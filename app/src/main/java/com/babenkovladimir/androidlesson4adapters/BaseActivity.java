package com.babenkovladimir.androidlesson4adapters;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

  protected void showToast(String message) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
  }

}
