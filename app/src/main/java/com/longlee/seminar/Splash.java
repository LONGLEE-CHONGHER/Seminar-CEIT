package com.longlee.seminar;

/**
 * Created by LONGLEE_CHONGHER on 14/5/2558.
 */


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity {

    private Handler objHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent objIntent = new Intent(Splash.this, Home.class);
                startActivity(objIntent);
                finish();

            }
        }, 2000);


    }

}
