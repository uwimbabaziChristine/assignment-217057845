package com.example.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button login;
Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.etUsername);
        password=(EditText)findViewById(R.id.etPassword);
        login=(Button)findViewById(R.id.Login);
        register=(Button)findViewById(R.id.button3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = username.getText().toString();
                String PASS = password.getText().toString();
                if (User.equals("")|| PASS.equals("")){
                    Toast.makeText(getApplicationContext(),"ENTER YOU USERNAME AND PASSWORD",Toast.LENGTH_LONG).show();
                }
                else if (User.equals("ADMIN")&& PASS.equals("3006"))
                {   Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,project3.class);
                startActivity(intent);}
                else { Toast.makeText(getApplicationContext(),"INVALID USERNAME OR PASSWORD",Toast.LENGTH_LONG).show();
                }
            }
        });
register.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent=new Intent(MainActivity.this,LoginActivity.class);
         startActivity(intent);

     }
 });
    }
}
