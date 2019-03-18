package com.example.gykcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Kisi> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.Liste);

        personList.add(new Kisi("Beril Baltacı", "17.03.2019"));
        personList.add(new Kisi("Şevval Tekkol", "16.03.2019"));

        KisiAdapter kisiAdapter =new KisiAdapter(personList, this);
        listView.setAdapter(kisiAdapter);

    }
}
