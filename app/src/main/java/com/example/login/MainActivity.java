package com.example.login;
import android.content.Intent;
//import android.support.constraint.R;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText editText1;
    TextView textView1;
    TextView textView2;
    EditText editText2;
    Button  b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        textView1=(TextView)findViewById(R.id.textview1);
         b1=(Button)findViewById(R.id.b1);
        textView2=(TextView)findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        }
        );

    }
}



