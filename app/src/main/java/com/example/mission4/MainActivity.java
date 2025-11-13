package com.example.mission4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private ImageView imageView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = findViewById(R.id.button);
         num1 = findViewById(R.id.TextNumber1);
        num2 =  findViewById(R.id.TextNumber2);
        num3 =  findViewById(R.id.TextNumber3);
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number1 = random.nextInt(3);
                Random random2 = new Random();
                int number2 = random2.nextInt(3);
                Random random3 = new Random();
                int number3 = random3.nextInt(3);
                num1.setText(String.valueOf(number1));
                num2.setText(String.valueOf(number2));
                num3.setText(String.valueOf(number3));
                if(number1==number2 && number2==number3){
                    Toast.makeText(MainActivity.this,"you win!",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.dfzoe25780d92ab3bc040bf9a302eca7497042e);
                }
                else{
                    Toast.makeText(MainActivity.this,"you lose!",Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.images);
                }

            }
        });
    }
}