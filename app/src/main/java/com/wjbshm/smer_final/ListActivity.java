package com.wjbshm.smer_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ListActivity extends AppCompatActivity {
    //선택된 재료 출력 텍스트뷰
    TextView textView100;


    //양식
    //계란피자의 재료
    String[] eggpizza_ing = {"- - - - - - - -","계란", "소세지", "베이컨", "올리브", "그린빈", "치즈", "토마토소스"};
    //식빵피자의 재료
    String[] breadpizza_ing = {"- - - - - - - -","식빵", "옥수수", "베이컨", "양파", "파프리카", "토마토", "치즈", "케찹", "마요네즈"};
    //토마토파스타의 재료
    String[] tomatopasta_ing = {"- - - - - - - -","스파게티 면", "토마토소스", "새우", "브로콜리", "양파", "마늘", "소금"};
    //크림 파스타의 재료
    String[] creampasta_ing = {"- - - - - - - -","스파게티 면", "버섯", "토마토", "양파", "마늘", "생크림", "우유", "올리브 오일", "후추", "소금", "치즈"};
    //홍콩식 프렌치 토스트
    String[] frenchtoast_ing = {"- - - - - - - -","식빵", "계란", "소금", "버터", "연유", "아몬드"};
    //신라면 투움바 파스타 재료
    String[] shinpasta_ing = {"- - - - - - - -","라면", "새우", "양파", "마늘", "버터", "치즈", "우유", "후추", "소금","파슬리"};
    //두부까스 재료
    String[] dooboogasu_ing = {"- - - - - - - -","두부", "부침가루", "계란", "돈까스소스", "올리고당", "양파","빵가루"};
    //콘치즈
    String[] corncheese_ing = {"- - - - - - - -","옥수수콘 통조림", "양파","당근","파프리카","피망","치즈","마요네즈","설탕","소금","후추","버터","파슬리"};
    //목살스테이크
    String[] steak_ing = {"- - - - - - - -","소고기 목살", "버섯","호박","양파","소금","후추","밀가루","버터","케찹","설탕","간장","식초"};
    //바나나버터 토스트
    String[] bananatoast_ing = {"- - - - - - - -","식빵", "버터","바나나","버터","아몬드","계피분"};
    //두부 딸기 샐러드
    String[] tofustrawberrysalad_ing = {"- - - - - - - -","두부", "딸기", "상추", "간장", "식초", "매실진액", "깨", "참기름"};
    //식빵 맛탕
    String[] breadmattang_ing = {"- - - - - - - -","식빵", "견과류", "아몬드","식용유", "설탕", "올리고당"};
    //몬테크리스토 샌드위치
    String[] montecristo_ing = {"- - - - - - - -","식빵", "달걀", "치즈", "햄","햄 슬라이스", "빵가루", "잼", "버터"};
    //맥앤치즈
    String[] macandcheese_ing = {"- - - - - - - -","마카로니", "치즈", "버터", "밀가루", "우유"};
    //닭가슴살 카레
    String[] chickencurry_ing = {"- - - - - - - -","닭가슴살", "식용유", "당근", "감자", "양파", "고추", "파", "마늘", "버섯", "카레", "치즈", "소금", "후추"};
    //

    //중식,일식
    //Fragment 1
    String[] fragment1_ing = {"- - - - - - - -","닭가슴살","소금","후추","마늘","다시마","양파","파","간장","설탕"};
    //Fragment 2
    String[] fragment2_ing = {"- - - - - - - -","새우", "양파","고추","당근","파","튀김가루","전분가루","감자전분가루", "간장","식초","설탕","굴소스"};
    //Fragment 3
    String[] fragment3_ing = {"- - - - - - - -","계란", "식빵", "맛술", "혼다시", "설탕","소금", "식용유","마요네즈"};
    //Fragment 4
    String[] fragment4_ing = {"- - - - - - - -","새우", "밥", "양파", "마늘", "파", "식용유"};
    //Fragment 5
    String[] fragment5_ing = {"- - - - - - - -","우동 면", "3분 카레","카레","생크림", "감자", "소금", "설탕", "후추"};
    //Fragment 6
    String[] fragment6_ing = {"- - - - - - - -","와사마요볶음면", "훈제연어"};
    //Fragment 7
    String[] fragment7_ing = {"- - - - - - - -","감자", "전분가루", "치즈","소금","간장","물엿","설탕"};
    //Fragment 8
    String[] fragment8_ing = {"- - - - - - - -","토마토", "밥", "계란","후추","간장","설탕","식초","굴소스"};
    //Fragment 9
    String[] fragment9_ing = {"- - - - - - - -","고기만두", "계란", "파","다시마","멸치","전분가루","간장","후추"};
    //Fragment 10
    String[] fragment10_ing = {"- - - - - - - -","감자", "소고기","소고기 목살", "밀가루","계란","빵가루","생크림","설탕","소금","후추","식용유"};
    //Fragment 11
    String[] fragment11_ing = {"- - - - - - - -","소고기","밥","양파","간장","맛술","설탕","무순","소금","후추","와사비"};
    //Fragment 12
    String[] fragment12_ing = {"- - - - - - - -","바나나","식용유","설탕"};
    //Fragment 13
    String[] fragment13_ing = {"- - - - - - - -","닭다리살","계란","다진마늘","마늘","생강","간장","소금","후추","전분가루"};
    //Fragment 14
    String[] fragment14_ing = {"- - - - - - - -","닭가슴살","양파","깻잎","고추기름","고추장","춘장","맛술","물엿","다진마늘","후추","마늘"};
    //Fragment 15
    String[] fragment15_ing = {"- - - - - - - -","두부","돼지고기","양파","파","굴소스","두반장","고추가루","마늘"};
    //

    //한식
    //김치볶음밥
    String[] kimchiRice_ing = {"- - - - - - - -","밥","식용유","김치","파","대파","참치","계란","치즈","고추가루","간장","마늘","후추","다진마늘"};
    //비빔국수
    String[] bibimNoodle_ing = {"- - - - - - - -","소면","김치","계란", "상추", "김", "깨","간장","고추장", "고추가루", "설탕", "참기름"};
    //비빔밥
    String[] bibimRice_ing = {"- - - - - - - -","돼지고기","양파","간장", "설탕", "소금", "깨","참기름","식용유", "맛술", "생강", "후추"};
    //떡볶이
    String[] dduckboki_ing = {"- - - - - - - -","가래떡","대파","고추장","파","간장","설탕","고추가루"};
    //김치찌개
    String[] kimchiBoil_ing = {"- - - - - - - -","김치","돼지고기", "대파", "고추장", "간장","설탕","고추가루"};
    //잔치국수
    String[] janchiNoodle_ing = {"- - - - - - - -","소면","버섯","양파", "호박", "당근", "계란","멸치","간장", "소금", "대파", "파","무","다시마"};
    //대파 볶음밥
    String[] daepaMixRice_ing = {"- - - - - - - -","밥","계란","대파","파","베이컨","식용유","간장","후추"};
    //부대찌개
    String[] armyBoil_ing = {"- - - - - - - -","스팸","소세지","돼지고기", "두부", "김치", "양파","대파","파", "멸치", "버섯", "치즈","고추","라면"};
    //된장찌개
    String[] doinJangBoil_ing = {"- - - - - - - -","소고기","참기름","두부", "무", "양파", "호박","버섯","대파", "파", "고추", "고추가루","마늘","다진마늘"};
    //김치 순두부찌개
    String[] kimchiSoftTofuBoil_ing = {"- - - - - - - -","두부","멸치","계란","김치","돼지고기","양파","대파","파","고추","다진마늘","마늘","고추가루","식용유","소금"};
    //고추장찌개
    String[] redPepperBoil_ing = {"- - - - - - - -","돼지고기","감자","호박", "양파", "두부", "버섯","멸치","대파", "파", "고추", "식용유",};
    //김치전
    String[] kimchiPanCake_ing = {"- - - - - - - -","김치","참치","부침가루", "고추", "식용유"};
    //오징어 볶음
    String[] squadMix_ing = {"- - - - - - - -","오징어","양배추","깻잎","당근","양파","대파","파","고추","식용유"};
    //불고기 전골
    String[] bulgogi_ing = {"- - - - - - - -","양파","대파","파", "당근", "버섯", "간장","설탕","다진마늘", "마늘", "참기름"};
    //두부김치
    String[] tofuKimchi_ing = {"- - - - - - - -","두부","소금","깨", "돼지고기", "김치", "양파","대파","파", "고추", "깻잎", "참기름","간장","고추가루","설탕","다진마늘","마늘","생강"};
    //

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listview ;
        ListViewAdapter adapter;

        //홈으로 돌아가는 버튼
        Button home_btn = findViewById(R.id.home_btn);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"홈으로 돌아갑니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView1);
        listview.setAdapter(adapter);

        textView100 = findViewById(R.id.ttt);

        int count=0;


        Intent intent = getIntent();
        String[] selected_ingredient = intent.getStringArrayExtra("three_ingredient");

        //리스트에 더하기
        //계란피자
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<eggpizza_ing.length;b++){
                if(selected_ingredient[a].equals(eggpizza_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.eggpizza1),
                                "계란 피자", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //식빵피자
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<breadpizza_ing.length;b++){
                if(selected_ingredient[a].equals(breadpizza_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.breadpizza1),
                                "식빵 피자", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //토마토파스타
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<tomatopasta_ing.length;b++){
                if(selected_ingredient[a].equals(tomatopasta_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tomatopasta1),
                                "토마토 파스타", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //크림 파스타
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<creampasta_ing.length;b++){
                if(selected_ingredient[a].equals(creampasta_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.creampasta1),
                                "크림 파스타", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //홍콩식 프렌치 토스트
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<frenchtoast_ing.length;b++){
                if(selected_ingredient[a].equals(frenchtoast_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.frenchtoast1),
                                "홍콩식 프렌치 토스트", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //신라면 투움바 파스타
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<shinpasta_ing.length;b++){
                if(selected_ingredient[a].equals(shinpasta_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shinramyunpasta1),
                                "신라면 투움바 파스타", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //두부까스
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<dooboogasu_ing.length;b++){
                if(selected_ingredient[a].equals(dooboogasu_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dooboogasu1),
                                "두부까스", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //콘치즈
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<corncheese_ing.length;b++){
                if(selected_ingredient[a].equals(corncheese_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.corncheese1),
                                "콘치즈", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //목살스테이크
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<steak_ing.length;b++){
                if(selected_ingredient[a].equals(steak_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.steak1),
                                "목살 스테이크", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //바나나버터 토스트
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<bananatoast_ing.length;b++){
                if(selected_ingredient[a].equals(bananatoast_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bananatoast1),
                                "바나나버터 토스트", "4,000원") ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //두부 딸기 샐러드
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<tofustrawberrysalad_ing.length;b++){
                if(selected_ingredient[a].equals(tofustrawberrysalad_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tofustrawberrysalad1),
                                "두부 딸기 샐러드", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //식빵 맛탕
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<breadmattang_ing.length;b++){
                if(selected_ingredient[a].equals(breadmattang_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.breadmattang1),
                                "식빵 맛탕", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //몬테크리스토 샌드위치
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<montecristo_ing.length;b++){
                if(selected_ingredient[a].equals(montecristo_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.montecristosandwich1),
                                "몬테크리스토 샌드위치", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //맥앤치즈
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<macandcheese_ing.length;b++){
                if(selected_ingredient[a].equals(macandcheese_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.macandcheese1),
                                "맥앤치즈", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //치킨 카레
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<chickencurry_ing.length;b++){
                if(selected_ingredient[a].equals(chickencurry_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chickencurry1),
                                "닭가슴살 카레", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //중식,일식
        //fragment1
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment1_ing.length;b++){
                if(selected_ingredient[a].equals(fragment1_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.oya),
                                "오야꼬동", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment2
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment2_ing.length;b++){
                if(selected_ingredient[a].equals(fragment2_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shrimp),
                                "깐풍새우", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment3
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment3_ing.length;b++){
                if(selected_ingredient[a].equals(fragment3_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tamago),
                                "타마고산도", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment4
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment4_ing.length;b++){
                if(selected_ingredient[a].equals(fragment4_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.hirice),
                                "구운새우 하이라이스 덮밥", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment5
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment5_ing.length;b++){
                if(selected_ingredient[a].equals(fragment5_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cream),
                                "3분카레크림우동", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment6
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment6_ing.length;b++){
                if(selected_ingredient[a].equals(fragment6_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.salmon),
                                "연어와사마요라면", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment7
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment7_ing.length;b++){
                if(selected_ingredient[a].equals(fragment7_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mozzi),
                                "치즈이모모찌", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment8
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment8_ing.length;b++){
                if(selected_ingredient[a].equals(fragment8_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tomato),
                                "토마토달걀덮밥", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment9
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment9_ing.length;b++){
                if(selected_ingredient[a].equals(fragment9_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dumpling),
                                "만두 계란탕", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment10
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment10_ing.length;b++){
                if(selected_ingredient[a].equals(fragment10_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.croket),
                                "일본식 소고기 크로켓", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment11
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment11_ing.length;b++){
                if(selected_ingredient[a].equals(fragment11_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.stekidong),
                                "위대한 스테키동", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment12
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment12_ing.length;b++){
                if(selected_ingredient[a].equals(fragment12_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bananabbas),
                                "바나나 빠스", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment13
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment13_ing.length;b++){
                if(selected_ingredient[a].equals(fragment13_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.chicken),
                                "치킨가라아게", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment14
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment14_ing.length;b++){
                if(selected_ingredient[a].equals(fragment14_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.zzazang),
                                "닭가슴살 짜장볶음", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //fragment15
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<fragment15_ing.length;b++){
                if(selected_ingredient[a].equals(fragment15_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mafa),
                                "마파두부", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //김치볶음밥
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<kimchiRice_ing.length;b++){
                if(selected_ingredient[a].equals(kimchiRice_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.rice_kimchi),
                                "김치 볶음밥", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //비빔국수
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<bibimNoodle_ing.length;b++){
                if(selected_ingredient[a].equals(bibimNoodle_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.noodle_mix),
                                "비빔국수", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //비빔밥
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<bibimRice_ing.length;b++){
                if(selected_ingredient[a].equals(bibimRice_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.rice_mix),
                                "비빔밥", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //떡볶이
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<dduckboki_ing.length;b++){
                if(selected_ingredient[a].equals(dduckboki_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.spicy_ricecake),
                                "떡볶이", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //김치찌개
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<kimchiBoil_ing.length;b++){
                if(selected_ingredient[a].equals(kimchiBoil_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchi_boiling),
                                "김치찌개", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //잔치국수
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<janchiNoodle_ing.length;b++){
                if(selected_ingredient[a].equals(janchiNoodle_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.noodle),
                                "잔치국수", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //대파볶음밥
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<daepaMixRice_ing.length;b++){
                if(selected_ingredient[a].equals(daepaMixRice_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.greenonion_rice),
                                "대파 볶음밥", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //부대찌개
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<armyBoil_ing.length;b++){
                if(selected_ingredient[a].equals(armyBoil_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.army_kimchi),
                                "부대찌개", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //된장찌개
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<doinJangBoil_ing.length;b++){
                if(selected_ingredient[a].equals(doinJangBoil_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bean_boiling),
                                "된장찌개", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //김치 순두부찌개
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<kimchiSoftTofuBoil_ing.length;b++){
                if(selected_ingredient[a].equals(kimchiSoftTofuBoil_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.soft_tofu_boiling),
                                "김치 순두부찌개", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //고추장찌개
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<redPepperBoil_ing.length;b++){
                if(selected_ingredient[a].equals(redPepperBoil_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.red_pepper_boiling),
                                "고추장찌개", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //김치전
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<kimchiPanCake_ing.length;b++){
                if(selected_ingredient[a].equals(kimchiPanCake_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.kimchi_pancake),
                                "김치전", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //오징어 볶음
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<squadMix_ing.length;b++){
                if(selected_ingredient[a].equals(squadMix_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.squid_boat),
                                "오징어 볶음", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //불고기 전골
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<bulgogi_ing.length;b++){
                if(selected_ingredient[a].equals(bulgogi_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bulgogi),
                                "불고기 전골", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //두부김치
        for (int a=0; a<selected_ingredient.length; a++) {
            for(int b=0; b<tofuKimchi_ing.length;b++){
                if(selected_ingredient[a].equals(tofuKimchi_ing[b])) {
                    count++;
                    if(count==3){
                        //리스트뷰에 아이템추가
                        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.tofu_kimchi),
                                "두부김치", selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]) ;
                    }
                }
            }
        }
        //reset count
        count=0;

        //리스트 메뉴 클릭리스너
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //선택된 아이템의 포지션을 읽음
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;
                String titleStr = item.getTitle() ;

                //계란 피자선택시
                if(titleStr.equals("계란 피자")){
                    Intent intent = new Intent(ListActivity.this, EggPizza.class );
                    startActivity(intent);
                }
                //식빵 피자선택시
                if(titleStr.equals("식빵 피자")){
                    Intent intent = new Intent(ListActivity.this, BreadPizza.class );
                    startActivity(intent);
                }
                //토마토 파스타선택시
                if(titleStr.equals("토마토 파스타")){
                    Intent intent = new Intent(ListActivity.this, TomatoPasta.class );
                    startActivity(intent);
                }
                //크림 파스타선택시
                if(titleStr.equals("크림 파스타")){
                    Intent intent = new Intent(ListActivity.this, CreamPasta.class );
                    startActivity(intent);
                }
                //홍콩식 프렌치 토스트 선택시
                if(titleStr.equals("홍콩식 프렌치 토스트")){
                    Intent intent = new Intent(ListActivity.this, FrenchToast.class );
                    startActivity(intent);
                }
                //신라면 투움바 파스타 선택시
                if(titleStr.equals("신라면 투움바 파스타")){
                    Intent intent = new Intent(ListActivity.this, ShinPasta.class );
                    startActivity(intent);
                }
                //두부까스 선택시
                if(titleStr.equals("두부까스")){
                    Intent intent = new Intent(ListActivity.this, DoobooGasu.class );
                    startActivity(intent);
                }
                //콘치즈 선택시
                if(titleStr.equals("콘치즈")){
                    Intent intent = new Intent(ListActivity.this, CornCheese.class );
                    startActivity(intent);
                }
                //목살스테이크 선택시
                if(titleStr.equals("목살 스테이크")){
                    Intent intent = new Intent(ListActivity.this, Steak.class );
                    startActivity(intent);
                }
                //바나나버터 토스트 선택시
                if(titleStr.equals("바나나버터 토스트")){
                    Intent intent = new Intent(ListActivity.this, BananaToast.class );
                    startActivity(intent);
                }
                //두부 딸기 샐러드 선택시
                if(titleStr.equals("두부 딸기 샐러드")){
                    Intent intent = new Intent(ListActivity.this, TofuStrawberrySalad.class );
                    startActivity(intent);
                }
                //식빵 맛탕 선택시
                if(titleStr.equals("식빵 맛탕")){
                    Intent intent = new Intent(ListActivity.this, BreadMattang.class );
                    startActivity(intent);
                }
                //몬테크리스토 샌드위치 선택시
                if(titleStr.equals("몬테크리스토 샌드위치")){
                    Intent intent = new Intent(ListActivity.this, Montecristo.class );
                    startActivity(intent);
                }
                //맥앤치즈 선택시
                if(titleStr.equals("맥앤치즈")){
                    Intent intent = new Intent(ListActivity.this, MacandCheese.class );
                    startActivity(intent);
                }
                //맥앤치즈 선택시
                if(titleStr.equals("맥앤치즈")){
                    Intent intent = new Intent(ListActivity.this, MacandCheese.class );
                    startActivity(intent);
                }
                //닭가슴살 카레 선택시
                if(titleStr.equals("닭가슴살 카레")){
                    Intent intent = new Intent(ListActivity.this, ChickenCurry.class );
                    startActivity(intent);
                }


                //중식,일식
                //오야꼬동 선택시
                if(titleStr.equals("오야꼬동")){
                    Intent intent = new Intent(ListActivity.this, FragmentOne.class );
                    startActivity(intent);
                }
                //깐풍새우 선택시
                if(titleStr.equals("깐풍새우")){
                    Intent intent = new Intent(ListActivity.this, FragmentTwo.class );
                    startActivity(intent);
                }
                //타마고산도 선택시
                if(titleStr.equals("타마고산도")){
                    Intent intent = new Intent(ListActivity.this, FragmentThree.class );
                    startActivity(intent);
                }
                //구운새우 하이라이스 덮밥 선택시
                if(titleStr.equals("구운새우 하이라이스 덮밥")){
                    Intent intent = new Intent(ListActivity.this, FragmentFour.class );
                    startActivity(intent);
                }
                //3분카레크림우동 선택시
                if(titleStr.equals("3분카레크림우동")){
                    Intent intent = new Intent(ListActivity.this, FragmentFive.class );
                    startActivity(intent);
                }
                //연어와사마요라면 선택시
                if(titleStr.equals("연어와사마요라면")){
                    Intent intent = new Intent(ListActivity.this, FragmentSix.class );
                    startActivity(intent);
                }
                //치즈이모모찌 선택시
                if(titleStr.equals("치즈이모모찌")){
                    Intent intent = new Intent(ListActivity.this, FragmentSeven.class );
                    startActivity(intent);
                }
                //토마토달걀덮밥 선택시
                if(titleStr.equals("토마토달걀덮밥")){
                    Intent intent = new Intent(ListActivity.this, FragmentEight.class );
                    startActivity(intent);
                }
                //만두 계란탕 선택시
                if(titleStr.equals("만두 계란탕")){
                    Intent intent = new Intent(ListActivity.this, FragmentNine.class );
                    startActivity(intent);
                }
                //일본식 소고기 크로켓 선택시
                if(titleStr.equals("일본식 소고기 크로켓")){
                    Intent intent = new Intent(ListActivity.this, FragmentTen.class );
                    startActivity(intent);
                }
                //위대한 스테키동 선택시
                if(titleStr.equals("위대한 스테키동")){
                    Intent intent = new Intent(ListActivity.this, FragmentEleven.class );
                    startActivity(intent);
                }
                //바나나 빠스 선택시
                if(titleStr.equals("바나나 빠스")){
                    Intent intent = new Intent(ListActivity.this, FragmentTwelve.class );
                    startActivity(intent);
                }
                //치킨가라아게 선택시
                if(titleStr.equals("치킨가라아게")){
                    Intent intent = new Intent(ListActivity.this, FragmentThirteen.class );
                    startActivity(intent);
                }
                //닭가슴살 짜장볶음 선택시
                if(titleStr.equals("닭가슴살 짜장볶음")){
                    Intent intent = new Intent(ListActivity.this, FragmentFourteen.class );
                    startActivity(intent);
                }
                //마파두부 선택시
                if(titleStr.equals("마파두부")){
                    Intent intent = new Intent(ListActivity.this, FragmentFifteen.class );
                    startActivity(intent);
                }

                //한식
                //김치 볶음밥 선택시
                if(titleStr.equals("김치 볶음밥")){
                    Intent intent = new Intent(ListActivity.this, 김치볶음밥.class );
                    startActivity(intent);
                }
                //비빔국수 선택시
                if(titleStr.equals("비빔국수")){
                    Intent intent = new Intent(ListActivity.this, 비빔국수.class );
                    startActivity(intent);
                }
                //비빔밥 선택시
                if(titleStr.equals("비빔밥")){
                    Intent intent = new Intent(ListActivity.this, 비빔밥.class );
                    startActivity(intent);
                }
                //떡볶이 선택시
                if(titleStr.equals("떡볶이")){
                    Intent intent = new Intent(ListActivity.this, 떡볶이.class );
                    startActivity(intent);
                }
                //김치찌개 선택시
                if(titleStr.equals("김치찌개")){
                    Intent intent = new Intent(ListActivity.this, 김치찌개.class );
                    startActivity(intent);
                }
                //잔치국수 선택시
                if(titleStr.equals("잔치국수")){
                    Intent intent = new Intent(ListActivity.this, 잔치국수.class );
                    startActivity(intent);
                }
                //대파 볶음밥 선택시
                if(titleStr.equals("대파 볶음밥")){
                    Intent intent = new Intent(ListActivity.this, 대파볶음밥.class );
                    startActivity(intent);
                }
                //부대찌개 선택시
                if(titleStr.equals("부대찌개")){
                    Intent intent = new Intent(ListActivity.this, 부대찌개.class );
                    startActivity(intent);
                }
                //된장찌개 선택시
                if(titleStr.equals("된장찌개")){
                    Intent intent = new Intent(ListActivity.this, 된장찌개.class );
                    startActivity(intent);
                }
                //김치 순두부찌개 선택시
                if(titleStr.equals("김치 순두부찌개")){
                    Intent intent = new Intent(ListActivity.this, 김치순두부찌개.class );
                    startActivity(intent);
                }
                //고추장찌개 선택시
                if(titleStr.equals("고추장찌개")){
                    Intent intent = new Intent(ListActivity.this, 고추장찌개.class );
                    startActivity(intent);
                }
                //김치전 선택시
                if(titleStr.equals("김치전")){
                    Intent intent = new Intent(ListActivity.this, 김치전.class );
                    startActivity(intent);
                }
                //오징어 볶음 선택시
                if(titleStr.equals("오징어 볶음")){
                    Intent intent = new Intent(ListActivity.this, 오징어볶음.class );
                    startActivity(intent);
                }
                //불고기 전골 선택시
                if(titleStr.equals("불고기 전골")){
                    Intent intent = new Intent(ListActivity.this, 불고기전골.class );
                    startActivity(intent);
                }
                //두부김치 선택시
                if(titleStr.equals("두부김치")){
                    Intent intent = new Intent(ListActivity.this, 두부김치.class );
                    startActivity(intent);
                }
            }
        });

        textView100.setText(selected_ingredient[0]+" / "+selected_ingredient[1]+" / "+selected_ingredient[2]);


    }
}
