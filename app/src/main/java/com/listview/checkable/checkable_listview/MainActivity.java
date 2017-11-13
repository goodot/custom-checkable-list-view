package com.listview.checkable.checkable_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        final ArrayList<BasketballPlayer> basketballPlayers = new ArrayList<>();

        BasketballPlayer player1 = new BasketballPlayer();
        player1.setImageResource(R.drawable.ginobili);
        player1.setName("Emanuel Ginobili");
        player1.setAge(40);
        player1.setHeight(198);

        BasketballPlayer player2 = new BasketballPlayer();
        player2.setImageResource(R.drawable.rodriguez);
        player2.setName("Sergio Rodriguez");
        player2.setAge(31);
        player2.setHeight(191);

        BasketballPlayer player3 = new BasketballPlayer();
        player3.setImageResource(R.drawable.zaza);
        player3.setName("Zaza Pachulia");
        player3.setAge(33);
        player3.setHeight(211);

        BasketballPlayer player4 = new BasketballPlayer();
        player4.setImageResource(R.drawable.boris);
        player4.setName("Boris Diaw");
        player4.setAge(35);
        player4.setHeight(203);

        basketballPlayers.add(player1);
        basketballPlayers.add(player2);
        basketballPlayers.add(player3);
        basketballPlayers.add(player4);

        BasketballPlayerAdapter adapter = new BasketballPlayerAdapter(this, basketballPlayers);

        listView.setAdapter(adapter);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);




    }
}
