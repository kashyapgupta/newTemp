package com.example.rohit.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Computer pc = ComputerFactory.getComputer("Pc", "2 GB", "500 GB", "2.4 GHZ");
        Computer laptop = ComputerFactory.getComputer("Laptop", "2 GB", "500 GB", "2.4 GHZ");
        Computer server = ComputerFactory.getComputer("Server", "2 GB", "500 GB", "2.4 GHZ");
        TextView textView = (TextView)findViewById(R.id.text_view);
        textView.setText("Pc Configuration "+pc+"\n Laptop Configuration "+laptop+"\n Server Configuration "+server);
    }
}