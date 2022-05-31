package com.moringaschool.dripstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpPage extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.button4)Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        ButterKnife.bind(this);
        mButton4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == mButton4) {
            Toast.makeText(SignUpPage.this, "View our Products", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SignUpPage.this, Products.class);
            startActivity(intent);
        }
}
}