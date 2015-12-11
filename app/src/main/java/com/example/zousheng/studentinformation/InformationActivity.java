package com.example.zousheng.studentinformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Zou Sheng on 2015/12/9.
 */
public class InformationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        String studentname = getIntent().getStringExtra("name");
        String qq = getIntent().getStringExtra("QQ");
        String telephonenumber = getIntent().getStringExtra("Telephonenumber");
        TextView Name = (TextView) findViewById(R.id.Name);
        TextView QQ = (TextView) findViewById(R.id.QQ);
        TextView Telephonenumber = (TextView) findViewById(R.id.Telephonenumber);
        Name.setText(studentname);
        QQ.setText(qq);
        Telephonenumber.setText(telephonenumber);
    }
}
