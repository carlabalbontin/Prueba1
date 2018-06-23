package com.cbalt.prueba1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubscriptionFragment extends Fragment {


    public SubscriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscription, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button subscribeBtn = view.findViewById(R.id.subscribeButton);
        final EditText emailField = view.findViewById(R.id.emailField);
        final Button confirmBtn = view.findViewById(R.id.confirmButton);
        final TextView thankYouText = view.findViewById(R.id.thankYouText);


        subscribeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "subscribe!", Toast.LENGTH_SHORT).show();
                subscribeBtn.setVisibility(View.GONE);
                emailField.setVisibility(View.VISIBLE);
                confirmBtn.setVisibility(View.VISIBLE);
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(emailField.getText().toString() > )

                emailField.setVisibility(View.GONE);
                confirmBtn.setVisibility(View.GONE);
                thankYouText.setVisibility(View.VISIBLE);

            }
        });
    }

}
