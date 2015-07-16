package com.example.jonny.bmi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(calcBMI);

        btn=(Button)findViewById(R.id.in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }


    private View.OnClickListener calcBMI = new View.OnClickListener() {
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText) findViewById(R.id.ET1);
            EditText fieldweight = (EditText) findViewById(R.id.ET2);
            double height = Double
                    .parseDouble(fieldheight.getText().toString()) / 100;
            double weight = Double
                    .parseDouble(fieldweight.getText().toString());
            double BMI = weight / (height * height);

            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Your BMI is " + nf.format(BMI));

            // Give health advice
            TextView fieldsuggest = (TextView) findViewById(R.id.suggest);
            if (BMI >= 40) {
                fieldsuggest.setText(R.string.advice_veryheavy);
            } else if (BMI>=35&&BMI<40) {
                fieldsuggest.setText(R.string.advice_tooheavy);
            } else if (BMI>=30&&BMI<35) {
                fieldsuggest.setText(R.string.advice_light);
            } else if (BMI>=25&&BMI<30) {
                fieldsuggest.setText(R.string.advice_heavy);
            } else if (BMI>=18.5&&BMI<25) {
                fieldsuggest.setText(R.string.advice_average);
            } else if (BMI>=16&&BMI<18.5) {
                fieldsuggest.setText(R.string.advice_thin);
            } else {
                fieldsuggest.setText(R.string.advice_verythin);
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //得到当前选中的MenuItem的ID,
        int item_id = item.getItemId();

        switch (item_id)
        {
            case R.id.action_settings:
                /* 新建一个Intent对象 */
                Intent intent = new Intent();
                /* 指定intent要启动的类 */
                Intent intent1 = intent.setClass(MainActivity.this, AboutActivity.class);
                /* 启动一个新的Activity */
                startActivity(intent);
                /* 关闭当前的Activity */
                //MainActivity.this.finish();
                MainActivity.this.finish();
                break;
            case R.id.exit:
                MainActivity.this.finish();
                break;
        }
        return true;
    }
}
