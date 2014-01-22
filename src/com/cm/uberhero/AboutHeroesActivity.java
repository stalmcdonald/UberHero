package com.cm.uberhero;

import java.util.ArrayList;

import AboutHero.AboutHeroGridLayout;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class AboutHeroesActivity extends Activity{
	private GridView gridView;
	private AboutHeroGridLayout customGridAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abouthero);
//		gridView = (GridView) findViewById(R.id.gridView);
//		customGridAdapter = new AboutHeroGridLayout(this, R.layout.row_grid, getData());
//		gridView.setAdapter(customGridAdapter);
//
//		gridView.setOnItemClickListener(new OnItemClickListener() {
//			public void onItemClick(AdapterView<?> parent, View v,
//					int position, long id) {
//				Toast.makeText(AboutHeroesActivity.this, position + "#Selected",
//						Toast.LENGTH_SHORT).show();
//			}
//
//		});
//
//	}
//
//	private ArrayList<ImageItem> getData() {
//		final ArrayList<ImageItem> imageItems = new ArrayList<ImageItem>();
//		// retrieve String drawable array
//		TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
//		for (int i = 0; i < imgs.length(); i++) {
//			Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
//					imgs.getResourceId(i, -1));
//			imageItems.add(new ImageItem(bitmap, "Image#" + i));
//		}
//
//		return imageItems;
//
//	}

}

}