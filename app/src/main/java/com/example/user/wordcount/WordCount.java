package com.example.user.wordcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */

public class WordCount extends AppCompatActivity {
    EditText questionEditText;
    Button countButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCount", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question_text);
        countButton = (Button)findViewById(R.id.count_button);
        answerText = (TextView)findViewById(R.id.answer_number);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("WordCount", "Count button clicked");
                String question = questionEditText.getText().toString();
                Log.d("WordCount", "Question: " + question);
                Sentance sentance = new Sentance(question);
                int numberOfWords = sentance.wordCount();
                String output = Integer.toString(numberOfWords);
                answerText.setText(output);
            }
        });

    }
}
