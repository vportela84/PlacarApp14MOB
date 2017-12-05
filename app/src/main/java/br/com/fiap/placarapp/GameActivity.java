package br.com.fiap.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String timeCasa;
    private String timeVisitante;

    private TextView tvTimeCasa;
    private TextView tvTimeVisitante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.tvTimeVisitante);

        if(getIntent() != null) {
            timeCasa = getIntent().getStringExtra("TIMECASA");
            timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");

            tvTimeCasa.setText(timeCasa);
            tvTimeVisitante.setText(timeVisitante);
        }

    }
}
