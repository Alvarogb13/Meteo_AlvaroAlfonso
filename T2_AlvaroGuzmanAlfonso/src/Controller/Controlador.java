package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import View.Vista;

public class Controlador implements ActionListener {
	ArrayList<String> Andalucia = new ArrayList<>();
	ArrayList<String> Baleares = new ArrayList<>();
	ArrayList<String> Canarias = new ArrayList<>();
	ArrayList<String> CastillaLeon = new ArrayList<>();
	ArrayList<String> CastillaMancha = new ArrayList<>();
	ArrayList<String> Cataluña = new ArrayList<>();
	ArrayList<String> Estremadura = new ArrayList<>();
	ArrayList<String> Galicia = new ArrayList<>();
	ArrayList<String> Madrid = new ArrayList<>();
	ArrayList<String> Murcia = new ArrayList<>();
	ArrayList<String> Navarra = new ArrayList<>();
	ArrayList<String> PaisVasco = new ArrayList<>();
	ArrayList<String> LaRioja = new ArrayList<>();
	ArrayList<String> Valencia = new ArrayList<>();
	ArrayList<String> Aragon = new ArrayList<>();
	ArrayList<String> Asturias = new ArrayList<>();
	ArrayList<String> cantabria = new ArrayList<>();
	

	Vista vista = new Vista();
	public Controlador(Vista frame) {
		vista=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
