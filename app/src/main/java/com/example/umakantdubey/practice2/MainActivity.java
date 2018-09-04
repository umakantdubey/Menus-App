package com.example.umakantdubey.practice2;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
                if(id==R.id.id_profile)
                {
                    return true;
                }
                if(id==R.id.id_setting)
                {
                    return true;
                }
                if(id==R.id.id_exit)
                {
                    return true;
                }
                if(id==R.id.id_update)
                {
                    return true;
                }
                if(id==R.id.id_download)
                {
                    return true;
                }
                if(id==R.id.id_upload) {
                    return true;
                }
                if(id==R.id.id_share)
                {
                    return true;
                }
                if(id==R.id.id_tool)
                {
                    return true;
                }
                if(id==R.id.id_help)
                {
                    return true;
                }
        return super.onOptionsItemSelected(item);

    }
}
