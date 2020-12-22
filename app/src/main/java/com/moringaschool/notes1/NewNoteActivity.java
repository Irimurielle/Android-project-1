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

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.moringaschool.notes1.MainActivity.notes;

public class NewNoteActivity extends AppCompatActivity {
    @BindView(R.id.editTextNewNote) EditText mNoteEditText;
    @BindView(R.id.save_button) Button mSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        ButterKnife.bind(this);
        mSaveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String note = mNoteEditText.getText().toString();
                Intent intent = new Intent(NewNoteActivity.this, EditActivity.class);
                intent.putExtra("note", note);
                startActivity(intent);
                Toast.makeText(NewNoteActivity.this, note, Toast.LENGTH_LONG).show();
            }
        });
    }
}