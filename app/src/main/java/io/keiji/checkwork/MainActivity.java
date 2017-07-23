package io.keiji.checkwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     textView = (TextView)findViewById(R.id.dadd);


        number = 0;
    }

    public void button (View v) {
        if (number % 2 == 0) {
           
        }

        number++;
        textView.setText(number + "回押した");
    }

    public void button2 (View v){
        number --;
        textView.setText(number + "回押した");
    }
    public void button3 (View v){
        number = 0;
        textView.setText(number + "回押した");

    }


    }
}
