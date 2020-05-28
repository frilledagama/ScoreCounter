package com.practice.android.scorecounter;

public class Team {
    int score;

    public Team(){
        score = 0;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }

    //method to increase score by 3
    public void scoreThree(){
        setScore(this.score+3);
    }

    //method to increase score by 2
    public void scoreTwo(){
        setScore(this.score+2);
    }

    //method to increase score by 1
    public void scoreOne(){
        setScore(this.score+1);
    }

}
