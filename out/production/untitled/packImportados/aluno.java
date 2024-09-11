//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;
import packTrimestre.trimestre;

public class Aluno {
    public Aluno() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        trimestre semestre = new trimestre();
        System.out.println("Digite seu nome: ");
        semestre.nome = sc.nextLine();
        System.out.println("primeira nota; ");
        semestre.nota1 = sc.nextDouble();
        System.out.println("segunda nota; ");
        semestre.nota2 = sc.nextDouble();
        System.out.println("terceira nota; ");
        semestre.nota3 = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Nota final: " + semestre.media());
        System.out.println(" ");
        semestre.resultado();
    }
}
