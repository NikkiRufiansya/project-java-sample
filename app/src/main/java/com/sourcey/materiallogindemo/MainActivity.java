package com.sourcey.materiallogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Boolean emulatorDetection = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Handler handler = new Handler(Looper.getMainLooper());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Toast.makeText(this, "Aplikasi Berjalan Diemulator",Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    public static void emulatorCallback(long debugInfo)
    {
        // This method will be called when an emulator is detected.
        Log.i("HelloWorldActivity", "Emulator detected. DebugInfo : " + debugInfo);
        emulatorDetection=true;
    }
}