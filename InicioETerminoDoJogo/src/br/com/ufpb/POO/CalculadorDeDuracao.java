package br.com.ufpb.POO;

public class CalculadorDeDuracao {
	
	public String retornarDuracao(int hInicial, int mInicial, int hFinal, int mFinal) {
		int hInicialEmMinutos = hInicial * 60;
		int totalMinInicial = hInicialEmMinutos + mInicial;
		int hFinalEmMinutos = hFinal * 60;
		int totalMinFinal = hFinalEmMinutos + mFinal;
		int duracao = totalMinFinal - totalMinInicial;
		int duracaoEmHoras = duracao / 60;
		int duracaoEmMinutos = duracao % 60;
		String duracao_horas_E_minutos = ""+duracaoEmHoras+":"+duracaoEmMinutos;
		return duracao_horas_E_minutos;
	}
}
