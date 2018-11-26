package com.iesvirgendelcarmen.dam.materialdesign04;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Material04 extends AppCompatActivity {
    Button btnSimple, btnInteractivo, btnPersonalizado;
    FloatingActionButton fab1;
    CoordinatorLayout coordinador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material04);

        btnSimple = findViewById(R.id.btnSimple);
        btnInteractivo = findViewById(R.id.btnInteractivo);
        btnPersonalizado = findViewById(R.id.btnPersonalizado);
        fab1 = findViewById(R.id.fab1);
        coordinador = findViewById(R.id.coordinador);

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinador,"EJEMPLO DE SNACKBAR", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        btnInteractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(coordinador,"MENSAJE BORRADO", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar1 = Snackbar.make(coordinador,"MENSAJE RESTAURADO", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });
                snackbar.setActionTextColor(Color.CYAN);
                btnPersonalizado.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View sbView= snackbar.getView();
                        TextView texto = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                        texto.setTextColor(Color.YELLOW);
                    }
                });
                snackbar.show();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinador,"fhfrias", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}
