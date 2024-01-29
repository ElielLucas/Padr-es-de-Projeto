/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import FabricaAbstrata.SalgadoIngredientesFactory;

/**
 *
 * @author Eliel
 */
public class Empada extends Salgado{
    private SalgadoIngredientesFactory ingredientes;

    public Empada(SalgadoIngredientesFactory ingredientes) {
        super(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
        this.ingredientes = ingredientes;
    }

    public SalgadoIngredientesFactory getIngredientes() {
        return ingredientes;
    }
}
