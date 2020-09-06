package th.ac.su.cp.speedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button cal;
    Button clear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.distance);
        num2 = (EditText)findViewById(R.id.time);
        cal = (Button)findViewById(R.id.calculate_button);
        result = (TextView)findViewById(R.id.answer);
        clear = (Button)findViewById(R.id.clear_button);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numDistance = Double.parseDouble(num1.getText().toString());
                double numTime = Double.parseDouble(num2.getText().toString());
                double ans = numDistance/numTime;
                result.setText(String.valueOf(ans));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.getText().clear();
                num2.getText().clear();
            }
        });


    }
}