package cn.chuangblog.materialdrawerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Log.e("TAG", "onClick1");

        Intent intent1 = new Intent(this, NavigationViewActivity.class);
        startActivity(intent1);

    }

    public void onClick2(View view) {
        Log.e("TAG", "onClick2");
    }
}
