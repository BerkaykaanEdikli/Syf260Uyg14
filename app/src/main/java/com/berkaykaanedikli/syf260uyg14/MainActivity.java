package com.berkaykaanedikli.syf260uyg14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.view.View;

import com.berkaykaanedikli.syf260uyg14.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    public void kullaniciGiris(View view){
        String ad = binding.edtTxtKullanici.getText().toString();
        String parola = binding.edtTxtParola.getText().toString();

        if(ad.equals("Berkay") && parola.equals("769")){
            Singleton singleton = Singleton.getInstance();
            singleton.setKullaniciAdi(ad);
            singleton.setKullaniciParola(parola);

            Intent intent = new Intent(this,AnaSayfa.class);
            startActivity(intent);
        }
        else{
            binding.txtUyari.setText("*Bilgiler Hatalı! Tekrar Giriş Yapınız.");
        }
    }
}