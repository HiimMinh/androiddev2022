package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.io.InputStream;


public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "Status";
    TabLayout tabLayout;
    ViewPager2 pager2;
    HomeFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        tabLayout = findViewById(R.id.tab_layout);
//        pager2 = findViewById(R.id.viewPager2);
//
//        FragmentManager fm = getSupportFragmentManager();
//        adapter = new HomeFragmentPagerAdapter(fm, getLifecycle());
//        pager2.setAdapter(adapter);
//
//        tabLayout.addTab(tabLayout.newTab().setText("HANOI, VIET NAM"));
//        tabLayout.addTab(tabLayout.newTab().setText("PARIS, FRANCE"));
//        tabLayout.addTab(tabLayout.newTab().setText("TOULOUSE, FRANCE"));
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                pager2.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                tabLayout.selectTab(tabLayout.getTabAt(position));
//            }
//        });
//
////        InputStream is = getApplicationContext().getResources().openRawResource(R.raw.lavienrose);
//
//        MediaPlayer mediaPlayer;
//        mediaPlayer = MediaPlayer.create(this,R.raw.lavienrose);
//        mediaPlayer.start();
//        FragmentManager fragment= getSupportFragmentManager();
//        FragmentTransaction fragment_add = fragment.beginTransaction();
//        fragment_add.add(R.id.main, new ForecastFragment());
//        fragment_add.commit();

        Log.d(TAG, "onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Toast here", Toast.LENGTH_SHORT);
                return true;
            case R.id.item2:
                Intent i = new Intent(WeatherActivity.this, PrefActivity.class);
                startActivity(i);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
    }
}
