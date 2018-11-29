package com.example.maei;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdapterLearning extends AppCompatActivity {

    private static final String[] data = {
            "Item1",
            "Item2",
            "Item3",
            "Item4",
            "Item5",
            "Item6",
            "Item7",
            "Item8",
            "Item9"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_learning);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_item, data);
        ListView listView = findViewById(R.id.listViewAdapterLearning);
        listView.setAdapter(adapter);
    }
}
