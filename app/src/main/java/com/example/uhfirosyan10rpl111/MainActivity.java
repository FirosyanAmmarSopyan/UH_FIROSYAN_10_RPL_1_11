package com.example.uhfirosyan10rpl111;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycleView;

    String s1[], s2[];
    int images[] = {R.drawable.java,R.drawable.javascript,R.drawable.c,R.drawable.c_plus_plus,
            R.drawable.c_pagar,R.drawable.kotlin,R.drawable.php,R.drawable.rubyy,R.drawable.python,
            R.drawable.pascall};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.Bahasa_Program);
        s2 = getResources().getStringArray(R.array.Deskripsi);

        MyAdapter myAdapter =  new MyAdapter(this, s1, s2, images);
        recycleView.setAdapter(myAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}