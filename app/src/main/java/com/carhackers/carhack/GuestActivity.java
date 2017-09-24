package com.carhackers.carhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class GuestActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.carhackers.carhack.LOCATION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);


    }


    public void continueOnClick(View v){

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_grp);
        Button locButton = (Button) findViewById(R.id.loc_choose);
        // get selected radio button from radioGroup
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        locButton = (RadioButton) findViewById(selectedId);

        Intent intent = new Intent(this, GuestPayment.class );
        intent.putExtra(EXTRA_MESSAGE, locButton.getText());
        startActivity(intent);
    }
}
