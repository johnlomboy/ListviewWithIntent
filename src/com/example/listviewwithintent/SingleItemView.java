package com.example.listviewwithintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleItemView extends Activity {

	private TextView tvRank, tvCountry, tvPopulation;
	private String[] rank, country, population;
	private int position;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleitemview);

		tvRank = (TextView) findViewById(R.id.tvRank);
		tvCountry = (TextView) findViewById(R.id.tvCountry);
		tvPopulation = (TextView) findViewById(R.id.tvPopulation);

		Intent getIntent = getIntent();
		rank = getIntent.getStringArrayExtra("keyRank");
		country = getIntent.getStringArrayExtra("keyCountry");
		population = getIntent.getStringArrayExtra("keyPopulation");
		position = getIntent.getExtras().getInt("keyPosition");

		tvRank.setText(rank[position]);
		tvCountry.setText(country[position]);
		tvPopulation.setText(population[position]);

	}

}
