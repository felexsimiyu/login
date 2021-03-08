package com.example.login;
import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import com.google.firebase.R;
import androidx.appcompat.app.AppCompatActivity;



public class SignupActivity extends AppCompatActivity {

    EditText username,email,password;
    Button create ;
    TextView textView21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        textView21 = (TextView) findViewById(R.id.textView21);
        create = (Button) findViewById(R.id.create);
        password = (EditText) findViewById(R.id.password);

        textView21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent int1 = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(int1);

                // TODO Auto-generated method stub

            }


        });


        create.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(SignupActivity.this,HomeActivity.class);
                                      startActivity(intent);
                                  }
                              }
        );

    }
}
