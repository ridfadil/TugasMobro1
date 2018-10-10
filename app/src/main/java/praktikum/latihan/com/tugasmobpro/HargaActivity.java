package praktikum.latihan.com.tugasmobpro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.Utils;

public class HargaActivity extends AppCompatActivity {


    int chikenKatsu = 0, thailis = 0, bakpao = 0, kwetiaw = 0, jus = 0, kopiYunan = 0, tehKrisan = 0, jiuniang = 0;
    int hargaChikenKatsu = 10000, hargaThailis = 12000, hargaBakpao = 6000, hargaKwetiaw = 12000, hargaJus = 9000, hargaKopiYunan = 15000, hargaTehKrisa = 12000, hargaJiuniang = 14000;
    int i = 1;

    @BindView(R.id.spin_chicken_katsu)
    Spinner spinChickenKatsu;
    @BindView(R.id.txt_chicken_katsu)
    EditText txtChickenKatsu;
    @BindView(R.id.spin_thailis)
    Spinner spinThailis;
    @BindView(R.id.txt_thailis)
    EditText txtThailis;
    @BindView(R.id.spin_bakpao)
    Spinner spinBakpao;
    @BindView(R.id.txt_bakpao)
    EditText txtBakpao;
    @BindView(R.id.spin_kweiaw)
    Spinner spinKweiaw;
    @BindView(R.id.txt_kwwetiaw)
    EditText txtKwwetiaw;
    @BindView(R.id.spin_jus)
    Spinner spinJus;
    @BindView(R.id.txt_jus)
    EditText txtJus;
    @BindView(R.id.spin_kopi_yunan)
    Spinner spinKopiYunan;
    @BindView(R.id.txt_kopi_yunan)
    EditText txtKopiYunan;
    @BindView(R.id.spin_teh_krisan)
    Spinner spinTehKrisan;
    @BindView(R.id.txt_teh_krisa)
    EditText txtTehKrisa;
    @BindView(R.id.spin_jiuniang)
    Spinner spinJiuniang;
    @BindView(R.id.txt_juinang)
    EditText txtJuinang;
/*    @BindView(R.id.cek_harga)
    Button cekHarga;
    @BindView(R.id.txt_total)
    TextView txtTotal;
    @BindView(R.id.linear)
    LinearLayout linear;
    @BindView(R.id.cd_total_harga)
    CardView cdTotalHarga;*/
    @BindView(R.id.btn_pesan)
    Button btnPesan;
    int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harga);
        ButterKnife.bind(this);
        initFocusable();
        initAdapterArray();
        initClicked();
        initSelectedItem();
    }

/*    public void cek() {
        cdTotalHarga.setVisibility(View.VISIBLE);
        chikenKatsu = Integer.parseInt(txtChickenKatsu.getText().toString());
        thailis = Integer.parseInt(txtThailis.getText().toString());
        kwetiaw = Integer.parseInt(txtKwwetiaw.getText().toString());
        jus = Integer.parseInt(txtJus.getText().toString());
        kopiYunan = Integer.parseInt(txtKopiYunan.getText().toString());
        tehKrisan = Integer.parseInt(txtTehKrisa.getText().toString());
        jiuniang = Integer.parseInt(txtJuinang.getText().toString());
        bakpao = Integer.parseInt(txtBakpao.getText().toString());
        jumlah = (chikenKatsu * hargaChikenKatsu) + (thailis * hargaThailis) + (bakpao * hargaBakpao) + (kwetiaw * hargaKwetiaw) + (jus * hargaJus) + (kopiYunan * hargaKopiYunan) + (tehKrisan * hargaTehKrisa) + (jiuniang * hargaJiuniang);
        txtTotal.setText(String.valueOf(jumlah));
    }*/

    public void initClicked() {

      /*  cekHarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i % 2 == 0) {
                    cek();
                } else {
                    cdTotalHarga.setVisibility(View.GONE);
                }
                i++;
            }
        });*/

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String q = "0";
                String ichikenKatsu = txtChickenKatsu.getText().toString();
                String ithailis = txtThailis.getText().toString();
                String ikwetiaw = txtKwwetiaw.getText().toString();
                String ijus = txtJus.getText().toString();
                String ikopiYunan = txtKopiYunan.getText().toString();
                String itehKrisan = txtTehKrisa.getText().toString();
                String ijiuniang = txtJuinang.getText().toString();
                String ibakpao = txtBakpao.getText().toString();

                if (ichikenKatsu.matches("")) ichikenKatsu = q;
                if (ithailis.matches("")) ithailis = q;
                if (ikwetiaw.matches("")) ikwetiaw = q;
                if (ijus.matches("")) ijus = q;
                if (ikopiYunan.matches("")) ikopiYunan = q;
                if (itehKrisan.matches("")) itehKrisan = q;
                if (ijiuniang.matches("")) ijiuniang = q;
                if (ibakpao.matches("")) ibakpao = q;

                if (ichikenKatsu.equals("0") && ithailis.equals("0") && ikwetiaw.equals("0") && ijus.equals("0") && ikopiYunan.equals("0") && itehKrisan.equals("0") && ijiuniang.equals("0") && ibakpao.equals("0")) {
                    Toast.makeText(HargaActivity.this, "Maaf minimal Pemesanan 1 menu", Toast.LENGTH_SHORT).show();
                } else {
                    int a,b,c,d,e,f,g,h;
                    a = Integer.valueOf(ichikenKatsu);
                    b = Integer.valueOf(ithailis);
                    c = Integer.valueOf(ikwetiaw);
                    d = Integer.valueOf(ijus);
                    e = Integer.valueOf(ikopiYunan);
                    f = Integer.valueOf(itehKrisan);
                    g = Integer.valueOf(ijiuniang);
                    h = Integer.valueOf(ibakpao);
                    jumlah = (a*10000)+(b*12000)+(c*12000)+(d*9000)+(e*15000)+(f*12000)+(g*14000)+(h*6000);

                    String sTot = String.valueOf(jumlah);
                    Intent i = new Intent(HargaActivity.this, DetailActivity.class);
                    i.putExtra("chicken", ichikenKatsu);
                    i.putExtra("thailis", ithailis);
                    i.putExtra("kwetiaw", ikwetiaw);
                    i.putExtra("jus", ijus);
                    i.putExtra("kopiyunan", ikopiYunan);
                    i.putExtra("tehkrisan", itehKrisan);
                    i.putExtra("bakpao", ibakpao);
                    i.putExtra("jiuniang", ijiuniang);
                    i.putExtra("total", sTot);

                    startActivity(i);
                }

            }
        });
    }

    public void initAdapterArray() {
        String[] katsuString = {"0", "1", "2", "3", "4", "5"};
        String[] thailisString = {"0", "1", "2", "3"};
        String[] bakpaoString = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] tehKrisanString = {"0", "1", "2", "3", "4", "5", "6"};
        String[] kwetiawString = {"0", "1", "2", "3", "4", "5", "6", "7"};
        String[] jusString = {"0", "1", "2", "3", "4",};
        String[] kopiYunanString = {"0", "1", "2", "3", "4", "5", "6"};
        String[] jianiangString = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        ArrayAdapter<String> adapterKatsuString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, katsuString);
        spinChickenKatsu.setAdapter(adapterKatsuString);
        ArrayAdapter<String> adapterThailisString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, thailisString);
        spinThailis.setAdapter(adapterThailisString);
        ArrayAdapter<String> adapterBakpaoString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, bakpaoString);
        spinBakpao.setAdapter(adapterBakpaoString);
        ArrayAdapter<String> adapterTehKrisanString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, tehKrisanString);
        spinTehKrisan.setAdapter(adapterTehKrisanString);
        ArrayAdapter<String> adapterKwetiawString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kwetiawString);
        spinKweiaw.setAdapter(adapterKwetiawString);
        ArrayAdapter<String> adapterJusString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, jusString);
        spinJus.setAdapter(adapterJusString);
        ArrayAdapter<String> adapterKopiYunanString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kopiYunanString);
        spinKopiYunan.setAdapter(adapterKopiYunanString);
        ArrayAdapter<String> adapterJianiangString = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, jianiangString);
        spinJiuniang.setAdapter(adapterJianiangString);
    }

    public void initSelectedItem() {
        spinChickenKatsu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtChickenKatsu.setText(selectedItemText);
                } else {
                    txtChickenKatsu.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinThailis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtThailis.setText(selectedItemText);
                } else {
                    txtThailis.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinJiuniang.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtJuinang.setText(selectedItemText);
                } else {
                    txtJuinang.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinKopiYunan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtKopiYunan.setText(selectedItemText);
                } else {
                    txtKopiYunan.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinJus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtJus.setText(selectedItemText);
                } else {
                    txtJus.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinKweiaw.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtKwwetiaw.setText(selectedItemText);
                } else {
                    txtKwwetiaw.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinTehKrisan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtTehKrisa.setText(selectedItemText);
                } else {
                    txtTehKrisa.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinBakpao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if (!selectedItemText.equals("0")) {
                    txtBakpao.setText(selectedItemText);
                } else {
                    txtBakpao.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
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
}