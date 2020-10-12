package br.com.example.safer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuDeOpcoesActivity extends AppCompatActivity {

    private ImageButton botaoValidacao;
    private ImageButton botaoAprendaEmpreender;
    private ImageButton botaoPagamento;
    private ImageButton botaoTransferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_de_opcoes);

        inicializandoCampos();
        configurandoImageButton();
    }

    private void configurandoImageButton() {
        configuraBotaoValidacao();
        configuraBotãoEmpreender();
        configuraBotaoPagamento();
        configuraBotaoTransferencia();
    }

    private void configuraBotaoValidacao() {
        botaoValidacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuDeOpcoesActivity.this, "Tela de validação em construção!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void configuraBotaoTransferencia() {
        botaoTransferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiParaTelaTransferencia = new Intent(MenuDeOpcoesActivity.this, TransferenciaActivity.class);
                startActivity(vaiParaTelaTransferencia);
            }
        });
    }

    private void configuraBotaoPagamento() {
        botaoPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuDeOpcoesActivity.this, "Tela de pagamento em construção!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void configuraBotãoEmpreender() {
        botaoAprendaEmpreender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiParaTelaAprendaEmpreender = new Intent(MenuDeOpcoesActivity.this, AprenderAEmpreenderActivity.class);
                startActivity(vaiParaTelaAprendaEmpreender);
            }
        });
    }

    private void inicializandoCampos() {
        botaoValidacao = findViewById(R.id.ib_activity_menu_de_opcoes_validacao);
        botaoAprendaEmpreender = findViewById(R.id.ib_activity_menu_de_opcoes_aprender_a_empreender);
        botaoPagamento = findViewById(R.id.ib_activity_menu_de_opcoes_pagamento);
        botaoTransferencia = findViewById(R.id.ib_activity_menu_de_opcoes_transferencia);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_de_opcoes_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int idMenu = item.getItemId();

        if(idMenu == R.id.activity_menu_de_opcoes_menu_sair){
            finish();
        }else if(idMenu == R.id.activity_menu_de_opcoes_menu_configuracoes){
            Toast.makeText(this, "Tela em manutenção!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Comando inválido", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}