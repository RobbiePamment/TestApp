package com.example.robbie.testapp;
import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
public class MainActivity extends Activity {
    private Button btnSubmitQuiz;
    int score,ans1,ans2, ans3, ans4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Question1 = (TextView)findViewById(R.id.Question1);
        TextView answer1A = (TextView)findViewById(R.id.answer1A);
        answer1A.setText(Html.fromHtml(getString(R.string.a1)));
        TextView answer1B = (TextView)findViewById(R.id.answer1B);
        answer1B.setText(Html.fromHtml(getString(R.string.b1)));
        TextView answer1C = (TextView)findViewById(R.id.answer1C );
        answer1C.setText(Html.fromHtml(getString(R.string.c1)));
        TextView answer1D = (TextView)findViewById(R.id.answer1D);
        answer1D.setText(Html.fromHtml(getString(R.string.d1)));
        RadioGroup champ = (RadioGroup) findViewById(R.id.answer1);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.answer1A:
                        ans1 = 1;
                        break;
                    case R.id.answer1B:
                        ans1 = 2;
                        //score++;
                        break;
                    case R.id.answer1C:
                        ans1 = 3;
                        break;
                    case R.id.answer1D:
                        ans1 = 4;
                        break;
                }
            }
        });
        RadioGroup gBall = (RadioGroup) findViewById(R.id.answer2);
        gBall.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer2A:
                        ans2 = 1;
                        break;
                    case R.id.answer2B:
                        ans2 = 2;
                        break;
                    case R.id.answer2C:
                        ans2 = 3;
                        break;
                }
            }
        });
        RadioGroup gBoot = (RadioGroup) findViewById(R.id.answer3);
        gBoot.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer3A:
                        ans3 = 1;
                        break;
                    case R.id.answer3B:
                        ans3 = 2;
                        break;
                    case R.id.answer3C:
                        ans3 = 3;
                        break;
                }
            }
        });
        RadioGroup cBoot = (RadioGroup) findViewById(R.id.answer4);
        cBoot.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer4A:
                        ans4 = 1;
                        break;
                    case R.id.answer4B:
                        ans4 = 2;
                        break;
                    case R.id.answer4C:
                        ans4 = 3;
                        break;
                }
            }
        });
        btnSubmitQuiz = (Button) findViewById(R.id.submit);
        btnSubmitQuiz.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                score = 0;
                if (ans1 == 2)
                    score++;
                if (ans2 == 3)
                    score++;
                if (ans3 == 1)
                    score++;
                if (ans4 == 2)
                    score++;
                Toast.makeText(MainActivity.this, "Your score is:" + score + " out of 4", Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }}
