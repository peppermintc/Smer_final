package com.wjbshm.smer_final;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Recipe> rc = new ArrayList<Recipe>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent passedIntent=getIntent();
        final String passedPrice=passedIntent.getStringExtra("myPrice");
        int price= Integer.parseInt(passedPrice);
        
        if(price>4500 && price< 5500){
            rc.add(new Recipe("구운새우 하이라이스 덮밥", R.drawable.hirice,  "가격:5000원"));
            rc.add(new Recipe("연어 와사마요 라면", R.drawable.salmon,  "가격:5400원"));
            rc.add(new Recipe("3분 카레 크림우동", R.drawable.cream,  "가격:4800원"));
            rc.add(new Recipe("치즈 이모 모찌", R.drawable.mozzi,  "가격:4600원"));
            rc.add(new Recipe("토마토 달걀 덮밥", R.drawable.tomato,  "가격:4600원"));
            rc.add(new Recipe("만두 계란탕", R.drawable.dumpling,  "가격:5200원"));
        }
        else if(price>3500 && price<4500){
            rc.add(new Recipe("오야꼬동", R.drawable.oya, "가격 4000원"));
            rc.add(new Recipe("타마고 산도", R.drawable.tamago,  "가격:4600원"));
            rc.add(new Recipe("마파두부", R.drawable.mafa,  "가격:3800원"));
            rc.add(new Recipe("식빵피자", R.drawable.pizza,  "가격:3800원"));
            rc.add(new Recipe("달걀피자", R.drawable.egg_pizza,  "가격:3800원"));
            rc.add(new Recipe("두부까스", R.drawable.dubuggas,  "가격:4000원"));
            rc.add(new Recipe("맥앤치즈", R.drawable.macandcheese,  "가격:3800원"));
            rc.add(new Recipe("닭가슴살 카레", R.drawable.care_dak,  "가격:4300원"));
            rc.add(new Recipe("김치볶음밥", R.drawable.kimchi,  "가격:3700원"));
            rc.add(new Recipe("비빔국수", R.drawable.bibimkuksu,  "가격:3800원"));
            rc.add(new Recipe("비빔밥", R.drawable.bibimbab,  "가격:3800원"));
            rc.add(new Recipe("잔치국수", R.drawable.zanchi,  "가격:3800원"));
            rc.add(new Recipe("된장찌개", R.drawable.zzigae_denzang,  "가격:4200원"));
            rc.add(new Recipe("김치 순두부찌개", R.drawable.sundubu,  "가격:4300원"));
            rc.add(new Recipe("고추장찌개", R.drawable.gochuzang,  "가격:4300원"));

        }
        else if(price >=2500 && price<3500){
            rc.add(new Recipe("바나나 빠스", R.drawable.bananabbas,  "가격:2800원"));
            rc.add(new Recipe("홍콩식 프렌치 토스트", R.drawable.french_toast,  "가격:2800원"));
            rc.add(new Recipe("신라면 투움바 파스타", R.drawable.tuomba,  "가격:3300원"));
            rc.add(new Recipe("콘치즈", R.drawable.corncheese,  "가격:3000원"));
            rc.add(new Recipe("바나나버터 토스트", R.drawable.bananabuttertoast,  "가격:2800원"));
            rc.add(new Recipe("식빵 맛탕", R.drawable.sikbbangmattang,  "가격:2500원"));
            rc.add(new Recipe("떡볶이", R.drawable.tteokbok,  "가격:2800원"));
            rc.add(new Recipe("김치찌개", R.drawable.kimchi,  "가격:3300원"));
            rc.add(new Recipe("대파 볶음밥", R.drawable.daefabok,  "가격:3300원"));
            rc.add(new Recipe("김치전", R.drawable.kimchijeon,  "가격:2500원"));
            rc.add(new Recipe("두부김치", R.drawable.dubukimchi,  "가격:2800원"));
        }
        else if(price>5500 && price<6500){
            rc.add(new Recipe("치킨 가라아게", R.drawable.chicken,  "가격:5800원"));
            rc.add(new Recipe("일본식 소고기 크로켓", R.drawable.croket,  "가격:6300원"));
            rc.add(new Recipe("닭가슴살 짜장볶음", R.drawable.zzazang,  "가격:5600원"));
            rc.add(new Recipe("두부 딸기 샐러드", R.drawable.dubuttalki,  "가격:5800원"));
            rc.add(new Recipe("몬테크리스토 샌드위치", R.drawable.montecristo,  "가격:6200원"));
            rc.add(new Recipe("오징어 볶음", R.drawable.octopus,  "가격:5600원"));

        }
        else if(price>6500 && price<7500){
            rc.add(new Recipe("위대한 스테키동", R.drawable.stekidong,  "가격:7400원"));
            rc.add(new Recipe("토마토 파스타", R.drawable.tomato_pasta,  "가격:6800원"));
            rc.add(new Recipe("크림 파스타", R.drawable.cream_pasta,  "가격:6800원"));
            rc.add(new Recipe("부대찌개", R.drawable.army_soup,  "가격:6800원"));


        }
        else if(price>7500 & price <10000){
            rc.add(new Recipe("깐풍새우", R.drawable.shrimp,  "가격:7800원"));
            rc.add(new Recipe("목살 스테이크", R.drawable.moksalsteak,  "가격:8800원"));
            rc.add(new Recipe("불고기 전골", R.drawable.bulgogi,  "가격:9300원"));
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please Retype the price", Toast.LENGTH_SHORT).show();
            finish();
        }




        MyAdapter adapter = new MyAdapter(getApplicationContext(),
                R.layout.row, rc);

        ListView lv = (ListView) findViewById(R.id.listView1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Recipe item=(Recipe)parent.getItemAtPosition(position);
                String titleStr=item.getTitle();

                if(titleStr.equals("오야꼬동")) {
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentOne.class);
                    startActivity(intent);
                }
                if(titleStr.equals("깐풍새우")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentTwo.class);
                    startActivity(intent);
                }
                if(titleStr.equals("타마고 산도")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentThree.class);
                    startActivity(intent);
                }

                if(titleStr.equals("구운새우 하이라이스 덮밥")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentFour.class);
                    startActivity(intent);
                }

                if(titleStr.equals("3분 카레 크림우동")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentFive.class);
                    startActivity(intent);
                }

                if(titleStr.equals("연어 와사마요 라면")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentSix.class);
                    startActivity(intent);
                }

                if(titleStr.equals("치즈 이모 모찌")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentSeven.class);
                    startActivity(intent);
                }

                if(titleStr.equals("토마토 달걀 덮밥")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentEight.class);
                    startActivity(intent);
                }

                if(titleStr.equals("만두 계란탕")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentNine.class);
                    startActivity(intent);
                }

                if(titleStr.equals("일본식 소고기 크로켓")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentTen.class);
                    startActivity(intent);
                }

                if(titleStr.equals("위대한 스테키동")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentEleven.class);
                    startActivity(intent);
                }

                if(titleStr.equals("바나나 빠스")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentTwelve.class);
                    startActivity(intent);
                }

                if(titleStr.equals("치킨 가라아게")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentThirteen.class);
                    startActivity(intent);
                }

                if(titleStr.equals("닭가슴살 짜장볶음")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentFourteen.class);
                    startActivity(intent);
                }
                if(titleStr.equals("마파두부")){
                    Intent intent = new Intent(getApplicationContext(),
                            FragmentFifteen.class);
                    startActivity(intent);
                }

            }
        });
    }
}

class MyAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Recipe> rc;
    LayoutInflater inf;

    public MyAdapter(Context context, int layout, ArrayList<Recipe> rc) {
        this.context = context;
        this.layout = layout;
        this.rc = rc;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rc.size();
    }

    @Override
    public Object getItem(int position) {
        return rc.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView Name = (TextView) convertView.findViewById(R.id.textView1);
        TextView Info = (TextView) convertView.findViewById(R.id.textView2);

        Recipe r = rc.get(position);
        iv.setImageResource(r.img);
        Name.setText(r.title);
        Info.setText(r.ingredient);

        return convertView;
    }


}

class Recipe {
    String title = "";
    int img;
    String ingredient = "";

    public Recipe(String title, int img, String ingredient) {
        super();
        this.title = title;
        this.img = img;
        this.ingredient = ingredient;
    }

    public Recipe() {
    }

    public String getTitle(){
        return this.title;
    }
}
