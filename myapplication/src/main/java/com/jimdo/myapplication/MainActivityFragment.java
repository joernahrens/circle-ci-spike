package com.jimdo.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jimdo.myapplication.databinding.FragmentMainBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        final FragmentMainBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                binding.text2.setText("Yeah!");
            }
        });
        return binding.getRoot();
    }
}
