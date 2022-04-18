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
import com.example.best_markets.ReviewAdapter;

public class ReviewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_review, container, false);
        View view = inflater.inflate(R.layout.fragment_review, container, false);

        ReviewAdapter adapter = new ReviewAdapter();

        ListView listview = (ListView) view.findViewById(R.id.listView_custom1);
        listview.setAdapter(adapter);

        return view;
    }

}