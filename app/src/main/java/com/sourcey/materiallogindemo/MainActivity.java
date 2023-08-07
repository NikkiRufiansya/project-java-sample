package com.sourcey.materiallogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void myEmulatorCallback(long debugInfo)
    {
        // This method will be called when an emulator is detected.
        Log.i("HelloWorldActivity", "Emulator detected. DebugInfo : " + debugInfo);
    }
}