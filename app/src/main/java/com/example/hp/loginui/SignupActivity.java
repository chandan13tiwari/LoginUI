package com.example.hp.loginui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by HP on 20-Jan-19.
 */

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_signup);


    }

    public void login(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        //finish();
    }



}
