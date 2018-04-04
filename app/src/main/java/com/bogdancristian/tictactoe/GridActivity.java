package com.bogdancristian.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }
    static boolean turn = true;
    public void cellClick(View v) {

        TextView cell = (TextView) findViewById(v.getId());


        String content = (String) cell.getText();
        if (content == "") {


            switch (cell.getId()) {

                case R.id.cell11:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell12:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell13:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell21:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell22:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell23:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell31:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell32:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;
                case R.id.cell33:
                    if (turn) {
                        cell.setText(R.string.X);
                    } else {
                        cell.setText(R.string.O);
                    }
                    turn = !turn;
                    break;

            }
        }
    }
}
