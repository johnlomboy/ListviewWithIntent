package com.example.listviewwithintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;
	private String[] rank, country, population;
	private ListViewAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.lvInformation);

		rank = new String[] { "1", "2", "3", "4", "5" };
		country = new String[] { "korea", "south korea", "north korea",
				"east korea", "west korea" };
		population = new String[] { "100", "200", "300", "400", "500" };

		adapter = new ListViewAdapter(this, rank, country, population);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				try {
					Intent intent = new Intent(MainActivity.this,
							SingleItemView.class);
					intent.putExtra("keyRank", rank);
					intent.putExtra("keyCountry", country);
					intent.putExtra("keyPopulation", population);
					intent.putExtra("keyPosition", position);
					startActivity(intent);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

}
