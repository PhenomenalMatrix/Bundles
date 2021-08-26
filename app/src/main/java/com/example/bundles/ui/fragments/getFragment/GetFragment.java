package com.example.bundles.ui.fragments.getFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bundles.R;
import com.example.bundles.ui.fragments.sendFragment.SendFragment;


public class GetFragment extends Fragment {

    private TextView textView;
    private Bundle bundle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getBundleFromFragment();
    }

    private void getBundleFromFragment() {
        bundle = this.getArguments();
        String txt = bundle.getString("key");
        textView.setText(txt);
    }

    private void initViews(View view) {
        textView = view.findViewById(R.id.get_tv);
    }


}