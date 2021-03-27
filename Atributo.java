package com.mycompany.desafio04;

import java.util.ArrayList;

public abstract class Atributo {

    protected ArrayList<Integer> firstNumber = new ArrayList();
    protected ArrayList<Integer> diferenceNumber = new ArrayList();

    protected int marco1;
    protected int marco2;
    protected int index0 = 0;
    protected int index1 = 1;
    

    public ArrayList<Integer> getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(ArrayList<Integer> firstNumber) {
        this.firstNumber = firstNumber;
    }

    public ArrayList<Integer> getDiferenceNumber() {
        return diferenceNumber;
    }

    public void setDiferenceNumber(ArrayList<Integer> diferenceNumber) {
        this.diferenceNumber = diferenceNumber;
    }

    public int getMarco1() {
        return marco1;
    }

    public void setMarco1(int marco1) {
        this.marco1 = marco1;
    }

    public int getMarco2() {
        return marco2;
    }

    public void setMarco2(int marco2) {
        this.marco2 = marco2;
    }

    public int getIndex0() {
        return index0;
    }

    public void setIndex0(int index0) {
        this.index0 = index0;
    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    
}
