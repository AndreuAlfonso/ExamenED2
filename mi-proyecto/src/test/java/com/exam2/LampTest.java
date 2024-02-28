package com.exam2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LampTest {

    Lamp lamp;
    double consumption;
    boolean turnedOn;

    @Test
    @DisplayName("Se crea la lámpara")
    public void Lamp() {
        lamp = new Lamp(consumption);
    }

    @Test
    @DisplayName("Se crea la lámpara con turnedOn")
    public void LampTurnedOn() {
        lamp = new Lamp(consumption, turnedOn);
    }

    @Test
    @DisplayName("Enciende la lámpara")
    public void turnOn() {
        Lamp.turnOn();
        assertEquals(true, turnedOn);
    }

    @Test
    @DisplayName("Apaga la lámpara")
    void turnOff() {
        assertEquals(false, turnedOn);
    }

    @Test
    @DisplayName("Alterna el estado de la lámpara de apagada a encendida")
    void toggleFalseToTrue() {
        Lamp.toggle();
        turnedOn = false;
        assertEquals(true, turnedOn);
    }

    @Test
    @DisplayName("Alterna el estado de la lámpara de encendida a apagada")
    void toggleTrueToFalse() {
        Lamp.toggle();
        turnedOn = true;
        assertEquals(false, turnedOn);
    }
}