package com.example.nick.hw2;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    Button gpa_btn;
    boolean btn_clear = false;
    TextView gpa_textview;
    EditText eT1;
    EditText eT2;
    EditText eT3;
    EditText eT4;
    EditText eT5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=(ConstraintLayout)findViewById(R.id.constLayout);
        gpa_btn=(Button)findViewById(R.id.button);
        gpa_textview=(TextView)findViewById(R.id.textView6);
        eT1=(EditText)findViewById(R.id.editText);
        eT2=(EditText)findViewById(R.id.editText2);
        eT3=(EditText)findViewById(R.id.editText3);
        eT4=(EditText)findViewById(R.id.editText4);
        eT5=(EditText)findViewById(R.id.editText5);

        gpa_btn.setOnClickListener(new MyListenerForEventHandling());

    }

    class MyListenerForEventHandling implements View.OnClickListener{

        @Override
        public void onClick(View view){
            //Toast.makeText(MainActivity.this, "Class implements OnClickListener Toast msg to user", Toast.LENGTH_SHORT).show();
            if (!btn_clear) {
                double gpa = 0.0;
                double entries = 0.0;
                if (TextUtils.isDigitsOnly(eT1.getText())){
                    if (eT1.getText().toString() != null && !eT1.getText().toString().isEmpty()) {
                        gpa += Double.parseDouble(eT1.getText().toString());
                        entries++;
                    }
                } else {
                    eT1.setBackgroundColor(getResources().getColor(R.color.background_red));
                }
                if (TextUtils.isDigitsOnly(eT2.getText())){
                    if (eT2.getText().toString() != null && !eT2.getText().toString().isEmpty()) {
                        gpa += Double.parseDouble(eT2.getText().toString());
                        entries++;
                    }
                } else {
                    eT2.setBackgroundColor(getResources().getColor(R.color.background_red));
                }
                if (TextUtils.isDigitsOnly(eT3.getText())){
                    if (eT3.getText().toString() != null && !eT3.getText().toString().isEmpty()) {
                        gpa += Double.parseDouble(eT3.getText().toString());
                        entries++;
                    }
                } else {
                    eT3.setBackgroundColor(getResources().getColor(R.color.background_red));
                }
                if (TextUtils.isDigitsOnly(eT4.getText())){
                    if (eT4.getText().toString() != null && !eT4.getText().toString().isEmpty()) {
                        gpa += Double.parseDouble(eT4.getText().toString());
                        entries++;
                    }
                } else {
                    eT4.setBackgroundColor(getResources().getColor(R.color.background_red));
                }
                if (TextUtils.isDigitsOnly(eT5.getText())){
                    if (eT5.getText().toString() != null && !eT5.getText().toString().isEmpty()) {
                        gpa += Double.parseDouble(eT5.getText().toString());
                        entries++;
                    }
                } else {
                    eT5.setBackgroundColor(getResources().getColor(R.color.background_red));
                }
                if (entries > 0) {
                    gpa = (gpa / entries);
                    gpa_textview.setText(getResources().getString(R.string.result_text)+ " " + String.format("%.2f", gpa));
                    if (gpa < 60) {
                        layout.setBackgroundColor(getResources().getColor(R.color.background_red));
                    } else if (gpa < 80) {
                        layout.setBackgroundColor(getResources().getColor(R.color.background_yellow));
                    } else {
                        layout.setBackgroundColor(getResources().getColor(R.color.background_green));
                    }
                    btn_clear = true;
                    gpa_btn.setText(getResources().getString(R.string.btn_text2));
                }
            } else {
                eT1.getText().clear();
                eT2.getText().clear();
                eT3.getText().clear();
                eT4.getText().clear();
                eT5.getText().clear();
                eT1.setBackgroundColor(getResources().getColor(R.color.background_clear));
                eT2.setBackgroundColor(getResources().getColor(R.color.background_clear));
                eT3.setBackgroundColor(getResources().getColor(R.color.background_clear));
                eT4.setBackgroundColor(getResources().getColor(R.color.background_clear));
                eT5.setBackgroundColor(getResources().getColor(R.color.background_clear));
                layout.setBackgroundColor(getResources().getColor(R.color.background_normal));
                gpa_btn.setText(getResources().getString(R.string.btn_text1));
                btn_clear = false;
            }

        }
    }

    float calculateGPA(){

        return 0;
    }
}
