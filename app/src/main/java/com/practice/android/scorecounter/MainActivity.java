package com.practice.android.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global variables

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Team teamA = new Team();
        //Team teamB = new Team();

        //initialize gblvars to 0
        int scoreA = 0;
        int scoreB = 0;
    }

    //teamA methods

    //this method is called when a teamA scores a 3 pointer
    public void scoreThreeA(View view){
        scoreA = scoreA+3;
        displayScoreA(scoreA);
    }
    //this method is called when a teamA scores a 2 pointer
    public void scoreTwoA(View view){
        scoreA = scoreA+2;
        displayScoreA(scoreA);
    }
    //this method is called when a teamA scores a free throw
    public void scoreOneA(View view){
        scoreA = scoreA+1;
        displayScoreA(scoreA);
    }


    //teamB methods
    //this method is called when a teamB scores a 3 pointer
    public void scoreThreeB(View view){
        scoreB = scoreB+3;
        displayScoreB(scoreB);
    }
    //this method is called when a teamB scores a 2 pointer
    public void scoreTwoB(View view){
        scoreB = scoreB+2;
        displayScoreB(scoreB);
    }
    //this method is called when a teamB scores a free throw
    public void scoreOneB(View view){
        scoreB = scoreB+1;
        displayScoreB(scoreB);
    }
    
    private void displayScoreA(int score){
        ((TextView) findViewById(R.id.teamA_score)).setText("" + score);
    }

    private void displayScoreB(int score){
        ((TextView) findViewById(R.id.teamB_score)).setText("" + score);
    }

}
