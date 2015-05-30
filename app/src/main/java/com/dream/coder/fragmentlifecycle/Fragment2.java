package com.dream.coder.fragmentlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 30-May-15.
 */
public class Fragment2 extends Fragment {

    private static String TAG = Fragment2.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragment2View = inflater.inflate(R.layout.fragment2_layout,container,false);
        Log.d(TAG,"onCreateView called in fragment2");
        return fragment2View;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated called in fragment2");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "onAttach called in fragment2");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called in fragment2");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called in fragment2");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView called in fragment2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach called in fragment2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called in fragment2");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called in fragment2");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called in fragment2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called in fragment2");
    }
}
