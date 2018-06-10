package com.wjbshm.smer_final;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class food_List extends AppCompatActivity {
    ArrayList<Recipe> rc = new ArrayList<Recipe>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final String passedPrice = "1000";
        int price = Integer.parseInt(passedPrice);

        //홈으로 돌아가는 버튼
        Button home_btn = findViewById(R.id.home_btn);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"홈으로 돌아갑니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(food_List.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        //Your Choice 텍스트뷰
        TextView txt = findViewById(R.id.ttt);
        txt.setText("Your Choice");

        ListView listview = (ListView) findViewById(R.id.listView1);
        Intent intent = getIntent();//bundle 받기
        final String[] get_String = intent.getStringArrayExtra("meat");
        final String[] get_item = new String[1];
        get_item[0] =intent.getStringExtra("Meat");


        for (int i = 0; i < get_String.length; i++) {
            if (get_String[i] == null)
                break;
            if (get_String[i].equalsIgnoreCase("잔치국수")) {
                rc.add(new Recipe("잔치국수", R.drawable.noodle, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("비빔국수")) {
                rc.add(new Recipe("비빔국수", R.drawable.noodle_mix, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("두부김치")) {
                rc.add(new Recipe("두부김치", R.drawable.tofu_kimchi, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("오징어볶음")) {
                rc.add(new Recipe("오징어볶음", R.drawable.squid_boat, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("부대찌개")) {
                rc.add(new Recipe("부대찌개", R.drawable.army_kimchi, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("된장찌개")) {
                rc.add(new Recipe("된장찌개", R.drawable.bean_boiling, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("불고기전골")) {
                rc.add(new Recipe("불고기전골", R.drawable.bulgogi, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("대파볶음밥")) {
                rc.add(new Recipe("대파볶음밥", R.drawable.greenonion_rice, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("김치찌개")) {
                rc.add(new Recipe("김치찌개", R.drawable.kimchi_boiling, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("김치전")) {
                rc.add(new Recipe("김치전", R.drawable.kimchi_pancake, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("고추장찌개")) {
                rc.add(new Recipe("고추장찌개", R.drawable.red_pepper_boiling, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("비빔밥")) {
                rc.add(new Recipe("비빔밥", R.drawable.rice_mix, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("순두부찌개")) {
                rc.add(new Recipe("순두부찌개", R.drawable.soft_tofu_boiling, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("떡볶이")) {
                rc.add(new Recipe("떡볶이", R.drawable.spicy_ricecake, get_item[0]));
            } else if (get_String[i].equalsIgnoreCase("김치볶음밥")) {
                rc.add(new Recipe("김치볶음밥", R.drawable.rice_kimchi, get_item[0]));
            }
            /***************************************************************/
            else if (get_String[i].equalsIgnoreCase("하이라이스 덮밥구운새우"))
                rc.add(new Recipe("하이라이스 덮밥구운새우", R.drawable.hirice, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("연어 와사마요 라면"))
                rc.add(new Recipe("연어 와사마요 라면", R.drawable.salmon, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("3분 카레 크림우동"))
                rc.add(new Recipe("3분 카레 크림우동", R.drawable.cream, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("치즈 이모 모찌"))
                rc.add(new Recipe("치즈 이모 모찌", R.drawable.mozzi, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("토마토 달걀 덮밥"))
                rc.add(new Recipe("토마토 달걀 덮밥", R.drawable.tomato, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("만두 계란탕"))
                rc.add(new Recipe("만두 계란탕", R.drawable.dumpling,get_item[0]));
            else if (get_String[i].equalsIgnoreCase("오야꼬동"))
                rc.add(new Recipe("오야꼬동", R.drawable.oya, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("타마고 산도"))
                rc.add(new Recipe("타마고 산도", R.drawable.tamago, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("마파두부"))
                rc.add(new Recipe("마파두부", R.drawable.mafa,get_item[0]));
            else if (get_String[i].equalsIgnoreCase("바나나 빠스"))
                rc.add(new Recipe("바나나 빠스", R.drawable.bananabbas, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("치킨 가라아게"))
                rc.add(new Recipe("치킨 가라아게", R.drawable.chicken, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("일본식 소고기 크로켓"))
                rc.add(new Recipe("일본식 소고기 크로켓", R.drawable.croket, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("닭가슴살 짜장볶음"))
                rc.add(new Recipe("닭가슴살 짜장볶음", R.drawable.zzazang, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("위대한 스테키동"))
                rc.add(new Recipe("위대한 스테키동", R.drawable.stekidong, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("깐풍새우"))
                rc.add(new Recipe("깐풍새우", R.drawable.shrimp, get_item[0]));

            /****************************양식***********************************/
            else if (get_String[i].equalsIgnoreCase("계란 피자"))
                rc.add(new Recipe("계란 피자", R.drawable.eggpizza1,get_item[0]));
            else if (get_String[i].equalsIgnoreCase("식빵 피자"))
                rc.add(new Recipe("식빵 피자", R.drawable.breadpizza1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("토마토 파스타"))
                rc.add(new Recipe("토마토 파스타", R.drawable.tomatopasta1,get_item[0]));
            else if (get_String[i].equalsIgnoreCase("크림 파스타"))
                rc.add(new Recipe("크림 파스타", R.drawable.creampasta1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("홍콩식 프렌치 토스트"))
                rc.add(new Recipe("홍콩식 프렌치 토스트", R.drawable.frenchtoast1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("신라면 투움바 파스타"))
                rc.add(new Recipe("신라면 투움바 파스타", R.drawable.shinramyunpasta1,get_item[0]));
            else if (get_String[i].equalsIgnoreCase("두부까스"))
                rc.add(new Recipe("두부까스", R.drawable.dooboogasu1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("콘치즈"))
                rc.add(new Recipe("콘치즈", R.drawable.corncheese1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("목살 스테이크"))
                rc.add(new Recipe("목살 스테이크", R.drawable.steak1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("바나나버터 토스트"))
                rc.add(new Recipe("바나나버터 토스트", R.drawable.bananatoast1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("두부 딸기 샐러드"))
                rc.add(new Recipe("두부 딸기 샐러드", R.drawable.tofustrawberrysalad1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("식빵 맛탕"))
                rc.add(new Recipe("식빵 맛탕", R.drawable.breadmattang1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("몬테크리스토 샌드위치"))
                rc.add(new Recipe("몬테크리스토 샌드위치", R.drawable.montecristosandwich1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("맥앤치즈"))
                rc.add(new Recipe("맥앤치즈", R.drawable.macandcheese1, get_item[0]));
            else if (get_String[i].equalsIgnoreCase("닭가슴살 카레"))
                rc.add(new Recipe("닭가슴살 카레", R.drawable.chickencurry1,get_item[0]));
        }

        //리스트 메뉴 클릭리스너
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //선택된 아이템의 포지션을 읽음

                Recipe item = (Recipe) parent.getItemAtPosition(position);
                String titleStr = item.getTitle();
                /******************한식********************/
                //김치볶음밥 선택시
                if (titleStr.equals("김치볶음밥")) {
                    Intent intent = new Intent(food_List.this, 김치볶음밥.class);
                    startActivity(intent);
                }
                //떡볶이 선택시
                if (titleStr.equals("떡볶이")) {
                    Intent intent = new Intent(food_List.this, 떡볶이.class);
                    startActivity(intent);
                }
                //순두부찌개 선택시
                if (titleStr.equals("순두부찌개")) {
                    Intent intent = new Intent(food_List.this, 김치순두부찌개.class);
                    startActivity(intent);
                }
                //비빔밥 선택시
                if (titleStr.equals("비빔밥")) {
                    Intent intent = new Intent(food_List.this, 비빔밥.class);
                    startActivity(intent);
                }
                //고추장찌개 선택시
                if (titleStr.equals("고추장찌개")) {
                    Intent intent = new Intent(food_List.this, 고추장찌개.class);
                    startActivity(intent);
                }
                //김치전 선택시
                if (titleStr.equals("김치전")) {
                    Intent intent = new Intent(food_List.this, 김치전.class);
                    startActivity(intent);
                }
                //김치찌개 선택시
                if (titleStr.equals("김치찌개")) {
                    Intent intent = new Intent(food_List.this, 김치찌개.class);
                    startActivity(intent);
                }
                //대파볶음밥 선택시
                if (titleStr.equals("대파볶음밥")) {
                    Intent intent = new Intent(food_List.this, 대파볶음밥.class);
                    startActivity(intent);
                }
                //불고기전골 선택시
                if (titleStr.equals("불고기전골")) {
                    Intent intent = new Intent(food_List.this, 불고기전골.class);
                    startActivity(intent);
                }
                //잔치국수 선택시
                if (titleStr.equals("잔치국수")) {
                    Intent intent = new Intent(food_List.this, 잔치국수.class);
                    startActivity(intent);
                }
                //비빔국수 선택시
                if (titleStr.equals("비빔국수")) {
                    Intent intent = new Intent(food_List.this, 비빔국수.class);
                    startActivity(intent);
                }
                //두부김치 선택시
                if (titleStr.equals("두부김치")) {
                    Intent intent = new Intent(food_List.this, 두부김치.class);
                    startActivity(intent);
                }
                //오징어볶음 선택시
                if (titleStr.equals("오징어볶음")) {
                    Intent intent = new Intent(food_List.this, 오징어볶음.class);
                    startActivity(intent);
                }
                //부대찌개 선택시
                if (titleStr.equals("부대찌개")) {
                    Intent intent = new Intent(food_List.this, 부대찌개.class);
                    startActivity(intent);
                }
                //된장찌개 선택시
                if (titleStr.equals("된장찌개")) {
                    Intent intent = new Intent(food_List.this, 된장찌개.class);
                    startActivity(intent);
                }

                /*************중식******일식*****************/

                //구운새우 하이라이스 덮밥 선택시
                if (titleStr.equals("하이라이스 덮밥구운새우")) {
                    Intent intent = new Intent(food_List.this, FragmentFour.class);
                    startActivity(intent);
                }
                //연어 와사마요 라면 선택시
                if (titleStr.equals("연어 와사마요 라면")) {
                    Intent intent = new Intent(food_List.this, FragmentSix.class);
                    startActivity(intent);
                }
                //3분 카레 크림우동 선택시
                if (titleStr.equals("3분 카레 크림우동")) {
                    Intent intent = new Intent(food_List.this, FragmentFive.class);
                    startActivity(intent);
                }
                //치즈 이모 모찌 선택시
                if (titleStr.equals("치즈 이모 모찌")) {
                    Intent intent = new Intent(food_List.this, FragmentSeven.class);
                    startActivity(intent);
                }
                //토마토 달걀 덮밥 선택시
                if (titleStr.equals("토마토 달걀 덮밥")) {
                    Intent intent = new Intent(food_List.this, FragmentEight.class);
                    startActivity(intent);
                }
                //만두 계란탕 선택시
                if (titleStr.equals("만두 계란탕")) {
                    Intent intent = new Intent(food_List.this, FragmentNine.class);
                    startActivity(intent);
                }
                //오야꼬동 선택시
                if (titleStr.equals("오야꼬동")) {
                    Intent intent = new Intent(food_List.this, FragmentOne.class);
                    startActivity(intent);
                }
                //타마고 산도 선택시
                if (titleStr.equals("타마고 산도")) {
                    Intent intent = new Intent(food_List.this, FragmentThree.class);
                    startActivity(intent);
                }
                //마파두부 선택시
                if (titleStr.equals("마파두부")) {
                    Intent intent = new Intent(food_List.this, FragmentFifteen.class);
                    startActivity(intent);
                }
                //바나나 빠스 선택시
                if (titleStr.equals("바나나 빠스")) {
                    Intent intent = new Intent(food_List.this, FragmentTwelve.class);
                    startActivity(intent);
                }
                //비빔국수 선택시
                if (titleStr.equals("깐풍새우")) {
                    Intent intent = new Intent(food_List.this, FragmentTwo.class);
                    startActivity(intent);
                }
                //치킨 가라아게 선택시
                if (titleStr.equals("치킨 가라아게")) {
                    Intent intent = new Intent(food_List.this, FragmentThirteen.class);
                    startActivity(intent);
                }
                //일본식 소고기 크로켓 선택시
                if (titleStr.equals("일본식 소고기 크로켓")) {
                    Intent intent = new Intent(food_List.this, FragmentTen.class);
                    startActivity(intent);
                }
                //닭가슴살 짜장볶음 선택시
                if (titleStr.equals("닭가슴살 짜장볶음")) {
                    Intent intent = new Intent(food_List.this, FragmentFourteen.class);
                    startActivity(intent);
                }//위대한 스테키동 선택시
                if (titleStr.equals("위대한 스테키동")) {
                    Intent intent = new Intent(food_List.this, FragmentEleven.class);
                    startActivity(intent);
                }
                /********************양식*************************/
                //계란 피자선택시
                if(titleStr.equals("계란 피자")){
                    Intent intent = new Intent(food_List.this, EggPizza.class );
                    startActivity(intent);
                }
                //식빵 피자선택시
                if(titleStr.equals("식빵 피자")){
                    Intent intent = new Intent(food_List.this, BreadPizza.class );
                    startActivity(intent);
                }
                //토마토 파스타선택시
                if(titleStr.equals("토마토 파스타")){
                    Intent intent = new Intent(food_List.this, TomatoPasta.class );
                    startActivity(intent);
                }
                //크림 파스타선택시
                if(titleStr.equals("크림 파스타")){
                    Intent intent = new Intent(food_List.this, CreamPasta.class );
                    startActivity(intent);
                }
                //홍콩식 프렌치 토스트 선택시
                if(titleStr.equals("홍콩식 프렌치 토스트")){
                    Intent intent = new Intent(food_List.this, FrenchToast.class );
                    startActivity(intent);
                }
                //신라면 투움바 파스타 선택시
                if(titleStr.equals("신라면 투움바 파스타")){
                    Intent intent = new Intent(food_List.this, ShinPasta.class );
                    startActivity(intent);
                }
                //두부까스 선택시
                if(titleStr.equals("두부까스")){
                    Intent intent = new Intent(food_List.this, DoobooGasu.class );
                    startActivity(intent);
                }
                //콘치즈 선택시
                if(titleStr.equals("콘치즈")){
                    Intent intent = new Intent(food_List.this, CornCheese.class );
                    startActivity(intent);
                }
                //목살스테이크 선택시
                if(titleStr.equals("목살 스테이크")){
                    Intent intent = new Intent(food_List.this, Steak.class );
                    startActivity(intent);
                }
                //바나나버터 토스트 선택시
                if(titleStr.equals("바나나버터 토스트")){
                    Intent intent = new Intent(food_List.this, BananaToast.class );
                    startActivity(intent);
                }
                //두부 딸기 샐러드 선택시
                if(titleStr.equals("두부 딸기 샐러드")){
                    Intent intent = new Intent(food_List.this, TofuStrawberrySalad.class );
                    startActivity(intent);
                }
                //식빵 맛탕 선택시
                if(titleStr.equals("식빵 맛탕")){
                    Intent intent = new Intent(food_List.this, BreadMattang.class );
                    startActivity(intent);
                }
                //몬테크리스토 샌드위치 선택시
                if(titleStr.equals("몬테크리스토 샌드위치")){
                    Intent intent = new Intent(food_List.this, Montecristo.class );
                    startActivity(intent);
                }
                //맥앤치즈 선택시
                if(titleStr.equals("맥앤치즈")){
                    Intent intent = new Intent(food_List.this, MacandCheese.class );
                    startActivity(intent);
                }
                //닭가슴살 카레 선택시
                if(titleStr.equals("닭가슴살 카레")){
                    Intent intent = new Intent(food_List.this, ChickenCurry.class );
                    startActivity(intent);
                }

            }
        });


        MyAdapter adapter = new MyAdapter(getApplicationContext(),
                R.layout.row, rc);

        listview.setAdapter(adapter);

    }
}

//class MyAdapter extends BaseAdapter {
//    Context context;
//    int layout;
//    ArrayList<Recipe> rc;
//    LayoutInflater inf;
//
//    public MyAdapter(Context context, int layout, ArrayList<Recipe> rc) {
//        this.context = context;
//        this.layout = layout;
//        this.rc = rc;
//        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//    @Override
//    public int getCount() {
//        return rc.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return rc.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = inf.inflate(layout, null);
//        }
//        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView1);
//        TextView Name = (TextView) convertView.findViewById(R.id.textView1);
//        TextView Info = (TextView) convertView.findViewById(R.id.textView2);
//
//        Recipe r = rc.get(position);
//        iv.setImageResource(r.img);
//        Name.setText(r.title);
//        Info.setText(r.ingredient);
//
//        return convertView;
//    }
//}

//class Recipe {
//    String title = "";
//    int img;
//    String ingredient = "";
//
//    public Recipe(String title, int img, String ingredient) {
//        super();
//        this.title = title;
//        this.img = img;
//        this.ingredient = ingredient;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//}
