package com.company;

import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha una opcio1");
        System.out.println("1 - Ver a hora do sistema");
        System.out.println("2 Ver a resolução da tela");
        System.out.println("3 Ver o idioma do sistema");
        System.out.println("4 Mostrar todos");

        int num = in.nextInt();

        switch (num) {

            case 1:
                Date relogio = new Date();
                System.out.println("A hora do sistema :");
                System.out.println(relogio.toString());
                break;
            case 2:
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();
                System.out.println("A sua tela está em resolução: " + d.width + "x" + d.height);
                break;
            case 3:
                Locale loc = Locale.getDefault();
                System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
                break;
            case 4:
                Date relogios = new Date();
                System.out.println("A hora do sistema :");
                System.out.println(relogios.toString());

                Toolkit tks = Toolkit.getDefaultToolkit();
                Dimension ds = tks.getScreenSize();
                System.out.println("A sua tela está em resolução: " + ds.width + "x" + ds.height);

                Locale locs = Locale.getDefault();
                System.out.println("Seu sistema está em " + locs.getDisplayLanguage());

                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
