package fahmi.moch.quizceria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class ScoreActivity extends AppCompatActivity {
    Button balik;
    TextView hasil;
    ImageView emot;
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        balik = (Button) findViewById(R.id.home);
        hasil = (TextView) findViewById(R.id.tvSkorakhir);
        emot = (ImageView) findViewById(R.id.emot);

        skorakhir();

        if (x > 80) {
            emot.setImageResource(R.drawable.happy);
        } else if (x > 60) {
            emot.setImageResource(R.drawable.shappy);
        } else if (x > 40) {
            emot.setImageResource(R.drawable.confused);
        } else {
            emot.setImageResource(R.drawable.crying);
        }

        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }

    public void skorakhir() {
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        hasil.setText("YOUR SCORE : " + skorPilGan);
        x = Integer.parseInt(skorPilGan);

    }


}
