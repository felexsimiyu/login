package com.example.login;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Animatedbackground extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //This  code is used for hide the sheek bar of application************************************
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //***********************************************************************************************

        setContentView(R.layout.activity_animatedbackground);

// this code is for splash screen ************************************************
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Animatedbackground.this,SignupActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
