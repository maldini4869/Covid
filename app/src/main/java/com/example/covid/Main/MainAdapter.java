package com.example.covid.Main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covid.Model.DetailModel;
import com.example.covid.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private List<DetailModel> Provincelist;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback =onItemClickCallback;
    }

    public MainAdapter(List<DetailModel> Provincelist){

        this.Provincelist = Provincelist;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.provinsi,parent,false);
        return new MainViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {

        holder.provinsi.setText(Provincelist.get(position).getProvinsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(Provincelist.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {

        return Provincelist.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        public TextView provinsi;

        public MainViewHolder(View itemView){
            super(itemView);
            provinsi= itemView.findViewById(R.id.provinsi);
        }
    }
    public interface OnItemClickCallback{
        void onItemClicked (DetailModel detailModel);
    }
}
