package br.com.trinopolo.appofertas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Oferta> listaOfertas;

    ListView listViewOfertas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        criarOfertas();

        ListView listViewOfertas = (ListView) findViewById(R.id.listViewOfertas);

        OfertaAdapter ofertaAdapter = new OfertaAdapter(this.listaOfertas, this);
        listViewOfertas.setAdapter(ofertaAdapter);

        listViewOfertas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("LOG", "Clicou no item " + i);

                Intent ofertaIntent = new Intent(MainActivity.this, OfertaActivity.class);

                Oferta oferta = listaOfertas.get(i);

                ofertaIntent.putExtra("oferta_id", oferta.getId().intValue());
                ofertaIntent.putExtra("oferta_nome", oferta.getNome());
                ofertaIntent.putExtra("oferta_condicoes", oferta.getQtdCondicoes().doubleValue());
                ofertaIntent.putExtra("oferta_entrada", oferta.getValorEntrada().doubleValue());

                MainActivity.this.startActivity(ofertaIntent);

            }
        });


    }

    private void criarOfertas() {

        this.listaOfertas = new ArrayList<Oferta>();

        this.listaOfertas.add(new Oferta(1, "Item 1", new BigDecimal(100.0), new BigDecimal(30.0),
                new BigDecimal(15.0), 6));
        this.listaOfertas.add(new Oferta(2, "Item 2", new BigDecimal(200.0), new BigDecimal(25.0),
                new BigDecimal(20.0), 7));
        this.listaOfertas.add(new Oferta(3, "Item 3", new BigDecimal(300.0), new BigDecimal(30.0),
                new BigDecimal(25.0), 8));


    }
}
