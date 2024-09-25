package com.example.prac_asgn2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SeekbarSwitchActivity extends AppCompatActivity {

    SeekBar seekBar;
    Switch switchOption;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_switch);

        seekBar = findViewById(R.id.seekBar);
        switchOption = findViewById(R.id.switch_option);
        buttonBack = findViewById(R.id.button_back);

        buttonBack.setOnClickListener(v -> {
            // Display current SeekBar and Switch state
            int seekBarValue = seekBar.getProgress();
            boolean switchState = switchOption.isChecked();
            Toast.makeText(SeekbarSwitchActivity.this,
                    "SeekBar: " + seekBarValue + ", Switch: " + switchState, Toast.LENGTH_SHORT).show();

            // Return to MainActivity
            Intent intent = new Intent(SeekbarSwitchActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
