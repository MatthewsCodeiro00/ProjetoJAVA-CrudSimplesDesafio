package crudprodutodesaffio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CrudProdutoDesaffio {

    public static void main(String[] args) {

        boolean execute = true;

        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        List<Produto> array;
        array = new ArrayList();

        Produto pro;
        pro = new Produto();
        
        while(execute){
            pro.MENU();
            switch(pro.opc){
                case 1:
                    pro = new Produto();
                    pro.CadastrarProduto();
                    array.add(pro);
                    break;
                case 2:
                    if(array.isEmpty()){
                        System.out.println("\nNÃO EXISTEM CADASTROS");
                    }else{
                        pro.AlterarProduto((ArrayList<Produto>) array);
                    }
                    break;
                case 3:
                    if(array.isEmpty()){
                        System.out.println("\nNÃO EXISTEM CADASTROS");
                    }else{
                        pro.DeletarProduto((ArrayList<Produto>) array);
                    }
                    break;
                case 4:
                    if(array.isEmpty()){
                        System.out.println("\nNÃO EXISTEM CADASTROS");
                    }else{
                        pro.Listar((ArrayList<Produto>) array);
                    }
                    break;
                case 5:
                    if(array.isEmpty()){
                        System.out.println("\nNÂO EXISTEM CADASTROS");
                    }else{
                        pro.BuscarPorNome((ArrayList<Produto>) array);
                    }
                    break;
                case 6:
                    if(array.isEmpty()){
                        System.out.println("\nNÃO EXISTEM CADASTROS");
                    }else{
                        pro.Subtrair((ArrayList<Produto>) array);
                    }
                    break;
                case 7:
                    if(array.isEmpty()){
                        System.out.println("\nNÃO EXISTEM CADASTROS");
                    }else{
                        pro.Somar((ArrayList<Produto>) array);
                    }
                    break;
                case 8:
                    execute = false;
                    break;
                default:
                    System.out.println("\nYOUR MOMMA IS A HOE");
                    break;
            }
        }
    }
}
