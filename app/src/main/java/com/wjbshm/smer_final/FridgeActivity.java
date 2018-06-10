package com.wjbshm.smer_final;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FridgeActivity extends AppCompatActivity {

    Button empty_btn;
    Handler handler1;

    private LinearLayout mGallery1;
    ArrayList<Integer> mImgIds = new ArrayList<>();
    private LayoutInflater mInflater;

    int number;
    SharedPreferences sh_pref, sh_exp;
    SharedPreferences.Editor toEdit, toEdit_exp;

    String expiration_time = "";
    String ingredient_string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);
        mInflater = LayoutInflater.from(this);
        handler1 = new Handler();

        Intent intent = getIntent();
        sh_pref = getSharedPreferences("ingredient", MODE_PRIVATE);//shared preference 사용
        ingredient_string = sh_pref.getString("match", "");//시작하자 마자 바로 shared에서 string 받기

        sh_exp = getSharedPreferences("expiration", MODE_PRIVATE);//shared preference 사용
        expiration_time = sh_exp.getString("matching", "");//시작하자 마자 바로 shared에서 string 받기


/************************************************************************************************/
        String msg = (String) intent.getExtras().get("msg");
        empty_btn = (Button) findViewById(R.id.empty);
        empty_btn.setOnClickListener(new View.OnClickListener() {//냉장고 비우기
            @Override
            public void onClick(View v) {

                expiration_time = "";
                ingredient_string = "";
                sharedPreferences();
            }
        });

        String[] temp;
        temp = ingredient_string.split(",");
        if (temp.length == 10) {
            Toast.makeText(this, "더 이상 재료를 넣을 수 없습니다. ", Toast.LENGTH_SHORT).show();

        } else {
            if (msg.equals("onion")) {

                ingredient_string = ingredient_string + "onion,";
                sharedPreferences();
            }
            if (msg.equals("pa")) {
                ingredient_string = ingredient_string + "pa,";
                sharedPreferences();
            }
            if (msg.equals("cow")) {
                ingredient_string = ingredient_string + "cow,";
                sharedPreferences();

            }
            if (msg.equals("pork")) {
                ingredient_string = ingredient_string + "pork,";
                sharedPreferences();
            }
            if (msg.equals("eggs")) {
                ingredient_string = ingredient_string + "eggs,";
                sharedPreferences();
            }
            if (msg.equals("potato")) {
                ingredient_string = ingredient_string + "potato,";
                sharedPreferences();
            }
            if (msg.equals("saewo")) {
                ingredient_string = ingredient_string + "saewo,";
                sharedPreferences();
            }
            if (msg.equals("tofu")) {
                ingredient_string = ingredient_string + "tofu,";
                sharedPreferences();
            }
            if (msg.equals("namul")) {
                ingredient_string = ingredient_string + "namul,";
                sharedPreferences();
            }
            if (msg.equals("sikbang")) {
                ingredient_string = ingredient_string + "sikbang,";
                sharedPreferences();
            }
            if (msg.equals("grarlic")) {
                ingredient_string = ingredient_string + "grarlic,";
                sharedPreferences();
            }
            if (msg.equals("butter")) {
                ingredient_string = ingredient_string + "butter,";
                sharedPreferences();
            }
            if (msg.equals("milk")) {
                ingredient_string = ingredient_string + "milk,";
                sharedPreferences();
            }
            if (msg.equals("cream")) {
                ingredient_string = ingredient_string + "cream,";
                sharedPreferences();
            }
            if (msg.equals("kim")) {
                ingredient_string = ingredient_string + "kim,";
                sharedPreferences();
            }
            if (msg.equals("fish")) {
                ingredient_string = ingredient_string + "fish,";
                sharedPreferences();
            }

        }
        applySharedPreference();
        initView1();



    }


    private void initView1() {//이미지에 대한 리스트 추가
        mGallery1 = (LinearLayout) findViewById(R.id.id_gallery);
        for (int i = 0; i < mImgIds.size(); i++) {
            View view = mInflater.inflate(R.layout.activity_gallery_item, mGallery1, false);
            ImageView img = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
            img.setImageResource(mImgIds.get(i));
            TextView txt = (TextView) view.findViewById(R.id.id_index_gallery_item_text);
            txt.setText("Info " + i);
            mGallery1.addView(view);
        }
    }

    public void sharedPreferences() {
        sh_pref = getSharedPreferences("ingredient", MODE_PRIVATE);
        sh_exp = getSharedPreferences("expiration", MODE_PRIVATE);

        toEdit = sh_pref.edit();
        toEdit.putString("match", ingredient_string);
        toEdit.commit();

        toEdit_exp = sh_exp.edit();
        toEdit_exp.putString("matching", expiration_time);
        toEdit_exp.commit();
    }

    public void applySharedPreference() {

        String[] ingredient_array = ingredient_string.split(",");

        for (int i = 0; i < ingredient_array.length; i++) {

            if (ingredient_array[i].equals("onion")) {
                mImgIds.add(R.drawable.onion);

            }
            if (ingredient_array[i].equals("pa")) {
                mImgIds.add(R.drawable.pa);

            }
            if (ingredient_array[i].equals("cow")) {
                mImgIds.add(R.drawable.cow);


            }
            if (ingredient_array[i].equals("pork")) {
                mImgIds.add(R.drawable.pork);

            }
            if (ingredient_array[i].equals("eggs")) {
                mImgIds.add(R.drawable.eggs);

            }
            if (ingredient_array[i].equals("potato")) {
                mImgIds.add(R.drawable.potato);

            }
            if (ingredient_array[i].equals("saewo")) {
                mImgIds.add(R.drawable.saewo);

            }
            if (ingredient_array[i].equals("tofu")) {
                mImgIds.add(R.drawable.tofu);

            }
            if (ingredient_array[i].equals("namul")) {
                mImgIds.add(R.drawable.namul);

            }
            if (ingredient_array[i].equals("sikbang")) {
                mImgIds.add(R.drawable.sikbang);

            }
            if (ingredient_array[i].equals("grarlic")) {
                mImgIds.add(R.drawable.grarlic);

            }
            if (ingredient_array[i].equals("butter")) {
                mImgIds.add(R.drawable.butter);

            }
            if (ingredient_array[i].equals("milk")) {
                mImgIds.add(R.drawable.milk);

            }
            if (ingredient_array[i].equals("cream")) {
                mImgIds.add(R.drawable.cream);

            }
            if (ingredient_array[i].equals("kim")) {
                mImgIds.add(R.drawable.kim);

            }
            if (ingredient_array[i].equals("fish")) {
                mImgIds.add(R.drawable.fish);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
