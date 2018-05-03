package com.example.hsa2245.teamattendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class teamAttendence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_attendence);
        }

    public void buttonOnClick(View v){
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
    }

    public void textBoxText(View v){
        EditText editText = (EditText) v;

    }
}