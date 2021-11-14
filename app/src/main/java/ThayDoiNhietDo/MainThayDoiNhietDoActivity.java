package ThayDoiNhietDo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maytinhbotui.R;

public class MainThayDoiNhietDoActivity extends AppCompatActivity {
    Button nutdoC, nutDoF, nutClear;
    EditText oDoF, oDoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thay_doi_nhiet_do);

        nutdoC = findViewById(R.id.btnDoC);
        nutDoF = findViewById(R.id.btnDoF);
        nutClear = findViewById(R.id.btnClear);

        oDoC = findViewById(R.id.oNhapDoC);
        oDoF = findViewById(R.id.oNhapDoF);

        nutdoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nhietDoF = Double.parseDouble(oDoF.getText().toString());

                double a = congThucDoF(nhietDoF);

                oDoC.setText(String.valueOf(a));

                Toast.makeText(MainThayDoiNhietDoActivity.this, "Tính độ c thành công", Toast.LENGTH_LONG).show();

            }
        });

        nutDoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double nhietDoC = Double.parseDouble(oDoC.getText().toString());

                double b = congThucDoC(nhietDoC);

                oDoF.setText(String.valueOf(b));

                Toast.makeText(MainThayDoiNhietDoActivity.this,"Tính độ f thành công",Toast.LENGTH_LONG).show();

            }
        });

        nutClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oDoC.setText("");
                oDoF.setText("");
            }
        });
    }
    public Double congThucDoF(double c){

        return c * (9/5) + 32;
    }

    public double congThucDoC(double f){

        return ((f-32) * 5)/9;
    }
}