package com.example.zousheng.studentinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {
    private List<Student>studentList=new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        NameAndGrade nameAndGrade= new NameAndGrade();
        nameAndGrade.addStudent(studentList);
        StudentAdapter studentAdapter=new StudentAdapter(StudentActivity.this,R.layout.activity_list,studentList);
        ListView listView=(ListView)findViewById(R.id.studentlist);
        listView.setAdapter(studentAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = studentList.get(position);
                Intent intent=new Intent(StudentActivity.this,InformationActivity.class);
                intent.putExtra("name",student.getName());
                intent.putExtra("QQ",student.getQq());
                intent.putExtra("Telephonenumber",student.getTelephonenumber());
                startActivity(intent);
            }
        });
    }

}
