package com.evolutioninc.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by That's Enam on 6/29/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolderStudent> {
    LayoutInflater layoutInflater;
    List<Student> studentList = Collections.EMPTY_LIST;

    public MyAdapter(Context context, List<Student> data) {
        layoutInflater = LayoutInflater.from(context);
        studentList = data;
    }

    @Override
    public MyViewHolderStudent onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.recycler_view, parent, false);
        MyViewHolderStudent myViewHolder = new MyViewHolderStudent(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolderStudent holder, int position) {
        holder.textView.setText(studentList.get(position).name);
       // holder.imageView.setImageResource(studentList.get(position).iconId);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyViewHolderStudent extends RecyclerView.ViewHolder {
       // ImageView imageView = null;
        TextView textView = null;

        public MyViewHolderStudent(View itemView) {
            super(itemView);
           // imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }

    }


}
