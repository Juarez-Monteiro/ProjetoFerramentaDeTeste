package com.teste.projeto.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcularVolumeTest {

	@Test
	void testVolumeParalepipado() {
		CalcularVolume calc = new CalcularVolume();
		double volumeParalepipado = calc.volumeParalepipado(3.0,2.0, 2.0);
		assertEquals(12.0 ,volumeParalepipado );
	}
	@Test
	void testVolumeParalepipado2() {
		CalcularVolume calc = new CalcularVolume();
		double volumeParalepipado = calc.volumeParalepipado(-3.0,2.0, 2.0);
		assertEquals(-1.0 ,volumeParalepipado );
	}
	@Test
	void testVolumeCilindro() {
		CalcularVolume calc = new CalcularVolume();
		double volumeCilindro = calc.volumeCilindro(2.0, 2.0);
		assertEquals(25.132741228718345 ,volumeCilindro );
	}
	@Test
	void testVolumeCilindro2() {
		CalcularVolume calc = new CalcularVolume();
		double volumeCilindro = calc.volumeCilindro(2.0, -2.0);
		assertEquals(-1 ,volumeCilindro );
	}
	@Test
	void testVolumeEsfera() {
		CalcularVolume calc = new CalcularVolume();
		double volumeEsfera = calc.volumeEsfera( 2.0);
		assertEquals(33.510321638291124 ,volumeEsfera );
	}@Test
	void testVolumeEsfera2() {
		CalcularVolume calc = new CalcularVolume();
		double volumeEsfera = calc.volumeEsfera( 0);
		assertEquals(-1 ,volumeEsfera );
	}
}
