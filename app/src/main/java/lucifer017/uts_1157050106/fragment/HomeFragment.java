package lucifer017.uts_1157050106.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import butterknife.ButterKnife;
import lucifer017.uts_1157050106.R;
import android.widget.TextView;
import butterknife.BindView;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    @BindView(R.id.txt_nama)
    TextView txtNama;
    @BindView(R.id.txt_nim)
    TextView txtNim;
    @BindView(R.id.txt_tanggal_lahir)
    TextView txtTanggalLahir;
    @BindView(R.id.txt_alamat)
    TextView txtAlamat;

    public HomeFragment() {
        // Required empty public constructor
    }

    private void initUI() {
        txtNama.setText("Muhammad Irfan Firdaus");
        txtNim.setText("1157050106");
        txtTanggalLahir.setText("Tri Darmayoga, 30 Mei 1998");
        txtAlamat.setText("Jl. Manisi, Kosan Al-Barokah, Pasirbiru, Cibiru, Bandung");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, v);

        initUI();

        return v;
    }


}
