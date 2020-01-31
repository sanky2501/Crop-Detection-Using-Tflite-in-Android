package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Homepage extends AppCompatActivity {

    Button BrowseImage;
    Button LiveCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homapage);

        BrowseImage=findViewById(R.id.browseImage_button);
        LiveCamera=findViewById(R.id.liveCamera_button);

        BrowseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,BrowseImage.class));
            }
        });

        LiveCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage.this,ClickImage.class));
            }
        });

    }

    public void logOut(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(Homepage.this,Login.class));
    }
}
