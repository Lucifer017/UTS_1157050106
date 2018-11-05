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
import lucifer017.uts_1157050106.adapter.MatchAdapter;
import lucifer017.uts_1157050106.model.Match;

public class MatchFragment extends Fragment {

    @BindView(R.id.rv_pertandingan)
    RecyclerView rvPertandingan;

    private MatchAdapter mAdapter;
    List<Match> listMatch = new ArrayList<>();


    public MatchFragment() {
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
        listMatch.add(new Match(
                "Cardiff", "https://upload.wikimedia.org/wikipedia/id/4/43/Cardiff_City_Crest_2012.svg.png", "0",
                "Leicester", "https://preview.ibb.co/hexC3L/1200px-Leicester-City-crest-svg.png", "1",
                "https://www.bbc.com/sport/football/46000538"));
        listMatch.add(new Match(
                "Arsenal", "http://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4df.png", "1",
                "Liverpool", "https://upload.wikimedia.org/wikipedia/hif/b/bd/Liverpool_FC.png", "1",
                "https://www.bbc.com/sport/football/46086629"));
        listMatch.add(new Match(
                "Wolves", "https://image.ibb.co/hpoMV0/Wolverhampton-Wanderers-FC.png", "2",
                "Tottenham", "https://image.ibb.co/kGkUHf/580b57fcd9996e24bc43c4ee.png", "3",
                "https://www.bbc.com/sport/football/46000540"));
        listMatch.add(new Match(
                "Manchester City", "https://upload.wikimedia.org/wikipedia/sco/thumb/e/eb/Manchester_City_FC_badge.svg/410px-Manchester_City_FC_badge.svg.png", "6",
                "Southampton", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c9/FC_Southampton.svg/1200px-FC_Southampton.svg.png", "1",
                "http://www.squawka.com/en/news/man-city-6-1-southampton-every-player-rated-as-raheem-sterling-and-co-smash-the-saints-for-six/1067134"));
        listMatch.add(new Match(
                "Chelsea", "http://www.stickpng.com/assets/images/580b57fcd9996e24bc43c4e1.png", "3",
                "Crystal Palace", "https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Crystal_Palace_FC_logo.svg/1200px-Crystal_Palace_FC_logo.svg.png", "1",
                "https://www.football.london/chelsea-fc/fixtures-results/kepa-chelsea-loftus-cheek-luiz-15372467"));
    }

    private void initRecyclerView() {
        rvPertandingan.setHasFixedSize(true);
        rvPertandingan.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new MatchAdapter(getContext(), listMatch);
        rvPertandingan.setAdapter(mAdapter);
    }
}
