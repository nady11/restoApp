package com.example.restaurant;


import android.app.Activity;
import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class second extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);

        ListView listViewv= findViewById(R.id.listview);
        CustomAdapter customAdapter= new CustomAdapter();
        listViewv.setAdapter(customAdapter);


        String[] Food ={"Rice","Chicken","Pizza","Mushroom","Irish Patatoes","Rice","Chips and salad","Rice","Pizza"};
        Integer [] images ={R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8,R.drawable.food9};
        String[] minutes={"Min to cook:","Min to cook:","Min to cook:","Min to cook:","Min to cook:","Min to cook:","Min to cook:","Min to cook:","Min to cook:"};

        drawerLayout =(DrawerLayout) findViewById(R.id.drawernavigation);
        navigationView =(NavigationView) findViewById(R.id.navigationview);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int i ) {
            return 0;
        }

        @Override
        public View getView(int i, View View, ViewGroup parent) {
            View view= getLayoutInflater().inflate(R.layout.layout, null);

            ImageView imageView=(ImageView) findViewById(R.id.imageView2);
            TextView textView_name=(TextView)findViewById(R.id.textView_name);
            TextView textView_description=(TextView)findViewById(R.id.textView2_minutes);


            imageView.setImageResource(images[i);
            textView_name.setText(food[i]);
            textView2_minutes.setText(minutes[i]);
            return view;
        }
    }


}


}
