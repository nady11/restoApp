package com.example.restaurant;


import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar;
    Handler handler;
    Runnable runnable;
    Timer timer;
    TextView restoname;
    CircleImageView image;
    EditText et_email;
    EditText username;
    EditText email;
    EditText password;
    Button login;
    Button register;
    TextInputLayout til;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);
        restoname = (TextView) findViewById(R.id.resto_name);
        image = (CircleImageView) findViewById(R.id.resto_image);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login_btn);
        register = (Button) findViewById(R.id.register_btn);


        progressBar = (ProgressBar) findViewById(R.id.progressbar_id);
        progressBar.setVisibility(View.VISIBLE);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                timer.cancel();
                progressBar.setVisibility(View.GONE);

            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                handler.post(runnable);
            }
        }, 6000, 800);


        if (username.getText().toString().equals("nadine") && password.getText().toString().equals("password")) {
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent login;
                    login = new Intent(MainActivity.this, second.class);
                    startActivity(login);


                }
            });
            if (username.getText().toString().equals("nadine") && password.getText().toString().equals("password")) {
                register.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent register;
                        register = new Intent(MainActivity.this, second.class);
                        startActivity(register);


                    }
                });

            }


        }
    }
}
