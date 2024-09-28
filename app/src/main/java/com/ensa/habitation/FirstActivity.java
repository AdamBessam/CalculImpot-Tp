package com.ensa.habitation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class FirstActivity extends AppCompatActivity {
    private TextInputEditText surface,piece;

    private RadioButton piscine;
    private TextView base,supplimentaire,total;
    private Button calcul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        calcul=findViewById(R.id.calcul);
        surface=findViewById(R.id.surface);
        piscine=findViewById(R.id.piscine);
        piece=findViewById(R.id.piece);
        base=findViewById(R.id.base);
        supplimentaire=findViewById(R.id.supplimentaire);
        total=findViewById(R.id.total);

        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surfaceValeur = surface.getText().toString();
                String pieceValeur=piece.getText().toString();
                float pieceNombre=0;
                float surfaceNombre = 0;
                float supplimentaireValue;
                float baseValue;
                float totalValue;
                try {
                    surfaceNombre = Float.parseFloat(surfaceValeur);
                    pieceNombre=Float.parseFloat(pieceValeur);
                    baseValue=surfaceNombre * 2;
                    base.setText("Impot de base: " + baseValue);
                    if(piscine.isChecked()){
                        supplimentaireValue=pieceNombre*50+100;

                    }else{
                        supplimentaireValue=pieceNombre*50;
                    }
                    totalValue=baseValue+supplimentaireValue;
                    supplimentaire.setText("Impot supplémentaire:"+supplimentaireValue);
                    total.setText("impot total: "+totalValue);
                } catch (NumberFormatException e) {
                    Toast.makeText(FirstActivity.this,"veuiller entrer des nombres",Toast.LENGTH_SHORT).show();
                }
            }



        });


    }
}