package com.example.ja.kalkulator;



import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button pkw;
    Button pprost;
    TextView react;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI(){
    pkw = (Button)findViewById(R.id.pkwadrat );
    pprost = (Button)findViewById(R.id.pprostokat );
    react = (TextView) findViewById(R.id.display );
    View.OnClickListener pk = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //  react.setText("pole kwadratu");
            pole_kwadratu();
        }
    };
    View.OnClickListener pp = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //  react.setText("pole prostokata");
        //    pole_prostokata();
        }
    };

    pkw.setOnClickListener(pk);
    pprost.setOnClickListener(pp);
}

// otwarcie poszczegolnych ekranow
public void pole_kwadratu(){
    Intent otworzkwadrat = new Intent(this,Kwadrat.class);
    startActivity(otworzkwadrat);
}
//public void pole_prostokata(){
 //       Intent otworzprostokat = new Intent(this,Prostokat.class);
 //       startActivity(otworzprostokat);
 //   }

}
