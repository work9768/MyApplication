package com.example.osp160.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import com.example.osp160.myapplication.R;
import com.example.osp160.myapplication.constatnt.SessionManager;

public class Dashboard extends AppCompatActivity {


    // Session Manager Class
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Dashboard");

        // Session class instance
        session = new SessionManager(getApplicationContext());


        /**
         * Call this function whenever you want to check user login
         * This will redirect user to LoginActivity is he is not
         * logged in
         * */
        //session.checkLogin();


        LinearLayout LL_Main=(LinearLayout)findViewById(R.id.LL_Main);

        /*LL_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(Dashboard.this, CalllistActivity.class);
                startActivity(i);
            }
        });*/


    }
}
