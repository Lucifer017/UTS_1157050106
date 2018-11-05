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
                "Leicester", "https://upload.wikimedia.org/wikipedia/id/6/6c/Leicester_FC_Logo.svg", "1",
                "https://www.bbc.com/sport/football/46086629"));
        listPertandingan.add(new Pertandingan(
                "Arsenal", "https://upload.wikimedia.org/wikipedia/id/5/53/Arsenal_FC.svg", "1",
                "Liverpool", "https://upload.wikimedia.org/wikipedia/id/0/0c/Liverpool_FC.svg", "1",
                "https://sport.detik.com/sepakbola/liga-indonesia/4084710/persija-vs-persebaya-berakhir-1-1"));
        listPertandingan.add(new Pertandingan(
                "Persib", "https://3.bp.blogspot.com/-gYhAsYqZdCo/WCcDjqzGE0I/AAAAAAAAYnQ/07-Njkhdnegk2uwLzGdDxdpqXt38obzmgCLcB/s1600/PERSIB-LOGO.png", "4",
                "Persebaya", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/PERSEBAYA_SINCE_1927.png/222px-PERSEBAYA_SINCE_1927.png", "1",
                "https://www.liputan6.com/bola/read/3672351/susunan-pemain-persib-bandung-vs-persebaya-surabaya"));
        listPertandingan.add(new Pertandingan(
                "PSM", "https://vignette.wikia.nocookie.net/logopedia/images/5/5d/PSM_Makassar_-new-.png/revision/latest/scale-to-width-down/418?cb=20180405141051", "2",
                "Persib", "https://3.bp.blogspot.com/-gYhAsYqZdCo/WCcDjqzGE0I/AAAAAAAAYnQ/07-Njkhdnegk2uwLzGdDxdpqXt38obzmgCLcB/s1600/PERSIB-LOGO.png", "2",
                "https://www.goal.com/id/pertandingan/psm-v-persib/mflu4gbtlvsl10pm2cze75nu"));
        listPertandingan.add(new Pertandingan(
                "Arema", "https://upload.wikimedia.org/wikipedia/th/f/fe/AremaMalang.png", "3",
                "Persija", "https://upload.wikimedia.org/wikipedia/id/6/6d/Logo_Persija.png", "2",
                "https://bola.kompas.com/read/2018/08/05/20572838/hasil-liga-1-arema-fc-vs-persija-imbang"));
    }

    private void initRecyclerView() {
        rvPertandingan.setHasFixedSize(true);
        rvPertandingan.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new PertandinganAdapter(getContext(), listPertandingan);
        rvPertandingan.setAdapter(mAdapter);
    }
}
