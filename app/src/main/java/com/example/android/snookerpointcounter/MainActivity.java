package com.example.android.snookerpointcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    static final String STATE_playerOneCurrentPoint = "player One current point";
    static final String STATE_playerTwoCurrentPoint = "player Two current point";
    static final String STATE_playerOneFrameWin = "player One frame win";
    static final String STATE_playerTwoFrameWin = "player Two frame win";
    static final String STATE_allFrameCounter = "all frame counter";
    static final String STATE_statPlayerOneRedBall = "how many red ball scored by player One";
    static final String STATE_statPlayerTwoRedBall = "how many red ball scored by player Two";
    static final String STATE_statPlayerOneYellowBall = "how many yellow ball scored by player One";
    static final String STATE_statPlayerTwoYellowBall = "how many yellow ball scored by player Two";
    static final String STATE_statPlayerOneBrownBall = "how many brown ball scored by player One";
    static final String STATE_statPlayerTwoBrownBall = "how many brown ball scored by player Two";
    static final String STATE_statPlayerOneGreenBall = "how many green ball scored by player One";
    static final String STATE_statPlayerTwoGreenBall = "how many green ball scored by player Two";
    static final String STATE_statPlayerOneBlueBall = "how many blue ball scored by player One";
    static final String STATE_statPlayerTwoBlueBall = "how many blue ball scored by player Two";
    static final String STATE_statPlayerOnePinkBall = "how many pink ball scored by player One";
    static final String STATE_statPlayerTwoPinkBall = "how many pink ball scored by player Two";
    static final String STATE_statPlayerOneBlackBall = "how many black ball scored by player One";
    static final String STATE_statPlayerTwoBlackBall = "how many black ball scored by player One";
    static final String STATE_undoPlayerOneValueIndex = "index for undo arraylist for player One";
    static final String STATE_undoPlayerTwoValueIndex = "index for undo arraylist for player Two";
    static final String STATE_playerOneAtTheTable = "radio button state holder for player one";
    static final String STATE_playerTwoAtTheTable = "radio button state holder for player Two";
    static final String STATE_PlayerOneShootsCounterList = "stores the scored balls in order for player One";
    static final String STATE_PlayerTwoShootsCounterList = "stores the scored balls in order for player Two";

    static final int REDVALUE = 1;
    static final int YELLOWVALUE = 2;
    static final int GREENVALUE = 3;
    static final int BROWNVALUE = 4;
    static final int BLUEVALUE = 5;
    static final int PINKVALUE = 6;
    static final int BLACKVALUE = 7;

    int playerOneCurrentPoint = 0;
    int playerTwoCurrentPoint = 0;
    int playerOneFrameWin = 0;
    int playerTwoFrameWin = 0;
    int allFrameCounter = 0;
    int statPlayerOneRedBall = 0;
    int statPlayerTwoRedBall = 0;
    int statPlayerOneYellowBall = 0;
    int statPlayerTwoYellowBall = 0;
    int statPlayerOneBrownBall = 0;
    int statPlayerTwoBrownBall = 0;
    int statPlayerOneGreenBall = 0;
    int statPlayerTwoGreenBall = 0;
    int statPlayerOneBlueBall = 0;
    int statPlayerTwoBlueBall = 0;
    int statPlayerOnePinkBall = 0;
    int statPlayerTwoPinkBall = 0;
    int statPlayerOneBlackBall = 0;
    int statPlayerTwoBlackBall = 0;
    int undoPlayerOneValueIndex = 0;
    int undoPlayerTwoValueIndex = 0;

    boolean playerOneAtTheTable = false;
    boolean playerTwoAtTheTable = false;

    ArrayList PlayerOneShootsCounterList = new ArrayList();
    ArrayList PlayerTwoShootsCounterList = new ArrayList();

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_playerOneCurrentPoint, playerOneCurrentPoint);
        savedInstanceState.putInt(STATE_playerTwoCurrentPoint, playerTwoCurrentPoint);
        savedInstanceState.putInt(STATE_playerOneFrameWin, playerOneFrameWin);
        savedInstanceState.putInt(STATE_playerTwoFrameWin, playerTwoFrameWin);
        savedInstanceState.putInt(STATE_allFrameCounter, allFrameCounter);
        savedInstanceState.putInt(STATE_statPlayerOneRedBall, statPlayerOneRedBall);
        savedInstanceState.putInt(STATE_statPlayerTwoRedBall, statPlayerTwoRedBall);
        savedInstanceState.putInt(STATE_statPlayerOneYellowBall, statPlayerOneYellowBall);
        savedInstanceState.putInt(STATE_statPlayerTwoYellowBall, statPlayerTwoYellowBall);
        savedInstanceState.putInt(STATE_statPlayerOneBrownBall, statPlayerOneBrownBall);
        savedInstanceState.putInt(STATE_statPlayerTwoBrownBall, statPlayerTwoBrownBall);
        savedInstanceState.putInt(STATE_statPlayerOneGreenBall, statPlayerOneGreenBall);
        savedInstanceState.putInt(STATE_statPlayerTwoGreenBall, statPlayerTwoGreenBall);
        savedInstanceState.putInt(STATE_statPlayerOneBlueBall, statPlayerOneBlueBall);
        savedInstanceState.putInt(STATE_statPlayerTwoBlueBall, statPlayerTwoBlueBall);
        savedInstanceState.putInt(STATE_statPlayerOnePinkBall, statPlayerOnePinkBall);
        savedInstanceState.putInt(STATE_statPlayerTwoPinkBall, statPlayerTwoPinkBall);
        savedInstanceState.putInt(STATE_statPlayerOneBlackBall, statPlayerOneBlackBall);
        savedInstanceState.putInt(STATE_statPlayerTwoBlackBall, statPlayerTwoBlackBall);
        savedInstanceState.putInt(STATE_undoPlayerOneValueIndex, undoPlayerOneValueIndex);
        savedInstanceState.putInt(STATE_undoPlayerTwoValueIndex, undoPlayerTwoValueIndex);

        savedInstanceState.putBoolean(STATE_playerOneAtTheTable, playerOneAtTheTable);
        savedInstanceState.putBoolean(STATE_playerTwoAtTheTable, playerTwoAtTheTable);

        savedInstanceState.putIntegerArrayList(STATE_PlayerOneShootsCounterList, PlayerOneShootsCounterList);
        savedInstanceState.putIntegerArrayList(STATE_PlayerTwoShootsCounterList, PlayerTwoShootsCounterList);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

         playerOneCurrentPoint = savedInstanceState.getInt(STATE_playerOneCurrentPoint);
        playerTwoCurrentPoint = savedInstanceState.getInt(STATE_playerTwoCurrentPoint);
        playerOneFrameWin = savedInstanceState.getInt(STATE_playerOneFrameWin);
        playerTwoFrameWin = savedInstanceState.getInt(STATE_playerTwoFrameWin);
        allFrameCounter = savedInstanceState.getInt(STATE_allFrameCounter);
        statPlayerOneRedBall = savedInstanceState.getInt(STATE_statPlayerOneRedBall);
        statPlayerTwoRedBall = savedInstanceState.getInt(STATE_statPlayerTwoRedBall);
        statPlayerOneYellowBall = savedInstanceState.getInt(STATE_statPlayerOneYellowBall);
        statPlayerTwoYellowBall = savedInstanceState.getInt(STATE_statPlayerTwoYellowBall);
        statPlayerOneBrownBall = savedInstanceState.getInt(STATE_statPlayerOneBrownBall);
        statPlayerTwoBrownBall = savedInstanceState.getInt(STATE_statPlayerTwoBrownBall);
        statPlayerOneGreenBall = savedInstanceState.getInt(STATE_statPlayerOneGreenBall);
        statPlayerTwoGreenBall = savedInstanceState.getInt(STATE_statPlayerTwoGreenBall);
        statPlayerOneBlueBall = savedInstanceState.getInt(STATE_statPlayerOneBlueBall);
        statPlayerTwoBlueBall = savedInstanceState.getInt(STATE_statPlayerTwoBlueBall);
        statPlayerOnePinkBall = savedInstanceState.getInt(STATE_statPlayerOnePinkBall);
        statPlayerTwoPinkBall = savedInstanceState.getInt(STATE_statPlayerTwoPinkBall);
        statPlayerOneBlackBall = savedInstanceState.getInt(STATE_statPlayerOneBlackBall);
        statPlayerTwoBlackBall = savedInstanceState.getInt(STATE_statPlayerTwoBlackBall);
        undoPlayerOneValueIndex = savedInstanceState.getInt(STATE_undoPlayerOneValueIndex);
        undoPlayerTwoValueIndex = savedInstanceState.getInt(STATE_undoPlayerTwoValueIndex);

        playerOneAtTheTable = savedInstanceState.getBoolean(STATE_playerOneAtTheTable);
        playerTwoAtTheTable = savedInstanceState.getBoolean(STATE_playerTwoAtTheTable);

        PlayerOneShootsCounterList = savedInstanceState.getIntegerArrayList(STATE_PlayerOneShootsCounterList);
        PlayerTwoShootsCounterList = savedInstanceState.getIntegerArrayList(STATE_PlayerTwoShootsCounterList);

        resetTheDisplay();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void brownClick(View view){
        whoScores(BROWNVALUE);
        displayCurrentPoint();
        displayStatistic();
    }

    public void yellowClick(View view){
        whoScores(YELLOWVALUE);
        displayCurrentPoint();
        displayStatistic();
    }

    public void redClick(View view){
        whoScores(REDVALUE);
        displayCurrentPoint();
        displayStatistic();
        if (allFrameCounter==0){
            toastMessageSetTheAllMatch();
        }
    }

    public void greenClick(View view){
        whoScores(GREENVALUE);
        displayCurrentPoint();
        displayStatistic();
    }

    public void blueClick(View view){
        whoScores(BLUEVALUE);
        displayCurrentPoint();
        displayStatistic();
    }

    public void pinkClick(View view){
        whoScores(PINKVALUE);
        displayCurrentPoint();
        displayStatistic();
    }

    public void blackClick(View view){
        whoScores(BLACKVALUE);
        displayCurrentPoint();
        displayStatistic();

    }

    public void playerOneFrameWin(View view){
        playerOneFrameWin++;

        if(playerOneFrameWin > (allFrameCounter/2)){
            EditText txtPlayerOneName = (EditText) findViewById(R.id.txt_playerOne);
            toastMessageGameWinning(String.valueOf(txtPlayerOneName.getText()));
        }

        setTheVariablesToDefault();
        displayFramePoint();
        displayCurrentPoint ();
        displayStatistic();

    }

    public void playerTwoFrameWin(View view){
        playerTwoFrameWin++;

        if(playerTwoFrameWin > (allFrameCounter/2)){
            EditText txtPlayerTwoName = (EditText) findViewById(R.id.txt_playerTwo);
            toastMessageGameWinning(String.valueOf(txtPlayerTwoName.getText()));
        }

        setTheVariablesToDefault();
        displayFramePoint();
        displayCurrentPoint ();
        displayStatistic();
    }

    public void setAllFrame(View view){
        allFrameCounter++;
        displayFramePoint();
    }

    public void undoLastScore(View view){
        displayUndo();
        displayCurrentPoint();
        displayStatistic();
    }

    public void oneFaultPoint(View view){
        RadioButton rdbPlayerOneShoots = (RadioButton) findViewById(R.id.rdb_playerOne);
        RadioButton rdbPlayerTwoShoots = (RadioButton) findViewById(R.id.rdb_playerTwo);

        if (rdbPlayerOneShoots.isChecked()){
            playerTwoCurrentPoint++;
        }
        if(rdbPlayerTwoShoots.isChecked()){
            playerOneCurrentPoint++;
        }

        displayCurrentPoint();
    }

    public void resetCurrentFrame(View view){
        setTheVariablesToDefault();
        displayCurrentPoint ();
        displayStatistic();
    }


    public void toastMessageSetTheAllMatch() {
        Context context = getApplicationContext();
        CharSequence text = "Please set the All match counter by clicking it.(Secound line in the middle)";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void setTheVariablesToDefault() {
        RadioGroup rdgGroup = (RadioGroup) findViewById(R.id.rg_holdRadioButtons);
        rdgGroup.clearCheck();


        playerOneCurrentPoint=0;
        playerTwoCurrentPoint=0;
        statPlayerOneRedBall = 0;
        statPlayerTwoRedBall = 0;
        statPlayerOneYellowBall = 0;
        statPlayerTwoYellowBall = 0;
        statPlayerOneBrownBall = 0;
        statPlayerTwoBrownBall = 0;
        statPlayerOneGreenBall = 0;
        statPlayerTwoGreenBall = 0;
        statPlayerOneBlueBall = 0;
        statPlayerTwoBlueBall = 0;
        statPlayerOnePinkBall = 0;
        statPlayerTwoPinkBall = 0;
        statPlayerOneBlackBall = 0;
        statPlayerTwoBlackBall = 0;
        undoPlayerOneValueIndex = 0;
        undoPlayerTwoValueIndex = 0;

        PlayerOneShootsCounterList.clear();
        PlayerTwoShootsCounterList.clear();

    }

    public void resetAllToZero(View view){
        setTheVariablesToDefault();
        playerOneFrameWin=0;
        playerTwoFrameWin=0;
        allFrameCounter=0;
        displayFramePoint();
        displayCurrentPoint ();
        displayStatistic();
    }

    public void displayCurrentPoint (){
        Button btnPlayerOneCurrentPoint = (Button) findViewById(R.id.btn_playerOneCurrent);
        btnPlayerOneCurrentPoint.setText(String.valueOf(playerOneCurrentPoint));

        Button btnPlayerTwoCurrentPoint = (Button) findViewById(R.id.btn_playerTwoCurrent);
        btnPlayerTwoCurrentPoint.setText(String.valueOf(playerTwoCurrentPoint));
    }



    public void displayFramePoint(){
        TextView txtPlayerOneFrameWin = (TextView) findViewById(R.id.txt_playerOneFrameWin);
        TextView txtPlayerTwoFrameWin = (TextView) findViewById(R.id.txt_playerTwoFrameWin);
        txtPlayerOneFrameWin.setText(String.valueOf(playerOneFrameWin));
        txtPlayerTwoFrameWin.setText(String.valueOf(playerTwoFrameWin));

        TextView txtAllFrameCounter = (TextView) findViewById(R.id.txt_allFrameCounter);
        txtAllFrameCounter.setText(String.valueOf(allFrameCounter));
    }


    public void displayStatistic(){
        TextView txtPlayerOneRedStat = (TextView) findViewById(R.id.txt_playerOneRedBallCount);
        txtPlayerOneRedStat.setText(String.valueOf(statPlayerOneRedBall));

        TextView txtPlayerTwoRedStat = (TextView) findViewById(R.id.txt_playerTwoRedBallCount);
        txtPlayerTwoRedStat.setText(String.valueOf(statPlayerTwoRedBall));

        TextView txtPlayerOneYellowStat = (TextView) findViewById(R.id.txt_playerOneYellowBallCount);
        txtPlayerOneYellowStat.setText(String.valueOf(statPlayerOneYellowBall));

        TextView txtPlayerTwoYellowStat = (TextView) findViewById(R.id.txt_playerTwoYellowBallCount);
        txtPlayerTwoYellowStat.setText(String.valueOf(statPlayerTwoYellowBall));

        TextView txtPlayerOneBrownStat = (TextView)findViewById(R.id.txt_playerOneBrownBallCount);
        txtPlayerOneBrownStat.setText(String.valueOf(statPlayerOneBrownBall));

        TextView txtPlayerTwoBrownStat = (TextView)findViewById(R.id.txt_playerTwoBrownBallCount);
        txtPlayerTwoBrownStat.setText(String.valueOf(statPlayerTwoBrownBall));

        TextView txtPlayerOneGreenStat = (TextView) findViewById(R.id.txt_playerOneGreenBallCount);
        txtPlayerOneGreenStat.setText(String.valueOf(statPlayerOneGreenBall));

        TextView txtPlayerTwoGreenStat = (TextView) findViewById(R.id.txt_playerTwoGreenBallCount);
        txtPlayerTwoGreenStat.setText(String.valueOf(statPlayerTwoGreenBall));

        TextView txtPlayerOneBlueStat = (TextView) findViewById(R.id.txt_playerOneBlueBallCount);
        txtPlayerOneBlueStat.setText(String.valueOf(statPlayerOneBlueBall));

        TextView txtPlayerTwoBlueStat = (TextView) findViewById(R.id.txt_playerTwoBlueBallCount);
        txtPlayerTwoBlueStat.setText(String.valueOf(statPlayerTwoBlueBall));

        TextView txtPlayerOnePinkStat = (TextView) findViewById(R.id.txt_playerOnePinkBallCount);
        txtPlayerOnePinkStat.setText(String.valueOf(statPlayerOnePinkBall));

        TextView txtPlayerTwoPinkStat = (TextView) findViewById(R.id.txt_playerTwoPinkBallCount);
        txtPlayerTwoPinkStat.setText(String.valueOf(statPlayerTwoPinkBall));

        TextView txtPlayerOneBlackStat = (TextView) findViewById(R.id.txt_playerOneBlackBallCount);
        txtPlayerOneBlackStat.setText(String.valueOf(statPlayerOneBlackBall));

        TextView txtPlayerTwoBlackStat = (TextView) findViewById(R.id.txt_playerTwoBlackBallCount);
        txtPlayerTwoBlackStat.setText(String.valueOf(statPlayerTwoBlackBall));

    }

    public void displayUndo(){
        RadioButton rdbPlayerOneShoots = (RadioButton) findViewById(R.id.rdb_playerOne);
        RadioButton rdbPlayerTwoShoots = (RadioButton) findViewById(R.id.rdb_playerTwo);
        if (!rdbPlayerOneShoots.isChecked() && !rdbPlayerTwoShoots.isChecked()) {
            Context context = getApplicationContext();
            CharSequence text = "From who should I take the last point?";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        if (undoPlayerOneValueIndex > 0) {
            int playerOneLastElementValue;

            if (rdbPlayerOneShoots.isChecked() && PlayerOneShootsCounterList != null && !PlayerOneShootsCounterList.isEmpty()) {
                playerOneAtTheTable = true;
                playerTwoAtTheTable = false;
                playerOneLastElementValue = (int) PlayerOneShootsCounterList.get(PlayerOneShootsCounterList.size() - 1);
                playerOneCurrentPoint -= playerOneLastElementValue;
                statisticCountMinus(playerOneLastElementValue);
                undoPlayerOneValueIndex--;
                PlayerOneShootsCounterList.remove(PlayerOneShootsCounterList.size()-1);
            }
        }

        if (undoPlayerTwoValueIndex > 0) {
            int playerTwoLastElement;

            if (rdbPlayerTwoShoots.isChecked() && PlayerTwoShootsCounterList != null && !PlayerTwoShootsCounterList.isEmpty()) {
                playerTwoAtTheTable = true;
                playerOneAtTheTable = false;
                playerTwoLastElement = (int) PlayerTwoShootsCounterList.get(PlayerTwoShootsCounterList.size() - 1);

                playerTwoCurrentPoint -= playerTwoLastElement;
                statisticCountMinus(playerTwoLastElement);
                undoPlayerTwoValueIndex--;
                PlayerTwoShootsCounterList.remove(PlayerTwoShootsCounterList.size() - 1);
            }
        }
        noMoreUndoPoint();
    }


    public void noMoreUndoPoint(){
        RadioButton rdbPlayerOneShoots =  (RadioButton) findViewById(R.id.rdb_playerOne);
        RadioButton rdbPlayerTwoShoots = (RadioButton) findViewById(R.id.rdb_playerTwo);
        EditText txtPlayerOneName = (EditText) findViewById(R.id.txt_playerOne);
        EditText txtPlayerTwoName = (EditText) findViewById(R.id.txt_playerTwo);

        if (undoPlayerOneValueIndex == 0 && rdbPlayerOneShoots.isChecked()){
            Context context = getApplicationContext();
            CharSequence text = "There is NO point to undo from " +txtPlayerOneName.getText();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        if(undoPlayerTwoValueIndex == 0 && rdbPlayerTwoShoots.isChecked()){
            Context context = getApplicationContext();
            CharSequence text = "There is NO point to undo from " + txtPlayerTwoName.getText();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void toastMessageGameWinning(String name)
    {
        Context context = getApplicationContext();
        CharSequence text = name +" has won the game :-)!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void resetTheDisplay(){
        displayFramePoint();
        displayCurrentPoint();
        displayStatistic();
    }

    public void whoScores(int value){
        RadioButton rdbPlayerOneShoots = (RadioButton) findViewById(R.id.rdb_playerOne);
        RadioButton rdbPlayerTwoShoots = (RadioButton) findViewById(R.id.rdb_playerTwo);

        if(rdbPlayerOneShoots.isChecked()){
            playerOneAtTheTable=true;
            playerTwoAtTheTable=false;
            playerOneCurrentPoint+=value;
            PlayerOneShootsCounterList.add(undoPlayerOneValueIndex,value);
            undoPlayerOneValueIndex++;

            statisticCount(value);
        }
        if (rdbPlayerTwoShoots.isChecked()){
            playerTwoAtTheTable=true;
            playerOneAtTheTable=false;
            playerTwoCurrentPoint+=value;
            PlayerTwoShootsCounterList.add(undoPlayerTwoValueIndex,value);
            undoPlayerTwoValueIndex++;

            statisticCount(value);
        }

        if (!rdbPlayerOneShoots.isChecked() && !rdbPlayerTwoShoots.isChecked()) {
            Context context = getApplicationContext();
            CharSequence text = "Choose the Player who is at the table!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }



    public void statisticCount(int value){
        switch (value){
            case 1 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                    statPlayerOneRedBall++;
                }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoRedBall++;
                } ; break;

            case 2 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOneYellowBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoYellowBall++;
                } ; break;

            case 3 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOneGreenBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoGreenBall++;
                } ; break;

            case 4 :  if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOneBrownBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoBrownBall++;
                } ; break;

            case 5 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOneBlueBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoBlueBall++;
                } ; break;

            case 6 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOnePinkBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoPinkBall++;
                } ; break;

            case 7 : if (playerOneAtTheTable && !playerTwoAtTheTable){
                statPlayerOneBlackBall++;
            }
                if(!playerOneAtTheTable && playerTwoAtTheTable){
                    statPlayerTwoBlackBall++;
                } ; break;
    }
}


public void statisticCountMinus(int value){
    switch (value){
        case 1 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneRedBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoRedBall--;
            } ; break;

        case 2 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneYellowBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoYellowBall--;
            } ; break;

        case 3 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneGreenBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoGreenBall--;
            } ; break;

        case 4 :  if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneBrownBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoBrownBall--;
            } ; break;

        case 5 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneBlueBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoBlueBall--;
            } ; break;

        case 6 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOnePinkBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoPinkBall--;
            } ; break;

        case 7 : if (playerOneAtTheTable && !playerTwoAtTheTable){
            statPlayerOneBlackBall--;
        }
            if(!playerOneAtTheTable && playerTwoAtTheTable){
                statPlayerTwoBlackBall--;
            } ; break;
    }
}


}
