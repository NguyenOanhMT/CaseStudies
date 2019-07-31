package com.nguyenoanh.casestudies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context context;
    ArrayList<Item> arrayList;

    public ItemAdapter(Context context, ArrayList<Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_recycler, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Item item = arrayList.get(i);

        holder.tvName.setText(item.getName());
        holder.tvPlace.setText(item.getPlace ());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(item.getImage()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvPlace;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super (itemView);

            tvName = itemView.findViewById (R.id.tv_name);
            tvPlace = itemView.findViewById (R.id.tv_place);
            imageView = itemView.findViewById (R.id.imageView);
        }
    }
}
