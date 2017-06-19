package yeseul.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    Switch switchMusic;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchMusic = (Switch)findViewById(R.id.switch_music);
        musicPlayer = MediaPlayer.create(this, R.raw.grandfather_11month);
        switchMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchMusic.isChecked())
                    musicPlayer.start();
                else
                    musicPlayer.pause();
            }
        });
    }
    protected void onStop() {
        super.onStop();
        musicPlayer.stop();
    }
}
