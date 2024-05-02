package com.example.project2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<WishlistItem> wishlistItems;
    private RecyclerView recyclerView;
    private WishlistAdapter adapter;
    private EditText nameEditText, priceEditText, urlEditText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView and adapter
        wishlistItems = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new WishlistAdapter(wishlistItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Initialize EditText fields and Button
        nameEditText = findViewById(R.id.nameEditText);
        priceEditText = findViewById(R.id.priceEditText);
        urlEditText = findViewById(R.id.urlEditText);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String price = priceEditText.getText().toString();
                String url = urlEditText.getText().toString();
                WishlistItem newItem = new WishlistItem(name, price, url);
                wishlistItems.add(newItem);
                adapter.notifyDataSetChanged();

                nameEditText.setText("");
                priceEditText.setText("");
                urlEditText.setText("");
            }
        });
    }
}