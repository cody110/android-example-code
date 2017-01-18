package com.github.jiahuanyu.example.ui.dragsortgird;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.github.jiahuanyu.example.R;
import com.github.jiahuanyu.example.ToolbarActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doom on 16/3/31.
 */
public class GridViewSortActivity extends ToolbarActivity implements AdapterView.OnItemClickListener {
    private DragSortGridView mGridView;
    private GridViewSortAdapter mAdapter;
    private List<String> mTitleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeActivity(R.string.title_activity_sort_grid_view, true, R.layout.activity_grid_view_sort);
        mGridView = (DragSortGridView) findViewById(R.id.activity_grid_view_sort_main);
        mTitleList.add("上海");
        mTitleList.add("北京");
        mTitleList.add("成都");
        mTitleList.add("武汉");
        mTitleList.add("天津");
        mTitleList.add("深圳");
        mTitleList.add("海口");
        mTitleList.add("厦门");
        mTitleList.add("西安");
        mAdapter = new GridViewSortAdapter(mGridView, this, mTitleList);
        mGridView.setAdapter(mAdapter);

        mGridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, mTitleList.get(i), Toast.LENGTH_SHORT).show();
    }
}
