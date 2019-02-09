package org.pursuit.psychic_app_hw_charles_clifford.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.pursuit.psychic_app_hw_charles_clifford.R;


public class AmericanDadResultFragement extends Fragment {

    private View rootView;
    private ImageView resultView;
    private static final String BUNDLE_KEY = "SubZero";
    public static AmericanDadResultFragement newInstance (int drawableResource) {
        AmericanDadResultFragement americanDadResultFragement = new AmericanDadResultFragement();
        Bundle args = new Bundle();
        args.putInt(BUNDLE_KEY,drawableResource);
        americanDadResultFragement.setArguments(args);
        return americanDadResultFragement;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.americandadresult_layout,container,false);
        Bundle bundle = new Bundle();
        int imageResult = bundle.getInt(BUNDLE_KEY,123);
        findViews();
        resultView.setImageResource(imageResult);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    public void findViews(){
        resultView = rootView.findViewById(R.id.americandad_result_imageview);



    }
}
