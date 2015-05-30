package com.dream.coder.fragmentlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 30-May-15.
 */
public class Fragment1 extends Fragment {

    private static String TAG = Fragment1.class.getSimpleName();
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.d(TAG,"onCreateView called in Fragment1");

        View fragment1View = inflater.inflate(R.layout.fragment1_layout,container,false);

        textView = (TextView) fragment1View.findViewById(R.id.tv1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment2 fragment2 = new Fragment2();
                FragmentManager fragmentManager = getFragmentManager();

                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return fragment1View;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate called in fragment1");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated called in fragment1");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "onAttach called in fragment1");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy called in fragment1");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView called in fragment1");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach called in fragment1");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called in fragment1");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called in fragment1");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called in fragment1");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called in fragment1");
    }
}
