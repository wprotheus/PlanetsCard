package com.wprotheus.mobile1cardplanetas.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.wprotheus.mobile1cardplanetas.R;
import com.wprotheus.mobile1cardplanetas.interfaces.RecyclerViewInterface;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
    private List<Planeta> planetas;
    private RecyclerViewInterface listener;

    public MyAdapter(List<Planeta> planetas, RecyclerViewInterface listener)
    {
        this.planetas = planetas;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itens_card, parent, false), listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        if(position != RecyclerView.NO_POSITION) {
            holder.imgPlaneta.setImageResource(planetas.get(position).getPlanetaId());
            holder.nomePlaneta.setText(planetas.get(position).getNomePlaneta());
            holder.descPlaneta.setText(planetas.get(position).getDescPlaneta());
        }
    }

    @Override
    public int getItemCount()
    {
        return planetas.size();
    }
}