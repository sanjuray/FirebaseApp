package com.example.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView reflect = findViewById(R.id.reflect);
        TextView reflectUser = findViewById(R.id.reflectUser);

        //Database Instance
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        //Reference to a specific node in the database
        DatabaseReference ref = database.getReference("msg");

//        Writing a value at specified location
        ref.setValue("Hello From SG!");

        //Event Listener to update the app of any changes to the reference node
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String newValue = snapshot.getValue(String.class);
                reflect.setText(newValue);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //Use to handle errors
            }
        });

        //For custom objects
        //Reference to a specific node in the database
        DatabaseReference ref1 = database.getReference("customObjectTest");

        User user = new User("JackSully","jacksully@gmail.com");

        ref1.setValue(user);

        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User u = snapshot.getValue(User.class);
                reflectUser.setText("Name: "+u.getName()+"\nEmail: "+u.getEmail());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}