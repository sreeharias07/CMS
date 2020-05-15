package com.example.canteenmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_admindash extends AppCompatActivity {

    EditText user;
    EditText pass;
    RadioGroup rg;
    RadioButton rb;
    myDbAdapter helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);

        user = findViewById(R.id.usLogin);
        pass = findViewById(R.id.usPass);
        rg = findViewById(R.id.apRadioGroup);
        int radioid = rg.getCheckedRadioButtonId();
        rb= findViewById(radioid);



    }
    void add(View v){  //Add user to Database
        String u = user.getText().toString();
        String p = pass.getText().toString();

        if(u.isEmpty()||p.isEmpty()){
            Toast.makeText(this,"Enter Details", Toast.LENGTH_SHORT).show();
        }
        else {
            int a = helper.updateName(u1, u2);
            if (a <= 0) {
                Toast.makeText(this, "Unsuccessfull", Toast.LENGTH_SHORT).show();
                u.setText("");
                p.setText("");
            } else {
                Toast.makeText(this, "Updated", Toast.LENGTH_SHORT).show();
                u.setText("");
                p.setText("");
            }

        }

    }

    public void viewdata(View view)
    {
        String data = helper.getData();
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
    }

    void delete(View v){                        // Admin can remove without using password implimented
        String u = user.getText().toString();
        String p = pass.getText().toString();

        if(u.isEmpty()){
            Toast.makeText(this,"Enter Details",Toast.LENGTH_SHORT).show();
        }
        else{
            int a = helper.delete(u);               //function name alse delete, there is another Edittext in onCreate. CHECk
            if(a<=0){
                Toast.makeText(getApplicationContext(),"Unsuccessful",Toast.LENGTH_SHORT).show();
                delete.setText("");
            }
            else {
                Toast.makeText(getApplicationContext(),"DELETED");
                delete.setText("");
            }

        }


    }



}
