/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collections;

import java.util.ArrayList;
import java.util.List;
import observer.Observado;
import observer.Observador;

/**
 *
 * @author Heitor
 */

public final class MarcasCollection implements Observado{
    
    private List<String> marcas;
    private List<Observador> observadores;
    private static MarcasCollection INSTANCE = null;

    private MarcasCollection() {
        this.marcas = new ArrayList();
        this.observadores = new ArrayList();
        popularMarcas();
    }
    
    public static MarcasCollection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MarcasCollection();
        }
        return INSTANCE;
    }
    
    public void addMarca(String marca) throws Exception {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Informe uma marca válida");
        }
        
        if (!this.marcas.contains(marca)) {
            this.marcas.add(marca);
            notificarObservador();
        }
    }
    
    public void removerMarca(String marca) {
       if (marca != null || !marca.isEmpty()) {
            this.marcas.remove(marca);
            notificarObservador();
        } 
    }

    public List<String> getMarcas() {
        return marcas;
    }  

    @Override
    public void adicionarObservador(Observador o) {
        if (!this.observadores.contains(o)) {
            this.observadores.add(o);
        }
    }

    @Override
    public void removerObservador(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificarObservador() {
        this.observadores.forEach(o -> o.atualizar());
    }

    private void popularMarcas() {
        this.marcas.add("Microsoft");
        this.marcas.add("Facebook");
        this.marcas.add("IBM");
        this.marcas.add("Apple");
    }
}
