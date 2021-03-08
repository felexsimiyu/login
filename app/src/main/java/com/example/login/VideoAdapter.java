package com.example.login;


/*
import android.content.Context;
import android.provider.MediaStore.Video;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import java.util.List;

//import androidx.fragment.app.Fragment;

public class VideoAdapter extends ArrayAdapter<Video> {

private Context mContext;
private Fragment frgmt;
private List<Video> mVideos;

public VideoAdapter(@NonNull Context context, @NonNull List<Video> objects, Fragment frg) {
        super(context, R.layout.single_row_video, objects);
        mContext = context;
        mVideos = objects;
        frgmt = frg;
        }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        YouTubePlayerSupportFragment WatchFragment;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.single_row_video, null);
            holder = new ViewHolder();
            holder.videoView = convertView.findViewById(R.id.videoView);
            WatchFragment = new YouTubePlayerSupportFragment();
            FragmentTransaction transaction = frgmt.getChildFragmentManager().beginTransaction();
            transaction.add(R.id.videoView, WatchFragment).commit();
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            WatchFragment = (YouTubePlayerSupportFragment) frgmt.getChildFragmentManager().findFragmentById(R.id.videoView)
        }
        WatchFragment.initialize("A8w4e8GYS-iQWDzwuEw", new YouTubePlayer.OnInitializedListener() {
@Override
public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b) {
        youTubePlayer.cueVideo(url);
        }


@Override
public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        if (result.isUserRecoverableError()) {
        result.getErrorDialog(frgmt.getActivity(), 1).show();
        } else {
        Toast.makeText(frgmt.getActivity(), "YouTubePlayer.onInitializationFailure(): " + result.toString(), Toast.LENGTH_LONG).show();
        }
        }
        });
        } catch (Exception e) {
        Log.e("Youtube Video error", e.getMessage());
        }
        return convertView;
        }

public static class ViewHolder {
    FrameLayout videoView;
}
}
*/