package com.maxpasit.test_action_listener_xml_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mheeText;
    Button mheeBut;
    ImageButton mheeImBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mheeText = (TextView)findViewById(R.id.mheeText);
        mheeBut = (Button)findViewById(R.id.mheeButton);
        mheeImBut = (ImageButton)findViewById(R.id.imageButton);
        mheeBut.setOnClickListener(this);
        mheeImBut.setOnClickListener(this);
//        mheeImBut.setOnClickListener(new Button.OnClickListener()
//            {
//                public void onClick(View view)
//                {
//                    mheeText.setText("You did it!!!!");
//                }
//            }
//        );
//        mheeBut.setOnLongClickListener(
//                new Button.OnLongClickListener() {
//                    public boolean onLongClick(View v) {
//                        mheeText.setText(R.string.testString);
//                        return true;
//                    }
//                }
//        );
    }

    @Override
    public void onClick(View view) {
        if(view == mheeBut) {
            mheeText.setText(R.string.testString);
        }
        if(view == mheeImBut) {
            mheeText.setText(R.string.testString);
        }
    }
}
