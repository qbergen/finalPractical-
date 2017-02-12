package com.example.queenabergen.finalpractical;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by queenabergen on 2/12/17.
 */

public class NaviAdapter extends RecyclerView.Adapter<NaviAdapter.MyViewHolder> {
    ImageView iconWidget;
    RelativeLayout relativeLayout;
    TextView buttonTitle;

    int[] buttonTitles = {R.string.Button_1, R.string.Button_2, R.string.Button_3, R.string.Button_4};
    int[] naviIcons = {R.drawable.hearticon, R.drawable.messageicon, R.drawable.settingsicon, R.drawable.logout};

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(final View itemView) {
            super(itemView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.buttonHolder);
            iconWidget = (ImageView) itemView.findViewById(R.id.iconNavi);
            buttonTitle = (TextView) itemView.findViewById(R.id.buttonTitle);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()) {
                        case 0:
                            Toast.makeText(v.getContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(v.getContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Intent intent = new Intent(v.getContext(), Settings.class);
                            itemView.getContext().startActivity(intent);
                            break;
                        case 3:
                            Toast.makeText(v.getContext(), "Selected Login Activity", Toast.LENGTH_SHORT).show();
                            
                    }
                }
            });
        }
    }

    @Override
    public NaviAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.button_layout, parent, false);
        return new NaviAdapter.MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final NaviAdapter.MyViewHolder holder, final int position) {
        buttonTitle.setText(buttonTitles[position]);
        iconWidget.setImageResource(naviIcons[position]);

    }

    @Override
    public int getItemCount() {
        return buttonTitles.length;
    }


}
