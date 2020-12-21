package com.moringaschool.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewNoteActivity extends AppCompatActivity {
    public static final String TAG = Activity.class.getSimpleName();
    private EditText mNoteEditText;
    private Button mSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        mNoteEditText = (EditText) findViewById(R.id.editTextNewNote);
        mSaveButton = (Button) findViewById(R.id.save_button);
        mSaveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String note = mNoteEditText.getText().toString();
                Log.d(TAG, note);
                Intent intent = new Intent(NewNoteActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(NewNoteActivity.this, note, Toast.LENGTH_LONG).show();
            }
        });
    }
}