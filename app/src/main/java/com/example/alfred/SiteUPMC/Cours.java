package com.example.alfred.SiteUPMC;

import android.util.Log;

public class Cours {
    public String title;
    public String description;
    public String salle;
    public String start;
    public String end;
    public String class_name;
    public int ID;

    Cours(){
        title = new String();
        description = new String();
        salle = new String();
        start = new String();
        end = new String();
        class_name = new String();
        ID = 0;
    }

    void AfficherCours(){
        Log.i("Cours","----------------------------------------------");
        Log.i("Cours",title);
        Log.i("Cours",description);
        Log.i("Cours",salle);
        Log.i("Cours",start);
        Log.i("Cours",end);
        Log.i("Cours",class_name);
        Log.i("Cours","----------------------------------------------");
    }

}
