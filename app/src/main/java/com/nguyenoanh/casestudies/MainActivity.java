package com.nguyenoanh.casestudies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Item> arrayList;

    ItemAdapter adapter;
    StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<> ();

        recyclerView = findViewById(R.id.recycler_view);
        manager = new StaggeredGridLayoutManager (2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager (manager);

        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh));

        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh1));
        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh2));

        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh3));

        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh4));
        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh5));

        arrayList.add(
                new Item ("PETER ARANDO",
                        "LOS ANGELES CA, USA",
                        R.drawable.anh6));
        adapter = new ItemAdapter (this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}
