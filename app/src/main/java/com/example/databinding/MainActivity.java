package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity implements UserAction {

    protected static final String TAG = "MainActivity";

    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUserAction(this);
        getSupportActionBar().show();

    }

    @Override
    public void onClickPhoto() {
        Log.w(TAG, "onClickPhoto: ");
    }
}