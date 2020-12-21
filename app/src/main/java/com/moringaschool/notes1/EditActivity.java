package com.moringaschool.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import static com.moringaschool.notes1.MainActivity.*;

public class EditActivity extends AppCompatActivity {
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mEditText = (EditText) findViewById(R.id.editText);
        Intent intent = getIntent();
        String notes = intent.getStringExtra("notes");
    }
}