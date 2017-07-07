package br.com.trinopolo.appofertas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by guerra on 07/07/17.
 */

public class OfertaAdapter extends BaseAdapter {

    private ArrayList<Oferta> data;
    private Context context;


    public OfertaAdapter(ArrayList data, Context context) {

        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int i) {
        return this.data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.data.get(i).getId();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.oferta_item_list_view_constraint_layout, parent, false);

        TextView tvNome = view.findViewById(R.id.tvNome);
        TextView tvValor = view.findViewById(R.id.tvValor);
        TextView tvDesconto = view.findViewById(R.id.tvDesconto);

        Oferta oferta = this.data.get(i);

        tvNome.setText(oferta.getNome());
        tvValor.setText(oferta.getValor().toString());
        tvDesconto.setText(oferta.getValorDesconto().toString());

        return view;
    }
}
