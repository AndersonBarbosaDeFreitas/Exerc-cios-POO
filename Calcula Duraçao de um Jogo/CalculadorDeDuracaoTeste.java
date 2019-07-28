package br.com.ufpb.POO;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CalculadorDeDuracaoTeste {
	@Test
	public void deverRetornarADuracao() {
		int hInicialEmMinutos = 5 * 60;
		int totalMinInicial = hInicialEmMinutos + 50;
		int hFinalEmMinutos = 7* 60;
		int totalMinFinal = hFinalEmMinutos + 30;
		int total = totalMinFinal - totalMinInicial;
		int totalEmHoras = total / 60;
		int totalEmMinutos = total % 60;
		String horasEMinutos = ""+totalEmHoras+":"+totalEmMinutos;
		
		assertEquals("1:40", horasEMinutos);
	}
}
