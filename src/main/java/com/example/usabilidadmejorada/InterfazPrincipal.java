package com.example.usabilidadmejorada;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InterfazPrincipal {
    public Button hamButton;
    public Button aguaButton;
    public Button cervButton;
    public Button postreButton;
    public Button ensalButton;
    public Button perritoButton;
    public Button sandwButton;
    public Button refresButton;

    public TextField totSinImp;
    public TextField impuestos;
    public TextField total;

    private double precioTotal;

    private int cantHam=0;
    private int cantAgua=0;
    private int cantRefres=0;
    private int cantCerv=0;
    private int cantEnsa=0;
    private int cantPerri=0;
    private int cantSandw=0;
    private int cantPostre=0;


    // ANADIR PRODUCTOS //
    public void sumarHam(ActionEvent actionEvent) {
        precioTotal+=3;
        cantHam++;
        actualizTotalSinImp();
    }

    public void sumarAgua(ActionEvent actionEvent) {
        precioTotal+=1.5;
        cantAgua++;
        actualizTotalSinImp();
    }

    public void sumarCerv(ActionEvent actionEvent) {
        precioTotal+=2.5;
        cantCerv++;
        actualizTotalSinImp();
    }

    public void sumarPostre(ActionEvent actionEvent) {
        precioTotal+=3;
        cantPostre++;
        actualizTotalSinImp();
    }

    public void sumarEnsal(ActionEvent actionEvent) {
        precioTotal+=3.5;
        cantEnsa++;
        actualizTotalSinImp();
    }

    public void sumarPerrit(ActionEvent actionEvent) {
        precioTotal+=2.5;
        cantPerri++;
        actualizTotalSinImp();
    }

    public void sumarSandw(ActionEvent actionEvent) {
        precioTotal+=2.5;
        cantSandw++;
        actualizTotalSinImp();
    }

    public void sumarRefres(ActionEvent actionEvent) {
        precioTotal+=2;
        cantRefres++;
        actualizTotalSinImp();
    }

    // RESTAR PRODUCTOS //
    public void menosHam(ActionEvent actionEvent) {
        if (cantHam>0) {
            precioTotal -= 3;
            cantHam--;
        }
        actualizTotalSinImp();
    }

    public void menosAgua(ActionEvent actionEvent) {
        if (cantAgua>0) {
            precioTotal -= 1.5;
            cantAgua--;
        }
        actualizTotalSinImp();
    }

    public void menosRefres(ActionEvent actionEvent) {
        if (cantRefres>0) {
            precioTotal -= 2;
            cantRefres--;
        }
        actualizTotalSinImp();
    }

    public void menosCerv(ActionEvent actionEvent) {
        if (cantCerv>0) {
            precioTotal -= 1.5;
            cantCerv--;
        }
        actualizTotalSinImp();
    }

    public void menosEnsal(ActionEvent actionEvent) {
        if (cantEnsa>0) {
            precioTotal -= 3.5;
            cantEnsa--;
        }
        actualizTotalSinImp();
    }

    public void menosPerrito(ActionEvent actionEvent) {
        if (cantPerri>0) {
            precioTotal -= 2.5;
            cantPerri--;
        }
        actualizTotalSinImp();
    }

    public void menosSandw(ActionEvent actionEvent) {
        if (cantSandw>0) {
            precioTotal -= 2.5;
            cantSandw--;
        }
        actualizTotalSinImp();
    }

    public void menosPostre(ActionEvent actionEvent) {
        if (cantPostre>0) {
            precioTotal -= 3;
            cantPostre--;
        }
        actualizTotalSinImp();
    }

    public void actualizTotalSinImp(){
        totSinImp.setText(String.valueOf(precioTotal));
    }

    public void aceptar(ActionEvent actionEvent) {

    }
}