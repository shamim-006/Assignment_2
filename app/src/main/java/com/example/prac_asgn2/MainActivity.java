package com.example.prac_asgn2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonOrder, buttonSeekbarSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        buttonOrder = findViewById(R.id.button_order);
        buttonSeekbarSwitch = findViewById(R.id.button_seekbar_switch);

        // Set click listeners to navigate between screens
        buttonOrder.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(intent);
        });

        buttonSeekbarSwitch.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SeekbarSwitchActivity.class);
            startActivity(intent);
        });
    }
}
