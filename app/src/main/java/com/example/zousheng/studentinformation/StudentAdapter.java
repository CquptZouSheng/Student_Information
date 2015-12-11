package com.example.zousheng.studentinformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zou Sheng on 2015/12/8.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context,int textViewResourceId,List<Student> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    class ViewHolder{
        TextView studentname;
        TextView studentgrade;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Student student=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder=new ViewHolder();
            viewHolder.studentname=(TextView)view.findViewById(R.id.name);
            viewHolder.studentgrade=(TextView)view.findViewById(R.id.grade);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.studentname.setText(student.getName());
        viewHolder.studentgrade.setText(student.getGrade());
        return view;
    }

}
