package com.wjbshm.smer_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class PushIngredient extends Activity implements OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    Button btn9, btn10, btn11, btn12, btnPush, btn14, btn15, btn16, btn17;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ingredient);

        btn1 = findViewById(R.id.button2);
        btn2 = findViewById(R.id.button3);
        btn3 = findViewById(R.id.button4);
        btn4 = findViewById(R.id.button5);
        btn5 = findViewById(R.id.button6);
        btn6 = findViewById(R.id.button7);
        btn7 = findViewById(R.id.button8);

        btn8 = findViewById(R.id.button9);
        btn9 = findViewById(R.id.button10);
        btn10 = findViewById(R.id.button11);
        btn11 = findViewById(R.id.button12);
        btn12 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button15);
        btn15 = findViewById(R.id.button16);
        btn16 = findViewById(R.id.button17);
        btn17 = findViewById(R.id.button18);
        img1 = findViewById(R.id.imageView);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        //btnPush.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button2:
                img1.setImageResource(R.drawable.onion);
                String onion = "onion";
                Intent intent1 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent1.putExtra("msg", onion);
                startActivity(intent1);
                break;
            case R.id.button3:
                img1.setImageResource(R.drawable.pa);
                String pa = "pa";
                Intent intent2 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent2.putExtra("msg", pa);
                startActivity(intent2);
                break;
            case R.id.button4:
                img1.setImageResource(R.drawable.cow);
                String cow = "cow";
                Intent intent3 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent3.putExtra("msg", cow);
                startActivity(intent3);
                break;
            case R.id.button5:
                img1.setImageResource(R.drawable.pork);
                String pork = "pork";
                Intent intent4 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent4.putExtra("msg", pork);
                startActivity(intent4);
                break;
            case R.id.button6:
                img1.setImageResource(R.drawable.eggs);
                String eggs = "eggs";
                Intent intent5 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent5.putExtra("msg", eggs);
                startActivity(intent5);
                break;
            case R.id.button7:
                img1.setImageResource(R.drawable.potato);
                String potato = "potato";
                Intent intent6 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent6.putExtra("msg", potato);
                startActivity(intent6);
                break;
            case R.id.button8:
                img1.setImageResource(R.drawable.saewo);
                String saewo = "saewo";
                Intent intent7 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent7.putExtra("msg", saewo);
                startActivity(intent7);
                break;
            case R.id.button9:
                img1.setImageResource(R.drawable.tofu);
                String tofu = "tofu";
                Intent intent8 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent8.putExtra("msg", tofu);
                startActivity(intent8);
                break;
            case R.id.button10:
                img1.setImageResource(R.drawable.namul);
                String namul = "namul";
                Intent intent9 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent9.putExtra("msg", namul);
                startActivity(intent9);
                break;
            case R.id.button11:
                img1.setImageResource(R.drawable.sikbang);
                String sikbang = "sikbang";
                Intent intent10 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent10.putExtra("msg", sikbang);
                startActivity(intent10);
                break;
            case R.id.button12:
                img1.setImageResource(R.drawable.grarlic);
                String grarlic = "grarlic";
                Intent intent11 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent11.putExtra("msg", grarlic);
                startActivity(intent11);
                break;
            case R.id.button13:
                img1.setImageResource(R.drawable.butter);
                String butter = "butter";
                Intent intent12 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent12.putExtra("msg", butter);
                startActivity(intent12);
                break;
            case R.id.button15:
                img1.setImageResource(R.drawable.milk);
                String milk = "milk";
                Intent intent13 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent13.putExtra("msg", milk);
                startActivity(intent13);
                break;
            case R.id.button16:
                img1.setImageResource(R.drawable.cream);
                String cream = "cream";
                Intent intent14 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent14.putExtra("msg", cream);
                startActivity(intent14);
                break;
            case R.id.button17:
                img1.setImageResource(R.drawable.kim);
                String kim = "kim";
                Intent intent15 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent15.putExtra("msg", kim);
                startActivity(intent15);
                break;
            case R.id.button18:
                img1.setImageResource(R.drawable.fish);
                String fish = "fish";
                Intent intent16 = new Intent(getApplicationContext(),FridgeActivity.class);
                intent16.putExtra("msg", fish);
                startActivity(intent16);
                break;

            default:
                break;


        }
    }


}





