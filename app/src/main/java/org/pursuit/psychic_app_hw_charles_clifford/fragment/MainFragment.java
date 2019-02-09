package org.pursuit.psychic_app_hw_charles_clifford.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import org.pursuit.psychic_app_hw_charles_clifford.R;

public class MainFragment extends Fragment implements View.OnClickListener {
    Spinner mainSpinner;
    private View rootView;
    private Button submitButton;

    public static MainFragment newInstance() {
        return new MainFragment();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.mainfragment_layout, container, false);
        findViews();
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "It works", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };


        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.spinner_strings_array, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mainSpinner.setOnItemSelectedListener(onItemSelectedListener);
        if (mainSpinner != null) {
            mainSpinner.setAdapter(spinnerAdapter);
        }

        submitButton.setOnClickListener(this);
        return rootView;


    }

    private void findViews() {

        mainSpinner = rootView.findViewById(R.id.mainfrag_spinner);
        submitButton = rootView.findViewById(R.id.mainfrag_submit_button);


    }

    @Override
    public void onClick(View v) {
        int spinnerId = mainSpinner.getSelectedItemPosition();
        switch (spinnerId) {
            case 0:
                Toast.makeText(getContext(), "you Chose this!", Toast.LENGTH_SHORT).show();
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_container, AmericanDadFragment.newInstance())
                        .addToBackStack("Clothing Brands")
                        .commit();

                break;

            case 1:
                break;

            case 2:
            break;


            default:
                break;


        }

    }
}
