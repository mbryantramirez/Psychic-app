package org.pursuit.psychic_app_hw_charles_clifford;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import org.pursuit.psychic_app_hw_charles_clifford.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = MainFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container,mainFragment)
                .commit();
    }


}
