package com.example.alfred;

import android.app.Application;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.util.Vector;

public class RequestFormation extends Application {


    String texte = new String();
    RequestFormation(){
        Log.i("yoyo","Initialise");
    }

    void listenFormation(RequestQueue queue) {
        Log.i("essai requete ", "1");
        // Instantiate the RequestQueue.

        String url = "https://www.google.com/";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        texte = response;
                        Log.i("essai requete ", "2");
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                texte = "That didn't work!";
                Log.i("essai requete ", "3");
            }
        }
        );
         Log.i("essai requete ", "4");
    }

    public void JSoupEssai() {
        try {
            Log.i("JSoup","Debut");
            Document doc = Jsoup.connect("https://www.google.com").get();

            // With the document fetched, we use JSoup's title() method to fetch the title
            Log.i("Title:", doc.title());

            // In case of any IO errors, we want the messages written to the console
        } catch (IOException e) {
            Log.e("JSoup","Rate");
        }
    }


//   String listenFormation()  {
//        String retour = new String();
//        try {
//            Document doc = Jsoup.connect("https://www.google.com/").userAgent("Mozilla/5.0").get();
//                Log.i("retour",doc.title());
//                retour = doc.title();
//        }catch(IOException e) {
//            Log.e("erreur", e.toString());
//            retour= e.toString();
//        }
//
//    return retour;
//   };


//
}
