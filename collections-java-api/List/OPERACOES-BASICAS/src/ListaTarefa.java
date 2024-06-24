import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //cria lista que armazena os items que serão removidos caso tenha mais de um
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        //percorre a tarefaList para verificar quais items possuem a descrição informada
        //e os insere na lista de items que serão removidos caso possuam descrição compativel.
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //Remove a lista de items que devem ser removidos.  
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
   
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");
        System.out.println("O número de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        // listaTarefa.removerTarefa("Tarefa2");
        System.out.println("O número de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();
    }

    


}
