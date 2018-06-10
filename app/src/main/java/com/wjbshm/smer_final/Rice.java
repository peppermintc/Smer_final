package com.wjbshm.smer_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Rice extends AppCompatActivity {

    Button Rice;
    Button not_Rice;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);
        Rice=(Button)findViewById(R.id.Rice);

        Rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = "Rice = O";


                String[] rice={"김치볶음밥","비빔밥","김치찌개","대파볶음밥",
                        "부대찌개", "된장찌개","김치순두부찌개","고추장찌개","오징어볶음밥","오야꼬동",
                        "하이라이스 덮밥구운새우","토마토 달걀 덮밥","만두 계란탕","위대한 스테키동"
                        ,"마파두부","닭가슴살 카레"};
                Intent intent=new Intent(getApplicationContext(),Spicy.class);
                Bundle bundle = new Bundle();// bundle 생성
                bundle.putStringArray("strings",rice);
                bundle.putString("rice",temp);
                intent.putExtras(bundle);//bundle로 묶은 후 보내기
                startActivity(intent);//보내기
            }
        });

        not_Rice=(Button)findViewById(R.id.not_Rice);
        not_Rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = "Rice = X";
                String[] not_rice={"비빔국수","떡볶이","감자전",
                        "잔치국수","불고기전골","두부김치","깐풍새우","타모고 산도",
                "3분 카레 크림우동","연어 와사라면 마요","치즈 이모 모찌","일본식 소고기 크로켓"
                        ,"바나나 빠스","치킨 가라아게","닭가슴살 짜장볶음","계란 피자","식빵 피자",
                        "홍콩식 프렌치 토스트","토마토 파스타","크림 파스타","신라면 투움바 파스타",
                        "두부까스","콘치즈","목살 스테이크","바나나버터 토스트","두부 딸기 샐러드",
                        "식빵 맛탕","몬테크리스토 샌드위치","맥앤치즈"};
                Intent intent=new Intent(getApplicationContext(),Spicy.class);
                Bundle bundle = new Bundle();// bundle 생성
                bundle.putStringArray("strings",not_rice);
                bundle.putString("rice",temp);
                intent.putExtras(bundle);//bundle로 묶은 후 보내기


                startActivity(intent);//보내기
            }
        });

        back_btn = findViewById(R.id.rice_Back);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"이전으로 돌아갑니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Rice.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
