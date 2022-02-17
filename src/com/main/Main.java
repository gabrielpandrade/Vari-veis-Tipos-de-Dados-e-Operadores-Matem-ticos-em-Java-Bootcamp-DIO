package com.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        * Tipos de variáveis
        * Instância: objeto
        * Classe: classe
        * Local: dentro dos métodos
        * Parâmetro: Na assinatura do método
        * */

        /*
        * Tipos de casting
        * Upcast(implícito) -> para variável de tipo maior
        * Downcast(explicito) -> para variável de tipo menor
        * (tipo de casting) nomedocasting = (tipo do casting) npmevariável
        * */

        byte b1 = 10;
        byte b2 = 10;

        short s1 = 10;
        short s2 = 10;

        int i1 = 10;
        int i2 = 10;

        long l1 = 10L;
        long l2 = 10L;

        float f1 = 10f;
        float f2 = 10f;

        double d1 = 10d;
        double d2 = 10d;

        char c1 = 'T';
        char c2 = 'T';

        String st1 = "Gabriel";
        String st2 = "Gabriel";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println("PrePos: ");
        prepos();
        System.out.println("Aritmético: ");
        aritmetico();
        System.out.println("Atribuição: ");
        atribuicao();
    }

    public static void prepos(){
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("++k: "+i);
        System.out.println("k--: "+j);
        System.out.println("k: "+x);
    }

    public static void aritmetico(){
        int a = 10;
        int b = 20;
        int c = 30;
        double d = 40;
        double e = 50;

        System.out.println("a+b: "+(a+b));
        System.out.println("c-a: "+(c-a));
        System.out.println("c*b: "+(c*b));
        System.out.println("e/d: "+(e/d));
        System.out.println("b%c: "+(b%c));
    }

    public static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: "+d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("i += 5: "+i);
        System.out.println("j -= 3: "+j);
        System.out.println("d /= 2.7d: "+d);
        System.out.println("l *= 3"+l);
        System.out.println("k %= 2"+k);
    }

}
