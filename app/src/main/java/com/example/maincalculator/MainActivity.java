package com.example.maincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bequal, bdot, bC, bAC;
    EditText et1;
    Double mValOne, mValTwo;
    boolean mAdd, mSub, mMul, mDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.button14);
        b1=(Button) findViewById(R.id.button9);
        b2=(Button) findViewById(R.id.button10);
        b3=(Button) findViewById(R.id.button11);
        b4=(Button) findViewById(R.id.button5);
        b5=(Button) findViewById(R.id.button6);
        b6=(Button) findViewById(R.id.button7);
        b7=(Button) findViewById(R.id.button1);
        b8=(Button) findViewById(R.id.button2);
        b9=(Button) findViewById(R.id.button3);
        badd=(Button) findViewById(R.id.button16);
        bsub=(Button) findViewById(R.id.button12);
        bmul=(Button) findViewById(R.id.button8);
        bdiv=(Button) findViewById(R.id.button4);
        bequal=(Button) findViewById(R.id.button15);
        bdot=(Button) findViewById(R.id.button13);
        bC=(Button) findViewById(R.id.button17);
        bAC=(Button) findViewById(R.id.button18);
        et1=(EditText) findViewById(R.id.editText1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1==null) {
                    et1.setText("");
                }
                else{
                    mValOne=Double.parseDouble(et1.getText()+"");
                    mAdd=true;
                    et1.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1==null) {
                    et1.setText("");
                }
                else{
                    mValOne=Double.parseDouble(et1.getText()+"");
                    mSub=true;
                    et1.setText(null);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1==null) {
                    et1.setText("");
                }
                else{
                    mValOne=Double.parseDouble(et1.getText()+"");
                    mMul=true;
                    et1.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1==null) {
                    et1.setText("");
                }
                else {
                    mValOne = Double.parseDouble(et1.getText() + "");
                    mDiv = true;
                    et1.setText(null);
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValTwo=Double.parseDouble(et1.getText()+"");
                if(mAdd==true) {
                    et1.setText(mValOne+mValTwo+"");
                    mAdd=false;
                }
                if(mSub==true) {
                    et1.setText(mValOne-mValTwo+"");
                    mSub=false;
                }
                if(mMul==true) {
                    et1.setText(mValOne*mValTwo+"");
                    mMul=false;
                }
                if(mDiv==true) {
                    et1.setText(mValOne/mValTwo+"");
                    mDiv=false;
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+".");
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
            }
        });


    }
}


