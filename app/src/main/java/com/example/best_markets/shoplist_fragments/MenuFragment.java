package com.example.best_markets.shoplist_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.best_markets.R;
import com.example.best_markets.SingleAdapter;


public class MenuFragment extends Fragment {

    private String shopname;

    public MenuFragment() {
        shopname = "old";
    }

    public MenuFragment(String shopname) {
        this.shopname = shopname;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, null);

        if(this.shopname == "old"){
            SingleAdapter adapter = new SingleAdapter() ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);

//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String strText = (String) parent.getItemAtPosition(position);
//            }
//        });
        }


        if(shopname == "bu"){
            SingleAdapter adapter = new SingleAdapter("bu") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(shopname == "dack"){
            SingleAdapter adapter = new SingleAdapter("dac") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(this.shopname == "eunho"){
            SingleAdapter adapter = new SingleAdapter("eunho") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(shopname == "gangganae"){
            SingleAdapter adapter = new SingleAdapter("gangganae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(shopname == "gorocae"){
            SingleAdapter adapter = new SingleAdapter("gorocae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(this.shopname == "heelockgalchi"){
            SingleAdapter adapter = new SingleAdapter("heelockgalchi") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(shopname == "hongduggae"){
            SingleAdapter adapter = new SingleAdapter("hongduggae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(shopname == "jinokhalmae"){
            SingleAdapter adapter = new SingleAdapter("jinokhalmae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(this.shopname == "maknae"){
            SingleAdapter adapter = new SingleAdapter("maknae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(this.shopname == "monyeo"){
            SingleAdapter adapter = new SingleAdapter("monyeo") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(shopname == "obok"){
            SingleAdapter adapter = new SingleAdapter("obok") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(shopname == "ques"){
            SingleAdapter adapter = new SingleAdapter("ques") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(this.shopname == "uelock"){
            SingleAdapter adapter = new SingleAdapter("uelock") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(this.shopname == "wangsung"){
            SingleAdapter adapter = new SingleAdapter("wangsung") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }
        if(shopname == "wonjonudecheesekimbop"){
            SingleAdapter adapter = new SingleAdapter("wonjonudecheesekimbop") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }

        if(shopname == "wonjosunheenae"){
            SingleAdapter adapter = new SingleAdapter("wonjosunheenae") ;

            ListView listview = (ListView) view.findViewById(R.id.listView_custom);
            listview.setAdapter(adapter);
        }



        return view;
        //return inflater.inflate(R.layout.fragment_menu, container, false);

    }

}