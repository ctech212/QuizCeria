package fahmi.moch.quizceria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class LearnActivity extends AppCompatActivity {
    JustifiedTextView justifiedTextCiew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_learn);

        justifiedTextCiew=(JustifiedTextView) findViewById(R.id.learntext);
    }
}
