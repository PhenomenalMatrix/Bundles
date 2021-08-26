package com.example.bundles.ui.fragments.sendFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bundles.R;
import com.example.bundles.ui.fragments.getFragment.GetFragment;


public class SendFragment extends Fragment {

    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    private void initViews(View view) {
        editText = view.findViewById(R.id.edit_et);
        button = view.findViewById(R.id.send_btn);
    }

    private void initListeners() {
        button.setOnClickListener(v ->{
            Bundle bundle = new Bundle();
            GetFragment getFragment = new GetFragment();
            bundle.putString("key",editText.getText().toString());
            getFragment.setArguments(bundle);
            getFragmentManager().beginTransaction().add(R.id.main_container, getFragment).commit();
        });
    }
}