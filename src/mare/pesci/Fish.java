/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mare.pesci;

/**
 *
 * @author carbo
 */
abstract public class Fish {

    private final VenomType venomType;
    private final float weight;
    private final float length;

    public Fish(float length, float weight, VenomType venom) {
        this.length = length;
        this.weight = weight;
        venomType = venom;
    }
}
