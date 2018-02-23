package Polinomio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polinomio {

	private Integer coeficiente;
	private Integer exponente;

	public void setCoeficiente(Integer coeficiente) {
		this.coeficiente = coeficiente;
	}

	public void setExponente(Integer exponente) {
		this.exponente = exponente;
	}

	public Integer getCoeficiente() {
		return coeficiente;
	}

	public Integer getExponente() {
		return exponente;
	}

	private static Scanner entrada = new Scanner(System.in);
	static ArrayList<Polinomio> polinomio = new ArrayList<>();
	static ArrayList<Polinomio> polinomio2 = new ArrayList<>();
	static ArrayList<Polinomio> suma_o_resta_de_los_dos_polinomios = new ArrayList<>();
	static Integer monomio;

	public Polinomio(Integer coeficiente_1, Integer exponente_1) {

		this.coeficiente = coeficiente_1;
		this.exponente = exponente_1;

	}

	public static void entrada_datos() {

		System.out.println("Ingresa la cantidad de monimios:");
		monomio = entrada.nextInt();

		for (int i = 0; i < monomio; i++) {

			Ingresar_Lista();

		}

		Impresion_de_Monomio();
	}

	public static void Impresion_de_Monomio() {

		System.out.println("Impresion del Polinomio 1:\n");

		for (Polinomio mostrar : polinomio) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

		System.out.println("\n\n");

		System.out.println("Simplificacion del Polinomio 1\n");
		simplificar();

		for (Polinomio mostrar : polinomio) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

	}

	public static void Ingresar_Lista() {

		Integer coeficiente_1;
		Integer exponente_1;

		System.out.println("Ingresa el Valor del Coeficiente");
		coeficiente_1 = entrada.nextInt();
		System.out.println("Ingresa el Valor del Exponente");
		exponente_1 = entrada.nextInt();

		polinomio.add(new Polinomio(coeficiente_1, exponente_1));

	}

	@Override
	public String toString() {
		return "(" + coeficiente + " X" + exponente + ")";
	}

	public static void simplificar() {

		for (int i = 0; i < polinomio.size(); i++) {

			for (int x = i + 1; x < polinomio.size(); x++) {

				if (polinomio.get(i).getExponente() == polinomio.get(x).getExponente()) {
					polinomio.get(i)
							.setCoeficiente(polinomio.get(i).getCoeficiente() + polinomio.get(x).getCoeficiente());
					if (i < polinomio.size() - 1)
						polinomio.remove(x);

				}

			}

		}

	}
	
/////////////////////////////////////////////////////POLINOMIO 2//////////////////////////////////////////////////////////7/////////////////////////////////////////////////////////

	public static void entrada_datos2() {

		
		System.out.println("\n\n\nIngresa la cantidad de Polinomio 2:");
		monomio = entrada.nextInt();

		for (int i = 0; i < monomio; i++) {

			Ingresar_Lista2();

		}

		Impresion_de_Monomio2();
	}
	
	public static void Ingresar_Lista2() {

		Integer coeficiente_2;
		Integer exponente_2;

		System.out.println("Ingresa el Valor del Coeficiente");
		coeficiente_2 = entrada.nextInt();
		System.out.println("Ingresa el Valor del Exponente");
		exponente_2 = entrada.nextInt();

		polinomio2.add(new Polinomio(coeficiente_2, exponente_2));

	}
	
	public static void Impresion_de_Monomio2() {

		System.out.println("Impresion del Polinomio 2\n");

		for (Polinomio mostrar : polinomio2) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

		System.out.println("\n\n");

		System.out.println("Simplificacion del Polinomio 2\n");
		simplificar2();

		for (Polinomio mostrar : polinomio2) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

	}
	
	public static void simplificar2() {

		for (int i = 0; i < polinomio2.size(); i++) {

			for (int x = i + 1; x < polinomio2.size(); x++) {

				if (polinomio2.get(i).getExponente() == polinomio2.get(x).getExponente()) {
					polinomio2.get(i)
							.setCoeficiente(polinomio2.get(i).getCoeficiente() + polinomio2.get(x).getCoeficiente());
					if (i < polinomio2.size() - 1)
						polinomio2.remove(x);

				}

			}

		}

	}

///////////////////////////////////////////////////SUMA/////////////////////////////////////////////////////////////7////////////////////////////7/////
	
	public static void entrada_de_datos3() {
		
		for(int i=0; i<polinomio.size(); i++) {
			
			suma_o_resta_de_los_dos_polinomios.add(polinomio.get(i));
			
		}
		
        for(int i=0; i<polinomio2.size(); i++) {
			
			suma_o_resta_de_los_dos_polinomios.add(polinomio2.get(i));
			
		}
		
	}
	
	public static void Impresion_de_Monomio3() {

		System.out.println("\n\n\nImpresion de la suma de los dos Polinomios 1 y 2 simplificados \n");

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

		System.out.println("\n\n");

		System.out.println("Simplificacion de los dos polinomios 1 y 2 sumados \n");
		simplificar3();

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

	}
	
	public static void simplificar3() {

		for (int i = 0; i < suma_o_resta_de_los_dos_polinomios.size(); i++) {

			for (int x = i + 1; x < suma_o_resta_de_los_dos_polinomios.size(); x++) {

				if (suma_o_resta_de_los_dos_polinomios.get(i).getExponente() == suma_o_resta_de_los_dos_polinomios.get(x).getExponente()) {
					suma_o_resta_de_los_dos_polinomios.get(i)
							.setCoeficiente(suma_o_resta_de_los_dos_polinomios.get(i).getCoeficiente() + suma_o_resta_de_los_dos_polinomios.get(x).getCoeficiente());
					if (i < suma_o_resta_de_los_dos_polinomios.size() - 1)
						suma_o_resta_de_los_dos_polinomios.remove(x);

				}

			}

		}

	}
	
////////////////////////////////////////////////RESTA//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void RestarSimplificar() {

		for (int i = 0; i < suma_o_resta_de_los_dos_polinomios.size(); i++) {

			for (int x = i + 1; x < suma_o_resta_de_los_dos_polinomios.size(); x++) {

				if (suma_o_resta_de_los_dos_polinomios.get(i).getExponente() == suma_o_resta_de_los_dos_polinomios.get(x).getExponente()) {
					suma_o_resta_de_los_dos_polinomios.get(i)
							.setCoeficiente(suma_o_resta_de_los_dos_polinomios.get(i).getCoeficiente() - (suma_o_resta_de_los_dos_polinomios.get(x).getCoeficiente()));
					if (i < suma_o_resta_de_los_dos_polinomios.size() - 1)
						suma_o_resta_de_los_dos_polinomios.remove(x);

				}

			}

		}

	}
	
	public static void Impresion_de_Monomio4() {

		System.out.println("\n\n\nImpresion de la suma de los dos Polinomios 1 y 2 simplificados \n");

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

		System.out.println("\n\n");

		System.out.println("Simplificacion de los dos polinomios 1 y 2 restados \n");
		RestarSimplificar();

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

	}
	
///////////////////////////////////////////MULTIPLICACION//////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void MultiplicarSimplificar() {

		for (int i = 0; i < suma_o_resta_de_los_dos_polinomios.size(); i++) {

			for (int x = i + 1; x < suma_o_resta_de_los_dos_polinomios.size(); x++) {

				if (suma_o_resta_de_los_dos_polinomios.get(i).getExponente() == suma_o_resta_de_los_dos_polinomios.get(x).getExponente()) {
					suma_o_resta_de_los_dos_polinomios.get(i)
							.setCoeficiente(suma_o_resta_de_los_dos_polinomios.get(i).getCoeficiente() * (suma_o_resta_de_los_dos_polinomios.get(x).getCoeficiente()));
					if (i < suma_o_resta_de_los_dos_polinomios.size() - 1)
						suma_o_resta_de_los_dos_polinomios.remove(x);

				}

			}

		}

	}
	
	public static void Impresion_de_Monomio5() {

		System.out.println("\n\n\nImpresion de la suma de los dos Polinomios 1 y 2 simplificados \n");

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

		System.out.println("\n\n");

		System.out.println("Simplificacion de los dos polinomios 1 y 2 multiplicados \n");
		MultiplicarSimplificar();

		for (Polinomio mostrar : suma_o_resta_de_los_dos_polinomios) {
			System.out.print(mostrar + " + ");

		}

		System.out.print(0);

	}
	
	
	
	public static void main(String[] args) {
		

        int opcion;
		
		
     	entrada_datos();
		entrada_datos2();
		entrada_de_datos3();
		
		
			System.out.println("\n\n\nEligue una Opcion");
            System.out.println("1.-Suma de los Polinomios");
			System.out.println("2.-Resta de los Polinomios");
			System.out.println("3.-Multiplicacion de los Polinomios");
			System.out.println("4.-Salir\n");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1: 
				
				Impresion_de_Monomio3();
				
				break;
				
				
			case 2:
				
				Impresion_de_Monomio4();
				
				break;
				
			case 3:
				
				Impresion_de_Monomio5();
				
				break;
				
			case 4:
				
				System.out.println("Presiono Salir\n");
				
				break;
				
			default:
				
					System.out.println("\nPresiono un numero incorrecto que no esta en el menu\n\n");

			}

		
	}

	
	
	
}




