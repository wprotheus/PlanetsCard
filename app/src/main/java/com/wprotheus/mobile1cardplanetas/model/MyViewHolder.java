package com.wprotheus.mobile1cardplanetas.model;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.wprotheus.mobile1cardplanetas.R;
import com.wprotheus.mobile1cardplanetas.interfaces.RecyclerViewInterface;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    public TextView nomePlaneta;
    public TextView descPlaneta;
    public ImageView imgPlaneta;
    public Button btnApagar;
    private RecyclerViewInterface listener;

    public MyViewHolder(View itemView, RecyclerViewInterface listener)
    {
        super(itemView);
        imgPlaneta = itemView.findViewById(R.id.ivImgPlaneta);
        nomePlaneta = itemView.findViewById(R.id.tvNomePlaneta);
        descPlaneta = itemView.findViewById(R.id.tvDescPlaneta);
        btnApagar = itemView.findViewById(R.id.btnDeletar);
        this.listener = listener;
        btnApagar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION)
                    listener.onItemClick(position);
            }
        });
    }
}