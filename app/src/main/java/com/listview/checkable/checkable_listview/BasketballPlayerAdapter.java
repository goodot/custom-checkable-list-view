package com.listview.checkable.checkable_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.Format;
import java.util.ArrayList;

/**
 * Created by godot on 11/12/17.
 */

public class BasketballPlayerAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<BasketballPlayer> basketballPlayers;

    public BasketballPlayerAdapter(Context context, ArrayList<BasketballPlayer> basketballPlayers){
        this.context = context;
        this.basketballPlayers = basketballPlayers;

    }

    @Override
    public int getCount() {
        return this.basketballPlayers.size();
    }

    @Override
    public BasketballPlayer getItem(int position) {
        return this.basketballPlayers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_view_item, parent, false);

        ImageView playerPhotoImageView = (ImageView) view.findViewById(R.id.player_photo_image_view);
        TextView playerNameTextView = (TextView) view.findViewById(R.id.player_name_text_view);
        TextView playerAgeTextView = (TextView) view.findViewById(R.id.player_age_text_view);
        TextView playerHeightTextView = (TextView) view.findViewById(R.id.player_height_text_view);

        BasketballPlayer basketballPlayer = this.basketballPlayers.get(position);

        playerPhotoImageView.setImageDrawable(context.getResources().getDrawable(basketballPlayer.getImageResource()));
        playerNameTextView.setText(basketballPlayer.getName());
        playerAgeTextView.setText(basketballPlayer.getAge().toString() + " years old");
        playerHeightTextView.setText(basketballPlayer.getHeight().toString() + " cm");


        return view;
    }
}