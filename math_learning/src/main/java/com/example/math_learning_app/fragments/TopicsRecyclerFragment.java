package com.example.math_learning_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.math_learning_app.R;
import com.example.math_learning_app.adapter.TopicAdapter;

public class TopicsRecyclerFragment extends Fragment {

    public TopicsRecyclerFragment(){

    }
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_topic_list, container, false);
        recyclerView = view.findViewById(R.id.rv_main);
        //ConstraintLayout layoutManager = new ConstraintLayout(view.getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        TopicAdapter topicAdapter = new TopicAdapter();
        /*
        Gson gson = new Gson();
        String jsonString = FakeAPI.getMostViewedStoriesJsonString();
        TopStoriesResponse topStoriesResponse = gson.fromJson(jsonString, TopStoriesResponse.class);*/

        //topicAdapter.setData();



        return view;


    }


}
