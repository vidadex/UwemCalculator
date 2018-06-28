package com.example.android.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String displayScreen = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Resets the score for both teams back to 0.
     */

    public void resetScore(View v) {
       String displayScreen = "0";
        display(displayScreen);

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void showOne(View v) {
        display(displayScreen + "1");
    }
    public void showTwo(View v) {
        display(displayScreen + "2");
    }
    public void showThree(View v) {
        display("3");
    }
    public void showFour(View v) {
        display("4");
    }
    public void showFive(View v) {
        display("5");
    }
    public void showSix(View v) {
        display("6");
    }
    public void showSeven(View v) {
        display("7");
    }
    public void showEight(View v) {
        display("8");
    }
    public void showNine(View v) {
        display("9");
    }
    public void showZero(View v) {
        display("0");
    }
    public void showZeroZero(View v) {
        display("00");
    }

    public void showPoint(View v) {
        display(displayScreen + ".");
    }
    public void showPlus(View v) {
        display( displayScreen + "+");

    }
    public void showMinus(View v) {
        display( displayScreen + "-");
    }
    public void showMultiply(View v) {
        display( displayScreen + "*");
    }
    public void showDivide(View v) {
        display( displayScreen + "/");
    }






    public void display(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}