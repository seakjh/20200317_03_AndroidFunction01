package com.example.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a20200317_03_androidfunction01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 퍼스트 액티비티로 이동하자
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);

            }
        });

        binding.goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

    }
}
