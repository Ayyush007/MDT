package com.example.mst;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button Get_Started;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Get_Started= findViewById(R.id.Get_Started);
        Get_Started.setOnClickListener(this);
        Log.i("State changed event", "MainActivity");
    }
        @Override
        public void onClick(View view) {
            Intent firstIntent = new
                    Intent(getApplicationContext(),SecondActivity.class);
            startActivity(firstIntent);
        }
    }
