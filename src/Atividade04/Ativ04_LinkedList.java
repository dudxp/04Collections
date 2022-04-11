package Atividade04;

import java.util.LinkedList;
import java.util.Collections;

public class Ativ04_LinkedList {
    private LinkedList listaValores = new LinkedList();

    public Ativ04_LinkedList() {}
    
    public Ativ04_LinkedList(int[] valores) {
        LinkedList listaValores = new LinkedList();
        
        for (int cont = 0; cont < valores.length; cont++)
        {
            listaValores.add(valores[cont]);
        } 
        
        this.listaValores = listaValores;
    }
    
    public LinkedList getListaValores() {
        return listaValores;
    }

    public void setListaValores(LinkedList listaValores) {
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
