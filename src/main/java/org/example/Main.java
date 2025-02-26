package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Una empresa ha instalado una nueva máquina expendedora de snacks y bebidas en su oficina. Para mejorar la experiencia de los empleados, quieren que el sistema:
Muestre los productos disponibles y sus precios.
•	Permita a los usuarios comprar varios productos en una sola sesión (Ingresar 5 productos).
•	Maneje pagos en efectivo y devuelva el cambio correctamente.
•	No permita compras si el usuario no tiene suficiente dinero.
•	Ofrezca la opción de salir cuando el usuario termine.*/
        Scanner scanner = new Scanner(System.in);
        int Hamburguesa = 15000;
        int papa = 10000;
        int coca = 40000;
        int agu = 5000;
        int choco = 1500;
        int Opc;
        double Pago;
        int pedido = 0;
        double Saldo =50000;
        int Opedido = 0;


        System.out.println(
                """
              
               ---  Menu ---
               
               1. Hamburguesa = 15000
               2. Papas fritas = 10000
               3. Coca Cola = 40000
               4. Agua = 5000
               5. Chocolatina = 1500
               
                """.stripIndent());

        do {
            System.out.print(
                    """
                  
                   --- BIENVENID@---
                   
                   
                   1. Hacer tu pedido:
                   2.  
                     Elige una Opcion:      
                    """.stripIndent());

            Opc = scanner.nextInt();

            switch (Opc) {
                case 1 -> {
                    System.out.println("Ingresar tu pedido de acuedo al menu (1-5): ");
                    System.out.print("Selecciona tu Opcion: ");
                    for(int i =1; i <=5; i++) {
                        Opedido = scanner.nextInt();


                        switch (Opedido) {

                            case 1 ->
                                    {
                                        pedido += Hamburguesa;
                                        System.out.println("Seleccionaste Hamburguesa: "+Hamburguesa);
                                    }
                            case 2 ->
                                    {
                                        pedido +=  papa;
                                        System.out.println("Seleccionaste papasfritas: "+papa);
                                    }

                            case 3 ->
                                    {
                                        pedido +=  coca;
                                        System.out.println("Seleccionaste Coca Cola: "+coca);
                                    }
                            case 4 ->
                                    {
                                        pedido += agu;
                                        System.out.println("Seleccionaste Agua: " +agu);
                                    }
                            case 5 ->
                                    {
                                        pedido += choco;
                                        System.out.println("Seleccionaste Chocolatina: "+choco);
                                    }
                            default -> System.out.println("Opcion no valida");

                         }
                        System.out.println("Tu pedido tiene un valor: "+pedido);
                    }

                }

            }

        } while(Opc != 4);
        System.out.println("Gracias! ");
    }
}