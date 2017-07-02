package com.evolutioninc.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by That's Enam on 6/30/2017.
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.MyViewHolder> {
    ArrayList<Section> sections;
    Context context;
    LayoutInflater layoutInflater;
    MyAdapter myAdapter;

//hello dear
    public SectionAdapter(Context context, ArrayList<Section> sections) {
        this.sections = sections;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public SectionAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.section_view_item, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(SectionAdapter.MyViewHolder holder, int position) {
        holder.sectionTitle.setText(sections.get(position).sectionName);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        myAdapter = new MyAdapter(context, sections.get(position).students);
        holder.recyclerView.setAdapter(myAdapter);

    }

    @Override
    public int getItemCount() {
        return sections.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView sectionTitle;
        RecyclerView recyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);
            sectionTitle = (TextView) itemView.findViewById(R.id.sectionTittle);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.list_item_Box_Recycler);

        }

    }
}
