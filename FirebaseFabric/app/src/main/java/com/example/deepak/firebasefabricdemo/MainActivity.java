package com.example.deepak.firebasefabricdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.auth.FirebaseAuthException;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.ENABLE_ANALYTICS) {
            Fabric.with(this, new Crashlytics());
        }
        setContentView(R.layout.activity_main);
        Crashlytics.getInstance().crash(); // Force a crash


    }


}
