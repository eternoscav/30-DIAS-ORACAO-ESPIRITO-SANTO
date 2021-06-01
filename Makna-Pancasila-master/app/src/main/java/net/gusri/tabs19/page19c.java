package net.gusri.tabs19;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import net.gusri.pancasilas.R;

/**
 * Created by ghostonk on 30/11/16.
 */

public class page19c extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_tab3, container, false);

        final WebView mWb = (WebView) mView.findViewById(R.id.wv_Tab3);
        mWb.loadUrl("file:///android_asset/web/sila19/page19c.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}
