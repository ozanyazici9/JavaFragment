package com.ozanyazici.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirst (View view) {


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
        //fragmentTransaction.add(R.id.frame_layout,firstFragment).commit();
        fragmentTransaction.replace(R.id.frame_layout,firstFragment).commit();
        //Bu satır sonrasında, onCreateView metodu çağrılır.
        // Bu metot, fragmentin görünümünü oluşturmak ve yapılandırmak için kullanılır.
        // İşte bu metot, fragmentın görünümünü tanımlayan layout dosyasını şişirir (inflate) ve bu görünümün bileşenlerini oluşturur.
        // Bu metotun sonunda, fragmentın görünümü oluşturulmuş ve ayarlanmış olur.
        //
        //Yani, onCreateView metodu, fragmentın görünümünü döndürdüğünde,
        // bu görünümü daha önce belirlenen FrameLayout bileşenine eklenir veya yerine geçirilen fragmentın görünümünü değiştirir.
        // Bu sayede kullanıcı, fragmentın görünümünü görebilir.


    }

    public void goToSecond (View view) {

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.frame_layout,secondFragment).commit();
        //fragmentTransaction.add(R.id.frame_layout,secondFragment).commit();

    }
}