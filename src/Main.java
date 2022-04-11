
import ClasseAtividades.*;
import Atividade04.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) 
    {
        ArrayList listaValores = new ArrayList();
        ClasseAtividades atividadesList = new ClasseAtividades();
        
        //Atividade 01:
        System.out.println("Atividade 01:");
        atividadesList = new ClasseAtividades(1,3,5,6,4);
        
        System.out.println("Lista de numeros: " + atividadesList.MontarStringLista());
        System.out.println();
        
        //Atividade 02:
        System.out.println("Atividade 02:");
        atividadesList = new ClasseAtividades("Eduardo","Thais","Matheus","Patricia","Eduarda");
        atividadesList.InverterValores();
        System.out.println("Lista de nomes invertida: " + atividadesList.MontarStringLista());
        System.out.println();
        
        //Atividade 03:
        System.out.println("Atividade 03:");
        atividadesList = new ClasseAtividades("Linkin Park","Outkast","Pink Floyd","Aerosmith","Red Hot Chilli Peppers");
        System.out.println("Lista de bandas: " + atividadesList.MontarStringLista());
        System.out.println("Removendo a banda: " + atividadesList.getValorPosicao(2));
        atividadesList.RemoverValorLista(2);
        System.out.println("Nova lista de bandas: " + atividadesList.MontarStringLista());
        System.out.println();
        
        //Atividade 04 (ArrayList):
        System.out.println("Atividade 04 (ArrayList):");
        int[] valores = {3,23,56,87,9,15,54,20,15,66,548,66,45};
        
        
        Ativ04_ArrayList ativ04_ArrayList = new Ativ04_ArrayList(valores);
        System.out.println("Lista padrão:");
        ativ04_ArrayList.ExibirValoresLista();
        
        ativ04_ArrayList.setValorEmPosicaoListaValores(9,500);
        
        System.out.println("Lista alterada:");
        ativ04_ArrayList.ExibirValoresLista();
        
        System.out.println("Lista Crescente:");
        ativ04_ArrayList.OrdemCrescente();
        ativ04_ArrayList.ExibirValoresLista();
        System.out.println("Lista Decrescente:");
        ativ04_ArrayList.OrdemDecrescente();
        ativ04_ArrayList.ExibirValoresLista();
        System.out.println();
        
        //Atividade 04 (LinkedList):
        System.out.println("Atividade 04 (LinkedList):");
        Ativ04_LinkedList ativ04_LinkedList = new Ativ04_LinkedList(valores);
        System.out.println("Lista padrão:");
        ativ04_LinkedList.ExibirValoresLista();
        
        ativ04_LinkedList.setValorEmPosicaoListaValores(9,500);
        
        System.out.println("Lista alterada:");
        ativ04_LinkedList.ExibirValoresLista();
        
        System.out.println("Lista Crescente:");
        ativ04_LinkedList.OrdemCrescente();
        ativ04_LinkedList.ExibirValoresLista();
        System.out.println("Lista Decrescente:");
        ativ04_LinkedList.OrdemDecrescente();
        ativ04_LinkedList.ExibirValoresLista();
        System.out.println();
    }
}
