package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
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


        //Ajout de l'ecouteur d'evenement onItemSelected
        //Pour cela on a besoin de deux info, la quantite selectionne et l'edit text quantite

        //Mise en place de l'ecouteur d'evemment sur le spinner spinQuantite
        spinQuantite.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           //Creation de l'ecouteur d'evenement onItemSlected
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //On declare quantiteSelectionne pour reccuperer la quantite selectionner sous forme de Strign
                // lorsque l'utilisateur declenche l'evenement
                String quantiteSelectionne = adapterView.getItemAtPosition(i).toString();//getItemAtPosition pour reccuperer la quantite selectionner
                eQuantite.setText(quantiteSelectionne); // Mise a jour dans le champ de saisie manule en utiliant setText
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //Alors on ne fait rien
            }
        });

//On ecoute l'evenement dans le champ de saisie manuelle EditText

        eQuantite.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Si la saisie de texte n'est pas vide
                if(!charSequence.toString().isEmpty()){
                    // Alors on desactive le spinner
                    spinQuantite.setEnabled(false);
                }
                //Sinon on reactive
                else {
                    spinQuantite.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    //Declaration eventuelle de methodes


    //Maintenant on utilise ses utiliser ces variables dans le reste de
    // notre code pour accéder aux propriétés et méthodes de chaque widget

}