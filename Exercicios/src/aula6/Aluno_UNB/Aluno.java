package aula6.Aluno_UNB;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    String nome; // Nome do aluno
    int matricula; // Número de matrícula do aluno
    Map<Integer, String> disciplinas; // Mapa para armazenar disciplinas (chave) e professores (valor)

    // Construtor que inicializa o nome, matrícula e o mapa de disciplinas
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new HashMap<>(); // Inicializa o mapa de disciplinas
    }

    // Construtor padrão que inicializa apenas o mapa de disciplinas
    public Aluno() {
        this.disciplinas = new HashMap<>();
    }

    // Define o nome do aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o nome do aluno
    public String getNome() {
        return nome;
    }

    // Define a matrícula do aluno
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Retorna a matrícula do aluno
    public int getMatricula() {
        return matricula;
    }

    // Matricula o aluno em uma disciplina associando a disciplina a um professor
    public void matricular(int disciplina, String professor) {
        disciplinas.put(disciplina, professor); // Adiciona a disciplina e o professor ao mapa
    }

    // Retorna o mapa de disciplinas e professores do aluno
    public Map<Integer, String> getDisciplinas() {
        return disciplinas;
    }
    /*
     * Map: Uma interface que representa uma estrutura de dados que mapeia chaves a
     * valores. Cada chave pode ser associada a no máximo um valor.
     * 
     * HashMap: Uma implementação concreta da interface Map baseada em uma tabela de
     * hash. Ele permite a associação de chaves a valores, garantindo que as
     * operações de inserção, exclusão e busca sejam eficientes.
     */
}
