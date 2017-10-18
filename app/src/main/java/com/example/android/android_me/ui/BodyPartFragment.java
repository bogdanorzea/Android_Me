package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

public class BodyPartFragment extends Fragment {

    private static final String LOG_TAG = BodyPartFragment.class.getSimpleName();
    private List<Integer> mImageIds;
    private int mListIndex;

    public void setImageResources(List<Integer> imageIdList) {
        this.mImageIds = imageIdList;
    }

    public void setIndex(int index) {
        this.mListIndex = index;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment
     */
    public BodyPartFragment() {
    }

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        if(mImageIds != null){
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            Log.e(LOG_TAG, "Invalid ImageResources list");
        }

        // Return the rootView
        return rootView;
    }

}
