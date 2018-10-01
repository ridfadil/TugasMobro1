package praktikum.latihan.com.tugasmobpro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cd_menu)
    CardView cdMenu;
    @BindView(R.id.cd_telepon)
    LinearLayout cdTelepon;
    @BindView(R.id.cd_lokasi)
    LinearLayout cdLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.cd_menu, R.id.cd_telepon, R.id.cd_lokasi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cd_menu:
                Intent i = new Intent(MainActivity.this,HargaActivity.class);
                startActivity(i);
                break;
            case R.id.cd_telepon:
                String phone;
                phone = "089567566467";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
                break;

            case R.id.cd_lokasi:
                String lokasi = "-6.922492,107.715390";
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=" + lokasi);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

                break;
        }
    }
}