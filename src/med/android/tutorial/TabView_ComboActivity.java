package med.android.tutorial;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabView_ComboActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost(); // The activity Tab Host
        TabHost.TabSpec spec; // Reusable TabSpec for each Tab
        Intent intent; // Reusable Intent for each Tab
        
        // Create an Intent to launch an Activity for the Tab (to be reused)
        intent = new Intent().setClass(this, LinearActivity.class);
        
        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("linear").setIndicator("Linear", res.getDrawable(R.drawable.ic_tab_linear)).setContent(intent);
        tabHost.addTab(spec);
        
        // Do the same for other tabs
        intent = new Intent().setClass(this, GridActivity.class);
        spec = tabHost.newTabSpec("grid").setIndicator("Grid", res.getDrawable(R.drawable.ic_tab_linear)).setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, __ListActivity.class);
        spec = tabHost.newTabSpec("list").setIndicator("List", res.getDrawable(R.drawable.ic_tab_linear)).setContent(intent);
        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(2);
    }
}