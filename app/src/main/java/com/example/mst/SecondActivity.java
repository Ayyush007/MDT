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
public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    private Button SecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuactivity_main);
        SecondActivity = findViewById(R.id.Mobile_info);
        SecondActivity.setOnClickListener(this);
        Log.i("State changed event", "SecondActivity");
    }
        @Override
        public void onClick(View view) {
            Intent firstIntent = new
                    Intent(getApplicationContext(),SecondActivity.class);
            startActivity(firstIntent);
        }
    }

