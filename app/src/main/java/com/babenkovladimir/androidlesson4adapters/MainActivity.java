package com.babenkovladimir.androidlesson4adapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.babenkovladimir.androidlesson4adapters.array_adapter.ArrayAdapterActivity;
import com.babenkovladimir.androidlesson4adapters.edittext_underline_style_example.EditTextUnderlineColorExample;
import com.babenkovladimir.androidlesson4adapters.recycler_adapter.RecyclerAdapterActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void navigateArrayAdapterActivity(View view) {
    startActivity(new Intent(this, ArrayAdapterActivity.class));
  }

  public void navigateRecyclerAdapterActivity(View view) {
    startActivity(new Intent(this, RecyclerAdapterActivity.class));
  }

  public void navigateUnderlineExample(View view) {
    startActivity(new Intent(this, EditTextUnderlineColorExample.class));
  }
}
