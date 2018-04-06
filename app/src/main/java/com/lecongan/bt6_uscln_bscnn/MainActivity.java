package com.lecongan.bt6_uscln_bscnn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtA, edtB;
    private TextView tvKQ;
    private TextView tvKQ1;
    private Button btnTinh;
    private Button btnXoa;

//    String chuoi = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = (EditText) findViewById(R.id.edt_a);
        edtB = (EditText) findViewById(R.id.edt_b);
        tvKQ = (TextView) findViewById(R.id.tv_kq);
        tvKQ1 = (TextView) findViewById(R.id.tv_kq1);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        btnXoa= (Button) findViewById(R.id.btnXoa);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                phantich(a,b);
                USCLN(a,b);

                //______________________________________________________//
//                int i = 2;
//                while (a > 1) {
//                    if (a % i == 0) {
//                        a = a / i;
//                        chuoia += String.valueOf(i);
//                        chuoia += (i != a) ? " " : "";
//                    } else {
//                        i++;//3
//                    }
//                }
//
//                //++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                int j = 2;
//                while (b > 1) {
//                    if (b % j == 0) {
//                        b = b / j;
//                        chuoib += String.valueOf(j);
//                        chuoib += (j != b) ? " " : " ";
//                    } else {
//                        j++;//3
//                    }
//                }
                //_-----------------------------------------------//
//
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtA.setText("");
                edtB.setText("");
                tvKQ.setText("");
                tvKQ1.setText("");
            }
        });
    }


    public void phantich(int n,int m) {
        int i = 2;
        int j = 2;
        String chuoia = "";
        String chuoib = "";
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                chuoia += String.valueOf(i);
                chuoia += " ";
            } else {
                i++;//3
            }

        }
        while (m > 1) {
            if (m % j == 0) {
                m = m / j;
                chuoib += String.valueOf(j);
                chuoib += " ";
            } else {
                j++;//3
            }

        }
        tvKQ.setText(chuoia + "\n"+chuoib);

    }


    public void USCLN(int a, int b) {
        //--------------------------
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2)
                temp1 = temp1 - temp2;
            else
                temp2 = temp2 - temp1;
        }
        int uscln = temp1;
        int bscnn = (a * b) / uscln;
        //-------------------------------------------------
        tvKQ1.setText("Ước số chung lớn nhất là: "+uscln+"\n"+"Bội số chung nhỏ nhất là: "+bscnn);

    }
}





