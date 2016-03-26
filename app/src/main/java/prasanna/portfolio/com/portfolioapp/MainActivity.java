package prasanna.portfolio.com.portfolioapp;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStreamer = (Button) findViewById(R.id.btn_streamer);
        Button btnScores = (Button) findViewById(R.id.btn_scores);
        Button btnLibrary = (Button) findViewById(R.id.btn_library);
        Button btnBigger = (Button) findViewById(R.id.btn_bigger);
        Button btnReader = (Button) findViewById(R.id.btn_reader);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer app", Toast.LENGTH_SHORT).show();
            }
        });

        btnReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader app", Toast.LENGTH_SHORT).show();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Library app", Toast.LENGTH_SHORT).show();
            }
        });

        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Scores app", Toast.LENGTH_SHORT).show();
            }
        });

        btnBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app" + R.string.string_btn_bigger, Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
            }
        });

        btnCapstone.getBackground().setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_ATOP);
        btnBigger.getBackground().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_ATOP);
        btnReader.getBackground().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_ATOP);
        btnLibrary.getBackground().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_ATOP);
        btnScores.getBackground().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_ATOP);
        btnStreamer.getBackground().setColorFilter(getResources().getColor(R.color.colorGray), PorterDuff.Mode.SRC_ATOP);


    }
}
