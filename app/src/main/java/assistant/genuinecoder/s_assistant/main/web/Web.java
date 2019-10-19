package assistant.genuinecoder.s_assistant.main.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import assistant.genuinecoder.s_assistant.R;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //确保跳转到另一个网页时仍然在当前WebView显示
        webView.loadUrl("https://m.facebook.com/nrithyopasana/");
        //将百度网址导入
    }

}
