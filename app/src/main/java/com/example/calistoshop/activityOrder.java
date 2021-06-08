package com.example.calistoshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activityOrder extends AppCompatActivity {

    Button btnCheckO;
    EditText editNama, editJumlah, editSize, editAlamat, editEks, editBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        editNama = findViewById(R.id.insertProduk);
        editJumlah = findViewById(R.id.insertJumlah);
        editSize = findViewById(R.id.insertSize);
        editAlamat = findViewById(R.id.insertAlamat);
        editEks = findViewById(R.id.insertEks);
        editBayar = findViewById(R.id.insertBayar);



        btnCheckO = findViewById(R.id.btnCheckout);
        btnCheckO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pesan1 = editNama.getText().toString();
                String pesan2 = editJumlah.getText().toString();
                String pesan3 = editSize.getText().toString();
                String pesan4 = editAlamat.getText().toString();
                String pesan5 = editEks.getText().toString();
                String pesan6 = editBayar.getText().toString();

                String num = "+6281338479891";
                String semuapesan = "FORMAT ORDER" + "\n" + "Nama pesanan : " + pesan1 + "\n" + "Jumlah : " + pesan2 + "\n" + "Size : " + pesan3 + "\n" + "Alamat : " + pesan4 + "\n" + "Pengiriman : " + pesan5 + "\n" + "Pembayaran : " + pesan6 + "\n";

                boolean installed = isAppInstalled("com.whatsapp");
                if (installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+num+"&text="+semuapesan));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(activityOrder.this, "Whatsapp is not instal", Toast.LENGTH_SHORT);
                }
            }
        });

    }
    private boolean isAppInstalled(String s){
        PackageManager packageManager = getPackageManager();
        boolean is_installed;

        try {
            packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            is_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;
    }
}