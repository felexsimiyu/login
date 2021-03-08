package com.example.login;

//import android.R;
import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;


public class WatchFragment extends Fragment {

    // private View mVideosListView;
    //private VideoAdapter mVideoAdapter;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState) {
        return inflater.inflate(R.layout.watch_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        YouTubePlayerSupportFragment youTubePlayerFragment = (YouTubePlayerSupportFragment)   getActivity().getSupportFragmentManager()
                .findFragmentById(R.id.watch_fragment);
        youTubePlayerFragment.initialize("YOUR API KEY",
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {
                        // do any work here to cue video, play video, etc.
                        youTubePlayer.cueVideo("5xVh-7ywKpE");
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });

        // ...

    }
}
/*
        YouTubePlayer.OnInitializedListener{
    private FragmentActivity myContext;

    private YouTubePlayer YPlayer;
    private static final String YoutubeDeveloperKey = "xyz";
    private static final int RECOVERY_DIALOG_REQUEST = 1;

    @Override
    public void onAttach(Activity activity) {

        if (activity instanceof FragmentActivity) {
            myContext = (FragmentActivity) activity;
        }

        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle Object savedInstanceState;
        savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_you_tube_api, container, false);

        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();

        youTubePlayerFragment.initialize("DEVELOPER_KEY", new YouTubePlayer.OnInitializedListener() {


        });
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.watch_fragment, youTubePlayerFragment).commit();
        return rootView;

    }
    @Override
    public void onInitializationSuccess (YouTubePlayer.Provider provider, YouTubePlayer
            youTubePlayer,boolean b){
        if (!b) {
            YPlayer = youTubePlayer;
            YPlayer.setFullscreen(true);
            YPlayer.loadVideo("2zNSgSzhBfM");
            YPlayer.play();
        }
    }

    @Override
    public void onInitializationFailure (YouTubePlayer.Provider
                                                 provider, YouTubeInitializationResult youTubeInitializationResult){

    }
}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        //assign video
        mVideosListView = getView().findViewById(R.id.videoLV);
        fetchVideos();

        /*populate video list to adapter
        mVideoAdapter = new VideoAdapter(getContext(), mVideosList, this);
        mVideosListView.setAdapter(mVideoAdapter);
    }*/