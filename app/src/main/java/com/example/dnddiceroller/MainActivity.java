package com.example.dnddiceroller;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dnddiceroller.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private dicePermutation roll = new dicePermutation();

    private void rollDice(int sides) {
        roll.addRoll(sides);
        binding.score.setText(Integer.toString(roll.getResult()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (roll.getResult() != 0) {
                    roll = new dicePermutation();
                    binding.score.setText(Integer.toString(roll.getResult()));
                }
            }
        });

        binding.d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(4);
            }
        });

        binding.d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(6);
            }
        });

        binding.d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(8);
            }
        });

        binding.d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(10);
            }
        });

        binding.d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(12);
            }
        });

        binding.d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(20);
            }
        });

        binding.percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(100);
            }
        });
    }
}
