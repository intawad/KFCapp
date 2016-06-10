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
    private MySQLite mySQLite;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        mySQLite = new MySQLite(this);


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
        final EditText tYear = (EditText) findViewById(R.id.txtYear);
        final EditText tNew = (EditText) findViewById(R.id.txtNew);
        final EditText tRoot1 = (EditText) findViewById(R.id.txtRoot1);

        // Dialog
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();

        // Check MemberID
        if(tYear.getText().length() == 0)
        {
            ad.setMessage("Please input [MemberID] ");
            ad.show();
            tYear.requestFocus();
            return false;
        }

//        // Check Name
//        if(tNew.getText().length() == 0)
//        {
//            ad.setMessage("Please input [Name] ");
//            ad.show();
//            tName.requestFocus();
//            return false;
//        }

//        // Check Tel
//        if(tTel.getText().length() == 0)
//        {
//            ad.setMessage("Please input [Tel] ");
//            ad.show();
//            tTel.requestFocus();
//            return false;
//        }

        // new Class DB
//        final myDBClass myDb = new myDBClass(this);

//        // Check Data (MemberID exists)
//        String arrData[] = myDb.SelectData(tMemberID.getText().toString());
//        if(arrData != null)
//        {
//            ad.setMessage("MemberID already exists!  ");
//            ad.show();
//            tMemberID.requestFocus();
//            return false;
//        }

//        // Save Data
//        long saveStatus = myDb.InsertData(tMemberID.getText().toString(),
//                tName.getText().toString(),
//                tTel.getText().toString());
//        if(saveStatus <=  0)
//        {
//            ad.setMessage("Error!! ");
//            ad.show();
//            return false;
//        }

        Toast.makeText(AddActivity.this,"Add Data Successfully. ",
                Toast.LENGTH_SHORT).show();

        return true;
    }

}
