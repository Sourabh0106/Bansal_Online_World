package com.kratos.bansalonlineworld.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kratos.bansalonlineworld.Model.StoryModel;

import java.util.ArrayList;

import com.kratos.bansalonlineworld.R;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder> {

    ArrayList<StoryModel> list;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_rv_design, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        StoryModel model = list.get(position);
        holder.stroyImg.setImageResource(model.getStroy());
        holder.profile.setImageResource(model.getProfile());
        holder.storyType.setImageResource(model.getStoryType());
        holder.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView stroyImg, profile, storyType;
        TextView name;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            stroyImg = itemView.findViewById(R.id.addStoryImg);
            profile = itemView.findViewById(R.id.profileImage);
            storyType = itemView.findViewById(R.id.storyType);
            name = itemView.findViewById(R.id.name);
        }
    }
}
