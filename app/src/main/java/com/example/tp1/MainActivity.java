package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //2-Declaration des attributs correspondants aux objets graphique
    private ImageView imageView;
    private TextView tcompositionMenu;
    private TextView tEntrees;
    private Spinner spinEntrees;
    private TextView tPlat;
    private Spinner spinPlats;
    private TextView tDessert;
    private Spinner spinDessert;
    private TextView tQuantite;
    private Spinner spinQuantite;
    private EditText eQuantite;
    private Button bAjouter;
    private TextView tRecaptitulatif;
    private EditText eRemarques;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des attributs correspondant aux objets graphiques
        imageView = findViewById(R.id.imageView);
        tcompositionMenu = findViewById(R.id.tcompositionMenu);
        tEntrees = findViewById(R.id.tEntrees);
        spinEntrees = findViewById(R.id.spinEntrees);
        tPlat = findViewById(R.id.tPlat);
        spinPlats = findViewById(R.id.spinPlats);
        tDessert = findViewById(R.id.tDessert);
        spinDessert = findViewById(R.id.spinDessert);
        tQuantite = findViewById(R.id.tQuantite);
        spinQuantite = findViewById(R.id.spinQuantite);
        eQuantite = findViewById(R.id.eQuantite);
        bAjouter = findViewById(R.id.bAjouter);
        tRecaptitulatif = findViewById(R.id.tRecaptitulatif);
        eRemarques = findViewById(R.id.eRemarques);
    }
    //Maintenant on utilise ses utiliser ces variables dans le reste de
    // notre code pour accéder aux propriétés et méthodes de chaque widget

    //Ajout des methode sneccessaires


}