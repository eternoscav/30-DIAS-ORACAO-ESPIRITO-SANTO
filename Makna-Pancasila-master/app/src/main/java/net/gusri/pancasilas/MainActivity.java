package net.gusri.pancasilas;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import net.gusri.fragments.HomeFragment;
import net.gusri.fragments.SejarahFragment;
import net.gusri.sobre.TabSobreFragment;
import net.gusri.tabs0.TabSila0Fragment;
import net.gusri.tabs1.TabSila1Fragment;
import net.gusri.tabs2.TabSila2Fragment;
import net.gusri.tabs3.TabSila3Fragment;
import net.gusri.tabs4.TabSila4Fragment;
import net.gusri.tabs5.TabSila5fragment;
import net.gusri.tabs6.page6;
import net.gusri.tabs7.page7;
import net.gusri.tabs8.page8;
import net.gusri.tabs9.page9;
import net.gusri.tabs10.page10;
import net.gusri.tabs11.page11;
import net.gusri.tabs12.page12;
import net.gusri.tabs13.page13;
import net.gusri.tabs14.page14;
import net.gusri.tabs15.page15;
import net.gusri.tabs16.page16;
import net.gusri.tabs17.page17;
import net.gusri.tabs18.page18;
import net.gusri.tabs19.page19;
import net.gusri.tabs20.page20;
import net.gusri.tabs21.page21;
import net.gusri.tabs22.page22;
import net.gusri.tabs23.page23;
import net.gusri.tabs24.page24;
import net.gusri.tabs25.page25;
import net.gusri.tabs26.page26;
import net.gusri.tabs27.page27;
import net.gusri.tabs28.page28;
import net.gusri.tabs29.page29;
import net.gusri.tabs30.page30;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;
    private ActionBarDrawerToggle mBarToggle;
    private NavigationView mNavView;
    private Toolbar mToolbar;
    private FragmentManager mManager = getSupportFragmentManager();
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.Bar);
        setSupportActionBar(mToolbar);
        mNavDrawer = (DrawerLayout) findViewById(R.id.activity_main);
        mBarToggle = new ActionBarDrawerToggle(this, mNavDrawer, R.string.open, R.string.close);
        mNavView = (NavigationView) findViewById(R.id.nav_View);

        mNavDrawer.addDrawerListener(mBarToggle);
        mBarToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavView.setNavigationItemSelectedListener(this);

        //Panggil HomeFragment ke menu utama
        mManager.beginTransaction().replace(R.id.cont_Frame, new HomeFragment()).commit();

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Deseja realmente sair do aplicativo?");
        builder.setCancelable(true);
        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mBarToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_dasar) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new HomeFragment()).commit();
            getSupportActionBar().setTitle(R.string.st_dasar);
        } else if (id == R.id.nav_sejarah) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new SejarahFragment()).commit();
            getSupportActionBar().setTitle(R.string.tit_sejarah);
        } else if (id == R.id.nav_sila0) {
           // Toast.makeText(this, R.string.st_sila1, Toast.LENGTH_SHORT).show();
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila0Fragment()).commit();
            getSupportActionBar().setTitle(R.string.Oracao);
        } else if (id == R.id.nav_sila1) {
           // Toast.makeText(this, R.string.st_sila1, Toast.LENGTH_SHORT).show();
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila1Fragment()).commit();
            getSupportActionBar().setTitle(R.string.Bar1);
        } else if (id == R.id.nav_sila2) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila2Fragment()).commit();
            getSupportActionBar().setTitle(R.string.Bar2);
        } else if (id == R.id.nav_sila3) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila3Fragment()).commit();
            getSupportActionBar().setTitle(R.string.Bar3);
        } else if (id == R.id.nav_sila4) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila4Fragment()).commit();
            getSupportActionBar().setTitle(R.string.Bar4);
        } else if (id == R.id.nav_sila5) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new TabSila5fragment()).commit();
            getSupportActionBar().setTitle(R.string.Bar5);
        } else if (id == R.id.nav_sila6) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page6()).commit();
            getSupportActionBar().setTitle(R.string.Bar6);
        }else if (id == R.id.nav_sila7) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page7()).commit();
            getSupportActionBar().setTitle(R.string.Bar7);
        }else if (id == R.id.nav_sila8) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page8()).commit();
            getSupportActionBar().setTitle(R.string.Bar8);
        }else if (id == R.id.nav_sila9) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page9()).commit();
            getSupportActionBar().setTitle(R.string.Bar9);
        }else if (id == R.id.nav_sila10) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page10()).commit();
            getSupportActionBar().setTitle(R.string.Bar10);
        }else if (id == R.id.nav_sila11) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page11()).commit();
            getSupportActionBar().setTitle(R.string.Bar11);
        }else if (id == R.id.nav_sila12) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page12()).commit();
            getSupportActionBar().setTitle(R.string.Bar12);
        }else if (id == R.id.nav_sila13) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page13()).commit();
            getSupportActionBar().setTitle(R.string.Bar13);
        }else if (id == R.id.nav_sila14) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page14()).commit();
            getSupportActionBar().setTitle(R.string.Bar14);
        }else if (id == R.id.nav_sila15) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page15()).commit();
            getSupportActionBar().setTitle(R.string.Bar15);
        }else if (id == R.id.nav_sila16) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page16()).commit();
            getSupportActionBar().setTitle(R.string.Bar16);
        }else if (id == R.id.nav_sila17) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page17()).commit();
            getSupportActionBar().setTitle(R.string.Bar17);
        }else if (id == R.id.nav_sila18) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page18()).commit();
            getSupportActionBar().setTitle(R.string.Bar18);
        }else if (id == R.id.nav_sila19) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page19()).commit();
            getSupportActionBar().setTitle(R.string.Bar19);
        }else if (id == R.id.nav_sila20) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page20()).commit();
            getSupportActionBar().setTitle(R.string.Bar20);
        }else if (id == R.id.nav_sila21) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page21()).commit();
            getSupportActionBar().setTitle(R.string.Bar21);
        }else if (id == R.id.nav_sila22) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page22()).commit();
            getSupportActionBar().setTitle(R.string.Bar22);
        }else if (id == R.id.nav_sila23) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page23()).commit();
            getSupportActionBar().setTitle(R.string.Bar23);
        }else if (id == R.id.nav_sila24) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page24()).commit();
            getSupportActionBar().setTitle(R.string.Bar24);
        }else if (id == R.id.nav_sila25) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page25()).commit();
            getSupportActionBar().setTitle(R.string.Bar25);
        }else if (id == R.id.nav_sila26) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page26()).commit();
            getSupportActionBar().setTitle(R.string.Bar26);
        }else if (id == R.id.nav_sila27) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page27()).commit();
            getSupportActionBar().setTitle(R.string.Bar27);
        }else if (id == R.id.nav_sila28) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page28()).commit();
            getSupportActionBar().setTitle(R.string.Bar28);
        }else if (id == R.id.nav_sila29) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page29()).commit();
            getSupportActionBar().setTitle(R.string.Bar29);
        }else if (id == R.id.nav_sila30) {
            mManager.beginTransaction().replace(R.id.cont_Frame, new page30()).commit();
            getSupportActionBar().setTitle(R.string.Bar30);
        } else if (id == R.id.nav_exit) {
            onBackPressed();
        }
        //Jika dipilih menu, maka navigasi Close
        mNavDrawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

