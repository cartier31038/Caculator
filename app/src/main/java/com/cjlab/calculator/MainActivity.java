package com.cjlab.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener{

    private EditText operand1EditText;
    private EditText operand2EditText;
    private TextView resultTextView;

    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1EditText = (EditText) findViewById(R.id.operand_1_edit_text);
        operand2EditText = (EditText) findViewById(R.id.operand_2_edit_text);
        resultTextView = (TextView) findViewById(R.id.result_text_view);

        mainController = new MainController();
        mainController.setListener(this);
    }

    public void onAdd(View view)
    {
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());
        double operand2 = Double.parseDouble(operand2EditText.getText().toString());
        mainController.add(operand1, operand2);
    }

    public void onSub(View view)
    {
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());
        double operand2 = Double.parseDouble(operand2EditText.getText().toString());
        mainController.sub(operand1, operand2);
    }

    public void onMul(View view)
    {
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());
        double operand2 = Double.parseDouble(operand2EditText.getText().toString());
        mainController.mul(operand1, operand2);
    }

    public void onDivide(View view)
    {
        double operand1 = Double.parseDouble(operand1EditText.getText().toString());
        double operand2 = Double.parseDouble(operand2EditText.getText().toString());
        mainController.divide(operand1, operand2);
    }

    public void showResult(String result)
    {
        resultTextView.setText(String.valueOf(result));
    }

    @Override
    public void onSuccess(String result) {
        showResult(result);
    }
}
