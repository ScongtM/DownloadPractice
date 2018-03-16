package com.example.scong.servicebestpractice;

/**
 * Created by Scong on 2018/3/16.
 */

public interface DownloadListener {

    void onParogress(int progress);

    void  onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
