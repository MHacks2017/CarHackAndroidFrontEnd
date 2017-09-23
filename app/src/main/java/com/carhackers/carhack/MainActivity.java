package com.carhackers.carhack;

import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean lightOn;
    private boolean locked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton bulb = (ImageButton) findViewById(R.id.light_btn);
        //change to get from api check if light off, replace false with code that gets this
        if(lightOn = false){
            bulb.setImageResource(R.drawable.bulb_off);
        }
        else{
            bulb.setImageResource(R.drawable.bulb_on);
        }

        ImageButton lock = (ImageButton) findViewById(R.id.lock_btn);
        //change to get from api check if locked, replace false with code that gets this
        if(locked = false){
            lock.setImageResource(R.drawable.unlocked);
        }
        else {
            lock.setImageResource(R.drawable.locked);
        }
    }

    public void lightOnClick(View v){
        ImageButton bulb = (ImageButton) findViewById(R.id.light_btn);
        //insert api check here to see if car lights on or not to update lightOn instance field
        if(lightOn){
            bulb.setImageResource(R.drawable.bulb_off);
            Toast.makeText(this, R.string.light_off_message, Toast.LENGTH_SHORT).show();
        }
        else{
            bulb.setImageResource(R.drawable.bulb_on);
            Toast.makeText(this, R.string.unlocked_message, Toast.LENGTH_SHORT).show();
        }
        //insert code here for changing light
        {}
        lightOn = !lightOn;
    }

    public void lockOnClick(View v){
        ImageButton lock = (ImageButton) findViewById(R.id.lock_btn);
        //insert api check here to see if car locked or not to update locked instance field
        if(locked){
            lock.setImageResource(R.drawable.unlocked);
            Toast.makeText(this, R.string.locked_message, Toast.LENGTH_SHORT).show();

        }
        else{
            lock.setImageResource(R.drawable.locked);
            Toast.makeText(this, R.string.unlocked_message, Toast.LENGTH_SHORT).show();
        }

        //insert code here for changing lock
        {}
        locked = !locked;
    }

    public void tireOnClick(View v){
        LinearLayout extendedView = (LinearLayout) v.getParent();
        View[] componentsToSave = new View[extendedView.getChildCount()];
        for(int i = 0; i < extendedView.getChildCount(); ++i){
            ImageButton button = (ImageButton) extendedView.getChildAt((i));
            componentsToSave[i] = button;
            button.setVisibility((View.GONE));
        }
        //use a relative layout to position tires and tire info
        RelativeLayout newContainer = new RelativeLayout(this);
        extendedView.addView(newContainer);

        //img of car
//        ImageView carTopology = new ImageView(this);
//        carTopology.setImageResource(R.drawable.car_topology);
//        LinearLayout.LayoutParams carLayout = carTopology.getLayoutParams();
//        carTopology.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, .5f));
//        newContainer.addView(carTopology);
    }
}
