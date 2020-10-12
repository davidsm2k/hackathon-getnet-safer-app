package br.com.example.safer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class TransferenciaActivity extends AppCompatActivity {

    private String[] tipoContas = new String[]{"Conta Corrente", "Conta Poupança", "Conta Pagamento"};
    private String[] tipoTransacao = new String[]{"TED", "DOC"};
    private Spinner campoTipoConta;
    private Spinner campoTipoTransacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferencia);

        ArrayAdapter<String> adapterTipoDasContas = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, tipoContas);
        adapterTipoDasContas.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        campoTipoConta = findViewById(R.id.sp_activity_transferencia_tipo_conta);
        campoTipoConta.setAdapter(adapterTipoDasContas);

        ArrayAdapter<String> adapterTipoTransacao = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, tipoTransacao);
        adapterTipoTransacao.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        campoTipoTransacao = findViewById(R.id.sp_activity_transferencia_tipo_transacao);
        campoTipoTransacao.setAdapter(adapterTipoTransacao);
    }
}