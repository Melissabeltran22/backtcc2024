package org.example;

import org.example.modelos.Mercancia;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Vehiculo vehiculo = new Vehiculo();
        Mercancia mercancia = new Mercancia();

        Scanner lea = new Scanner(System.in);
        System.out.print("Digite el Id: ");
        vehiculo.setId(lea.nextInt());
        System.out.println(vehiculo.getId());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la marca: ");
//        vehiculo.setMarca(lea.nextLine());
//        System.out.println(vehiculo.getMarca());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el modelo del vehículo: ");
//        vehiculo.setModelo(lea.next());
//        System.out.println(vehiculo.getModelo());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el kilometraje: ");
//        vehiculo.setKilometraje(lea.nextDouble());
//        System.out.println(vehiculo.getKilometraje());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el Color del vehículo: ");
//        vehiculo.setColor(lea.nextLine());
//        System.out.println(vehiculo.getColor());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la descripción del vehículo: ");
//        vehiculo.setDescripcion(lea.nextLine());
//        System.out.println(vehiculo.getDescripcion());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el tipo de vehículo: ");
//        vehiculo.setTipo(lea.nextLine());
//        System.out.println(vehiculo.getTipo());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la autonomía del vehículo: ");
//        vehiculo.setAutonomia(lea.nextInt());
//        System.out.println(vehiculo.getAutonomia());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la capacidad de carga del vehículo: ");
//        vehiculo.setCapacidadCarga(lea.nextDouble());
//        System.out.println(vehiculo.getCapacidadCarga());

//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el avalúo del vehículo: $ ");
//        vehiculo.setAvaluo(lea.nextInt());
//        System.out.println(vehiculo.getAvaluo());



        //**************** Mercancía ****************


//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el id de la mercancía: ");
//        mercancia.setId(lea.nextInt());
//        System.out.println(mercancia.getId());
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el volumen ocupado: ");
//        mercancia.setVolumenOcupado(lea.nextDouble());
//        System.out.println(mercancia.getVolumenOcupado());
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el tipo de mercancía: ");
//        mercancia.setTipo(lea.nextLine());
//        System.out.println(mercancia.getTipo());
//
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el peso de la mercancía: ");
//        mercancia.setPeso(lea.nextDouble());
//        System.out.println(mercancia.getPeso());
//
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la descripción de la mercancía: ");
//        mercancia.setDescripcion(lea.nextLine());
//        System.out.println(mercancia.getDescripcion());
//
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite el avalúo la mercancía: $");
//        mercancia.setAvaluo(lea.nextInt());
//        System.out.println(mercancia.getAvaluo());
//
//
//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la dirección del remitente: ");
//        mercancia.setDireccionRemitente(lea.nextLine());
//        System.out.println(mercancia.getDireccionRemitente());


//        Scanner lea = new Scanner(System.in);
//        System.out.print("Digite la dirección del destinatario: ");
//        mercancia.setDireccionDestinatario(lea.nextLine());
//        System.out.println(mercancia.getDireccionDestinatario());


    }
}