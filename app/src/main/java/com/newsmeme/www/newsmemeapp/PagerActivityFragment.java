package com.newsmeme.www.newsmemeapp;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class PagerActivityFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);
        /*VideoView videoView = (VideoView) getView().findViewById(R.id.videoView);
        getDataFromServer asyncTask = new getDataFromServer(uri);
        asyncTask.execute();

        TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        tv.setText(getArguments().getString("msg"));
        */
        return v;
    }

    public static PagerActivityFragment newInstance(String text) {

        PagerActivityFragment f = new PagerActivityFragment();
        /*VideoView videoView = (VideoView) view.findViewById(R.id.videoView);
        String path = "https://www.youtube.com/watch?v=thM_PEHQZLM";
        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);
        videoView.start();
        */
        /*
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);
        */
        return f;
    }

    private class getDataFromServer extends AsyncTask<Void, Void, Void>{

        Uri uri;

        public getDataFromServer(Uri uri) {
            this.uri = uri;
        }

        @Override
        protected Void doInBackground(Void... params) {
            return null;
        }
    }

}
