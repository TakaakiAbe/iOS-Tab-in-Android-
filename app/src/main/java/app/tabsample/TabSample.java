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

		addTab("Home", R.drawable.tab_home, ArrowsActivity.class);
		addTab("Search", R.drawable.tab_search, OptionsActivity.class);
        addTab("Help", R.drawable.tab_search, OptionsActivity.class);
	}
private void removeTabSys315(){
	//ポリゴン２は神ポケモン
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
<<<<<<< HEAD
	private void removeTabSys312()
	{
		//ここにタブを削除するプログラムを書く。メモリ増やしたい。
	}
=======

<<<<<<< HEAD
	private void removeTabSys314
	{
		// 縺ゅ＞縺�縺医♀縲�縺願�ｹ縺吶＞縺溘��繝�繧ｹ繝�繧ｹ縲�
		// v(�ｿ｣ﾐ費ｿ｣)v �ｽｲ�ｽｴ�ｽｲ
	}
=======
	private void removeTabSys100(){
		// ここにタブを削除するプログラムを書くぜ！
	}

>>>>>>> origin/master
}