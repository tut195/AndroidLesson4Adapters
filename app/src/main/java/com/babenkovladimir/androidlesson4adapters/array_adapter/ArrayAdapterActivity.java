package com.babenkovladimir.androidlesson4adapters.array_adapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.babenkovladimir.androidlesson4adapters.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAdapterActivity extends AppCompatActivity {

  // Variables

  ListView listView;

  // Life

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_array_adapter);

    setupUI();
    setupDefaultArrayAdapter();
  }

  // Private

  private void setupUI() {
    listView = findViewById(R.id.lvListViewArrayAdapter);
  }

  private void setupDefaultArrayAdapter() {
    List<String> values = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);

    listView.setAdapter(arrayAdapter);
  }
}
