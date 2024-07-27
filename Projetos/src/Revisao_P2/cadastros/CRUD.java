package cadastros;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import app.Aluno;
import app.Professor;

public class CRUD<T> {
    private Map<String, T> itens;

    public CRUD() {
        this.itens = new HashMap<>();
    }

    public void adicionar(String chave, T item) {
        itens.put(chave, item);
    }

    public T pesquisar(String chave) {
        return itens.get(chave);
    }

    public boolean remover(String chave) {
        return itens.remove(chave) != null;
    }

    public boolean atualizar(String chave, T novoItem) {
        if (itens.containsKey(chave)) {
            itens.put(chave, novoItem);
            return true;
        }
        return false;
    }

    public void listarTODOS() {
        for (T item : itens.values()) {
            if (item instanceof Aluno) {
                Aluno aluno = (Aluno) item;
                JOptionPane.showMessageDialog(null, aluno.getNome() + "-" + aluno.getMatricula());
            }
            if (item instanceof Professor) {
                Professor professor = (Professor) item;
                JOptionPane.showMessageDialog(null, professor.getNome() + "-" + professor.getMatriculaFUB());
            }
        }
    }
}
