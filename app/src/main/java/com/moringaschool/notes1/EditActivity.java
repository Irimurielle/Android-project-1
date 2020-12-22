package com.moringaschool.notes1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.moringaschool.notes1.MainActivity.*;

public class EditActivity extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ButterKnife.bind(this);
        Intent intent = getIntent();
        String note = intent.getStringExtra("note");
        mTextView.setText("Here is what you just added: " + note);
    }
}