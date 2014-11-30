package com.greenteam.cs3398project;

//all buttons are temporarily tested with "Button Works!" text

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//take user to account creation page when button is clicked
public void AccountCreationButtonClick(View v){
    Button button=(Button) v;
    ((Button) v).setText("Button works!");
}

//take user to calendar page
public void CalendarButtonClick(View v){
    Button button=(Button) v;
    ((Button) v).setText("Button works!");
}

//log user out of application
public void LogoutButtonClick(View v){
    Button button=(Button) v;
    ((Button) v).setText("Button works!");
}


