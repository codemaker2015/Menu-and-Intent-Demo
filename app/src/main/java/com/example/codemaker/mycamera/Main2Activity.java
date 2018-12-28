package com.example.codemaker.mycamera;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextpassword);
        btnOk = (Button) findViewById(R.id.buttonLogin);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("abcd") && password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Right User", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
                    //startActivity(intent);
//                    Intent callIntent = new Intent(Intent.ACTION_CALL);
//                    callIntent.setData(Uri.parse("tel:9961907453"));
//                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                        startActivity(callIntent);
//                    }
//                    startActivity(callIntent);
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.google.com"));
                    startActivity(intent);
                }else
                Toast.makeText(getApplicationContext(), "Wrong User", Toast.LENGTH_SHORT).show();

             }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity paused by user " + editTextUsername.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed by user " + editTextUsername.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroyed", Toast.LENGTH_SHORT).show();
    }
}
