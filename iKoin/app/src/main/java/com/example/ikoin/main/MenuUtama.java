package com.example.ikoin.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.ikoin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new Beranda());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.beranda:
                        fragment = new Beranda();
                        break;

                    case R.id.riwayat:
                        fragment = new Riwayat();
                        break;

                    case R.id.transaksi:
                        fragment = new Transaksi();
                        break;
                    case R.id.logout:
                        fragment = new Logout();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

    }
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
