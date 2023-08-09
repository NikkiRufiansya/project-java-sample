package com.sourcey.materiallogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.guardsquare.dexguard.rasp.callback.DetectionReport;

public class MainActivity extends AppCompatActivity {
    private static Context context;

    private static boolean emulatorDetected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (emulatorDetected == true) {
                    myToast();
                    finishAffinity();
                }
            }
        }, 800);

    }

    public void myToast() {
        Toast.makeText(context, "Kami mendeteksi adanya kejanggalan pada konfigurasi perangkatmu, " +
                "Untuk Alasan keamanan aplikasi tidak dapat digunakan", Toast.LENGTH_SHORT).show();
    }


    public static void detectionReport(DetectionReport detectionReport) {
        if (detectionReport.isRunningInEmulator()) {
            Log.d("hello", "emulator detected");
            emulatorDetected = true;
        }
    }

}