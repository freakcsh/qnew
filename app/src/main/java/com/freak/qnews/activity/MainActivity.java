package com.freak.qnews.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.freak.qnews.R;
import com.freak.qnews.commoms.ActivityUtils;
import com.freak.qnews.fragment.AboutFragment;
import com.freak.qnews.fragment.JokeFragment;
import com.freak.qnews.fragment.NewsFragment;
import com.freak.qnews.fragment.RobotFragment;
import com.freak.qnews.fragment.TodayFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

public class MainActivity extends AppCompatActivity {






    @BindView(R.id.fl_content)
    FrameLayout flContent;
    @BindView(R.id.nv_left)
    NavigationView nvLeft;
    @BindView(R.id.dl_activity_main)
    DrawerLayout dlActivityMain;
    private NewsFragment newsFragment;      //新闻数据
    private JokeFragment jokeFragment;      //段子
    private RobotFragment robotFragment;    //机器人
    private AboutFragment aboutFragment;    //关于
    private TodayFragment todayFragment;    //历史上的今天

    private FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    private ActivityUtils utils;
    private BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        utils=new ActivityUtils(this);
        /******************************第一次进入创建****************************************/
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        newsFragment = new NewsFragment();
        fragmentTransaction.add(R.id.fl_content, newsFragment, "news");
        fragmentTransaction.commit();
        /***********************************************************************************/

        /*************************** 左侧 侧滑菜单 设置头像图片 ***************************/
        ImageView iconImage = nvLeft.getHeaderView(0).findViewById(R.id.icon_image);
        final ImageView ivBmp = nvLeft.getHeaderView(0).findViewById(R.id.iv_head_bg);
        Glide.with(this)
                .load("http://img.17gexing.com/uploadfile/2016/07/2/20160725115642623.gif")
                .asGif()
                .centerCrop()
                .into(iconImage);

        OkHttpUtils.get().url("http://guolin.tech/api/bing_pic").build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(String response, int id) {
                Glide.with(MainActivity.this)
                        .load(response)
                        .crossFade()
                        .centerCrop()
                        .into(ivBmp);
            }
        });

        iconImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomBar.selectTabAtPosition(4, true);
            }
        });
        /*********************************************************/

        /******************底部导航栏点击事件********************/
        bottomBar= (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab_news:
                        showNewsFragment();
                        nvLeft.setCheckedItem(R.id.nav_news);
                        closeDrawerLayout();
                        break;
                    case R.id.tab_joke:
                        shoeJokeFragment();
                        nvLeft.setCheckedItem(R.id.nav_duanzi);
                        closeDrawerLayout();
                        break;
                    case R.id.tab_today:
                        showTodayFragment();
                        nvLeft.setCheckedItem(R.id.nav_today_of_history);
                        closeDrawerLayout();
                        break;
                    case R.id.tab_robot:
                        showRobotFragment();
                        nvLeft.setCheckedItem(R.id.nav_robot);
                        closeDrawerLayout();
                        break;
                    case R.id.tab_about:
                        showAboutFragment();
                        nvLeft.setCheckedItem(R.id.nav_other);
                        closeDrawerLayout();
                        break;
                    default:
                }
            }
        });
        /****************************************************************/
        /**************************************左侧策划菜单设置选择事件******************************************/
        nvLeft.setCheckedItem(R.id.nav_news);
        nvLeft.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                nvLeft.setCheckedItem(item.getItemId());
                dlActivityMain.closeDrawers();
                switch (item.getItemId()){
                    case R.id.nav_news:
                        bottomBar.selectTabAtPosition(0, true);
                        break;
                    case R.id.nav_duanzi:
                        bottomBar.selectTabAtPosition(1, true);
                        break;
                    case R.id.nav_robot:
                        bottomBar.selectTabAtPosition(3, true);
                        break;
                    case R.id.nav_other:
                        bottomBar.selectTabAtPosition(4, true);
                        break;
                    case R.id.nav_today_of_history:
                        bottomBar.selectTabAtPosition(2, true);
                        break;

                }
                return false;
            }
        });
    }

    /**
     * 关闭左侧 侧滑菜单
     */
    private void closeDrawerLayout() {
        if (dlActivityMain.isDrawerOpen(Gravity.LEFT)) {
            dlActivityMain.closeDrawers();
        }
    }
    private void showAboutFragment() {
        hideAllFragment();
        if (aboutFragment == null) {
            aboutFragment = new AboutFragment();
            fragmentManager.beginTransaction().add(R.id.fl_content, aboutFragment).commit();
        } else {
            fragmentManager.beginTransaction().show(aboutFragment).commit();
        }
    }

    private void showRobotFragment() {
        hideAllFragment();
        if (robotFragment == null) {
            robotFragment = new RobotFragment();
            fragmentManager.beginTransaction().add(R.id.fl_content, robotFragment).commit();
        } else {
            fragmentManager.beginTransaction().show(robotFragment).commit();
        }
    }

    private void showTodayFragment() {
        hideAllFragment();
        if (todayFragment == null) {
            todayFragment = new TodayFragment();
            fragmentManager.beginTransaction().add(R.id.fl_content, todayFragment).commit();
        } else {
            fragmentManager.beginTransaction().show(todayFragment).commit();
        }
    }

    private void shoeJokeFragment() {
        hideAllFragment();
        if (jokeFragment == null) {
            jokeFragment = new JokeFragment();
            fragmentManager.beginTransaction().add(R.id.fl_content, jokeFragment).commit();
        } else {
            fragmentManager.beginTransaction().show(jokeFragment).commit();
        }
    }

    private void showNewsFragment() {
        hideAllFragment();
        if (newsFragment == null) {
            newsFragment = new NewsFragment();
        } else {
            fragmentManager.beginTransaction().show(newsFragment).commit();
        }
    }

    /**
     * 隐藏所有的fragment
     */
    private void hideAllFragment() {
        FragmentTransaction hideTransaction = fragmentManager.beginTransaction();
        if (newsFragment != null) {
            hideTransaction.hide(newsFragment);
        }
        if (jokeFragment != null) {
            hideTransaction.hide(jokeFragment);
        }
        if (robotFragment != null) {
            hideTransaction.hide(robotFragment);
        }
        if (aboutFragment != null) {
            hideTransaction.hide(aboutFragment);
        }
        if (todayFragment != null) {
            hideTransaction.hide(todayFragment);
        }
        hideTransaction.commit();
    }

}
