package lucifer017.uts_1157050106.activity;

import android.content.Intent;
import com.bumptech.glide.Glide;
import butterknife.BindView;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import lucifer017.uts_1157050106.model.Pertandingan;
import android.widget.ImageView;
import butterknife.ButterKnife;
import lucifer017.uts_1157050106.R;
import android.widget.TextView;

public class PertandinganActivity extends AppCompatActivity {

    @BindView(R.id.logo_tim_satu)
    ImageView imageTimSatu;
    @BindView(R.id.logo_tim_dua)
    ImageView imageTimDua;
    @BindView(R.id.txt_tim_satu)
    TextView txtTimSatu;
    @BindView(R.id.txt_tim_dua)
    TextView txtTimDua;
    @BindView(R.id.txt_score_tim_satu)
    TextView txtScoreTimSatu;
    @BindView(R.id.txt_score_tim_dua)
    TextView txtScoreTimDua;

    Pertandingan pertandingan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertandingan);
        ButterKnife.bind(this);

        pertandingan = (Pertandingan) getIntent().getSerializableExtra("pertandingan");

        initToolbar();
        initUI();
    }

    private void initToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Pertandingan");
    }

    private void initUI() {
        Glide.with(this).load(pertandingan.getLogoTimSatu()).into(imageTimSatu);
        Glide.with(this).load(pertandingan.getLogoTimDua()).into(imageTimDua);
        txtTimSatu.setText(pertandingan.getNamaTimSatu());
        txtTimDua.setText(pertandingan.getNamaTimDua());
        txtScoreTimSatu.setText(pertandingan.getScoreTimSatu());
        txtScoreTimDua.setText(pertandingan.getScoreTimDua());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home : {
                finish();
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                break;
            }
            case R.id.nav_news : {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(pertandingan.getLinkBerita()));
                startActivity(i);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
