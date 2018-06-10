package com.wjbshm.smer_final;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chrisantus on 2018. 4. 28..
 */

public class RecipeDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipedetail);

        TextView Title = (TextView) findViewById(R.id.textView1);
        TextView Ingredient = (TextView) findViewById(R.id.textView2);
        ImageView iv = (ImageView) findViewById(R.id.imageView1);

        Intent intent = getIntent();
        Title.setText(intent.getStringExtra("title"));
        Ingredient.setText(intent.getStringExtra("ingredient"));
        iv.setImageResource(intent.getIntExtra("img", 0));

    }
}

