package com.intawad.kfc.kfcapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        // btnSave (Save)
        final Button save = (Button) findViewById(R.id.btnSave);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // If Save Complete
                if(SaveData())
                {
                    // Open Form Main
                    Intent newActivity = new Intent(AddActivity.this,MainActivity.class);
                    startActivity(newActivity);
                }
            }
        });


        // btnCancel (Cancel)
        final Button cancel = (Button) findViewById(R.id.btnCancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open Form Main
                Intent newActivity = new Intent(AddActivity.this,MainActivity.class);
                startActivity(newActivity);
            }
        });

    }

    public boolean SaveData()
    {
        // txtMemberID, txtName, txtTel
        final EditText tDistanceID = (EditText) findViewById(R.id.intDistanceID);
        final EditText tYear = (EditText) findViewById(R.id.intYear);
        final EditText tNew = (EditText) findViewById(R.id.intNew);



        // Dialog
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();

        // Check MemberID
        if(tDistanceID.getText().length() == 0)
        {
            ad.setMessage("Please input [DistanceID] ");
            ad.show();
            tDistanceID.requestFocus();
            return false;
        }

        // Check Name
//        if(tName.getText().length() == 0)
//        {
//            ad.setMessage("Please input [Name] ");
//            ad.show();
//            tName.requestFocus();
//            return false;
//        }

        // Check Tel
//        if(tTel.getText().length() == 0)
//        {
//            ad.setMessage("Please input [Tel] ");
//            ad.show();
//            tTel.requestFocus();
//            return false;
//        }

        // new Class DB
        final myDBClass myDb = new myDBClass(this);

        // Check Data (MemberID exists)
        String arrData[] = myDb.SelectData(tDistanceID.getText().toString());
        if(arrData != null)
        {
            ad.setMessage("DistanceID already exists!  ");
            ad.show();
            tDistanceID.requestFocus();
            return false;
        }

        // Save Data
        long saveStatus = myDb.InsertData(tDistanceID.getText().toString(),
                tYear.getText().toString(),
                tNew.getText().toString());

        if(saveStatus <=  0)
        {
            ad.setMessage("Error!! ");
            ad.show();
            return false;
        }

        Toast.makeText(AddActivity.this,"Add Data Successfully. ",
                Toast.LENGTH_SHORT).show();

        return true;
    }

}
