package com.example.math_learning_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.math_learning_app.R;

public class QuizRecyclerFragment extends Fragment {
    private RecyclerView recyclerView;

    public QuizRecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_quiz_selection, container, false);

        /*recyclerView = view.findViewById(R.id.rv_main);
        //ConstraintLayout layoutManager = new ConstraintLayout(view.getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);*/


        return view;


    }

}
