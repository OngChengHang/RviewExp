package com.example.rviewexp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdpaterProcess extends RecyclerView.Adapter<AdpaterProcess.ViewProcessHolder> {

    Context context;
    private ArrayList<ModelData> item; //memanggil modelData

    public AdpaterProcess(Context context, ArrayList<ModelData> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public ViewProcessHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false); //memanggil layout list recyclerview
        ViewProcessHolder processHolder = new ViewProcessHolder(view);
        return processHolder;
    }

    @Override
    public void onBindViewHolder(ViewProcessHolder holder, int position) {

        final ModelData data = item.get(position);
        holder.UserID.setText(data.getUserID());//menampilkan data
        holder.Result.setText(data.getCompetitionResult());
        holder.Description.setText(data.getCompetitionDescription());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewProcessHolder extends RecyclerView.ViewHolder {

        TextView UserID;
        TextView Result;
        TextView Description;

        public ViewProcessHolder(View itemView) {
            super(itemView);

            UserID = (TextView) itemView.findViewById(R.id.idTVUserID);
            Result = (TextView) itemView.findViewById(R.id.idTVCompetitionResult);
            Description = (TextView) itemView.findViewById(R.id.idTVCompetitionDescription);

        }
    }
}