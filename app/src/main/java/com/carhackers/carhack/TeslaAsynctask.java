package com.carhackers.carhack;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by splat on 9/24/2017.
 */

public class TeslaAsynctask extends AsyncTask<Void, Void, String>
{
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {

        URL url = null;
        String inputLine;
        String result = null;
        try {
            url = new URL("https://mhacks.intrepidcs.com/api/data");
        } catch ( MalformedURLException e) {
            e.printStackTrace();
        }

        HttpsURLConnection urlConnection = null;
        try {
            urlConnection = (HttpsURLConnection) url.openConnection();
            TrustModifier.relaxHostChecking(urlConnection);
            urlConnection.setDoInput(true);
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Authorization", "Bearer d999ed0fbf442801d43503983fbaac5b6779316245e504cbc5cd3ecd8848d4cf");

            urlConnection.connect();

            //Create a new InputStreamReader
            InputStreamReader streamReader = new InputStreamReader(urlConnection.getInputStream());
            //Create a new buffered reader and String Builder
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder stringBuilder = new StringBuilder();
            //Check if the line we are reading is not null
            while((inputLine = reader.readLine()) != null){
                stringBuilder.append(inputLine);
            }
            //Close our InputStream and Buffered reader
            reader.close();
            streamReader.close();
            //Set our result equal to our stringBuilder
            result = stringBuilder.toString();

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
        return result;
    }
    @Override
    protected void onPostExecute(String s) {
        if (s != null && !s.equals("")) {
            Log.v("TeslaAPI", s);
        }
    }
}
