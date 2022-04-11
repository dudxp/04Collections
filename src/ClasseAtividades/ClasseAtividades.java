package ClasseAtividades;
import java.util.ArrayList;
import java.util.List;

public class ClasseAtividades {
    private List listaValores = new ArrayList();
    
    public ClasseAtividades(){}
    
    public ClasseAtividades(int valor1,int valor2,int valor3,int valor4,int valor5)
    {
        List listaValores = new ArrayList();
        listaValores.add(valor1);
        listaValores.add(valor2);
        listaValores.add(valor3);
        listaValores.add(valor4);
        listaValores.add(valor5);
        this.listaValores = listaValores;
    }
    
    public ClasseAtividades(String nome1,String nome2,String nome3,String nome4,String nome5)
    {
        List listaValores = new ArrayList();
        listaValores.add(nome1);
        listaValores.add(nome2);
        listaValores.add(nome3);
        listaValores.add(nome4);
        listaValores.add(nome5);
        this.listaValores = listaValores;
    }
    
    public List getListaValores() {
        return listaValores;
    }
    
    public String getValorPosicao(int index) {
        return this.listaValores.get(index).toString();
    }

    public void setListaValores(List listaValores) {
        this.listaValores = listaValores;
    }
    public void Teste()
    {
        System.out.println(this.listaValores);
    }
    
    public String MontarStringLista()
    {
        StringBuilder stringLista = new StringBuilder();
                
        for (int cont = 0; cont < listaValores.size(); cont++)
        {
            stringLista.append(listaValores.get(cont) + ", ");
        }
        
        stringLista = stringLista.deleteCharAt(stringLista.length() - 2);
        
        return stringLista.toString();
    }

    public void InverterValores()
    {
        int contInvertido = 0;
        List listaInvertida = new ArrayList();
        
        contInvertido = (listaValores.size() - 1);
        
        for (int cont = 0; cont < listaValores.size(); cont++)
        {
            listaInvertida.add(cont,listaValores.get(contInvertido));
            contInvertido--;
        }
        
        this.listaValores = listaInvertida;
    }
    
    public void RemoverValorLista(int index) 
    {
        this.listaValores.remove(index);
    }
}
