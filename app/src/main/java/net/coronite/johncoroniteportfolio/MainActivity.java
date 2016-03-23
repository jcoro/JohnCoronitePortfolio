package net.coronite.johncoroniteportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /** Called when the user touches the button */
    public void buttonToast(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "";
        switch(view.getId())
        {
            case (R.id.content_main_btn_spotify_streamer):
                text = "This button will launch my Streamer App";
                break;

            case (R.id.content_main_btn_scores_app):
                text = "This button will launch my Scores App";
                break;

            case (R.id.content_main_btn_library_app):
                text = "This button will launch my Library App";
                break;

            case (R.id.content_main_btn_build_it_bigger):
                text = "This button will launch my Build It App";
                break;

            case (R.id.content_main_btn_xyz_reader):
                text = "This button will launch my XYZ Reader App";
                break;

            case (R.id.content_main_btn_capstone_app):
                text = "This button will launch my Capstone App";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
