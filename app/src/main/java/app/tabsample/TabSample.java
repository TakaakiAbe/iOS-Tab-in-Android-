package app.tabsample;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;


/**
 * @author Ikeuchi
 *
 */
public class TabSample extends TabActivity {
	/** Called when the activity is first created. */

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setTabs() ;
	}
	private void setTabs()
	{
		addTab("Home", R.drawable.tab_home, ArrowsActivity.class);
		addTab("Search", R.drawable.tab_search, OptionsActivity.class);

        addTab("Fav", R.drawable.tab_fav, FavActivity.class);
        addTab("Book", R.drawable.tab_book, BookActivity.class);
        addTab("Help", R.drawable.tab_help, HelpActivity.class);
	}

	private void addTab(String labelId, int drawableId, Class<?> c)
	{
		TabHost tabHost = getTabHost();
		Intent intent = new Intent(this, c);
		TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

		View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);
		TextView title = (TextView) tabIndicator.findViewById(R.id.title);
		title.setText(labelId);
		ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
		icon.setImageResource(drawableId);

		spec.setIndicator(tabIndicator);
		spec.setContent(intent);
		tabHost.addTab(spec);
	}

}