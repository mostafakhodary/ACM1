package com.example.android.acm1.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.acm1.R;

public class ContactUsFragment extends Fragment {

    public ContactUsFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Contact Us");
        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }

}
