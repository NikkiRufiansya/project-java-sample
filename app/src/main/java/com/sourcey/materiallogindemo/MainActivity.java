package com.sourcey.materiallogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import java.util.UUID;


public class MainActivity extends AppCompatActivity {
    public static Boolean emulatorDetection = false;
    public static Boolean rootDetection = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Handler handler = new Handler(Looper.getMainLooper());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String uniqueID = UUID.randomUUID().toString();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (emulatorDetection==true){
                    MyToast();
                }
            }
        },600);
    }

    public void MyToast(){
        Toast.makeText(this, "Terjadi Kesalahan App Terinstall di perangkat berbahaya",Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    public static void emulatorCallback(long debugInfo)
    {
        // This method will be called when an emulator is detected.
        Log.i("HelloWorldActivity", "Emulator detected. DebugInfo : " + debugInfo);
        emulatorDetection=true;
    }

    public static void debugCallback(long  debugInfo){
        Log.d("HelloWorldActivity", "Debug Detected debugCallback: " + debugInfo);
    }

    public static void rootCallback(long debugInfo){
        Log.d("HelloWorldActivity", "Root Detected : " + debugInfo);
        rootDetection = true;
    }



}