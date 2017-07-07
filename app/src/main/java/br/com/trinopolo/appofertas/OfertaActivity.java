package br.com.trinopolo.appofertas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class OfertaActivity extends AppCompatActivity {

    EditText editNome;
    EditText editCondicoes;
    EditText editEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta);

        setTitle(getIntent().getStringExtra("oferta_nome"));

        this.editNome = (EditText) findViewById(R.id.editNome);
        this.editCondicoes = (EditText) findViewById(R.id.editCondicoes);
        this.editEntrada = (EditText) findViewById(R.id.editEntrada);

        editNome.setText(getIntent().getStringExtra("oferta_nome"));
        editCondicoes.setText(String.valueOf(getIntent().getDoubleExtra("oferta_condicoes", 0.0)));
        editEntrada.setText(String.valueOf(getIntent().getDoubleExtra("oferta_entrada", 0.0)));

        Log.d("LOG", "oferta_entrada: " + getIntent().getDoubleExtra("oferta_entrada", 0.0));
        //tarefaId = getIntent().getStringExtra("id");

    }
}
