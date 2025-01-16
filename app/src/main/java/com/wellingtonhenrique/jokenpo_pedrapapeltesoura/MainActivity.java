package com.wellingtonhenrique.jokenpo_pedrapapeltesoura;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        verificarGanhador( "Pedra");
    }

    public void selecionarPapel(View view){
        verificarGanhador( "Papel");
    }

    public void selecionarTesoura(View view){
        verificarGanhador( "Tesoura");
    }

    private void verificarGanhador( String escolhaUsuario){
        System.out.println("item clicado:" + escolhaUsuario);
    }
}