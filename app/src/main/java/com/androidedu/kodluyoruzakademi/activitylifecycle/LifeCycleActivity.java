package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

public class LifeCycleActivity extends AppCompatActivity {

    private final String MSG = "AndroidLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(MSG, "Before setContentView in onCreate.");
        setContentView(R.layout.activity_life_cycle);
        Log.e(MSG, "After setContentView in onCreate.");

    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(MSG, "onContentChanged."); // setContentView metodundan once calisir.
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MSG, "onStart."); // onCreate metodundan sonra veya onStop da ise onRestart dan sonra calisir
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MSG, "onRestoreInstanceState."); // ekran pozisyonu degistigi zaman meydana geliyor.
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(MSG, "onPostCreate.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MSG, "onResume."); //onRestoreInstanceState(Bundle), onRestart() ya da onPause() methodlarindan sonra cagrilir.
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(MSG, "onPostResume.");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(MSG, "onAttachedToWindow.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MSG, "onCreateOptionsMenu.");
        return super.onCreateOptionsMenu(menu);
        /*Seçenekler menusu ilk kez görüntülendiğinde
        sadece bir kez çağrılır. Yeni menu tanımlamaları
        yapabilirsiniz.*/
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MSG, "onPrepareOptionsMenu.");
        return super.onPrepareOptionsMenu(menu);
        /*Seçenekler menusu her görüntülendiğinde çağrılır.
        Menu itemları efektif bir şekilde enable veya disable
        etmek gibi işlerde kullanabilirsiniz.*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MSG, "onPause.");
        //Activity artık kullanıcı tarafından görüntülenemediğinde çağrılır.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MSG, "onDestroy.");
        /*Activity durumunu kaydetmek için bu methodu kullanmayınız.
        Bunu yapmak için onPause() ya da onSaveInstanceState(Bundle)
         methodları kullanılmalıdır. Burada daha çok Activity yok
         olduğunda çalışmasına gerek kalmayacak nesneleri kapatma
         ve bellekten temizleme işlemleri yapılır. Böylece diğer
         uygulamalara yer ve performans sağlanmış olur.*/
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(MSG, "onUserInteraction.");
        /*Activity’niz ayakta iken kullanıcı herhangi bir
        şekilde ekranla etkileşime geçerse bu method çağrılır.*/
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(MSG, "onUserLeaveHint.");
        /*Kullanıcı Home(Ana) butona basarak ayaktaki
         Activity’i arka plana almak isterse çağrılır.*/
        /*Activity arka plana alınırken, eğer bu bir
        kullanıcı seçimiyse onPause() methodu çağrılmadan
        hemen önce onUserLeaveHint() çağrılır.*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MSG, "onActivityResult.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MSG, "onRestart.");
        /*Arka planda olan Activity tekrar kullanıcıya gösterileceği zaman çağrılır.
        Peşine onStart ve onResume() çağrılacaktır.*/
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MSG, "onAttachFragment.");
        //Eğer bir fragment Activity’nize eklenmek isterse, bu durumda çağrılır.

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(MSG, "onConfigurationChanged.");  // ex: ekran oryantasyonu degistiginde calisiyor.
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(MSG, "onBackPressed."); // geri tusuna basildiginda calisir.
    }
}
