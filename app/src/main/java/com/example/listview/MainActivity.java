package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] namanegara=new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Myanmar", "Cambodia", "Taiwan", "Thailand", "Vietnam", "Nepal",
            "Laos", "Japan", "India", "Australia", "China"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);
        getSupportActionBar().setTitle("ListView Sederhana");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,android.R.id.text1,namanegara);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Anda Memilih :" + namanegara[i],
                        Toast.LENGTH_LONG).show();
            }
            });

    }
}