package com.example.mamaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AvoidancyActivity extends AppCompatActivity {

    WebView webViewavoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avoidancy);
        webViewavoid = findViewById(R.id.webview_sub_avid);



        if (haveNetworkConnection()) {
            webViewavoid.setWebViewClient(new WebViewClient());

            webViewavoid.getSettings().setJavaScriptEnabled(true);
            webViewavoid.loadUrl("https://www.goyeafrica.bi/mamaApp/avoid.html");

        }else{
            Toast.makeText(AvoidancyActivity.this, "Check your internet Connectivity", Toast.LENGTH_LONG).show();
        }


    }


    //method to check internet availability(WiFi and MobileData)
    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }
}