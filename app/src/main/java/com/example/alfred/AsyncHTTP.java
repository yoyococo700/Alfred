package com.example.alfred;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

    public class AsyncHTTP extends AsyncTask<String, Integer, String> {

        private AppCompatActivity myActivity;

        public AsyncHTTP(AppCompatActivity mainActivity) {
            myActivity = mainActivity;
        }

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected String doInBackground(String... strings) {
            publishProgress(1);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

            URL url = null;
            HttpURLConnection urlConnection = null;
            String result = null;
            try {
                url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection(); // Open
                InputStream in = new BufferedInputStream(urlConnection.getInputStream()); // Stream
                publishProgress(2);
                result = readStream(in); // Read stream
            }
            catch (MalformedURLException e) { e.printStackTrace(); }
            catch (IOException e) { e.printStackTrace(); }
            finally { if (urlConnection != null)
                urlConnection.disconnect();  }

            publishProgress(4);
            return result; // returns the result
        }


        private String readStream(InputStream is) throws IOException {
            StringBuilder sb = new StringBuilder();
            BufferedReader r = new BufferedReader(new InputStreamReader(is),1000);
            for (String line = r.readLine(); line != null; line =r.readLine()){
                sb.append(line);
            }
            is.close();
            return sb.toString();
        }


    }
