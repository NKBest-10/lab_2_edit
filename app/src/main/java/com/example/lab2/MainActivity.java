package com.example.lab2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        numMessage = 10;
        Log.i("numMessage=", "" + numMessage);

        numMessage++;
        numMessage += 1;
        Log.i("numMessage=", "" + numMessage);

        boolean isFriend = true;
        Log.i("isFriend=", "" + isFriend);

        String contact = "Narubet";
        String messsage = "This id my forst App";
        String know = "I don't know how to make this";

        Toast.makeText(this, "Message form " + contact, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Message is " + messsage, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Do you know?  " + know, Toast.LENGTH_LONG).show();

        String command = "go east";
        switch (command) {
            case "go east":
                Log.i("message", "Player go to east");
                break;
            case "go west":
                Log.i("message", "Player go to west");
                break;
            default:
                Log.i("message", "default message");
                break;
        }
        Log.i("message:", "In countUp method");
        int x = 0;
        while (true) {
            x++;
            Log.i("x =", "" + x);
            if (x == 10) {
                break;
            }
        }
        String mess = joinThese("You ", "are ", "cool");
        Log.i("message", mess);
        float area = getAreaCircle(5f);
        Log.i("area", "" + area);

    }
String joinThese(String a, String b, String c){
        return a+b+c;
    }
    float getAreaCircle(float radius){
        return 3.14f*radius*radius;
    }
}