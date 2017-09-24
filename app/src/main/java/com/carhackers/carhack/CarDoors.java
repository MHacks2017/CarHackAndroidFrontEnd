package com.carhackers.carhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CarDoors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_doors);
    }

    public void car_door_fl_OnClick(View v){

        changeDoorState(0,R.id.car_door_fl_caption);
    }
    public void car_door_fr_OnClick(View v){

        changeDoorState(0,R.id.car_door_fr_caption);
    }
    public void car_door_rl_OnClick(View v){

        changeDoorState(0,R.id.car_door_rl_caption);
    }
    public void car_door_rr_OnClick(View v){

        changeDoorState(0,R.id.car_door_rr_caption);
    }

    /**
     *
     * @param doorID 0 = fl, 1 = fr, 2 = rl, 3 = rr
     * @param doorIDRes pass in id of textView widget to change
     */
    private void changeDoorState(int doorID, int doorIDRes){

        //insert into conditional to check if door open
        if(((TextView) findViewById(doorIDRes)).getText().equals("Open")){
            //insert code to open front left door
            TextView caption = (TextView) findViewById(doorIDRes);
            caption.setText("Closed");

        }
        else{
            TextView caption = (TextView) findViewById(doorIDRes);
            caption.setText("Open");
        }
    }

}
