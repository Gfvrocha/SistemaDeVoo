package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;
import br.senai.sp.jandira.model.VooGol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;
    List<Voo> listVoo = new ArrayList<>();

    public void executarMenu(){


        VooGol vooGol1 = new VooGol("GL-1910", "São Paulo", "Ceara", "2023-11-05", 600);
        VooGol vooGol2 = new VooGol("GL-2012", "Minas Gerais", "João Pessoa", "2023-10-05", 700);
        VooGol vooGol3 = new VooGol("GL-1977", "Rio de Janeiro", "Pará", "2023-11-01", 400);

        VooDelta vooDelta1 = new VooDelta("DL-0001", "Portugal", "Roma", "2023-11-05", 300);
        VooDelta vooDelta2 = new VooDelta("DL-0002", "Roma", "Panamá", "2023-11-01", 900);
        VooDelta vooDelta3 = new VooDelta("DL-0003", "Nova Zelandia", "São Paulo", "2023-11-09", 800);

        VooEmirates vooEmirates1 = new VooEmirates("ET-0004", "Jandira", "Osasco", "2023-05-08", 400);
        VooEmirates vooEmirates2 = new VooEmirates("ET-0005", "Osasco", "Itapevi", "2023-05-10", 100);
        VooEmirates vooEmirates3 = new VooEmirates("ET-0006", "Caapicuiba", "Barueri", "2023-05-08", 400);

        listVoo.add(vooGol1);
        listVoo.add(vooGol2);
        listVoo.add(vooGol3);

        listVoo.add(vooDelta1);
        listVoo.add(vooDelta2);
        listVoo.add(vooDelta3);

        listVoo.add(vooEmirates1);
        listVoo.add(vooEmirates2);
        listVoo.add(vooEmirates3);


        while (continuar){
            System.out.println("|=0=0= -- Bem vindo -- =0=0=|");
            System.out.println("| 1 - Listar Voo            |");
            System.out.println("| 2 - Pesquisar Voo         |");
            System.out.println("| 3 - Sair                  |");
            System.out.println("|=0=0=0=0=0=0=0=0=0=0=0=0=0=|");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){

                case 1:
                    listarVoos();
                    break;

                case 2:
                    System.out.println("Informe o Número do Voo: ");
                    String numero = scanner.nextLine();
                    pesquisarVoo(numero);

                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }

    public void listarVoos(){
        for (Voo voo : listVoo){
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDestino());
            System.out.println(voo.getDataPartida());
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        }
    }

    public void pesquisarVoo(String numeroVoo){
        for(Voo voo : listVoo){
            String vooReal = voo.getNumeroVoo();

            if (vooReal.equalsIgnoreCase(numeroVoo)){
                System.out.println(voo.getNumeroVoo());
                System.out.println(voo.getOrigem());
                System.out.println(voo.getDestino());
                System.out.println(voo.getDataPartida());
                System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

            } else {
                System.out.println("Voo não encontrado!");
            }

        }
    }

}
