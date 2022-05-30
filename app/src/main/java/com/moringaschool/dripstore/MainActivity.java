package com.moringaschool.dripstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{



   @BindView(R.id.login) Button mLogin;
   @BindView(R.id.create) Button mCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mLogin.setOnClickListener(this);
        mCreate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == mLogin) {
        Toast.makeText(MainActivity.this, "welcome Back", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, LoginPage.class);
        startActivity(intent);
    }
        if (v == mCreate) {
            Toast.makeText(MainActivity.this, "Signup", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, SignUpPage.class);
            startActivity(intent);
        }

    }
}