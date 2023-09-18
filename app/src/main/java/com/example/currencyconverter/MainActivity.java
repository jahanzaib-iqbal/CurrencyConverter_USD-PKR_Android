package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void convertNow(View view){
        EditText dollarAmount = findViewById(R.id.dollarPr);
        String dollarString = dollarAmount.getText().toString();
        double dollarDouble = Double.parseDouble(dollarString);
        double pkrDouble = dollarDouble*289;

        String toastText = "price in PKR = " + Double.toString(pkrDouble) + " RS";

//        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        TextView pkrFinal = findViewById(R.id.pkrText);
        pkrFinal.setText(toastText);

    }
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }
}
