package com.example.balar.uts;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ipa extends AppCompatActivity {

    WebView pl_ipa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipa);

        pl_ipa = findViewById(R.id.pl_ipa);

        pl_ipa.setWebChromeClient(new MyChrome());
        pl_ipa.setWebViewClient(new Browser_home());
        pl_ipa.loadUrl("file:///android_asset/ipa.html");

    }

    private class MyChrome extends WebChromeClient {
    }

    private class Browser_home extends WebViewClient {
        Browser_home() {
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            setTitle(view.getTitle());
            super.onPageFinished(view, url);

        }
    }
}
