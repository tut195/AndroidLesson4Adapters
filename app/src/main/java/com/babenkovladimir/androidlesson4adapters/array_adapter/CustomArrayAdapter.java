package com.babenkovladimir.androidlesson4adapters.array_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.babenkovladimir.androidlesson4adapters.R;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<String> {

  private List<String> data = new ArrayList<String>();

  public List<String> getData() {
    return data;
  }

  public CustomArrayAdapter(Context context, int resource) {
    super(context, 0, resource);
  }

  public void setData(List<String> data) {
    this.data = data;
    notifyDataSetChanged();
  }

  @Override
  public int getCount() {
    return data.size();
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    String value = data.get(position);

    LayoutInflater inflater = LayoutInflater.from(getContext());
    View view = inflater.inflate(R.layout.cusom_item_array_adapter, parent, false);
    TextView tv = view.findViewById(R.id.tvItem);
    tv.setText(value);
    return view;
  }
}
