package lucifer017.uts_1157050106.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import butterknife.BindView;
import butterknife.ButterKnife;
import lucifer017.uts_1157050106.R;
import lucifer017.uts_1157050106.activity.MatchActivity;

import java.util.List;

import lucifer017.uts_1157050106.model.Match;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ViewHolder> {

    private Context context;
    private List<Match> listMatch;

    public MatchAdapter(Context context, List<Match> listMatch) {
        this.context = context;
        this.listMatch = listMatch;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Match match = listMatch.get(position);
        Glide.with(context).load(match.getLogoTimSatu()).into(holder.imageTimSatu);
        Glide.with(context).load(match.getLogoTimDua()).into(holder.imageTimDua);
        holder.txtTimSatu.setText(match.getNamaTimSatu());
        holder.txtTimDua.setText(match.getNamaTimDua());
        holder.cvPertandingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MatchActivity.class);
                i.putExtra("match", match);
                context.startActivity(i);
            }
        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pertandingan, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.logo_tim_satu)
        ImageView imageTimSatu;
        @BindView(R.id.logo_tim_dua)
        ImageView imageTimDua;
        @BindView(R.id.txt_tim_satu)
        TextView txtTimSatu;
        @BindView(R.id.txt_tim_dua)
        TextView txtTimDua;
        @BindView(R.id.cv_pertandingan)
        CardView cvPertandingan;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public int getItemCount() {
        return listMatch.size();
    }


}
