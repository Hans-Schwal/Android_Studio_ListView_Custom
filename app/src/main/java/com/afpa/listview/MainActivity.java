package com.afpa.listview;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // récup listview
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        List<UserAcount> listUser = new ArrayList<>();

        UserAcount user = new UserAcount("François", "admin");
        UserAcount user2 = new UserAcount("Germain", "user");
        UserAcount user3 = new UserAcount("Cédric", "guest", false);
        UserAcount user4 = new UserAcount("Hans","guest");

        listUser.add(user);
        listUser.add(user2);
        listUser.add(user3);
        listUser.add(user4);

        listView.setAdapter(new CustomListAdapter(listUser, this));
    }
}
