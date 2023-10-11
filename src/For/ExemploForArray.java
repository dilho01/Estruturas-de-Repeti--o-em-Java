package For;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"felipe", "jonas", "julia", "marcos"};

        for ( int x=0; x<alunos.length; x ++) {
            System.out.println("O aluno no indice X = " + x + " é " + alunos[x]);
        }
    }
}
