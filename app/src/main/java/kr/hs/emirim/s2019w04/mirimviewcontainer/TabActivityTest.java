package kr.hs.emirim.s2019w04.mirimviewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecPark = tabHost.newTabSpec("PARK").setIndicator("박정우");
        tabSpecPark.setContent(R.id.linearPark);
        tabHost.addTab(tabSpecPark);

        TabHost.TabSpec tabSpecKim = tabHost.newTabSpec("KIM").setIndicator("김도영");
        tabSpecKim.setContent(R.id.linearKim);
        tabHost.addTab(tabSpecKim);

        TabHost.TabSpec tabSpecHa = tabHost.newTabSpec("HA").setIndicator("하루토");
        tabSpecHa.setContent(R.id.linearHa);
        tabHost.addTab(tabSpecHa);

        tabHost.setCurrentTab(0);
    }
}