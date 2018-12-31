package com.bisdeep.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.bisdeep.simpletodo.MainActivity.ITEM_TEXT;
import static com.bisdeep.simpletodo.MainActivity.ITEM_POSITION;

public class EditItemActivity extends AppCompatActivity {

    
    EditText eItemText;
    //position of edited item in list
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        //resolve edit text from layout
        eItemText = (EditText) findViewById(R.id.etItemText);
        //set edit text value
        eItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        //update the position
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        //update the title bar of the activity
        getSupportActionBar().setTitle("Edit Item");
    }

    public void onSaveItem(View v){
        //prepare new intent for result
        Intent i = new Intent();
        //pass updated item as extra
        i.putExtra(ITEM_TEXT, eItemText.getText().toString());
        //pass original position as extra
        i.putExtra(ITEM_POSITION, position);
        //set the intent as the result of the activity
        setResult(RESULT_OK, i);
        finish();
    }
}
