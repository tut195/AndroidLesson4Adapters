package com.babenkovladimir.androidlesson4adapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.babenkovladimir.androidlesson4adapters.array_adapter.ArrayAdapterActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void navigateArrayAdapterActivity(View view) {
    startActivity(new Intent(this, ArrayAdapterActivity.class));
  }

  public void navigateRecyclerAdaprerActivity(View view) {
    startActivity(new Intent(this, ArrayAdapterActivity.class));
  }
}
