package com.example.welle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


// Model class for the data to be displayed in each item
class staffItem {

    String title;    // Title text
    String subtitle; // Subtitle text

    staffItem(String title, String subtitle) {

        this.title = title;
        this.subtitle = subtitle;
    }
}


public class StaffNoticeAdapter extends RecyclerView.Adapter<StaffNoticeAdapter.ItemViewHolder> {

    private Context context;
    private List<staffItem> itemList;


    public StaffNoticeAdapter(Context context, List<staffItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.staff_notice_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        // Get the current item
        staffItem item = itemList.get(position);

        // Bind data to the views

        holder.titleTextView.setText(item.title);
        holder.subtitleTextView.setText(item.subtitle);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    // ViewHolder class that holds references to the views for each item
    class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView subtitleTextView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.item_title);
            subtitleTextView = itemView.findViewById(R.id.item_subtitle);
        }
    }
}
