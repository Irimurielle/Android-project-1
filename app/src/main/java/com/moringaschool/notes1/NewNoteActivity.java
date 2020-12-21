package com.moringaschool.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NewNoteActivity extends AppCompatActivity {
    public static final String TAG = Activity.class.getSimpleName();
    private EditText mNoteEditText;
    private Button mSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
    }
}