package com.example.caova.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;

public class SreachViewActivity extends AppCompatActivity{

    ArrayList<String> dsTinhThanh;
    AutoCompleteTextView textView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sreach_view);

        dsTinhThanh = new ArrayList<>();
        dsTinhThanh.addAll(Arrays.asList(getResources().getStringArray(R.array.tinhThanh)));
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, dsTinhThanh);
        textView = findViewById(R.id.tv_search);
        textView.setThreshold(1);
        textView.setAdapter(adapter);
        textView.setTextColor(getResources().getColor(R.color.colorAccent));
        Log.d("textview", "onCreate: "+textView.getText().toString());

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CharSequence constraint = textView.getText();
//                adapter.getFilter().filter(constraint);
//                textView.showDropDown();
//            }
//        });

    }

//    private void addControls() {
//
//    }
//
//    private void addEvents() {
//        lvTinhThanh = findViewById(R.id.lvTinhThanh);
//        lvTinhThanh.setLayoutManager(new LinearLayoutManager(this));
//        tvSearch = findViewById(R.id.tv_search);
//
//        adapter = new SearchViewAdapter(this,dsTinhThanh);
//        //adapterTinhThanh=new ArrayAdapter<String>(SreachViewActivity.this,android.R.layout.simple_list_item_1,dsTinhThanh);
//        lvTinhThanh.setAdapter(adapter);
//        tvSearch.setOnClickListener(this);
//        tvSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                adapter.filter(s.toString());
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
////        SearchView searchView = (SearchView) tvSearch.getRootView();
////        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
////            @Override
////            public boolean onQueryTextSubmit(String query) {
////                return false;
////            }
////
////            @Override
////            public boolean onQueryTextChange(String newText) {
////                adapterTinhThanh.getFilter().filter(newText);
////                return false;
////            }
////        });
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        LayoutInflater inflater = (LayoutInflater)
//                getSystemService(LAYOUT_INFLATER_SERVICE);
//        assert inflater != null;
//        View popupView = inflater.inflate(R.layout.popup_win,null);
//    }
//
//    @Override
//    public void onClick() {
//
//    }
}
