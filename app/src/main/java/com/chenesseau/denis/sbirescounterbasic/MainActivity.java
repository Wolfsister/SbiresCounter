package com.chenesseau.denis.sbirescounterbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sub1,sub2,sub3,sub4;
    private Button add1,add2,add3,add4;
    private TextView name1,name2,name3,name4;
    private TextView nbPoints1,nbPoints2,nbPoints3,nbPoints4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sub1 = (Button) findViewById(R.id.subPlayer1);
        this.add1 = (Button) findViewById(R.id.addPlayer1);
        this.name1 = (TextView) findViewById(R.id.namePlayer1);
        this.nbPoints1 = (TextView) findViewById(R.id.nbPointsPlayer1);
        this.nbPoints1.setText("5");

        this.sub2 = (Button) findViewById(R.id.subPlayer2);
        this.add2 = (Button) findViewById(R.id.addPlayer2);
        this.name2 = (TextView) findViewById(R.id.namePlayer2);
        this.nbPoints2 = (TextView) findViewById(R.id.nbPointsPlayer2);
        this.nbPoints2.setText("5");

        this.sub3 = (Button) findViewById(R.id.subPlayer3);
        this.add3 = (Button) findViewById(R.id.addPlayer3);
        this.name3 = (TextView) findViewById(R.id.namePlayer3);
        this.nbPoints3 = (TextView) findViewById(R.id.nbPointsPlayer3);
        this.nbPoints3.setText("5");

        this.sub4 = (Button) findViewById(R.id.subPlayer4);
        this.add4 = (Button) findViewById(R.id.addPlayer4);
        this.name4 = (TextView) findViewById(R.id.namePlayer4);
        this.nbPoints4 = (TextView) findViewById(R.id.nbPointsPlayer4);
        this.nbPoints4.setText("5");




    }

    public void subPoint(View v){
        int id = v.getId();

        if(id == this.sub1.getId()){
            int nbPts = Integer.parseInt((String) nbPoints1.getText());
            nbPoints1.setText(Integer.toString(nbPts - 1));
        }else if(id == this.sub2.getId()){
            int nbPts = Integer.parseInt((String) nbPoints2.getText());
            nbPoints2.setText(Integer.toString(nbPts - 1));
        }else if(id == this.sub3.getId()){
            int nbPts = Integer.parseInt((String) nbPoints3.getText());
            nbPoints3.setText(Integer.toString(nbPts - 1));
        }else if(id == this.sub4.getId()){
            int nbPts = Integer.parseInt((String) nbPoints4.getText());
            nbPoints4.setText(Integer.toString(nbPts - 1));
        }

    }

    public void addPoint(View v){
        int id = v.getId();

        if(id == this.add1.getId()){
            int nbPts = Integer.parseInt((String) nbPoints1.getText());
            nbPoints1.setText(Integer.toString(nbPts + 1));
        }else if(id == this.add2.getId()){
            int nbPts = Integer.parseInt((String) nbPoints2.getText());
            nbPoints2.setText(Integer.toString(nbPts + 1));
        }else if(id == this.add3.getId()){
            int nbPts = Integer.parseInt((String) nbPoints3.getText());
            nbPoints3.setText(Integer.toString(nbPts + 1));
        }else if(id == this.add4.getId()){
            int nbPts = Integer.parseInt((String) nbPoints4.getText());
            nbPoints4.setText(Integer.toString(nbPts + 1));
        }

    }

}
