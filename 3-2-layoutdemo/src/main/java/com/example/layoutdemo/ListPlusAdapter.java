package com.example.layoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.layoutdemo.databinding.ListExampleBinding;

import java.util.List;

public class ListPlusAdapter extends ArrayAdapter<FruitPlus> {
    ListExampleBinding binding;
    private int resourceId;

    public ListPlusAdapter(Context context, int resource, List<FruitPlus> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        binding = ListExampleBinding.inflate(LayoutInflater.from(parent.getContext()));
        FruitPlus fruitPlus = getItem(position);

        binding.listExampleImage.setImageResource(fruitPlus.getFruitImage());
        binding.listExampleText.setText(fruitPlus.getFruitName());
        binding.listExamplePrice.setText(Double.toString(fruitPlus.getFruitPrice()));

        return binding.getRoot();
    }
}
