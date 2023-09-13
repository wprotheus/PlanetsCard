package com.wprotheus.mobile1cardplanetas.view;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.wprotheus.mobile1cardplanetas.R;
import com.wprotheus.mobile1cardplanetas.interfaces.RecyclerViewInterface;
import com.wprotheus.mobile1cardplanetas.model.DataSetPlanetas;
import com.wprotheus.mobile1cardplanetas.model.MyAdapter;
import com.wprotheus.mobile1cardplanetas.model.Planeta;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements RecyclerViewInterface
{
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<Planeta> planetas = new ArrayList<>();
    private LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvPlanetas);
        planetas = DataSetPlanetas.planetas();


//        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new MyAdapter(planetas, this);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(int position)
    {
        planetas.remove(position);
        myAdapter.notifyItemRemoved(position);
        if(planetas.size()==0)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("A lista está vazia!")
                    .setMessage("O aplicativo será reiniciado.")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            finish();
                            Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
                            startActivity(intent);
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}