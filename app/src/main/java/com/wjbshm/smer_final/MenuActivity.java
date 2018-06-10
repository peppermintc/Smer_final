package com.wjbshm.smer_final;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MenuActivity extends AppCompatActivity {
//한식 버튼
    public Button btnFrag1;
    public Button btnFrag2;
    public Button btnFrag3;
    public Button btnFrag4;
    public Button btnFrag5;
    public Button btnFrag6;
    public Button btnFrag7;
    public Button btnFrag8;
    public Button btnFrag9;
    public Button btnFrag10;
    public Button btnFrag11;
    public Button btnFrag12;
    public Button btnFrag13;
    public Button btnFrag14;
    public Button btnFrag15;
//중식+일식 버튼
    public Button btnFrag16;
    public Button btnFrag17;
    public Button btnFrag18;
    public Button btnFrag19;
    public Button btnFrag20;
    public Button btnFrag21;
    public Button btnFrag22;
    public Button btnFrag23;
    public Button btnFrag24;
    public Button btnFrag25;
    public Button btnFrag26;
    public Button btnFrag27;
    public Button btnFrag28;
    public Button btnFrag29;
    public Button btnFrag30;
    //양식 버튼
    public Button btnFrag31;
    public Button btnFrag32;
    public Button btnFrag33;
    public Button btnFrag34;
    public Button btnFrag35;
    public Button btnFrag36;
    public Button btnFrag37;
    public Button btnFrag38;
    public Button btnFrag39;
    public Button btnFrag40;
    public Button btnFrag41;
    public Button btnFrag42;
    public Button btnFrag43;
    public Button btnFrag44;
    public Button btnFrag45;


    Fragment1_ Fragment1;//고추장찌개
    Fragment2_ Fragment2;//김치볶음밥
    Fragment3_ Fragment3;//김치순두부찌개
    Fragment4_ Fragment4;//김치전
    Fragment5_ Fragment5;//김치찌개
    Fragment6_ Fragment6;//대파볶음밥
    Fragment7_ Fragment7;//된장찌개
    Fragment8_ Fragment8;//두부김치
    Fragment9_ Fragment9;//떡볶이
    Fragment10_ Fragment10;//부대찌개
    Fragment11_ Fragment11;//불고기전골
    Fragment12_ Fragment12;//비빔국수
    Fragment13_ Fragment13;//비빔밥
    Fragment14_ Fragment14;//오징어볶음
    Fragment15_ Fragment15;//잔치국수

    Fragment16_ Fragment16;//오야꼬동
    Fragment17_ Fragment17;//깐풍새우
    Fragment18_ Fragment18;//타마고산도
    Fragment19_ Fragment19;//구운새우 하이라이스 덮밥
    Fragment20_ Fragment20;//3분카레크림우동
    Fragment21_ Fragment21;//연어와사마요라면
    Fragment22_ Fragment22;//치즈이모모찌
    Fragment23_ Fragment23;//토마토달걀덮밥
    Fragment24_ Fragment24;//만두 계란탕
    Fragment25_ Fragment25;//일본식 소고기 크로켓(
    Fragment26_ Fragment26;//위대한 스테키동
    Fragment27_ Fragment27;//바나나 빠스
    Fragment28_ Fragment28;//치킨가라아게
    Fragment29_ Fragment29;//닭가슴살 짜장볶음
    Fragment30_ Fragment30;//마파두부

    Fragment31_ Fragment31;//계란피자
    Fragment32_ Fragment32;//식빵피자
    Fragment33_ Fragment33;//토마토 파스타
    Fragment34_ Fragment34;//크림 파스타
    Fragment35_ Fragment35;//홍콩식 프렌치 토스트
    Fragment36_ Fragment36;//신라면 투움바 파스타
    Fragment37_ Fragment37;//두바까스
    Fragment38_ Fragment38;//콘치즈
    Fragment39_ Fragment39;//목살 스테이크
    Fragment40_ Fragment40;//바나나버터 토스트
    Fragment41_ Fragment41;//두부 딸기 샐러드
    Fragment42_ Fragment42;//식빵 맛탕
    Fragment43_ Fragment43;//몬테크리스토 샌드위치
    Fragment44_ Fragment44;//맥앤치즈
    Fragment45_ Fragment45;//닭가슴살 카레

    //This is our tablayout
    private TabLayout tabLayout;

    //This is our viewPager
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();


        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("한식");
        spec.setContent(R.id.tab1);
        spec.setIndicator("한식");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("중식+일식");
        spec.setContent(R.id.tab2);
        spec.setIndicator("중식+일식");
        host.addTab(spec);
        //Tab 3
        spec = host.newTabSpec("양식");
        spec.setContent(R.id.tab3);
        spec.setIndicator("양식");
        host.addTab(spec);

        init();//초기값
        setListener();
    }

    public void setListener(){

        btnFrag1.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment1).commit();
            }
        });

        btnFrag2.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment2).commit();
            }
        });
        btnFrag3.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment3).commit();
            }
        });

        btnFrag4.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment4).commit();
            }
        });
        btnFrag5.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment5).commit();
            }
        });

        btnFrag6.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment6).commit();
            }
        });
        btnFrag7.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment7).commit();
            }
        });

        btnFrag8.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment8).commit();
            }
        });
        btnFrag9.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment9).commit();
            }
        });

        btnFrag10.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment10).commit();
            }
        });
        btnFrag11.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment11).commit();
            }
        });

        btnFrag12.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment12).commit();
            }
        });
        btnFrag13.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment13).commit();
            }
        });

        btnFrag14.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment14).commit();
            }
        });
        btnFrag15.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, Fragment15).commit();
            }
        });


        btnFrag16.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment16).commit();
            }
        });

        btnFrag17.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment17).commit();
            }
        });
        btnFrag18.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment18).commit();
            }
        });

        btnFrag19.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment19).commit();
            }
        });
        btnFrag20.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment20).commit();
            }
        });

        btnFrag21.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment21).commit();
            }
        });
        btnFrag22.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment22).commit();
            }
        });

        btnFrag23.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment23).commit();
            }
        });
        btnFrag24.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment24).commit();
            }
        });

        btnFrag25.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment25).commit();
            }
        });
        btnFrag26.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment26).commit();
            }
        });

        btnFrag27.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment27).commit();
            }
        });
        btnFrag28.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment28).commit();
            }
        });

        btnFrag29.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment29).commit();
            }
        });
        btnFrag30.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container1, Fragment30).commit();
            }
        });


        btnFrag31.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment31).commit();
            }
        });

        btnFrag32.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment32).commit();
            }
        });
        btnFrag33.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment33).commit();
            }
        });

        btnFrag34.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment34).commit();
            }
        });
        btnFrag35.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment35).commit();
            }
        });

        btnFrag36.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment36).commit();
            }
        });
        btnFrag37.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment37).commit();
            }
        });

        btnFrag38.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment38).commit();
            }
        });
        btnFrag39.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment39).commit();
            }
        });

        btnFrag40.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment40).commit();
            }
        });
        btnFrag41.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment41).commit();
            }
        });

        btnFrag42.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment42).commit();
            }
        });
        btnFrag43.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment43).commit();
    }
});

        btnFrag44.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment2를 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment44).commit();
            }
        });
        btnFrag45.setOnClickListener(new View.OnClickListener() {// 버튼에 대한 fragment1을 불러온다.
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, Fragment45).commit();
            }
        });

    }

    public void init(){
        //버튼 변수를 선언합니다
        btnFrag1 = findViewById(R.id.redpepper_stew);
        btnFrag2 = findViewById(R.id.kimchi_rice);
        btnFrag3 = findViewById(R.id.softtofu_stew);
        btnFrag4 = findViewById(R.id.kimchi_pancake);
        btnFrag5 = findViewById(R.id.kimchi_stew);
        btnFrag6 = findViewById(R.id.greenonion_rice);
        btnFrag7 = findViewById(R.id.bean_stew);
        btnFrag8 = findViewById(R.id.tofu_kimchi);
        btnFrag9 = findViewById(R.id.spicy_rice_cake);
        btnFrag10 = findViewById(R.id.army_stew);
        btnFrag11 = findViewById(R.id.bulgogi_hotpot);
        btnFrag12 = findViewById(R.id.noodle_mix);
        btnFrag13 = findViewById(R.id.rice_mix);
        btnFrag14 = findViewById(R.id.fried_squid);
        btnFrag15 = findViewById(R.id.noodle);
//중식+일식
        btnFrag16 = findViewById(R.id.f1);
        btnFrag17 = findViewById(R.id.f2);
        btnFrag18 = findViewById(R.id.f3);
        btnFrag19 = findViewById(R.id.f4);
        btnFrag20 = findViewById(R.id.f5);
        btnFrag21 = findViewById(R.id.f6);
        btnFrag22 = findViewById(R.id.f7);
        btnFrag23 = findViewById(R.id.f8);
        btnFrag24 = findViewById(R.id.f9);
        btnFrag25 = findViewById(R.id.f10);
        btnFrag26 = findViewById(R.id.f11);
        btnFrag27 = findViewById(R.id.f12);
        btnFrag28 = findViewById(R.id.f13);
        btnFrag29 = findViewById(R.id.f14);
        btnFrag30 = findViewById(R.id.f15);
//양식
        btnFrag31 = findViewById(R.id.f16);
        btnFrag32 = findViewById(R.id.f17);
        btnFrag33 = findViewById(R.id.f18);
        btnFrag34 = findViewById(R.id.f19);
        btnFrag35 = findViewById(R.id.f20);
        btnFrag36 = findViewById(R.id.f21);
        btnFrag37 = findViewById(R.id.f22);
        btnFrag38 = findViewById(R.id.f23);
        btnFrag39 = findViewById(R.id.f24);
        btnFrag40 = findViewById(R.id.f25);
        btnFrag41 = findViewById(R.id.f26);
        btnFrag42 = findViewById(R.id.f27);
        btnFrag43 = findViewById(R.id.f28);
        btnFrag44 = findViewById(R.id.f29);
        btnFrag45 = findViewById(R.id.f30);


        //한식
        Fragment1 = new Fragment1_();
        Fragment2 = new Fragment2_();
        Fragment3 = new Fragment3_();
        Fragment4 = new Fragment4_();
        Fragment5 = new Fragment5_();
        Fragment6 = new Fragment6_();
        Fragment7 = new Fragment7_();
        Fragment8 = new Fragment8_();
        Fragment9 = new Fragment9_();
        Fragment10 = new Fragment10_();
        Fragment11 = new Fragment11_();
        Fragment12 = new Fragment12_();
        Fragment13 = new Fragment13_();
        Fragment14 = new Fragment14_();
        Fragment15 = new Fragment15_();

        //중식+일식
        Fragment16 = new Fragment16_();
        Fragment17 = new Fragment17_();
        Fragment18 = new Fragment18_();
        Fragment19 = new Fragment19_();
        Fragment20 = new Fragment20_();
        Fragment21 = new Fragment21_();
        Fragment22= new Fragment22_();
        Fragment23 = new Fragment23_();
        Fragment24 = new Fragment24_();
        Fragment25 = new Fragment25_();
        Fragment26 = new Fragment26_();
        Fragment27 = new Fragment27_();
        Fragment28 = new Fragment28_();
        Fragment29= new Fragment29_();
        Fragment30 = new Fragment30_();

        //양식
        Fragment31 = new Fragment31_();
        Fragment32 = new Fragment32_();
        Fragment33 = new Fragment33_();
        Fragment34 = new Fragment34_();
        Fragment35 = new Fragment35_();
        Fragment36 = new Fragment36_();
        Fragment37 = new Fragment37_();
        Fragment38 = new Fragment38_();
        Fragment39 = new Fragment39_();
        Fragment40 = new Fragment40_();
        Fragment41 = new Fragment41_();
        Fragment42 = new Fragment42_();
        Fragment43 = new Fragment43_();
        Fragment44 = new Fragment44_();
        Fragment45 = new Fragment45_();


    }
}
