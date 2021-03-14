package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.MyViewHolder> {
    private LayoutInflater mInflater;
    Context context;
    private String[] mStrings;

    //public MyListAdapter(String[] values){
    public MyListAdapter(Context context1, String[] values){
        context = context1;
        mStrings = values;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myrow, parent, false);
         return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.getView().setText(mStrings[position]);
    }

    @Override
    public int getItemCount() {
        return mStrings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mytext;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mytext = (TextView) itemView.findViewById(R.id.textView);
            img = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "You clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }

        public TextView getView() {
            return mytext;
        }
    }
}
