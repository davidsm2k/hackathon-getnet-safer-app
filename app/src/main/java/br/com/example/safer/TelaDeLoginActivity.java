package br.com.example.safer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TelaDeLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);
        getSupportActionBar().hide(); // tirando appbar

        ImageButton botaoVoltar = findViewById(R.id.btn_activity_tela_de_login_voltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button botaoCadastrarBeneficio = findViewById(R.id.btn_activity_tela_de_login_beneficio);
        botaoCadastrarBeneficio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiParaCadastroCliente = new Intent(TelaDeLoginActivity.this, CadastroClienteActivity.class);
                startActivity(vaiParaCadastroCliente);
            }
        });

        Button botaoLogin = findViewById(R.id.btn_activity_tela_de_login_login);
        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiParaTelaMenuDeOpcoes = new Intent(TelaDeLoginActivity.this, MenuDeOpcoesActivity.class);
                startActivity(vaiParaTelaMenuDeOpcoes);
            }
        });

    }
}