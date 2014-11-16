package com.example.fragmentPages;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pages.R;

public class RemotePageFragment extends Fragment {
    public static RemotePageFragment newInstance() {
        RemotePageFragment fragment = new RemotePageFragment();
        return fragment;
    }

    public RemotePageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_remote_page, container, false);
    }
}
