package com.wjbshm.smer_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Spicy extends AppCompatActivity {

    Button spicy_back;
    Button Spicy;
    Button not_Spicy;

    String[] food_Spicy={"김치볶음밥","비빔국수","김치찌개","두부김치","부대찌개",
    "떡볶이", "고추장찌개","오징어볶음", "김치순두부찌개","깐풍새우","연어 와사마요 라면","마파두부","신라면 투움바 파스타"};
    String[] food_not_Spicy={"비빔밥","잔치국수","대파볶음밥","두부김치","감자전","된장찌개",
    "불고기전골","오야꼬동","타마고 산도","하이라이스 덮밥구운새우","3분 카레 크림우동","치즈 이모 모찌",
            "토마토 달걀 덮밥","만두 계란탕","일본식 소고기 크로켓","위대한 스테키동","바나나 빠스","치킨 가라아게",
            "닭가슴살 짜장볶음","계란 피자","식빵 피자","토마토 파스타","크림 파스타","홍콩식 프렌치 토스트","두부까스","콘치즈",
            "목살 스테이크","바나나버터 토스트","두부 딸기 샐러드","식빵 맛탕","몬테크리스토 샌드위치","맥앤치즈","닭가슴살 카레"};
    Intent spicy_intent;
    Bundle spicy_bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spicy);
        Spicy=(Button)findViewById(R.id.Spicy);
        not_Spicy=(Button)findViewById(R.id.not_Spicy);
        spicy_back=(Button)findViewById(R.id.spicy_Back);

        Intent intent = getIntent();//bundle 받기

        final String[] get_String;
        final String[] get_item = new String[1];
        get_String= intent.getStringArrayExtra("strings");
        get_item[0] =intent.getStringExtra("rice");


        String Temp="";
        for(int i=0;i<get_String.length;i++){
            if(get_String[i]==null)
                break;
            Temp=Temp.concat(get_String[i]+"\n");
        }



        Spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = "Spicy = O";
                get_item[0] = get_item[0] +"\n"+temp;
                String[] food_temp=new String[45];
                int count=0;
                for(int i=0;i<get_String.length;i++) {
                    for(int j=0;j<food_Spicy.length;j++) {
                        if(get_String[i].equals( food_Spicy[j] )==true){
                            food_temp[count]=food_Spicy[j];
                            count++;
                        }
                    }
                }

                spicy_intent=new Intent(getApplicationContext(),Meat.class);
                spicy_bundle = new Bundle();// bundle 생성
                spicy_bundle.putStringArray("spicy",food_temp);
                spicy_bundle.putString("Spicy",get_item[0]);
                spicy_intent.putExtras(spicy_bundle);//bundle로 묶은 후 보내기
                startActivity(spicy_intent);//보내기
            }
        });

        not_Spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = "Spicy = X";
                get_item[0] = get_item[0] +"\n"+temp;
                String[] food_temp=new String[45];
                int count=0;

                for(int i=0;i<get_String.length;i++) {
                    for(int j=0;j<food_not_Spicy.length;j++) {
                        if(get_String[i].equals( food_not_Spicy[j] )==true){
                            food_temp[count]=food_not_Spicy[j];
                            count++;
                        }
                    }
                }
                spicy_intent=new Intent(getApplicationContext(),Meat.class);
                 spicy_bundle = new Bundle();// bundle 생성
                spicy_bundle.putStringArray("spicy",food_temp);
                spicy_bundle.putString("Spicy",get_item[0]);
                spicy_intent.putExtras(spicy_bundle);//bundle로 묶은 후 보내기
                startActivity(spicy_intent);//보내기
            }
        });

        spicy_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이전으로 돌아갑니다", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
