package com.example.hp.loginui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 20-Jan-19.
 */

public class LoginActivity extends AppCompatActivity {


    Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView( R.layout.activity_login);


    }

    public void signup(View view) {
        startActivity(new Intent(this, SignupActivity.class));

        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        //finish();
    }






}
