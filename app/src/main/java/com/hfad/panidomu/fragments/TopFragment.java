package com.hfad.panidomu.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hfad.panidomu.MainActivity;
import com.hfad.panidomu.R;
import com.hfad.panidomu.activity.CleaningActivity;
import com.hfad.panidomu.activity.WashMashActivity;
import com.hfad.panidomu.activity.WashingActivity;

public class TopFragment extends Fragment {
    private Button dLux, sets, wash, cleaning, washM;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        dLux = (Button) view.findViewById(R.id.button_top_dLux);
        dLux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TabLayout tabs = (TabLayout) ((MainActivity)getActivity()).findViewById(R.id.tabs);
                tabs.getTabAt(1).select();
            }
        });

        sets = (Button) view.findViewById(R.id.button_top_sets);
        sets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TabLayout tabs = (TabLayout) ((MainActivity)getActivity()).findViewById(R.id.tabs);
                tabs.getTabAt(2).select();
            }
        });

        wash = (Button) view.findViewById(R.id.button_top_washing);
        wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] wash = {"wash"};

                Intent intent = new Intent(getContext(), WashingActivity.class);
                intent.putExtra("pranie", wash);
                startActivity(intent);
            }
        });

        cleaning = (Button) view.findViewById(R.id.button_top_cleaning);
        cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] wash = {"cleaning"};

                Intent intent = new Intent(getContext(), CleaningActivity.class);
                intent.putExtra("pranie", wash);
                startActivity(intent);
            }
        });

        washM = (Button) view.findViewById(R.id.button_top_washM);
        washM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] wash = {"dishwasher"};

                Intent intent = new Intent(getContext(), WashMashActivity.class);
                intent.putExtra("pranie", wash);
                startActivity(intent);
            }
        });

        return view;
    }



}












//
//    @Override
//    public void onClick(View v) {
//        fragmentManager.beginTransaction()
//                .replace(R.id.pager, new D_luxFragment(), null)
//                .setReorderingAllowed(true)
//                .addToBackStack(null)
//                .commit();
//    }









//        dLux = (ImageButton) view.findViewById(R.id.button_dlux_top);
//        dLux.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                D_luxFragment fragment = new D_luxFragment();
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.top_fragment_id, fragment, "D_luxFragment")
//                        .addToBackStack(null)
//                        .commit();



//                if(v == dLux){
//                    Intent intent = new Intent(view.getContext(), D_luxFragment.class);
//                    startActivity(intent);
//                }

//            }
//        });