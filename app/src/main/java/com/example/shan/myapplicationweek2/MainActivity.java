package com.example.shan.myapplicationweek2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView a_score;
    TextView b_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_score=(TextView) findViewById(R.id.a_score);
        b_score=(TextView) findViewById(R.id.b_score);
    }

    public void A_btnAdd1(View btn){
        A_showScore(0);
    }

    public void A_btnAdd2(View btn){
        A_showScore(2);
    }

    public void A_btnAdd3(View btn){
        A_showScore(3);
    }

    public void B_btnAdd1(View btn){
        B_showScore(0);
    }


    public void B_btnAdd2(View btn){
        B_showScore(2);
    }

    public void B_btnAdd3(View btn){
        B_showScore(3);
    }

    public void btnReset(View btn){
        a_score.setText("0");
        b_score.setText("0");
    }

    private void A_showScore(int inc){
        Log.i("show","inc=" + inc);
        String oldScore = (String) a_score.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        a_score.setText("" + newScore);
    }

    private void B_showScore(int inc){
        Log.i("show","inc=" + inc);
        String oldScore = (String) b_score.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        b_score.setText("" + newScore);
    }
}

