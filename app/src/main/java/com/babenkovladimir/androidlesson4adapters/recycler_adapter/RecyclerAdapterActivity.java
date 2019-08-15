package com.babenkovladimir.androidlesson4adapters.recycler_adapter;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.babenkovladimir.androidlesson4adapters.BaseActivity;
import com.babenkovladimir.androidlesson4adapters.R;
import com.babenkovladimir.androidlesson4adapters.recycler_adapter.model.BankCard;
import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapterActivity extends BaseActivity {

  // Views

  @BindView(R.id.recycler)
  RecyclerView mRecycler;

  // Variables

  private List<BankCard> bankCardList = new ArrayList<>();

  // Life

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recycler_adapter);

    ButterKnife.bind(this);
    fillBankCardList();
    setupRecycler();
  }

  private void setupRecycler() {
    MyRecyclerAdapter recyclerAdapter = new MyRecyclerAdapter();

    recyclerAdapter.setOnCardItemClick(new OnCardItemClick() {
      @Override
      public void onCardClick(String name) {
        showToast(name);
      }
    });

    LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

    mRecycler.setLayoutManager(layoutManager);
    mRecycler.setAdapter(recyclerAdapter);
    recyclerAdapter.setCards(bankCardList);
  }

  // Private

  private void fillBankCardList() {
    bankCardList.add(new BankCard("Danya", "1234 5678 9012 4578", 1000f, "21.02.2017", 1458));
    bankCardList.add(new BankCard("Vanya", "32323 4587 9012 4578", 1000f, "21.02.2017", 7896));
    bankCardList.add(new BankCard("Olya", "1234 5678 3698 4578", 1000f, "21.02.2017", 4555));
    bankCardList.add(new BankCard("Kira", "1234 5678 7854 4578", 1000f, "21.02.2017", 3563));
    bankCardList.add(new BankCard("Misha", "9874 5678 9012 4578", 1000f, "21.02.2017", 1234));
    bankCardList.add(new BankCard("Masyanya", "1234 2588 9012 4578", 1000f, "21.02.2017", 7777));
    bankCardList.add(new BankCard("Mikhalich", "1234 5678 9012 3333", 1000f, "21.02.2017", 8888));
    bankCardList.add(new BankCard("Lesha", "0000 5678 9012 4578", 1000f, "21.02.2017", 9999));
    bankCardList.add(new BankCard("Vitalik", "9999 5678 9012 4578", 1000f, "21.02.2017", 1212));
  }
}
