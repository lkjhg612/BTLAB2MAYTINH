package com.example.maytinhbotui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tinhTong, tinhHieu, tinhTich, tinhThuong;
    EditText nhapA, nhapB, ketQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinhTong = (Button) findViewById(R.id.tong2So);

        tinhHieu = (Button) findViewById(R.id.hieu2So);

        tinhTich = (Button) findViewById(R.id.tich2So);

        tinhThuong = (Button) findViewById(R.id.thuong2So);

        nhapA =  (EditText) findViewById(R.id.nhapSoA);

        nhapB = (EditText) findViewById(R.id.nhapSoB);

        ketQua = (EditText) findViewById(R.id.hienKetQua);



        tinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapA.getText().toString()) ;
                int b = Integer.parseInt(nhapB.getText().toString()) ;
                int Tong = Tong(a, b);



                ketQua.setText(String.valueOf(Tong));//sửa nội dung thông tin trên cái box
                Toast.makeText(MainActivity.this, "TÍNH TỔNG THÀNH CÔNG", Toast.LENGTH_LONG).show();


            }
        });

        tinhHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapA.getText().toString()) ;
                int b = Integer.parseInt(nhapB.getText().toString()) ;
                int Hieu = Hieu(a, b);
                ketQua.setText(String.valueOf(Hieu));
                Toast.makeText(MainActivity.this, "TÍNH HIỆU THÀNH CÔNG", Toast.LENGTH_LONG).show();

            }
        });

        tinhTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapA.getText().toString()) ;
                int b = Integer.parseInt(nhapB.getText().toString()) ;
                int Tich = Tich(a, b);
                ketQua.setText(String.valueOf(Tich));
                Toast.makeText(MainActivity.this, "TÍNH TÍCH THÀNH CÔNG", Toast.LENGTH_LONG).show();

            }
        });
        tinhThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapA.getText().toString()) ;
                int b = Integer.parseInt(nhapB.getText().toString()) ;


                if(b != 0 ){
                    int Thuong = Thuong(a, b);
                    ketQua.setText(String.valueOf(Thuong));
                    Toast.makeText(MainActivity.this, "TÍNH THƯƠNG THÀNH CÔNG", Toast.LENGTH_LONG).show();
                }else{
                    ketQua.setText("SAI PHÉP TÍNH");
                    Toast.makeText(MainActivity.this, "SAI PHÉP TOÁN RÙI XEM HENTAI ĐI =))", Toast.LENGTH_LONG).show();
                }

            }
        });




    }
    public int Tong(int a, int b){
        return a + b;
    }

    public int Hieu(int a, int b){

        return a - b;
    }

    public int Tich(int a, int b){

        return a * b;
    }
    public int Thuong(int a, int b) {

        return a / b;

        }


}