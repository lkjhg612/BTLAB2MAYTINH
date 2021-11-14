package SoNhanPham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.maytinhbotui.R;

import java.util.Random;

public class MainSoNhanPhamAcivity extends AppCompatActivity {
    Button btso, btma;
    EditText so,ma;
    String MaRandom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#%^*&!"; // => 42 KÝ TỪ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_so_nhan_pham_acivity);

        btma = findViewById(R.id.nutTaoMa);
        btso = findViewById(R.id.nutTaoSo);

        so = findViewById(R.id.taoSo);
        ma = findViewById(R.id.taoMa);

        btma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ketQua = "";
                Random soq = new Random();
                for (int i=0; i<7; i++) {// 7 ký tự
                    int gt = soq.nextInt(42); // SỐ SINH RA NGẪU NHIÊN 0 -35
                    char k = MaRandom.charAt(gt);   // LẤY KÍ TỰ NGẪU NHIÊN TỪ 0 -35 CHUỖI MaRandom GÁN VÀO k
                    ketQua += k;
                }
                ma.setText(ketQua);
            }
        });

        btso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Random soq = new Random();
               int soRanDom = soq.nextInt(10000000);// số ngẫu nhiên từ 1 - 999999
               so.setText(String.valueOf(soRanDom));
            }
        });

    }
}