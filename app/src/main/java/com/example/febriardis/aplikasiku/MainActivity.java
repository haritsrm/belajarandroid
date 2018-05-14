package com.example.febriardis.aplikasiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    public EditText uname, pword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.uUsername);
        pword = (EditText)findViewById(R.id.pPassword);
    }

    public void Daftar(View view){
        final String Username = uname.getText().toString();
        final String Password = pword.getText().toString();

        Background background = new Background(Username, Password);
        RequestQueue queue = Volley.newRequestQueue(MainActivity,this);
        queue.add(background);
    }
}
