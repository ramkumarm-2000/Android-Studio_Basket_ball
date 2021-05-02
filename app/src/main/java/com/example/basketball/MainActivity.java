package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTemA = 0;
    int scoreTemB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void teamAOneScore(View view) {

        scoreTemA = scoreTemA + 1;
        displayTeamA(scoreTemA);
    }

    public void teamATwoScore(View view) {
        scoreTemA = scoreTemA + 2;
        displayTeamA(scoreTemA);
    }

    public void teamAThreeScore(View view) {
        scoreTemA = scoreTemA + 3;
        displayTeamA(scoreTemA);
    }

    private void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    public void teamBOneScore(View view) {
        scoreTemB = scoreTemB + 1;
        displayTeamB(scoreTemB);
    }

    public void teamBTwoScore(View view) {
        scoreTemB = scoreTemB + 2;
        displayTeamB(scoreTemB);
    }

    public void teamBThreeScore(View view) {
        scoreTemB = scoreTemB + 3;
        displayTeamB(scoreTemB);
    }

    private void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    public void resetButton(View view) {
        scoreTemA = 0;
        scoreTemB = 0;
        displayTeamA(0);
        displayTeamB(0);

    }
    public void finishButton(View view) {
        if(scoreTemA==scoreTemB) {
            Toast toast = Toast.makeText(getApplicationContext(), "Its a Draw ", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
            toast.show();
        }else{
            if (scoreTemA>scoreTemB){
            int res=scoreTemA-scoreTemB;
            Toast toast = Toast.makeText(getApplicationContext(), "Team A won By "+res+" Points", Toast.LENGTH_LONG);
            toast.setGravity( Gravity.CENTER, 0, 0);
            toast.show();

        }else{
            int res=scoreTemB-scoreTemA;
            Toast toast = Toast.makeText(getApplicationContext(), "Team B won By "+res+" Points", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        }
    }
}