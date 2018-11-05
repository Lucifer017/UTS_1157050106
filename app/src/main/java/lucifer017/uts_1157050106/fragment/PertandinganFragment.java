package lucifer017.uts_1157050106.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import lucifer017.uts_1157050106.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import lucifer017.uts_1157050106.adapter.PertandinganAdapter;
import lucifer017.uts_1157050106.model.Pertandingan;

public class PertandinganFragment extends Fragment {

    @BindView(R.id.rv_pertandingan)
    RecyclerView rvPertandingan;

    private PertandinganAdapter mAdapter;
    List<Pertandingan> listPertandingan = new ArrayList<>();


    public PertandinganFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pertandingan, container, false);
        ButterKnife.bind(this, v);

        initTokoData();
        initRecyclerView();

        return v;
    }

    private void initTokoData() {
        listPertandingan.add(new Pertandingan(
                "Cardiff", "https://upload.wikimedia.org/wikipedia/id/4/43/Cardiff_City_Crest_2012.svg.png", "0",
                "Leicester", "https://preview.ibb.co/hexC3L/1200px-Leicester-City-crest-svg.png", "1",
                "https://www.bbc.com/sport/football/46000538"));
        listPertandingan.add(new Pertandingan(
                "Arsenal", "http://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4df.png", "1",
                "Liverpool", "https://upload.wikimedia.org/wikipedia/hif/b/bd/Liverpool_FC.png", "1",
                "https://www.bbc.com/sport/football/46086629"));
        listPertandingan.add(new Pertandingan(
                "Wolves", "https://image.ibb.co/hpoMV0/Wolverhampton-Wanderers-FC.png", "2",
                "Tottenham", "https://image.ibb.co/kGkUHf/580b57fcd9996e24bc43c4ee.png", "3",
                "https://www.bbc.com/sport/football/46000540"));
        listPertandingan.add(new Pertandingan(
                "Manchester City", "https://upload.wikimedia.org/wikipedia/sco/thumb/e/eb/Manchester_City_FC_badge.svg/410px-Manchester_City_FC_badge.svg.png", "6",
                "Southampton", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c9/FC_Southampton.svg/1200px-FC_Southampton.svg.png", "1",
                "http://www.squawka.com/en/news/man-city-6-1-southampton-every-player-rated-as-raheem-sterling-and-co-smash-the-saints-for-six/1067134"));
        listPertandingan.add(new Pertandingan(
                "Chelsea", "http://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4e1.png", "3",
                "Crystal Palace", "https://upload.wikimedia.org/wikipedia/id/6/6d/Logo_Persija.png", "2",
                "https://www.football.london/chelsea-fc/fixtures-results/kepa-chelsea-loftus-cheek-luiz-15372467"));
    }

    private void initRecyclerView() {
        rvPertandingan.setHasFixedSize(true);
        rvPertandingan.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new PertandinganAdapter(getContext(), listPertandingan);
        rvPertandingan.setAdapter(mAdapter);
    }
}
