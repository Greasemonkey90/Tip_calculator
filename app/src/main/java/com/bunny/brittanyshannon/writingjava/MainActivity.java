package com.bunny.brittanyshannon.writingjava;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    double amount = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * These gettingTip methods get the tip based on which percentage the user chooses.
     *
     * @return tip -- the calculated tip based on check amount entered;
     */
    public double gettingTip10() {
        EditText theTip = findViewById(R.id.enteredAmount);
        amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .10;
        tip = Math.round(tip * 100) / 100.0d;
        return tip;
    }

    public double gettingTip20() {
        EditText theTip = findViewById(R.id.enteredAmount);
        amount = Double.parseDouble(theTip.getEditableText().toString());
        double tip = amount * .20;
        tip = Math.round(tip * 100) / 100.0d;
        return tip;
    }

    public double gettingTip30() {
        EditText theTip = findViewById(R.id.enteredAmount);
        amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .30;
        tip = Math.round(tip * 100) / 100.0d;
        return tip;
    }

    public double gettingTip40() {
        EditText theTip = findViewById(R.id.enteredAmount);
        amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .40;
        tip = Math.round(tip * 100) / 100.0d;
        return tip;
    }

    public double gettingTip50() {
        EditText theTip = findViewById(R.id.enteredAmount);
        amount = Double.parseDouble(theTip.getText().toString());
        double tip = amount * .50;
        tip = Math.round(tip * 100) / 100.0d;
        return tip;
    }

    /**
     * These clickButton methods display the tip when any button with a percentage is pressed.
     *
     * @param view displays calculated tip
     */
    public void clickButton10(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this, getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        } else {
            display_tip10(gettingTip10());
            display_new_amount(gettingTip10());
        }
    }

    public void clickButton20(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this, getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        } else {
            display_tip20(gettingTip20());
            display_new_amount(gettingTip20());
        }
    }

    public void clickButton30(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this, getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        } else {
            display_tip30(gettingTip30());
            display_new_amount(gettingTip30());
        }
    }

    public void clickButton40(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this, getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        } else {
            display_tip40(gettingTip40());
            display_new_amount(gettingTip40());
        }
    }

    public void clickButton50(View view) {
        EditText theAmount = findViewById(R.id.enteredAmount);
        if (theAmount.length() == 0) {
            Toast.makeText(this, getString(R.string.valid_amount), Toast.LENGTH_SHORT).show();
        } else {
            display_tip50(gettingTip50());
            display_new_amount(gettingTip50());
        }
    }

    /**
     * resetButton restarts the whole application from the onCreate method
     *
     * @param view This reruns the app when pressed
     */
    public void resetButton(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
        //This line of code is called so the display doesn't flash when it resets the app
        overridePendingTransition(0, 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    /**
     * These display_tip methods determine how each individual tip
     * appears when button is pressed
     *
     * @param tip -- takes in the tip determined from methods above
     */
    public void display_tip10(double tip) {
        TextView tip10 = findViewById(R.id.tip10_button);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipFormatted = formatter.format(tip);
        String tipMessage = getString(R.string.tip10_show) + (tipFormatted);
        tip10.setText(tipMessage);
        tip10.setTextSize(18);
        tip10.setTextColor(Color.WHITE);
    }

    public void display_tip20(double tip) {
        TextView tip20 = findViewById(R.id.tip20_button);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipFormatted = formatter.format(tip);
        String tipMessage = getString(R.string.tip20_show) + (tipFormatted);
        tip20.setText(tipMessage);
        tip20.setTextSize(18);
        tip20.setTextColor(Color.WHITE);
    }

    public void display_tip30(double tip) {
        TextView tip30 = findViewById(R.id.tip30_button);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipFormatted = formatter.format(tip);
        String tipMessage = getString(R.string.tip30_show) + (tipFormatted);
        tip30.setText(tipMessage);
        tip30.setTextSize(18);
        tip30.setTextColor(Color.WHITE);
    }

    public void display_tip40(double tip) {
        TextView tip40 = findViewById(R.id.tip40_button);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipFormatted = formatter.format(tip);
        StringBuilder tipMessage = new StringBuilder(getString(R.string.tip40_show));
        tipMessage.append(tipFormatted);
        tip40.setText(tipMessage);
        tip40.setTextSize(18);
        tip40.setTextColor(Color.WHITE);
    }

    public void display_tip50(double tip) {
        TextView tip50 = findViewById(R.id.tip50_button);
        NumberFormat formatter = new DecimalFormat("#0.00");
        String tipFormatted = formatter.format(tip);
        StringBuilder tipMessage = new StringBuilder(getString(R.string.tip50_show));
        tipMessage.append(tipFormatted);
        tip50.setText(tipMessage);
        tip50.setTextSize(18);
        tip50.setTextColor(Color.WHITE);
    }

    /**
     * This method calculates and displays new bill amount under tip buttons
     * @param tip takes in the tip based on which percentage button is pressed
     */
    public void display_new_amount(double tip) {
        TextView newAmount = findViewById(R.id.whereNewBillAmountShows);
        StringBuilder newAmountMessage = new StringBuilder(getString(R.string.bill_amount));
        NumberFormat formatter = new DecimalFormat("#0.00");
        double finalAmount = tip + amount;
        String amountFormatted = formatter.format(finalAmount);
        newAmountMessage.append(amountFormatted);
        String color = "#00E5FF";
        newAmount.setTextColor(Color.parseColor(color));
        newAmount.setTextSize(32);
        newAmount.setText(newAmountMessage);

    }

}
