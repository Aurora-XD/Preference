package com.example.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SPActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @BindView(R.id.sp_edit)
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_p);

        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);

        ButterKnife.bind(this);

        setEditView();
    }

    private void setEditView() {
        String string = sharedPreferences.getString("name", "");
        mEditText.setText(string);
    }
}