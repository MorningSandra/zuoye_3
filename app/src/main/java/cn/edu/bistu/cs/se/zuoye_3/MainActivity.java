package cn.edu.bistu.cs.se.zuoye_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        CheckBox cbMi = (CheckBox) findViewById(R.id.CheckMi);
        CheckBox cbHuawei = (CheckBox) findViewById(R.id.CheckHuawei);
        CheckBox cbMeizu = (CheckBox) findViewById(R.id.CheckMeizu);
        CheckBox cbSmartisan = (CheckBox) findViewById(R.id.CheckSmartisan);
        RadioButton rb = (RadioButton) findViewById(R.id.male);
        cbMi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) txtResult.setText("小米");
                else txtResult.setText("");
            }
        });
        rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) txtResult.setText("男");
                else txtResult.setText("女");
            }
        });
    }

}
