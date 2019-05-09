package com.example.ljw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private ClearEditText account;
    private ClearEditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login);
        account=findViewById(R.id.account);
        password=findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!account.getText().toString().equals("17023119")){
                    Toast.makeText(MainActivity.this,"没有找到该账号",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.getText().toString().equals("password17023119")){
                    Toast.makeText(MainActivity.this,"请输入正确的密码",Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent=new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
                account.setText("");
                password.setText("");
            }
        });
    }
}
