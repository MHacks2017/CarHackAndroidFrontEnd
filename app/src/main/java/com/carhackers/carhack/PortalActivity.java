package com.carhackers.carhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

    }

    public void ownerBtnOnClick(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void guestBtnOnClick(View v){
        startActivity(new Intent(this, GuestActivity.class));
    }
}
