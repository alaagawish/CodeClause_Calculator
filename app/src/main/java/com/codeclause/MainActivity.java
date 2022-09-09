package com.codeclause;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button btnDivision, btnMultiply, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClean, btnEqual, btnMinus, btnAdd;
    public TextView screen, screenResult;
    public int num1, num2;
    public String flag;
    public int r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    public void initViews() {
        screen = findViewById(R.id.screen);
        screenResult = findViewById(R.id.screenResult);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDivision = findViewById(R.id.btnDivision);
        btnAdd = findViewById(R.id.btnAdd);
        btnEqual = findViewById(R.id.btnEqual);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnClean = findViewById(R.id.btnClean);


        btnClean.setOnClickListener(v -> {
            if (screen.getText() == "")
                num1 = 0;
            else
                num1 = 0;
            num2 = 0;

            screen.setText("");
        });
        btnAdd.setOnClickListener(v -> {
            num1 = Integer.parseInt(screen.getText().toString());
            flag = "+";
            screen.setText("");

        });
        btnMultiply.setOnClickListener(v -> {
            num1 = Integer.parseInt(screen.getText().toString());
            flag = "*";
            screen.setText("");
        });
        btnMinus.setOnClickListener(v -> {
            num1 = Integer.parseInt(screen.getText().toString());
            flag = "-";
            screen.setText("");
        });
        btnDivision.setOnClickListener(v -> {
            num1 = Integer.parseInt(screen.getText().toString());
            flag = "/";
            screen.setText("");
        });
        btnEqual.setOnClickListener(v -> {
            num2 = Integer.parseInt(screen.getText().toString());
            switch (flag) {
                case "+":
                    r = num1 + num2;
                    break;
                case "-":
                    r = num1 - num2;
                    break;
                case "/":
                    r = num1 / num2;
                    break;
                case "*":
                    r = num1 * num2;
                    break;
                default:
                    screen.setText("error");
            }
            screenResult.setText("= " + r);
            screen.setText("");
            num1 = 0;
            num2 = 0;
            flag = "";
        });

        btn0.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "0");
        });
        btn1.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "1");
        });
        btn2.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "2");
        });
        btn3.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "3");
        });
        btn4.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "4");
        });
        btn5.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "5");
        });
        btn6.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "6");
        });
        btn7.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "7");
        });
        btn8.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "8");
        });
        btn9.setOnClickListener(v -> {
            screen.setText(screen.getText().toString() + "9");
        });
    }
}