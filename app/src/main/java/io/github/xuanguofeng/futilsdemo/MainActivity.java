package io.github.xuanguofeng.futilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.xuanguofeng.futilslib.FLogUtils;
import io.github.xuanguofeng.futilslib.FNumberUtils;
import io.github.xuanguofeng.futilslib.FTimeUtils;
import io.github.xuanguofeng.futilslib.FVersionUtils;

public class MainActivity extends AppCompatActivity {

    Button getVersion;
    Button getAppVersion;
    Button logTest;
    Button timeMonitor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getVersion = findViewById(R.id.getVersion);
        getAppVersion = findViewById(R.id.getAppVersion);
        timeMonitor = findViewById(R.id.timeMonitor);
        logTest = findViewById(R.id.logTest);
        getVersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, FVersionUtils.getAndroidVersion(), Toast.LENGTH_LONG).show();
            }
        });

        getAppVersion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, FNumberUtils.twoBitsRemaining(0.333933, 3), Toast.LENGTH_LONG).show();
            }
        });

        logTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLogUtils.d("test..........");
                Toast.makeText(MainActivity.this, "请看logcat", Toast.LENGTH_LONG).show();
            }
        });

        timeMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FTimeUtils.startTimeMonitor(11);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                FTimeUtils.endTimeMonitor(11);
                Toast.makeText(MainActivity.this, "请看logcat", Toast.LENGTH_LONG).show();
            }
        });
    }


}
