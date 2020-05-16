package com.example.canteenmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_admindash extends AppCompatActivity {
    EditText user;
    EditText pass;
    RadioGroup rg;
    RadioButton rb;
    Button bSubmit;

    myDbAdapter myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);
    }
}

        myDb = new myDbAdapter(this);


        user = findViewById(R.id.usLogin);
        pass = findViewById(R.id.usPass);
        rg = findViewById(R.id.apRadioGroup);
        int radioid = rg.getCheckedRadioButtonId();
        rb = findViewById(radioid);
        bSubmit = findViewById(R.id.submit);
        AddUser();


    }

    public void AddUser(){
        bSubmit.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                     boolean isInserted = myDb.insertData(user.getText().toString(), pass.getText().toString(), rb.getText().toString().compareTo("STUDENT")==0?true:false);

                     if(isInserted==true){
                         Toast.makeText(activity_admindash.this,"User added",Toast.LENGTH_SHORT).show();
                     }else
                         Toast.makeText(activity_admindash.this,"User Not Added",Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }




}




