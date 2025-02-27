package org.example;
import java.util.Scanner;

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
        int Opedido = 0;
        int VlrDinero = 0;




        do {
            System.out.print(
                    """
                  
                   --- BIENVENID@---
                   1. Hacer tu pedido.
                   2. Pagar tu pedido.
                   3. Salir   
                     Elige una Opcion:
                       
                    """.stripIndent());

            Opc = scanner.nextInt();

            switch (Opc) {
                case 1 -> {
                    System.out.println(
                            """
                           ---  Menu ---
                           
                           1. Hamburguesa = 15000
                           2. Papas fritas = 10000
                           3. Coca Cola = 40000
                           4. Agua = 5000
                           5. Chocolatina = 1500
                           
                           * Ingresar tu pedido (1-5)
                           
                           """.stripIndent());
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
                        System.out.println("El valor Total: "+pedido);
                    }

                }
                case 2 -> {
                    System.out.println("Bienvenido recuerda que nuestro metodo de Pago solo Efectivo");
                    System.out.println("Tu valor a pagar es de: " +pedido);
                    System.out.println("Ingresar el dinero a la maquina");
                    VlrDinero = scanner.nextInt();
                    if(VlrDinero >= pedido){
                        VlrDinero-=pedido;
                        System.out.println("sus vueltas son "+VlrDinero);
                     }
                    else if (VlrDinero < pedido){
                        int Faltante;
                        Faltante = pedido - VlrDinero;
                        System.out.println("Su valor es insuficiente!, le hace falta un monto: "+Faltante);


                        System.out.println(
                                """
                               --- DESEAS PAGAR EL EXCEDETE ---
                               1. PAGAR
                               2. SALIR MENU INICIAL
                                """.stripIndent());
                        int oppago=0;
                        oppago = scanner.nextInt();

                                while(oppago ==1){

                                    System.out.println("Ingrese Dinero: ");
                                    VlrDinero = scanner.nextInt();

                                    if (Faltante == 0) {
                                        System.out.println(" Gracias por elegirnos!, tramitando pedido");
                                        System.exit(0);
                                    }
                                    else if (VlrDinero >= Faltante)
                                    {
                                        VlrDinero -= Faltante;
                                        System.out.println("Exito! tramitando pedido");
                                        System.out.println("sus vueltas son: "+VlrDinero);
                                        System.exit(0);
                                    }

                                    else if (Faltante < VlrDinero)
                                    {
                                        Faltante -= VlrDinero;
                                        System.out.println("Le hace falta un monto: "+Faltante);
                                    }
                                    else
                                    {
                                        System.out.println("No es posible realizar la transaccion");
                                     }
                                }
                        }
                    else{
                        System.out.println("No es posible realizar la transaccion");
                    }

                }
            }
        } while(Opc != 3);
        System.out.println("Gracias por preferirnos!, TE ESPAMOS PRONTO");
    }
}