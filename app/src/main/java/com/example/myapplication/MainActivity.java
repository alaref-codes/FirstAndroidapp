package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sayHello;
    private EditText edtText;
    private TextView txtView;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sayHello:
                Toast.makeText(this, "Hello Mother", Toast.LENGTH_SHORT).show();
                txtView.setText("Hello " + edtText.getText().toString() );
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHello = findViewById(R.id.sayHello);
//        sayHello.setOnClickListener(this);

        edtText = findViewById(R.id.edtText);
        txtView = findViewById(R.id.txtView);

//        sayHello.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Toast.makeText(MainActivity.this, "Hello MOTHER", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        } );

    }

}