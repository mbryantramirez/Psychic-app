package org.pursuit.psychic_app_hw_charles_clifford.fragment;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.pursuit.psychic_app_hw_charles_clifford.R;

public class AmericanDadFragment extends Fragment implements View.OnClickListener {
    private View rootView;
    private ImageView imageView1, imageView2, imageView3, imageView4;

    public static AmericanDadFragment newInstance() {

        return new AmericanDadFragment();


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.americandad_layou, container, false);
        findViews();
        imageView1.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        TypedArray images = getResources().obtainTypedArray(R.array.american_dad);
//        int choice = (int) (Math.random() * images.length());
        imageView1.setImageResource(R.drawable.americanfamily);
        imageView1.setTag(R.drawable.kalus);
//        imageView2.setImageResource(images.getResourceId(choice, R.drawable.americanfamily));
//        imageView3.setImageResource(images.getResourceId(choice, R.drawable.rogerpointing));
//        imageView4.setImageResource(images.getResourceId(choice, R.drawable.kalus));


    }

    public void findViews() {
        imageView1 = rootView.findViewById(R.id.imageView1);
        imageView2 = rootView.findViewById(R.id.imageView2);
        imageView3 = rootView.findViewById(R.id.imageView3);
        imageView4 = rootView.findViewById(R.id.imageView4);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.imageView1:
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_container, AmericanDadResultFragement.newInstance(getDrawable(imageView1))).addToBackStack("AmericanDad!")
                        .commit();
                break;

            default:
                break;


        }

    }

    private int getDrawable(ImageView view) {

        return (Integer) view.getTag();

    }
}

