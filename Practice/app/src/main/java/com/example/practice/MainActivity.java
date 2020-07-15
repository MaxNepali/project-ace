package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int i = 0;
    public void buttonClicked(View button) {

        i++;
        ImageView image1 = findViewById(R.id.imageView1);
        TextView text2 = findViewById(R.id.textView2);
        EditText edit1 = findViewById(R.id.editText1), edit2 = findViewById(R.id.editText2);
        String str = "Click " + i + "\n" + edit1.getText().toString() + " is an Android Developer !!";
        text2.setText(str);
        Toast.makeText(MainActivity.this
                , "Fuck_U_Man_!"
                , Toast.LENGTH_LONG ).show();
        if(i%2 == 0){
            image1.setImageResource(R.drawable.black);
        }
        else{
            image1.setImageResource(R.drawable.fuckyou);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
