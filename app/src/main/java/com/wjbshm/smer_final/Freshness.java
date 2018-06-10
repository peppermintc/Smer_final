package com.wjbshm.smer_final;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class Freshness extends AppCompatActivity {


    // 날짜설정하기
    int tYear, tMonth, tDay;


    String Date_data = "";
    ListView listItem;
    Handler handler1;
    public int counter=0;


    String ingredient_string = "";
    String date_String = "";
    String[] timer;


    SharedPreferences expiration_Date, list_num, sh_Pref;
    SharedPreferences.Editor toEdit, Edit, toEdit_num;

    ArrayList<Recipe_list> rc = new ArrayList<Recipe_list>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_freshness);
        listItem = (ListView) findViewById(R.id.list_item);

        handler1 = new Handler();

        sh_Pref = getSharedPreferences("ingredient", MODE_PRIVATE);
        ingredient_string = sh_Pref.getString("match", "");

        // 화면에 선언된 것들을 지정합니다.
        expiration_Date = getSharedPreferences("expiration", MODE_PRIVATE);
        date_String = expiration_Date.getString("matching", "");
        // btnCheck이 눌렸을 때(클릭핸들러) 해야 할 일을 명령합니다.

        if (date_String.length() == 0) {//shared에 저장된 것이 data가 들어가 있으면 무시
            expiration_Mapping();// 만료시간이 있는지 없는지 확인하고 재료각각에 mapping
        } else {
            expiration_After();
        }
        timer = date_String.split(",");
        //listView 부분
        Adapter adapter = new Adapter(getApplicationContext(), R.layout.list, rc);
        applySharedPreference();
        final ListView lv = (ListView) findViewById(R.id.list_item);
        lv.setAdapter(adapter);
        /*********************************************************************************************************************************/
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] num={"0","1","2","3","4","5","6","7","8","9"};

                counter= Integer.parseInt(num [position]);
              //  Toast.makeText(Freshness.this, date_String, Toast.LENGTH_SHORT).show();//위치에 따른 이름 toast로 띄위기

                if (timer[position].equals(String.valueOf(position))) {
                    setCurrentDate();
                    new DatePickerDialog(Freshness.this, dateSetListener, tYear, tMonth, tDay).show();//날짜 설정

                    date_String = "";
                    for (int i = 0; i < timer.length; i++) {
                        date_String = date_String + timer[i] + ",";

                    }
                    Toast.makeText(Freshness.this, "유통기한을 등록해 주세요.", Toast.LENGTH_SHORT).show();//위치에 따른 이름 toast로 띄위기

                } else {

                    Toast.makeText(Freshness.this, timer[position], Toast.LENGTH_SHORT).show();//위치에 따른 이름 toast로 띄위기
                }
                date_String = "";
                for (int i = 0; i < timer.length; i++) {
                    date_String = date_String + timer[i] + ",";

                }
                sharedPreferences();
            }
        });


    }

    /*****************************************************************************************************/
    public void expiration_Mapping() {
        String[] ingredient_Array = ingredient_string.split(",");
        String[] expiration_Array = date_String.split(",");

        if (expiration_Array.length == 1) {//,가 있거나 1개만 들어잇는 경우
            if (expiration_Array[0].equals("")) {
                date_String = "0,";
                for (int i = 1; i < ingredient_Array.length; i++) {
                    date_String = date_String + String.valueOf(i) + ",";
                }
            } else {
                for (int i = 1; i < ingredient_Array.length; i++) {
                    date_String = date_String + String.valueOf(i) + ",";
                }
            }
        }

        sharedPreferences();
    }

    public void expiration_After() {
        String[] ingredient_Array = ingredient_string.split(",");
        String[] expiration_Array = date_String.split(",");
        int temp = ingredient_Array.length - expiration_Array.length;
        if(temp<0) {
            for (int i = 0; i < ingredient_Array.length; i++) {
                date_String="";
                date_String = date_String + timer[i] + ",";
            }
            sharedPreferences();
        }
        if(temp>0) {
            for (int i = expiration_Array.length; i < ingredient_Array.length; i++) {
                date_String = date_String + String.valueOf(i) + ",";
            }
            sharedPreferences();
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


    // calendar 화면을 띄워주는 클래스
    private DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            // TODO Auto-generated method stub

            // 2. 선택된 날짜의 DDay를 계산한다.
            int nPassed = HowLongPassed(year, monthOfYear, dayOfMonth);

            // 3. 화면(txtDisplay)에 보여줘라.

            if (nPassed > 0) {
                timer[counter] = "유통기한이 " + nPassed + "일 남았습니다.";

            } else if (nPassed == 0) {
                timer[counter] = "유통기한이 오늘까지 입니다.";

            } else {
                timer[counter] = "유통기한이 " + (-1 * nPassed) + "일 지났습니다.";

            }

        }
    };


    // 오늘 날짜의 정보를 저장합니다.
    // "안드로이드 날짜"로 구글링
    void setCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        tYear = calendar.get(Calendar.YEAR);
        tMonth = calendar.get(Calendar.MONTH);
        tDay = calendar.get(Calendar.DAY_OF_MONTH);
    }


    // 설정일과 오늘이 얼마나 차이가 나는가?
    // 연-year, 월-month, 일-day을 받아서 처리함.
    int HowLongPassed(int year, int month, int day) {
        long d;
        long t;
        long r;

        // 오늘날짜
        Calendar calendar = Calendar.getInstance();

        // 설정일
        Calendar dCalendar = Calendar.getInstance();
        dCalendar.set(year, month, day);

        // 초단위로 계산하고 - 한다.
        t = calendar.getTimeInMillis();
        d = dCalendar.getTimeInMillis();
        r = (d - t) / (24 * 60 * 60 * 1000);

        return (int) r;
    }

    public void sharedPreferences() {
        expiration_Date = getSharedPreferences("expiration", MODE_PRIVATE);

        Edit = expiration_Date.edit();
        Edit.putString("matching", date_String);
        Edit.commit();

    }

    public void applySharedPreference() {
        String[] ingredient_array = ingredient_string.split(",");

        for (int i = 0; i < ingredient_array.length; i++) {

            if (ingredient_array[i].equals("onion")) {
                rc.add(new Recipe_list("양파", R.drawable.onion, counter));

            }
            if (ingredient_array[i].equals("pa")) {
                rc.add(new Recipe_list("파", R.drawable.pa, counter));

            }
            if (ingredient_array[i].equals("cow")) {
                rc.add(new Recipe_list("소고기", R.drawable.cow, counter));


            }
            if (ingredient_array[i].equals("pork")) {
                rc.add(new Recipe_list("돼지고기", R.drawable.pork, counter));

            }
            if (ingredient_array[i].equals("eggs")) {
                rc.add(new Recipe_list("계란", R.drawable.eggs, counter));

            }
            if (ingredient_array[i].equals("potato")) {
                rc.add(new Recipe_list("감자", R.drawable.potato, counter));

            }
            if (ingredient_array[i].equals("saewo")) {
                rc.add(new Recipe_list("새우", R.drawable.saewo, counter));

            }
            if (ingredient_array[i].equals("tofu")) {
                rc.add(new Recipe_list("두부", R.drawable.tofu, counter));

            }
            if (ingredient_array[i].equals("namul")) {
                rc.add(new Recipe_list("나물", R.drawable.namul, counter));

            }
            if (ingredient_array[i].equals("sikbang")) {
                rc.add(new Recipe_list("식빵", R.drawable.sikbang, counter));

            }
            if (ingredient_array[i].equals("grarlic")) {
                rc.add(new Recipe_list("마늘", R.drawable.grarlic, counter));

            }
            if (ingredient_array[i].equals("butter")) {
                rc.add(new Recipe_list("버터", R.drawable.butter, counter));

            }
            if (ingredient_array[i].equals("milk")) {
                rc.add(new Recipe_list("우유", R.drawable.milk, counter));

            }
            if (ingredient_array[i].equals("cream")) {
                rc.add(new Recipe_list("크림", R.drawable.cream, counter));

            }
            if (ingredient_array[i].equals("kim")) {
                rc.add(new Recipe_list("김치", R.drawable.kim, counter));

            }
            if (ingredient_array[i].equals("fish")) {
                rc.add(new Recipe_list("생선", R.drawable.fish, counter));
            }
        }

    }
}

//listview adapter
class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Recipe_list> rc;
    LayoutInflater inf;
    int count;

    public Adapter(Context context, int layout, ArrayList<Recipe_list> rc) {
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
        ProgressBar Info = (ProgressBar) convertView.findViewById(R.id.pro);

        MainActivity Count = new MainActivity();
        Recipe_list r = rc.get(position);
        iv.setImageResource(r.img);
        Name.setText(r.title);
        Info.setProgress(r.getPro());
        return convertView;
    }

}

class Recipe_list {
    String title = "";
    int img;
    int pro;

    public Recipe_list(String title, int img, int ingredient) {
        super();
        this.title = title;
        this.img = img;
        this.pro = ingredient;
    }

    public int getPro() {
        return pro;
    }

}

