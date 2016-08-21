package com.submission.selden.recipebookapplication;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class hAdapter extends RecyclerView.Adapter<hAdapter.ViewHolder> {

    private String[] titles = {"Korean Food",
            "Italy Food",
            "American Food",
            "China Food",
            "Japaneses Food",
            "India Food",
            "French Food",
            "English Food"};

    private int[] images = { R.drawable.bbab,
            R.drawable.italy,
            R.drawable.american,
            R.drawable.china,
            R.drawable.japan,
            R.drawable.india,
            R.drawable.french,
            R.drawable.english };

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public TextView itemTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage =
                    (ImageView)itemView.findViewById(R.id.iv_image);
            itemTitle =
                    (TextView)itemView.findViewById(R.id.tv_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.home_card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}
