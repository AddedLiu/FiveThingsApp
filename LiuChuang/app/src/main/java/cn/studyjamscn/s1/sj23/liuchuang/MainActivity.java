package cn.studyjamscn.s1.sj23.liuchuang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private Intent intent;

    // 跳转到设置字体教程
    public void textSize(View view) {
        intent = new Intent(this, TextSize.class);
        startActivity(intent);
    }

    // 跳转到手电筒教程
    public void torch(View view) {
        intent = new Intent(this, Torch.class);
        startActivity(intent);
    }

    // 跳转到数据教程
    public void network(View view) {
        intent = new Intent(this, Mobile_network.class);
        startActivity(intent);
    }

    // 跳转到WLAN教程
    public void wlan(View view) {
        intent = new Intent(this, WLAN.class);
        startActivity(intent);
    }

    // 跳转到联系人教程
    public void contacts(View view) {
        intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
