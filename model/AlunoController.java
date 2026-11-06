package model;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class AlunoController {
    private List<Aluno> listaAlunos;

    public AlunoController() {
        listaAlunos = new ArrayList();
    }

    public void setAluno(Aluno a) {
        listaAlunos.add(a);
    }
    public Aluno getAluno(int index) {
        return listaAlunos.get(index);
    }
    public String mostrarAlunos() {
        StringBuilder sb = new StringBuilder();
        for(Aluno a:listaAlunos) {
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void removerAluno (int index) {
        listaAlunos.remove(index);
    }

    public void viradaAluno() {
        for (Aluno a:listaAlunos){
            a.setCiclo(a.getCiclo()+1);
        }
    }

    public void limparLista(){
        listaAlunos.clear();
    }

    public void localizarIndex(int matricula){
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula){
                System.out.println(listaAlunos.indexOf(a)); 
            }
        }
    }
}
