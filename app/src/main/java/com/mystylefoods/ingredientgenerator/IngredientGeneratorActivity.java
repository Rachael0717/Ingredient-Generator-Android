package com.mystylefoods.ingredientgenerator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IngredientGeneratorActivity extends Activity {

    @SuppressWarnings("FieldCanBeLocal")
    private Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_selection);

        generateButton = findViewById(R.id.generate_button);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onGenerateClicked();
            }
        });
    }

    private void onGenerateClicked() {
        Log.i("Test", "The button was clicked!");
    }

}
