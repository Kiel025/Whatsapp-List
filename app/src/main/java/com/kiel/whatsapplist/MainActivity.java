package com.kiel.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.kiel.whatsapplist.Adapter.AdapterUser;
import com.kiel.whatsapplist.databinding.ActivityMainBinding;
import com.kiel.whatsapplist.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerUsers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerUsers.setHasFixedSize(true);
        AdapterUser adapterUser = new AdapterUser(userList);
        binding.recyclerUsers.setAdapter(adapterUser);

        createUsers();
    }

    public void createUsers() {
        User user1 = new User(R.drawable.usuario1, "Ezequiel", "ultima mensagem teste");
        userList.add(user1);
        User user2 = new User(R.drawable.usuario2, "Noemi", "ultima mensagem teste");
        userList.add(user2);
        User user3 = new User(R.drawable.usuario1, "Hermano", "ultima mensagem teste");
        userList.add(user3);
        User user4 = new User(R.drawable.usuario2, "Noemi", "ultima mensagem teste");
        userList.add(user4);
        User user5 = new User(R.drawable.usuario1, "Ezequiel", "ultima mensagem teste");
        userList.add(user5);
        User user6 = new User(R.drawable.usuario2, "Ezequiel", "ultima mensagem teste");
        userList.add(user6);
        User user7 = new User(R.drawable.usuario1, "Ezequiel", "ultima mensagem teste");
        userList.add(user7);
        User user8 = new User(R.drawable.usuario2, "Ezequiel", "ultima mensagem teste");
        userList.add(user8);
        User user9 = new User(R.drawable.usuario1, "Ezequiel", "ultima mensagem teste");
        userList.add(user9);
        User user10 = new User(R.drawable.usuario2, "Ezequiel", "ultima mensagem teste");
        userList.add(user10);

    }
}