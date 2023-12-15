package com.kiel.whatsapplist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kiel.whatsapplist.Adapter.AdapterUser;
import com.kiel.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;
import com.kiel.whatsapplist.databinding.ActivityMainBinding;
import com.kiel.whatsapplist.Model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = binding.recyclerUsers;

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        AdapterUser adapterUser = new AdapterUser(userList);
        recyclerView.setAdapter(adapterUser);

        createUsers();

        //  Click Event
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        User user = userList.get(position);
                        Toast.makeText(MainActivity.this, "Usuário: " + user.getName(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        User user = userList.get(position);
                        Toast.makeText(MainActivity.this, "Usuário click longo: " + user.getName(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));
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