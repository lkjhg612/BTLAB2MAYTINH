package BMI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.maytinhbotui.R;

public class MainbmiActivity extends AppCompatActivity {
    Button tinhBmi;
    EditText ten, chieuCao, canNang, bmi, chanDoan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainbmi);
        tinhBmi = findViewById(R.id.tinhBMI);
        ten = findViewById(R.id.nhapTen);
        chieuCao = findViewById(R.id.nhapChieuCao);
        canNang = findViewById(R.id.nhapCanNang);
        bmi = findViewById(R.id.ketQuaBmi);
        chanDoan = findViewById(R.id.chanDoan);

        tinhBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Ten = ten.getText().toString();

                Double ChieuCao = Double.parseDouble(chieuCao.getText().toString());

                Double CanNang = Double.parseDouble(canNang.getText().toString());

                double a = tinhBMI(CanNang, ChieuCao);

                String b = dieuKienBmi(a);

                chanDoan.setText(b);

                bmi.setText(String.valueOf(a));


               /* String a = label.Text (WINFORM) => String a = label.getText().toString() (ANDROID)    LẤY NỘI DUNG CỦA Label
                   label.Text = "ABC" (WINFORM)   => label.setText("ABC") (ANDROID)                     GÁN NỘI DUNG "ABC" lho label*/

            }
        });


    }


    public double tinhBMI(double w , double h) {
        return w  / Math.pow(h/100, 2);
    }
    public String dieuKienBmi(double bmi) {
        String chanDoan = "";
        if (bmi < 18){
            chanDoan = "Bạn gầy";
        }else if(bmi <= 24.9){
            chanDoan = "Bạn bình thường";
        }else if (bmi <= 29.9){
            chanDoan = "Bạn béo phì độ 1";
        }else if(bmi <= 34.9){
            chanDoan = "Bạn béo phì độ 2";
        }else {
            chanDoan = "Bạn béo phì độ 3";
        }
           return chanDoan;
    }
}
