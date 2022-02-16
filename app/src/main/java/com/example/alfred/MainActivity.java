package com.example.alfred;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.alfred.SiteUPMC.ressourceJSon;
import com.example.alfred.SiteUPMC.ressourceUPMC;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.alfred.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String HTMLessai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = findViewById(R.id.main_button_essai);
        Spinner choixSelection = findViewById(R.id.spinnerRegion);
        String[] Formations={"Meca","Physique"};
        ArrayAdapter<String> dataAdapterR = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,Formations);
        dataAdapterR.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choixSelection.setAdapter(dataAdapterR);




        ressourceJSon resJSon = new ressourceJSon();




    }

    private TextView mGreetingTextView;
    private EditText mNameEditText;
    private Button mPlayButton;




}