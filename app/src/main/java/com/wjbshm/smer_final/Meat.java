package com.wjbshm.smer_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Meat extends AppCompatActivity {
    String[] food_Meat={"불고기전골", "오징어볶음밥","오야꼬동","만두 계란탕",
            "일본식 소고기 크로켓","위대한 스테키동","치킨 가라아게","닭가슴살 짜장볶음",
            "마파두부","계란 피자","식빵 피자","목살 스테이크","닭가슴살 카레"};
    String[] food_not_Meat={"비빔국수","떡볶이","감자전", "잔치국수",
            "두부김치","김치볶음밥","비빔밥","김치찌개","대파볶음밥",
            "부대찌개", "된장찌개","김치순두부찌개","고추장찌개"
            ,"깐풍새우","타마고 산도","하이라이스 덮밥구운새우","3분 카레 크림우동",
            "연어 와사마요 라면","치즈 이모 모찌","토마토 달걀 덮밥","바나나 빠스"
            ,"토마토 파스타","크림 파스타","홍콩식 프렌치 토스트","신라면 토움바 파스타",
            "두부까스","콘치즈","바나나버터 토스트","두부 딸기 샐러드","식빵 맛탕","몬테크리스토 샌드위치","맥앤치즈"};
    Button meat_back;
    Button meat;
    Button not_meat;
    Intent meat_intent;
    Bundle meat_bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        meat=(Button)findViewById(R.id.Meat);
        not_meat=(Button)findViewById(R.id.not_Meat);
        meat_back=(Button)findViewById(R.id.meat_Back);
        Intent intent = getIntent();//bundle 받기
        final String[] get_String= intent.getStringArrayExtra("spicy");
        final String[] get_item = new String[1];get_item[0] =intent.getStringExtra("spicy");

        String Temp="";
        for(int i=0;i<get_String.length;i++){
            if(get_String[i]==null)
                break;
            Temp=Temp.concat(get_String[i]+"\n");
        }


        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = "Meat = O";

                String[] food_temp=new String[45];
                int count=0;

                for(int i=0;i<get_String.length;i++) {
                    for(int j=0;j<food_Meat.length;j++) {
                        if(get_String[i]==null)
                            break;
                        if(get_String[i].equalsIgnoreCase( food_Meat[j] )==true){
                            food_temp[count]=get_String[i];
                            count++;
                        }
                    }
                }

                meat_intent=new Intent(getApplicationContext(),food_List.class);
                meat_bundle = new Bundle();// bundle 생성
                meat_bundle.putStringArray("meat",food_temp);
                meat_intent.putExtras(meat_bundle);//bundle로 묶은 후 보내기
                startActivity(meat_intent);//보내기
            }
        });

        not_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = "Meat = X";

                String[] food_temp=new String[45];
                int count=0;

                for(int i=0;i<get_String.length;i++) {
                    for(int j=0;j<food_not_Meat.length;j++) {
                        if(get_String[i]==null)
                            break;
                        if(get_String[i].equalsIgnoreCase( food_not_Meat[j] )==true){
                            food_temp[count]=get_String[i];
                            count++;
                        }
                    }
                }
                meat_intent=new Intent(getApplicationContext(),food_List.class);
                meat_bundle = new Bundle();// bundle 생성
                meat_bundle.putStringArray("meat",food_temp);
                meat_intent.putExtras(meat_bundle);//bundle로 묶은 후 보내기
                startActivity(meat_intent);//보내기
            }
        });

        meat_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이전으로 돌아갑니다", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
