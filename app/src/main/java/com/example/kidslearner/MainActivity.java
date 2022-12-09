package com.example.kidslearner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button SkyBtn, GrassBtn, RootBtn;
    TextView LetterText, ResultText, RightScore, WrongScore;
    int right = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SkyBtn = findViewById(R.id.btnSky);
        RootBtn = findViewById(R.id.btnRoot);
        GrassBtn = findViewById(R.id.btnGrass);
        LetterText = findViewById(R.id.txtLetter);
        ResultText = findViewById(R.id.txtResult);
        RightScore = findViewById(R.id.txtRightScore);
        WrongScore = findViewById(R.id.txtWrongScore);

        String[] skyLetter ={"d","h","l","k","t","b","f"};
        String[] rootLetter ={"g","j","p","q","y"};
        String[] grassLetter ={"a","c","e","i","m","n","o","r","s","u","v","w","x","z"};

        String result = "";

        int category=0;
        int index=0;


        Random rnd = new Random();
        category = rnd.nextInt(3);
        if (category ==0){
            index = rnd.nextInt(skyLetter.length);
            LetterText.setText(skyLetter[index]);
            result = "SKY";
        } else if (category ==1){
            index = rnd.nextInt(rootLetter.length);
            LetterText.setText(rootLetter[index]);
            result = "ROOT";
        }else if (category ==2){
            index = rnd.nextInt(grassLetter.length);
            LetterText.setText(grassLetter[index]);
            result = "GRASS";
        }


        String finalResult = result;
        SkyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("SKY".equals(finalResult)){
                    ResultText.setText("Right Answer :)");
                    right++;
                    RightScore.setText(right);
                }
                else{
                    ResultText.setText("Wrong Answer :(");
                    wrong++;
                    WrongScore.setText(wrong);
                }
            }
        });

        RootBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("ROOT".equals(finalResult)){
                    ResultText.setText("Right Answer :)");
                    right++;
                    RightScore.setText(right);
                }
                else{
                    ResultText.setText("Wrong Answer :(");
                    wrong++;
                    WrongScore.setText(wrong);
                }
            }
        });

        GrassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("GRASS".equals(finalResult)){
                    ResultText.setText("Right Answer :)");
                    right++;
                    RightScore.setText(right);
                }
                else{
                    ResultText.setText("Wrong Answer :(");
                    wrong++;
                    WrongScore.setText(wrong);
                }
            }
        });
    }
}