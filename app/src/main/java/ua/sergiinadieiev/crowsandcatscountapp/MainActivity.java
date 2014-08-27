package ua.sergiinadieiev.crowsandcatscountapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    ImageButton mCountKittyBtn;
    ImageButton mCountCrowBtn;
    TextView mKittyCountText;
    TextView mCrowCountText;
    int mCountKitty = 0;
    int mCountCrow = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountKittyBtn = (ImageButton) findViewById(R.id.kittyBtn);
        mKittyCountText = (TextView) findViewById(R.id.kittyCountText);

        mCountCrowBtn = (ImageButton) findViewById(R.id.countCrowsBtn);
        mCrowCountText = (TextView) findViewById(R.id.crownCountText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void countKitty(View view) {
        mKittyCountText.setText("Я насчитал " + ++mCountKitty + " кошек.");

    }

    public void countCrow(View view) {
        mCrowCountText.setText("Я насчитал " + ++mCountCrow + " ворон.");
    }
}
