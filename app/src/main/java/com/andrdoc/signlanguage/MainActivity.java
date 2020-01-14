package com.andrdoc.signlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.speech.RecognizerIntent;
import android.content.ActivityNotFoundException;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView txtSpeechInput;
    ImageButton speakButton;
    final int REQ_CODE_SPEECH_INPUT = 100;
    ListView recentlist;
    ArrayAdapter recentarray;
    ArrayList<String> recentarrlist;

    public void Speakfunction(View view) {
        promptSpeechInput();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSpeechInput = (TextView) findViewById(R.id.txtSpeechInput);
        speakButton = (ImageButton) findViewById(R.id.speakButton);

        //Recents Array
        recentlist = findViewById(R.id.listview);
        recentarrlist = new ArrayList<String>();
        recentarray = new ArrayAdapter(this, android.R.layout
                .simple_list_item_1, recentarrlist);
        recentlist.setAdapter(recentarray);
    }

    public void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txtSpeechInput.setText(result.get(0));
                    recentarrlist.add(result.get(0));
                    recentarray.notifyDataSetChanged();
                    Intent signintent = new Intent(this, SignLangActivity.class);
                    signintent.putExtra("signwords", result.get(0));
                    startActivity(signintent);
                }
                break;
            }

        }
    }
}
