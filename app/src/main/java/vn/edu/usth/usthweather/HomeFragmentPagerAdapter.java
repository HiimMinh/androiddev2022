package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class HomeFragmentPagerAdapter extends FragmentStateAdapter {


    public HomeFragmentPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 1:
                return new WeatherAndForecastFragment2();
            case 2:
                return new WeatherAndForecastFragment3();

        }
        return new WeatherAndForecastFragment1();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
