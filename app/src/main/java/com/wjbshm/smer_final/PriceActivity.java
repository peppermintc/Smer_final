package com.wjbshm.smer_final;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PriceActivity extends AppCompatActivity {

    EditText price;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        price = (EditText) findViewById(R.id.priceEdit);
        show = (Button) findViewById(R.id.showBtn);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myPrice = price.getText().toString();
                Intent intent = new Intent(getApplicationContext(),
                        MainActivity.class);
                intent.putExtra("myPrice",myPrice);
                startActivity(intent);
            }

        });
    }
}

