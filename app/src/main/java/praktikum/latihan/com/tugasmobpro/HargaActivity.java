package praktikum.latihan.com.tugasmobpro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HargaActivity extends AppCompatActivity {

    @BindView(R.id.sw_chicken_katsu)
    Switch swChickenKatsu;
    @BindView(R.id.txt_chicken_katsu)
    EditText txtChickenKatsu;
    @BindView(R.id.sw_thailis)
    Switch swThailis;
    @BindView(R.id.txt_thailis)
    EditText txtThailis;
    @BindView(R.id.sw_bakpao)
    Switch swBakpao;
    @BindView(R.id.txt_bakpao)
    EditText txtBakpao;
    @BindView(R.id.sw_kweiaw)
    Switch swKweiaw;
    @BindView(R.id.txt_kwwetiaw)
    EditText txtKwwetiaw;
    @BindView(R.id.sw_jus)
    Switch swJus;
    @BindView(R.id.txt_jus)
    EditText txtJus;
    @BindView(R.id.sw_kopi_yunan)
    Switch swKopiYunan;
    @BindView(R.id.txt_kopi_yunan)
    EditText txtKopiYunan;
    @BindView(R.id.sw_teh_krisan)
    Switch swTehKrisan;
    @BindView(R.id.txt_teh_krisa)
    EditText txtTehKrisa;
    @BindView(R.id.sw_jiuniang)
    Switch swJiuniang;
    @BindView(R.id.txt_juinang)
    EditText txtJuinang;
    @BindView(R.id.btn_pesan)
    Button btnPesan;
    @BindView(R.id.txt_total)
    TextView jmlTotal;
    int chikenKatsu = 0, thailis = 0, bakpao = 0, kwetiaw = 0, jus = 0, kopiYunan = 0, tehKrisan = 0, jiuniang = 0;
    int hargaChikenKatsu = 10000, hargaThailis = 12000, hargaBakpao = 6000, hargaKwetiaw = 12000, hargaJus = 9000, hargaKopiYunan = 15000, hargaTehKrisa = 12000, hargaJiuniang = 14000;
    @BindView(R.id.cek_harga)
    Button cekHarga;
    @BindView(R.id.linear)
    LinearLayout linear;
    @BindView(R.id.cd_total_harga)
    CardView cdTotalHarga;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harga);
        ButterKnife.bind(this);
        initFocusable();
    }

    public void initFocusable() {
        txtBakpao.setFocusable(false);
        txtThailis.setFocusable(false);
        txtChickenKatsu.setFocusable(false);
        txtJuinang.setFocusable(false);
        txtJus.setFocusable(false);
        txtKopiYunan.setFocusable(false);
        txtKwwetiaw.setFocusable(false);
        txtTehKrisa.setFocusable(false);
    }

    public void setClicked(String chikenKatsu, String thailis, String bakpao, String kwetiaw, String jus, String kopiYunan, String tehKrisan, String jiuniang) {
       /* Intent i = new Intent (HargaActivity.this,ReviewActivity.class);
        i.putExtra("katsu",chikenKatsu);
        i.putExtra("thailis",thailis);
        i.putExtra("bakpao",bakpao);
        i.putExtra("kwetiaw",kwetiaw);
        i.putExtra("jus",jus);
        i.putExtra("kopiyunan",kopiYunan);
        i.putExtra("tehkrisa",tehKrisan);
        i.putExtra("jiuninang",jiuniang);
        startActivity(i);*/

    }


    @OnClick({R.id.sw_chicken_katsu, R.id.sw_thailis, R.id.sw_bakpao, R.id.sw_kweiaw, R.id.sw_jus, R.id.sw_kopi_yunan, R.id.sw_teh_krisan, R.id.sw_jiuniang, R.id.btn_pesan, R.id.cek_harga})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.sw_chicken_katsu:
                if (swChickenKatsu.isChecked()) {
                    txtChickenKatsu.setFocusable(true);
                    txtChickenKatsu.setFocusableInTouchMode(true);
                } else {
                    txtChickenKatsu.setFocusable(false);
                    txtChickenKatsu.setText("0");
                }
                break;
            case R.id.sw_thailis:
                if (swThailis.isChecked()) {
                    txtThailis.setFocusable(true);
                    txtThailis.setFocusableInTouchMode(true);
                } else {
                    txtThailis.setFocusable(false);
                    txtThailis.setText("0");
                }
                break;
            case R.id.sw_bakpao:
                if (swBakpao.isChecked()) {
                    txtBakpao.setFocusable(true);
                    txtBakpao.setFocusableInTouchMode(true);
                } else {
                    txtBakpao.setFocusable(false);
                    txtBakpao.setText("0");
                }
                break;
            case R.id.sw_kweiaw:
                if (swKweiaw.isChecked()) {
                    txtKwwetiaw.setFocusable(true);
                    txtKwwetiaw.setFocusableInTouchMode(true);
                } else {
                    txtKwwetiaw.setFocusable(false);
                    txtKwwetiaw.setText("0");
                }
                break;
            case R.id.sw_jus:
                if (swJus.isChecked()) {
                    txtJus.setFocusable(true);
                    txtJus.setFocusableInTouchMode(true);
                } else {
                    txtBakpao.setFocusable(false);
                    txtBakpao.setText("0");
                }
                break;
            case R.id.sw_kopi_yunan:
                if (swKopiYunan.isChecked()) {
                    txtKopiYunan.setFocusable(true);
                    txtKopiYunan.setFocusableInTouchMode(true);
                } else {
                    txtKopiYunan.setFocusable(false);
                    txtKopiYunan.setText("0");
                }
                break;
            case R.id.sw_teh_krisan:
                if (swTehKrisan.isChecked()) {
                    txtTehKrisa.setFocusable(true);
                    txtTehKrisa.setFocusableInTouchMode(true);
                } else {
                    txtTehKrisa.setFocusable(false);
                    txtTehKrisa.setText("0");
                }
                break;
            case R.id.sw_jiuniang:
                if (swJiuniang.isChecked()) {
                    txtJuinang.setFocusable(true);
                    txtJuinang.setFocusableInTouchMode(true);
                } else {
                    txtJuinang.setFocusable(false);
                    txtJuinang.setText("0");
                }
                break;
            case R.id.btn_pesan:

                AlertDialog alertDialog = new AlertDialog.Builder(
                        HargaActivity.this).create();
                alertDialog.setTitle("Info Pesanan");
                alertDialog.setIcon(R.drawable.imageresto);
                alertDialog.setMessage("Terimakasih Sudah Melakukan Pemesanan");
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Pesanan Sedang Di Proses", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(HargaActivity.this, MainActivity.class);
                        startActivity(i);
                    }
                });
                alertDialog.show();
                break;
            case R.id.cek_harga:
                if (i % 2 == 0) {
                    cdTotalHarga.setVisibility(View.VISIBLE);
                    chikenKatsu = Integer.parseInt(txtChickenKatsu.getText().toString());
                    thailis = Integer.parseInt(txtThailis.getText().toString());
                    kwetiaw = Integer.parseInt(txtKwwetiaw.getText().toString());
                    jus = Integer.parseInt(txtJus.getText().toString());
                    kopiYunan = Integer.parseInt(txtKopiYunan.getText().toString());
                    tehKrisan = Integer.parseInt(txtTehKrisa.getText().toString());
                    jiuniang = Integer.parseInt(txtJuinang.getText().toString());
                    bakpao = Integer.parseInt(txtBakpao.getText().toString());
                    //setClicked(chikenKatsu,thailis,bakpao,kwetiaw,jus,kopiYunan,tehKrisan,jiuniang);
                    int jumlah = 0;
                    jumlah = (chikenKatsu * hargaChikenKatsu) + (thailis * hargaThailis) + (bakpao * hargaBakpao) + (kwetiaw * hargaKwetiaw) + (jus * hargaJus) + (kopiYunan * hargaKopiYunan) + (tehKrisan * hargaTehKrisa) + (jiuniang * hargaJiuniang);
                    jmlTotal.setText(String.valueOf(jumlah));
                } else {
                    cdTotalHarga.setVisibility(View.GONE);
                }
                i++;
                break;
        }
    }

}