package cadastros;

import java.util.HashMap;
import java.util.Map;

public class CRUD<T> {
    private Map<String, T> itens;

    public CRUD() {
        this.itens = new HashMap<>();
    }

    public void adicionar(String matricula, T item) {
        itens.put(matricula, item);
    }

    public T pesquisar(String matricula) {
        return itens.get(matricula);
    }

    public boolean remover(String matricula) {
        return itens.remove(matricula) != null;
    }

    public boolean atualizar(String matricula, T novoItem) {
        if (itens.containsKey(matricula)) {
            itens.put(matricula, novoItem);
            return true;
        }
        return false;
    }

    public int contar() {
        return itens.size();
    }
}
