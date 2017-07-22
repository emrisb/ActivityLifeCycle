package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private final String MAIN_TAG = "ActivityLifeCycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MAIN_TAG, "onCreate");
        //Çalıştı
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(MAIN_TAG, "onContentChanged");
        //Çalıştı
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_TAG, "onStart");
        //Çalıştı
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG, "onRestoreInstanceState");
        //Çalıştı

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG, "onPostCreate");
        //Çalıştı
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_TAG, "onResume");
        //Çalıştı
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(MAIN_TAG, "onPostResume");
        //Çalıştı
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(MAIN_TAG, "onAttachedToWindow");
        //Çalıştı
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
        //Çalıştı


    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
        //Çalıştı
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG, "onPause");
        //Çalıştı
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG, "onSaveInstanceState");
        //Çalıştı
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG, "onStop");
        //Çalıştı
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG, "onDestroy");
        //Çalıştı
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(MAIN_TAG, "onUserInteraction");
        //Çalıştı
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(MAIN_TAG, "onUserLeaveHint");
        //Çalıştı
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MAIN_TAG, "onActivityResult");
        //Bir aktiviteyi sonuç alacak şekilde başlatmak için startActivityForResult() metodu, başlatılan aktiviteden elde edilen sonuçları elde etmek ve işlem yapmak için ise, onActivityResult() metodu kullanılır. Bu activity bu şekilde kullanılamıyor.
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG, "onRestart");
        //Çalıştı
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG, "onAttachFragment");
        //Activity e fragment attached'lendiğinde çalışır ama bu activity de fragment  yok.

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(MAIN_TAG, "onConfigurationChanged");
        //Çalıştı
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(MAIN_TAG, "onBackPressed");
        //Çalıştı
    }
}
