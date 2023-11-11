package com.example.appbansch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ListView lvPhone;
    ArrayList<Phone> arrayPhone;
    BookAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AnhXa();
        adapter = new BookAdapter(this,R.layout.book_col, arrayPhone);
        lvPhone.setAdapter(adapter);
        lvPhone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Home.this, PhoneDetail.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.imgBtnProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Profile.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.imgBtnCart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Cart.class);
                startActivity(intent);
            }
        });
    }
    void AnhXa(){
        lvPhone = (ListView) findViewById(R.id.lvBook);
        arrayPhone = new ArrayList<>();
        arrayPhone.add( new Phone(R.drawable.android,"iphone","Iphone",50.000));
        arrayPhone.add( new Phone(R.drawable.android,"samsung","Samsung",50.000));
        arrayPhone.add( new Phone(R.drawable.android,"oppo","Oppo",50.000));
    }
}