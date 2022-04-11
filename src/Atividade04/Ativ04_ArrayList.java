package Atividade04;
import java.util.ArrayList;
import java.util.Collections;

public class Ativ04_ArrayList {
    private ArrayList listaValores = new ArrayList();

    public Ativ04_ArrayList() {}
    
    public Ativ04_ArrayList(int[] valores) {
        ArrayList listaValores = new ArrayList();
        
        for (int cont = 0; cont < valores.length; cont++)
        {
            listaValores.add(valores[cont]);
        } 
        
        this.listaValores = listaValores;
    }
    
    public ArrayList getListaValores() {
        return listaValores;
    }

    public void setListaValores(ArrayList listaValores) {
        this.listaValores = listaValores;
    }
    
    public void setValorEmPosicaoListaValores(int index, int valor) {
        this.listaValores.add(index,valor);
    }
    
    public void ExibirValoresLista ()
    {
        int tamanhoLista;
        
        tamanhoLista = this.listaValores.size();
                
        for (int cont = 0; cont < tamanhoLista; cont++)
        {
            System.out.println("Posição: " + (cont + 1) + " - Valor: " + listaValores.get(cont));
        }
    }
    
    public void OrdemCrescente ()
    {
        Collections.sort(this.listaValores);
    }
    
    public void OrdemDecrescente ()
    {
        Collections.sort(this.listaValores, Collections.reverseOrder());
    }
    
}
