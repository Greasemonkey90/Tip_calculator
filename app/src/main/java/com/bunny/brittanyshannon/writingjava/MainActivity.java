package com.bunny.brittanyshannon.writingjava;
import java.text.DecimalFormat;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;



public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public double gettingTip10(){
        EditText theTip = findViewById(R.id.enteredAmount);
        double  amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .10;
        tip = Math.round(tip*100)/100.0d;
        return tip;
    }
    public double gettingTip20(){
        EditText theTip = findViewById(R.id.enteredAmount);
        double amount = Double.parseDouble(theTip.getEditableText().toString());
        double tip = amount * .20;
        tip = Math.round(tip*100)/100.0d;
        return tip;
    }
    public double gettingTip30(){
        EditText theTip = findViewById(R.id.enteredAmount);
        double amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .30;
        tip = Math.round(tip*100)/100.0d;
        return tip;
    }
    public double gettingTip40(){
        EditText theTip = findViewById(R.id.enteredAmount);
        double  amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .40;
        tip = Math.round(tip*100)/100.0d;
        return tip;
    }
    public double gettingTip50(){
        EditText theTip = findViewById(R.id.enteredAmount);
        double  amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .50;
        tip = Math.round(tip*100)/100.0d;
        return tip;
    }
    public void clickButton10(View view){
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this,getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        }
        else {
            display_tip10(gettingTip10());
        }
    }
    public void clickButton20(View view){
         EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this,getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        }
        else {
            display_tip20(gettingTip20());
        }
    }
    public void clickButton30(View view){
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this,getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        }
        else {
            display_tip30(gettingTip30());
        }
    }
    public void clickButton40(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this,getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        }
        else {
            display_tip40(gettingTip40());
        }
    }
    public void clickButton50(View view){
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this,getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        }
        else {
            display_tip50(gettingTip50());
        }
    }
    public void resetButton(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(0,0);
        startActivity(intent);
        overridePendingTransition(0,0);
        }
    public void display_tip10(double tip){
        TextView tip10 = findViewById(R.id.whereTipShows);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipC = formatter.format(tip);
        String tipMessage = getString(R.string.tip10_show) + (tipC);
         tip10.setText(tipMessage);
        tip10.setTextSize(40);
        String blue = "#18FFFF";
        int blueInt = Color.parseColor(blue);
        tip10.setTextColor(blueInt);
    }
    public void display_tip20(double tip){
        TextView tip20 = findViewById(R.id.whereTipShows);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipC = formatter.format(tip);
        String tipMessage = getString(R.string.tip20_show) + (tipC);
        tip20.setText(tipMessage);
        tip20.setTextSize(40);
        String blue = "#18FFFF";
        int blueInt = Color.parseColor(blue);
        tip20.setTextColor(blueInt);
    }
    public void display_tip30(double tip){
        TextView tip30 = findViewById(R.id.whereTipShows);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipC = formatter.format(tip);
        String tipMessage = getString(R.string.tip30_show) + (tipC);
        tip30.setText(tipMessage);
        tip30.setTextSize(40);
        String blue = "#18FFFF";
        int blueInt = Color.parseColor(blue);
        tip30.setTextColor(blueInt);
    }
    public void display_tip40(double tip){
        TextView tip40 = findViewById(R.id.whereTipShows);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipC = formatter.format(tip);
        String tipMessage = getString(R.string.tip40_show) + (tipC);
        tip40.setText(tipMessage);
        tip40.setTextSize(40);
        String blue = "#18FFFF";
        int blueInt = Color.parseColor(blue);
        tip40.setTextColor(blueInt);
    }
    public void display_tip50(double tip){
        TextView tip50 = findViewById(R.id.whereTipShows);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipC = formatter.format(tip);
        String tipMessage = getString(R.string.tip50_show) + (tipC);
        tip50.setText(tipMessage);
        tip50.setTextSize(40);
        String blue = "#18FFFF";
        int blueInt = Color.parseColor(blue);
        tip50.setTextColor(blueInt);
    }

}
