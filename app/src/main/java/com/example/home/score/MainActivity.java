package com.example.home.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int goalsForTeamA ;
    private int goalsForTeamB ;
    private int foulsForTeamA ;
    private int foulsForTeamB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateTeamAGoals(View view) {
        TextView textView = findViewById(R.id.editGoal_1);
        goalsForTeamA += 1;
        textView.setText("" + goalsForTeamA);
    }

    public void updateTeamAFouls(View view) {
        TextView textView2 = findViewById(R.id.editFoul_1);
        foulsForTeamA += 1;
        textView2.setText("" + foulsForTeamA);
    }

    public void updateTeamBGoals(View view) {
        TextView textView3 = findViewById(R.id.editGoal_2);
        goalsForTeamB += 1;
        textView3.setText("" + goalsForTeamB);
    }

    public void updateTeamBFouls(View view) {
        TextView textView4 = findViewById(R.id.editFoul_2);
        foulsForTeamB += 1;
        textView4.setText("" + foulsForTeamB);
    }

    public void reset(View view) {
        TextView foul1 = findViewById(R.id.editFoul_1);
        TextView foul2 = findViewById(R.id.editFoul_2);
        TextView goal2 = findViewById(R.id.editGoal_2);
        TextView goal1 = findViewById(R.id.editGoal_1);
        goal1.setText(R.string._0);
        goal2.setText(R.string._0);
        foul1.setText(R.string._0);
        foul2.setText(R.string._0);
        goalsForTeamA =0;
        goalsForTeamB=0 ;
        foulsForTeamA=0 ;
        foulsForTeamB=0 ;

    }

}
