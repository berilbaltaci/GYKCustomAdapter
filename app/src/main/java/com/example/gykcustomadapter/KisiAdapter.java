package com.example.gykcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class KisiAdapter extends BaseAdapter {

    private List<Kisi> kisiList;
    private Context context;
    private LayoutInflater layoutInflater;

    public KisiAdapter(List<Kisi> kisiList, Context context) {
        this.kisiList = kisiList;
        this.context = context;
        this.layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return kisiList.size();
    }

    @Override
    public Object getItem(int position) {
        return kisiList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View resultView;
        resultView=layoutInflater.inflate(R.layout.each_item, null);
        TextView isimSoyisim = resultView.findViewById(R.id.adSoyad);
        TextView tarih = resultView.findViewById(R.id.tarih);

        Kisi kisi1=(Kisi) getItem(position);
        isimSoyisim.setText(kisi1.getIsim());
        tarih.setText(kisi1.getTarih());

        return resultView;
    }
}
