package com.wjbshm.smer_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class IngredientActivity extends AppCompatActivity {
    //전체 재료
    String[] ingredient = { "- - - - - - - -", "계란",  "올리브", "그린빈", "토마토소스",            "소고기",
            "식빵", "옥수수", "양파", "파프리카","토마토","치즈","케찹","마요네즈","감자전분가루","굴소스",
            "스파게티 면",  "마늘", "소금","소세지", "베이컨",   "맛술", "혼다시",   "김치","파",
            "돼지고기","고추가루", "다시마","설탕",     "딸기",  "매실진액", "깨", "참기름",
            "견과류", "식용유", "깻잎","춘장","버터", "연유", "아몬드","무순","참치",
            "햄", "잼",     "옥수수콘 통조림","당근","부침가루", "돈까스소스","감자", "파","고추기름","고추장","오징어","양배추",
            "전분가루", "물엿", "닭다리살","생강",       "소고기 목살",   "스팸","소면","깨",
            "고기만두","멸치","두부",  "올리고당",       "와사마요볶음면", "훈제연어","닭가슴살",  "카레",
            "버섯",  "올리브 오일", "후추","밀가루","식초","상추", "간장",      "대파","와사비",
            "라면", "파슬리","새우", "브로콜리","생크림", "우유","햄 슬라이스", "빵가루","3분 카레", "생크림","무","호박",
            "바나나","계피분",
            "마카로니",         "밥",
            "우동 면",
            "튀김가루"
    };

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);

        button = findViewById(R.id.button1);

        Toast.makeText(getApplicationContext(),"1개 혹은 2개의 재료만 선택해도 됩니다", Toast.LENGTH_LONG).show();

        //선택된 3개의 재료를 담을 곳
        final String[] selected_ing={"","",""};

        //3개의 스피너
        final Spinner spinner1 = findViewById(R.id.spinner1);
        final Spinner spinner2 = findViewById(R.id.spinner2);
        final Spinner spinner3 = findViewById(R.id.spinner3);

        //1. 재료 스트링 어레이와 어댑터 연결
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ingredient);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //2. 어댑터를 스피너1,2,3에 연결
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

        //스피너1 선택 하면 스트링 저장
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[0] = (String)spinner1.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //스피너2 선택 하면 스트링 저장
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[1] = (String)spinner2.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //스피너3 선택 하면 스트링 저장
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //선택재료 어레이에 넣기
                selected_ing[2] = (String)spinner3.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view){
                //리스트 액티비티실행
                Intent intent = new Intent(getApplicationContext(), ListActivity.class );
                intent.putExtra("three_ingredient",selected_ing);
                startActivity(intent);
            }
        });
    }
}
