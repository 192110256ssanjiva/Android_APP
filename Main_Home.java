package com.example.newactivityopening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText name,password, email, rime,date;
public static String EXTRA_NAME="com.example.newactivityopening.extra.NAME";
public static String PASS_ID="com.example.newactivityopening.PASS.id";
public static String EMAIL_ID="com.example.newactivityopening.Email.id";
public static String TIME_ID="com.example.newactivityopening.TIME.id";
public static String Date_ID="com.example.newactivityopening.PASS.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void getDisplay(View v){
        Toast.makeText(this, "Form Submitted", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        rime = findViewById(R.id.rime);
        date = findViewById(R.id.date);
        //getting date to to related dataType
        String nameText = name.getText().toString();
        String passWord = String.valueOf(password.getText());
        String mail = email.getText().toString();
        String inTime = rime.getText().toString();
        String inDate = date.getText().toString();
        //intent for each form values entered by user
        intent.putExtra(EXTRA_NAME,nameText);
        intent.putExtra(PASS_ID,passWord);
        intent.putExtra(EMAIL_ID,mail);
        intent.putExtra(TIME_ID,inTime);
        intent.putExtra(Date_ID,inDate);
        startActivity(intent);



    }
}
