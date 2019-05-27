package cardoza.uic.edu.ph.plantprototype;


import android.os.Bundle;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.graphics.drawable.*;
//import com.google.android.material.tabs.TabLayout;
//import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;








import com.github.ybq.android.spinkit.style.ChasingDots;

public class MainActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager mViewPager;

    private ChasingDots mChasingDotsDrawable;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout mTabLayout =  findViewById(R.id.tabs);
        mViewPager =  findViewById(R.id.viewpager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            String[] titles = new String[]{
                    "Greenhouses", "page2"
            };

            @Override
            public Fragment getItem(int position) {
                if (position == 0) {
                    return tab1.newInstance();
                } else {
                    return tab2.newInstance();
                }
            }

            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager){});
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }
}
