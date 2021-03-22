package com.example.mymall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    final Fragment fragment1 = new SevaFragment();
    final Fragment fragment2 = new DonationFragment();
    final Fragment fragment3 = new ReportsFragment();
    final Fragment fragment4 = new AboutFragment();
    final Fragment fragment5 = new ProfileFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm.beginTransaction().add(R.id.main_container, fragment5, "5").hide(fragment5).commit();
        fm.beginTransaction().add(R.id.main_container, fragment4, "4").hide(fragment4).commit();
        fm.beginTransaction().add(R.id.main_container, fragment3, "3").hide(fragment3).commit();
        fm.beginTransaction().add(R.id.main_container, fragment2, "2").hide(fragment2).commit();
        fm.beginTransaction().add(R.id.main_container,fragment1, "1").commit();
    }

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.seva:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active = fragment1;
                    return true;

                case R.id.donation:
                    fm.beginTransaction().hide(active).show(fragment2).commit();
                    active = fragment2;
                    return true;

                case R.id.report:
                    fm.beginTransaction().hide(active).show(fragment3).commit();
                    active = fragment3;
                    return true;

                case R.id.about:
                    fm.beginTransaction().hide(active).show(fragment4).commit();
                    active = fragment4;
                    return true;

                case R.id.profile:
                    fm.beginTransaction().hide(active).show(fragment5).commit();
                    active = fragment5;
                    return true;
            }
            return false;
        }
    };


}