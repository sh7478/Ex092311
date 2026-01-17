package com.example.ex092311;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    TextView outputTv;
    AlertDialog ad;
    LinearLayout dialogMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputTv = findViewById(R.id.outputTv);
        dialogMain = (LinearLayout) getLayoutInflater().inflate(R.layout.event_type_dialog, null);
        adb = new AlertDialog.Builder(this);
        adb.setView(dialogMain);
        ad = adb.create();
    }

    public void choseEvent(View view) {
        ad.show();
    }

    public void pool(View view) {
        outputTv.setText("You chose pool party");
        ad.dismiss();
    }

    public void show(View view) {
        outputTv.setText("You chose show");
        ad.dismiss();
    }
    public void streetParty(View view) {
        outputTv.setText("You chose street party");
        ad.dismiss();
    }
    public void slientDisco(View view) {
        outputTv.setText("You chose silent disco party");
        ad.dismiss();
    }
}