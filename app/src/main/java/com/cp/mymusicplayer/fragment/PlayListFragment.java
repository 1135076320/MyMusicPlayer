package com.cp.mymusicplayer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cp.mymusicplayer.R;

import androidx.recyclerview.widget.RecyclerView;


public class PlayListFragment extends BaseFragment {

    private View divider;
    private RecyclerView playList;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public PlayListFragment() {

    }


    public static PlayListFragment newInstance(String param1, String param2) {
        PlayListFragment fragment = new PlayListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_play_list, container, false);
        initView(view);
        return view;

    }

    protected void initView(View view) {
        divider = (View) view.findViewById(R.id.divider);
        playList = (RecyclerView) view.findViewById(R.id.play_list);
    }

    @Override
    protected String getTAG() {
        return PlayListFragment.class.getName();
    }

    @Override
    protected int getLayoutID() {
        return 0;
    }
}