package com.example.listviewwithintent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

	private Context context;
	private String[] rank, country, population;
	private TextView tvRank, tvCountry, tvPopulation;
	private LayoutInflater inflater;
	private View itemView;

	public ListViewAdapter(MainActivity mainActivity, String[] rank,
			String[] country, String[] population) {
		this.context = mainActivity;
		this.rank = rank;
		this.country = country;
		this.population = population;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return rank.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		itemView = inflater.inflate(R.layout.listview_item, parent, false);

		tvRank = (TextView) itemView.findViewById(R.id.tvRank);
		tvCountry = (TextView) itemView.findViewById(R.id.tvCountry);
		tvPopulation = (TextView) itemView.findViewById(R.id.tvPopulation);

		tvRank.setText(rank[position]);
		tvCountry.setText(country[position]);
		tvPopulation.setText(population[position]);

		return itemView;
	}

}
