package com.moringaschool.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.listView) ListView mListView;
    static String[] notes = new String[] {"Christmas is all about love", "Kindness is greater than anything","You must understand the whole of life, not just one part of it. That is why you must read, that is why you must look at the skies, why you must sing, dance and write poems, and suffer, and understand, for all that is life","Don’t wait to fail before you open God’s Word. Instead, look to His Word first and foremost, so that you can live your life in a way that produces your ultimate good and His ultimate glory"};
    @BindView(R.id.add_button) Button mAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, notes);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String note = ((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this, note, Toast.LENGTH_LONG).show();
            }
        });
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewNoteActivity.class);
                startActivity(intent);
            }
        });

    }
}