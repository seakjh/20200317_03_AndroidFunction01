package com.example.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.a20200317_03_androidfunction01.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first);
    }
}
