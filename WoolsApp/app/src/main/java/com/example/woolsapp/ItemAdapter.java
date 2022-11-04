package com.example.woolsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {

    List<Items> itemsList ;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View w = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);

        Items currentItem = itemsList.get(position);

        TextView itemName = w.findViewById(R.id.itemName);
        TextView itemPrice = w.findViewById(R.id.itemPrice);
        ImageView itemImage = w.findViewById(R.id.itemImage);

        itemName.setText(currentItem.getItemName());
        itemPrice.setText(currentItem.getItemPrice());
        itemImage.setImageResource(currentItem.getItemImage());

        return w;
    }
}
