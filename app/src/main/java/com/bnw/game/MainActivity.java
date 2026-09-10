package com.bnw.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().getDecorView().setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_FULLSCREEN |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        WebView view = new WebView(this);
        view.setBackgroundColor(0xFF000000);
        WebSettings s = view.getSettings();
        s.setJavaScriptEnabled(false);
        s.setBuiltInZoomControls(false);
        s.setDisplayZoomControls(false);
        s.setLoadWithOverviewMode(true);
        s.setUseWideViewPort(true);
        view.setWebViewClient(new WebViewClient());
        view.loadDataWithBaseURL(
            "file:///android_asset/game/",
            "<!doctype html><html><head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"><style>html,body{margin:0;width:100%;height:100%;overflow:hidden;background:#000}img{width:100vw;height:100vh;object-fit:cover;display:block}</style></head><body><img src=\"background.jpg\"></body></html>",
            "text/html", "UTF-8", null);
        setContentView(view);
    }
}
