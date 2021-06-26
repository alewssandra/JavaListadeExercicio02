package exercicio1;

public class Main {
    public static void main(String[] args) {
       
       //Criação dos objetos.
        Professor p = new Professor("João", 1234567, 54321, 2000);
        Aluno a = new Aluno("Joãozinho", 1234567, 54321, 500);
        
        //Utilização dos métodos.
        p.fala();
        p.perfil();
        
        a.fala();
        a.perfil();
    }
}
