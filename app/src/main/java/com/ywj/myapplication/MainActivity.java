package com.ywj.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int themeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        themeType = getSharedPreferences("theme", MODE_PRIVATE).getInt("themeType", 0);
        if (themeType == 0) {
            setTheme(R.style.AppTheme);
        } else {
            setTheme(R.style.AppTheme2);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeTheme(View view) {
        themeType = themeType == 0 ? 1 : 0;
        getSharedPreferences("theme", MODE_PRIVATE).edit().putInt("themeType", themeType).commit();
        recreate();
        //会丢失当前页面的状态，需要保持的数据做持久化保持
    }
}
