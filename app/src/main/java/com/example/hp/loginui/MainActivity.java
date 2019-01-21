package com.example.hp.loginui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  login(View view)
    {
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        //finish();

    }



    public void  signup(View view)
    {
        startActivity(new Intent(this,SignupActivity.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        //finish();
    }

}
