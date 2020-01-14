package com.andrdoc.signlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SignLangActivity extends AppCompatActivity {
    String signwords;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_lang);

        //Sign Language shit
        Intent getsignwords = getIntent();
        signwords = getsignwords.getStringExtra("signwords");
        Log.i("Original String",signwords);
        final int length = signwords.length();
        Log.i("length",Integer.toString(length));
        i = 0;
        int tot = length*1500;
        Log.i("tottime",Integer.toString(tot));
        final char[] stringarray = signwords.toCharArray();
        for (int k = 0; k < length; k++){
            Log.i("String",Character.toString(stringarray[k]));
        }
        final ImageView singimages = findViewById(R.id.singlangimg);
        new CountDownTimer(tot, 1500) {
            @Override
            public void onTick(long l) {
                Log.i("Counter down timer",Long.toString(l));
                Character alpha = stringarray[i];
                String alpha2 = Character.toString(alpha);
                switch (alpha2){
                    case "a" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.a);
                    break;
                    case "A" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.a);
                        break;
                    case "b" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.b);
                        break;
                    case "B" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.b);
                        break;
                    case "c" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.c);
                        break;
                    case "C" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.c);
                        break;
                    case "D" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.d);
                        break;
                    case "d" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.d);
                        break;
                    case "e" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.e);
                        break;
                    case "E" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.e);
                        break;
                    case "f" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.f);
                        break;
                    case "F" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.f);
                        break;
                    case "g" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.g);
                        break;
                    case "G" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.g);
                        break;
                    case "h" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.h);
                        break;
                    case "H" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.h);
                        break;
                    case "i" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.i);
                        break;
                    case "I" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.i);
                        break;
                    case "j" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.j);
                        break;
                    case "J" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.j);
                        break;
                    case "k" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.k);
                        break;
                    case "K" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.k);
                        break;
                    case "l" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.l);
                        break;
                    case "L" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.l);
                        break;
                    case "m" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.m);
                        break;
                    case "M" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.m);
                        break;
                    case "n" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.n);
                        break;
                    case "N" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.n);
                        break;
                    case "o" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.o);
                        break;
                    case "O" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.o);
                        break;
                    case "p" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.p);
                        break;
                    case "P" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.p);
                        break;
                    case "q" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.q);
                        break;
                    case "Q" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.q);
                        break;
                    case "r" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.r);
                        break;
                    case "R" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.r);
                        break;
                    case "s" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.s);
                        break;
                    case "S" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.s);
                        break;
                    case "t" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.t);
                        break;
                    case "T" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.t);
                        break;
                    case "u" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.u);
                        break;
                    case "U" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.u);
                        break;
                    case "v" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.v);
                        break;
                    case "V" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.v);
                        break;
                    case "w" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.w);
                        break;
                    case "W" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.w);
                        break;
                    case "x" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.x);
                        break;
                    case "X" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.x);
                        break;
                    case "y" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.y);
                        break;
                    case "Y" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.y);
                        break;
                    case "z" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.z);
                        break;
                    case "Z" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.z);
                        break;
                    case "1" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "2" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "3" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "4" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "5" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "6" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "7" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "8" : singimages.setImageDrawable(null);
                    singimages.setImageResource(R.drawable.mic);
                        break;
                    case "9" : singimages.setImageDrawable(null);
                        singimages.setImageResource(R.drawable.mic);
                        break;
                    case " " :
                    break;
                        default:
                            Toast.makeText(SignLangActivity.this
                                    , "Unrecognized alphabet", Toast.LENGTH_SHORT).show();
                            break;
                }
                i++;
            }

            @Override
            public void onFinish() {
              finish();
            }
        }.start();

    }

    public void restart(View view){
        finish();
    }
}
