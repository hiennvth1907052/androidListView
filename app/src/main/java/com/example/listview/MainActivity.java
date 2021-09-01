package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ContactModel contactModel = listContacts.get(i);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData(){
        ContactModel contact = new ContactModel("Nguyễn Văn Hụi", "0399999999", R.drawable.ic_avatar1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyễn Văn Hụi", "0312345678", R.drawable.ic_avatar2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyễn Thị Bê", "0323456789", R.drawable.ic_avatar3);
        listContacts.add(contact);
        contact = new ContactModel("Lý Văn Lực", "0333333333", R.drawable.ic_avatar4);
        listContacts.add(contact);
        contact = new ContactModel("Trần Văn Lui", "0322222222", R.drawable.ic_avatar3);
        listContacts.add(contact);
        contact = new ContactModel("Ma Văn Thụi", "0379797979", R.drawable.ic_avatar4);
        listContacts.add(contact);
        contact = new ContactModel("Nguyễn Văn Táo", "0388888888", R.drawable.ic_avatar1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyễn Văn Hụi", "0382828282", R.drawable.ic_avatar1);
        listContacts.add(contact);
        contact = new ContactModel("Lê Lăn Lại", "0386868686", R.drawable.ic_avatar2);
        listContacts.add(contact);
        contact = new ContactModel("Hà Tiên Văn", "0315151515", R.drawable.ic_avatar4);
        listContacts.add(contact);
        contact = new ContactModel("Hồ Quý Y", "0377777777", R.drawable.ic_avatar1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyễn Văn Sót", "0311118888", R.drawable.ic_avatar3);
        listContacts.add(contact);
    }
}