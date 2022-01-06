package mcm.edu.ph.dones_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener{
    ImageButton plsbonk;
    TextView nybonked, bonked;
    String TAG = "doggo";
    MediaPlayer player;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.bonk);

        plsbonk = (ImageButton) findViewById(R.id.bonk2);
        nybonked = (TextView) findViewById(R.id.nybonked);
        bonked = (TextView) findViewById(R.id.bonked);

        Log.d(TAG, "not yet bonked");

        play();

    }
    @SuppressLint("ClickableViewAccessibility")
    public void play (){
        plsbonk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    plsbonk.setVisibility(View.INVISIBLE);
                    nybonked.setVisibility(View.INVISIBLE);
                    bonked.setVisibility(View.VISIBLE);
                    Log.d(TAG, "yayyy");
                    player.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    plsbonk.setVisibility(View.VISIBLE);
                    nybonked.setVisibility(View.VISIBLE);
                    bonked.setVisibility(View.INVISIBLE);
                    Log.d(TAG, "plz bonk again");
                }
                return false;
            }
        });
    }

    @Override
    public void onCompletion(MediaPlayer player) {
        player.stop();
        player.reset();
    }

}