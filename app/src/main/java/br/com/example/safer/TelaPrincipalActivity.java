package br.com.example.safer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR_TELA_PRINCIPAL = "Análise de Crédito Safer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        setTitle(TITULO_APPBAR_TELA_PRINCIPAL);

        Button botaoIrParaLogin = findViewById(R.id.btn_activity_tela_principal_login);
        botaoIrParaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiParaTelaLogin = new Intent(TelaPrincipalActivity.this, TelaDeLoginActivity.class);
                startActivity(vaiParaTelaLogin);
            }
        });

        Button botaoSair = findViewById(R.id.btn_activity_tela_principal_sair);
        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}