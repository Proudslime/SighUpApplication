package com.example.sighupapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sighupapplication.SIGH.UserSigh;

public class FirstActivity extends AppCompatActivity {

    private EditText editname;
    private EditText editpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstActivity.this);
                // 创建一个view，并且将布局加入view中
                final View viewDialog = LayoutInflater.from(FirstActivity.this).inflate(R.layout.customdialog,
                        null, false);
                builder.setTitle("登录界面")
                        .setView(viewDialog)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                EditText editTextTextUserID = viewDialog.findViewById(R.id.edittext_user_id);
                                EditText editTextTextUserPassword = viewDialog.findViewById(R.id.edittext_user_password);

                                if(editTextTextUserID.getText().toString().equals("abc") &&
                                        editTextTextUserPassword.getText().toString().equals("123")){
                                    Toast.makeText(FirstActivity.this, "UserId:" + editTextTextUserID.getText().toString()
                                            + "UserPassword:" + editTextTextUserPassword.getText().toString(), Toast.LENGTH_LONG).show();
                                }else {
                                    Toast.makeText(FirstActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                                }
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                builder.create().show();
            }
        });
    }
}