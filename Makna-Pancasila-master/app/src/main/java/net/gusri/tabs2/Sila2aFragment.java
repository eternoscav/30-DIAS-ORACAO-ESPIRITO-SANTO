package net.gusri.tabs2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


import net.gusri.pancasilas.R;

/**
 * Created by ghostonk on 28/11/16.
 */

public class Sila2aFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Sign TabSila1Fragment ke Layout fragment_tab1
        View mView = inflater.inflate(R.layout.fragment_tab1, container, false);



        final WebView mWb = (WebView) mView.findViewById(R.id.wv_Tab1);
        mWb.loadUrl("file:///android_asset/web/sila2/pagelmbB.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}
