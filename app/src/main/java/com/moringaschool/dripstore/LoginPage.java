package com.moringaschool.dripstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.button3)Button mButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        ButterKnife.bind(this);
        mButton3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == mButton3) {
            Toast.makeText(LoginPage.this, "View our Products", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginPage.this, Products.class);
            startActivity(intent);
        }
}
}