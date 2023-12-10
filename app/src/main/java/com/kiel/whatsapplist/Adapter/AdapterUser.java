package com.kiel.whatsapplist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kiel.whatsapplist.R;
import com.kiel.whatsapplist.model.User;

import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserViewHolder> {

    private List<User> userList;

    public AdapterUser(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        listItem = layoutInflater.inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.profilePic.setImageResource(userList.get(position).getPic());
        holder.name.setText(userList.get(position).getName());
        holder.lastMsg.setText(userList.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView profilePic;
        private TextView name;
        private TextView lastMsg;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePic = itemView.findViewById(R.id.profile_pic);
            name = itemView.findViewById(R.id.user_name);
            lastMsg = itemView.findViewById(R.id.last_msg);
        }
    }
}
