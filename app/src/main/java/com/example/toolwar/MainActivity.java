package com.example.toolwar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("ToolbarExample");
        toolbar.setLogo(R.drawable.icon);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Back Arrow",Toast.LENGTH_SHORT);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id =item.getItemId();
        if(id==R.id.action_settings)
        {
            Toast.makeText(getApplicationContext(), "settings",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.action_email)
        {
            Toast.makeText(getApplicationContext(), "Email",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.action_add)
        {
            Toast.makeText(getApplicationContext(), "user",Toast.LENGTH_SHORT).show();
        }
        return true;

    }
}
