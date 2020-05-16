package com.example.canteenmanagement;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {



    private EditText user;
    private EditText pass;
    private Button blogin;
    private Button btest;
    private RadioGroup rg;
    private RadioButton rb;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        setContentView(R.layout.activity_login);
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setTextColor(Color.WHITE);

    }
}
