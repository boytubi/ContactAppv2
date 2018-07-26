package com.example.hoangtruc.contactappv2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AllContactsAdapter extends
        RecyclerView.Adapter<AllContactsAdapter.ContactViewHolder>{

    private List<ContactListItem> mContactList;
    private Context mContext;
    public AllContactsAdapter(List<ContactListItem> contactList, Context mContext){
        this.mContactList = contactList;
        this.mContext = mContext;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_listitem, null);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        ContactListItem contactListItem = mContactList.get(position);
        holder.tvContactName.setText(contactListItem.getContactName());
        holder.tvPhoneNumber.setText(contactListItem.getContactNumber());
    }

    @Override
    public int getItemCount() {
        return mContactList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView ivContactImage;
        TextView tvContactName;
        TextView tvPhoneNumber;

        public ContactViewHolder(View itemView) {
            super(itemView);
            ivContactImage = (ImageView) itemView.findViewById(R.id.imageview_ContactImage);
            tvContactName = (TextView) itemView.findViewById(R.id.textview_ContactName);
            tvPhoneNumber = (TextView) itemView.findViewById(R.id.textview_PhoneNumber);
        }
    }
}