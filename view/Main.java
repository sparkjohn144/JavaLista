package view;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.AlunoController;

public class Main {
    public static void main(String[] args) {
        AlunoController ac = new AlunoController();
        Aluno a1 = new Aluno(10, "Ale", "DSM", 5);
        ac.setAluno(a1);
        ac.setAluno(new Aluno(40, "Ale", "DSM", 5));
        ac.setAluno(new Aluno(30, "Aline", "ADS", 4));
        ac.setAluno(new Aluno(20, "Maria", "DSM", 3));
        ac.setAluno(new Aluno(11, "Ana", "ADS",2));

        System.out.print("Index da matricula 30: ");
        ac.localizarIndex(30);

        System.out.println(ac.mostrarAlunos());

        System.out.println("Removido aluno de index 4");
        ac.removerAluno(4);
        System.out.println(ac.mostrarAlunos());
        
        System.out.println("Virada.");
        ac.viradaAluno();
        System.out.println(ac.mostrarAlunos());

        
    }
}