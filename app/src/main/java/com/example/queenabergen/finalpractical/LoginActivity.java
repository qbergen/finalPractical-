package com.example.queenabergen.finalpractical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private String userInformation;
    private String passwordInformation;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.userNameInput);
        userInformation = username.getText().toString();
        password = (EditText) findViewById(R.id.passWordInput);
        passwordInformation = password.getText().toString();
        submit = (Button) findViewById(R.id.submit_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emptyEditText();
            }
        });

    }

    public void emptyEditText() {
        if (!userInformation.isEmpty()) {
            Toast.makeText(getApplicationContext(), getString(R.string.Enter_User_Toast), Toast.LENGTH_SHORT).show();
        } else if (!passwordInformation.isEmpty()) {
            Toast.makeText(getApplicationContext(), getString(R.string.Enter_Password_Toast), Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);

        }
    }

}
