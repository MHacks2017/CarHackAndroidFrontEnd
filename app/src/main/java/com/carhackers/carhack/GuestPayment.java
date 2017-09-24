package com.carhackers.carhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GuestPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_payment);
        Intent intent = getIntent();
        String loc = intent.getStringExtra(GuestActivity.EXTRA_MESSAGE);
        switch(loc){
            case("Capitol Square"):
                ((TextView)findViewById(R.id.fee_amount_text)).setText("$5.00");
                ((TextView)findViewById(R.id.distance_amount_text)).setText("10mi");
                break;
            case("Grocery Store"):
                ((TextView)findViewById(R.id.fee_amount_text)).setText("$8.56");
                ((TextView)findViewById(R.id.distance_amount_text)).setText("17.12mi");
                break;
            case("The Terrace"):
                ((TextView)findViewById(R.id.fee_amount_text)).setText("$3.21");
                ((TextView)findViewById(R.id.distance_amount_text)).setText("6.42mi");
                break;
            case("Bascom Hall"):
                ((TextView)findViewById(R.id.fee_amount_text)).setText("$4.17");
                ((TextView)findViewById(R.id.distance_amount_text)).setText("8.34mi");
                break;
        }
    }
}
