package com.berkaykaanedikli.syf260uyg14;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.berkaykaanedikli.syf260uyg14.databinding.ActivityAnaSayfaBinding;
import com.berkaykaanedikli.syf260uyg14.databinding.ActivityMainBinding;

public class AnaSayfa extends AppCompatActivity {
    private ActivityAnaSayfaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityAnaSayfaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String kullaniciAd = Singleton.getInstance().getKullaniciAdi();
        String parola = Singleton.getInstance().getKullaniciParola();
        binding.textViewKullaniciAdi.setText(kullaniciAd);
        binding.textViewKullaniciParola.setText(parola);
    }
}