package com.test.sri.intelltest1;



 import android.annotation.SuppressLint;
 import android.graphics.Color;
 import android.support.v4.content.ContextCompat;
 import android.support.v4.view.ViewPager;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.support.v7.widget.LinearLayoutManager;
 import android.support.v7.widget.RecyclerView;
 import android.support.v7.widget.Toolbar;
 import android.util.Log;
 import android.view.View;
 import android.widget.Button;
 import android.widget.ScrollView;
 import android.widget.TextView;
 import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //declaring variables
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager rvLayoutManager;
    private RecyclerView.Adapter rvAdapter;
    private ArrayList<String> dataSet;
    private Button b1,b2,b3;
    private ScrollView sv;
    FragementAdapter fragmentAdapter;
    private TextView resultTextView;
    private Toolbar myToolbar;
    private String primaryColor,primaryColorDark,primaryColorAccent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataSet=new ArrayList<>();
        for (int i = 0; i <5; i++) {
            dataSet.add("item "+(i+1));
        }

        setContentView(R.layout.activity_main);

         myToolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        b1=findViewById(R.id.redButton);
        b2=findViewById(R.id.Greenbutton);
        b3=findViewById(R.id.blueButton);
        sv=findViewById(R.id.scrollView);
        resultTextView=findViewById(R.id.outputTextView);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        rvLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(rvLayoutManager);
        rvAdapter= new MainAdapter(dataSet,this,resultTextView);
        recyclerView.setAdapter(rvAdapter);
        ViewPager vpPager =  findViewById(R.id.viewPager);
        fragmentAdapter = new FragementAdapter(getSupportFragmentManager());
        vpPager.setAdapter(fragmentAdapter);


        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {

                 myToolbar.setBackgroundColor(getResources().getColor(R.color.redPrimary));
                getWindow().setStatusBarColor(getResources().getColor(R.color.redPrimaryDark));
                sv.setBackgroundColor(getResources().getColor(R.color.redAccent));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myToolbar.setBackgroundColor(getResources().getColor(R.color.greenPrimary));
                getWindow().setStatusBarColor(getResources().getColor(R.color.greenPrimaryDark));
                sv.setBackgroundColor(getResources().getColor(R.color.greenAccent));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myToolbar.setBackgroundColor(getResources().getColor(R.color.bluePrimary));
                getWindow().setStatusBarColor(getResources().getColor(R.color.bluePrimaryDark));
                sv.setBackgroundColor(getResources().getColor(R.color.blueAccent));

            }
        });

    }
    public void setText(String s){
        resultTextView.setText("Please select one the items........ ");
    }


}
