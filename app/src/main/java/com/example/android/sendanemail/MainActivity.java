package com.example.android.sendanemail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendmail(View view) {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"this is email");
        intent.putExtra(Intent.EXTRA_TEXT,"hi this is my email to you");
        intent.setType("message/rfc822");
        Intent chooser= Intent.createChooser(intent,"Send Email");
        if(chooser.resolveActivity(getPackageManager())!=null){
            startActivity(chooser);
        }
    }
}
