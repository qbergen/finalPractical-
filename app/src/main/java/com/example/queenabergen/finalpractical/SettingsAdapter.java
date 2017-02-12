package com.example.queenabergen.finalpractical;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by queenabergen on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.MyViewHolder> {
    TextView display;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
            display = (TextView) itemView.findViewById(R.id.settings_Holder);
        }
    }

    @Override
    public SettingsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.settingsholder, parent, false);
        return new SettingsAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SettingsAdapter.MyViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

}
