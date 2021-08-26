package com.example.bundles.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bundles.R;
import com.example.bundles.ui.fragments.sendFragment.SendFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }

    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_container, new SendFragment()).commit();
    }
}