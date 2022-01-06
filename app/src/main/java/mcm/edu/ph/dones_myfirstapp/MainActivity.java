package mcm.edu.ph.dones_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageButton plsbonk;
    TextView nybonked, bonked;
    String TAG = "doggo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plsbonk = (ImageButton) findViewById(R.id.bonk2);
        nybonked = (TextView) findViewById(R.id.nybonked);
        bonked = (TextView) findViewById(R.id.bonked);

        Log.d(TAG, "not yet bonked");

        plsbonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plsbonk.setVisibility(View.INVISIBLE);
                nybonked.setVisibility(View.INVISIBLE);
                bonked.setVisibility(View.VISIBLE);
                Log.d(TAG, "yayyy");
            }
        });
    }
}