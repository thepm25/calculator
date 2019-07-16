package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0;
    TextView tv1,tv2;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button clear, modulo, divide, multiply, subtract, add, point, zero, one, two, three, four,
            five, six, seven, eight, nine, equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear =(Button) findViewById(R.id.clear);
        modulo =(Button) findViewById(R.id.modulo);
        divide =(Button) findViewById(R.id.divide);
        multiply =(Button) findViewById(R.id.multiply);
        add =(Button) findViewById(R.id.add);
        subtract =(Button) findViewById(R.id.subtract);
        one =(Button) findViewById(R.id.one);
        two =(Button) findViewById(R.id.two);
        three =(Button) findViewById(R.id.three);
        four =(Button) findViewById(R.id.four);
        five =(Button) findViewById(R.id.five);
        six =(Button) findViewById(R.id.six);
        seven =(Button) findViewById(R.id.seven);
        eight =(Button) findViewById(R.id.eight);
        nine =(Button) findViewById(R.id.nine);
        point =(Button) findViewById(R.id.point);
        zero =(Button) findViewById(R.id.zero);
        equals =(Button) findViewById(R.id.equals);

        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(modulo.getText()+"%");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(add.getText()+"+");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(subtract.getText()+"-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(multiply.getText()+"x");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(divide.getText()+"/");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(point.getText()+".");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(zero.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(one.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(two.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(three.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(four.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(five.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(six.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(seven.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(eight.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("9");
            }
        });
    }
}
