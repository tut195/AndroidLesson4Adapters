package com.babenkovladimir.androidlesson4adapters.array_adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.babenkovladimir.androidlesson4adapters.BaseActivity;
import com.babenkovladimir.androidlesson4adapters.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAdapterActivity extends BaseActivity {

  // Variables

  private ListView listView;
  private List<String> values;

  // Life

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_array_adapter);

    setupUI();
    setupData();
//    showDefaultAdapter();
    showCustomAdapter();
  }

  // Private

  private void setupUI() {
    listView = findViewById(R.id.lvListViewArrayAdapter);
  }

  private void showDefaultAdapter() {
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
    listView.setAdapter(arrayAdapter);
  }

  private void showCustomAdapter() {
    CustomArrayAdapter customAdapter = new CustomArrayAdapter(this, 0);
    listView.setAdapter(customAdapter);
    customAdapter.setData(values);

    listView.setOnItemClickListener(new OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String number = values.get(position);
        showToast(number);
      }
    });

  }

  private void setupData() {
    values = new ArrayList<String>(Arrays
        .asList("one", "two", "three", "four", "five", "six", "seven", "one", "two", "three", "four", "five", "six", "seven", "one", "two", "three", "four", "five", "six", "seven",
            "one", "two", "three", "four", "five", "six", "seven"));
  }
}
