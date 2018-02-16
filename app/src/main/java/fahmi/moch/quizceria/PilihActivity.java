package fahmi.moch.quizceria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PilihActivity extends AppCompatActivity {
    @BindView(R.id.l_asia)
    ImageButton L_asia;
    @BindView(R.id.l_eropa)
    ImageButton L_eropa;
    @BindView(R.id.l_america)
    ImageButton L_america;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);
        ButterKnife.bind(this);

        L_asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(PilihActivity.this,PracticeActivity.class);
                startActivity(i);
            }
        });


        L_eropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(PilihActivity.this,Practice2Activity.class);
                startActivity(i);
            }
        });


        L_america.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(PilihActivity.this,Practice3Activity.class);
                startActivity(i);
            }
        });
    }
}
