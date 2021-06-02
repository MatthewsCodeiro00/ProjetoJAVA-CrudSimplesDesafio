package crudprodutodesaffio;
import java.util.ArrayList;
import java.util.Scanner;


public class Produto {
    private String nome;
    private String descricao;
    private int quantidade;
    private String marca;
    public int opc;
    public int n;
    public String buscar;
    public int operador;
    public char esc;
    
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);

    // M É T O D O S   E S P E C I A I S 
    
    public char getEsc() {
        return esc;
    }

    public void setEsc(char esc) {
        this.esc = esc;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
    
    // M   É   T   O   D   O   S
    
    //Método construtor
    public Produto() {
    }
    
    public void MENU(){
            System.out.println("\n----M  E  N  U----");
            System.out.println("1 - CADASTRAR PRODUTO");
            System.out.println("2 - ALTERAR PRODUTO");
            System.out.println("3 - DELETAR PRODUTO");
            System.out.println("4 - LISTAR TODOS OS PRODUTOS");
            System.out.println("5 - BUSCAR PRODUTO POR NOME");
            System.out.println("6 - RETIRAR PRODUTO");
            System.out.println("7 - REPOR PRODUTO");
            System.out.println("8 - FECHAR O SISTEMA");
            System.out.print("-->");
            this.opc = input.nextInt();
    }
    
    public void CadastrarProduto(){
            System.out.println("\nNOME:");
            this.setNome(sc.nextLine());
            System.out.println("DESCRICAO:");
            this.setDescricao(sc.nextLine());
            System.out.println("MARCA:");
            this.setMarca(sc.nextLine());
            System.out.println("QUANTIDADE");
            this.setQuantidade(input.nextInt());
            System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
    }
    
    public void AlterarProduto(ArrayList<Produto> prod){
        System.out.println("\nID DO CADASTRO A SER ALTERADO");
        System.out.print("->");
        this.n = input.nextInt();

        for(Produto produto : prod){
            if(n == prod.indexOf(produto)){
                prod.set(n, produto);
                produto.CadastrarProduto();
                System.out.println("PRODUTO ALTERADO COM SUCESSO!");
            }
        }
    }
    
    public void Subtrair(ArrayList<Produto> prod){
        System.out.println("ID DO PRODUTO:");
        System.out.print("->");
        this.n = input.nextInt();
        
        for(Produto produto : prod){
            if(this.n == prod.indexOf(produto)){
                System.out.println("QUANTIDADE A SER RETIRADA");
                System.out.print("->");
                this.operador = input.nextInt();
                produto.quantidade = produto.quantidade - operador;
                System.out.println("\nRETIRADA REALIZADA COM SUCESSO!");
            }
        }
    }
    
    public void Somar(ArrayList<Produto> prod){
        System.out.println("ID DO PRODUTO:");
        System.out.print("->");
        this.n = input.nextInt();
        
        for(Produto produto : prod){
            if(this.n == prod.indexOf(produto)){
                System.out.println("QUANTIDADE A SER REPOSTA");
                System.out.print("->");
                this.operador = input.nextInt();
                produto.quantidade = produto.quantidade + operador;
                System.out.println("\nREPOSICAO REALIZADA COM SUCESSO!");
            }
        }
    }
    
    public void DeletarProduto(ArrayList<Produto> prod){
        System.out.println("ID DO PRODUTO A SER DELETADO");
        System.out.print("->");
        this.n = input.nextInt();
       
        for(Produto produto : prod){
            if(this.n == prod.indexOf(produto)){
                
            } else {
                System.out.println("\nDEPOIS DE EXCLUIDO OS DADOS SERAO DESTRUIDOS IRREVERSIVELMENTE.\n"
                        + "TEM CERTEZA QUE QUER EXCLUIR ESTE ITEM?\n"
                        + "[ s - n ]");
                System.out.print("->");
                this.esc = sc.next().charAt(0);
                
                if(this.esc == 's' || this.esc == 'S'){
                    prod.remove(this.n);
                    System.out.println("\nCADASTRO DELETADO COM SUCESSO!");
                }
            }
            break;
        }
    }
    
    public void Listar(ArrayList<Produto> prod){
        for(Produto produto : prod){
                System.out.println("\n~~PRODUTO BUSCADO~~");
                System.out.println("ID: " + prod.indexOf(produto));
                System.out.println("NOME: " + produto.nome);
                System.out.println("DESCRICAO: " + produto.descricao);
                System.out.println("MARCA: " + produto.marca);
                System.out.println("QUANTIDADE: " + produto.quantidade);
                System.out.println("LISTAGEM REALIZADA COM SUCESSO!");
        }
    }
    
    public void BuscarPorNome(ArrayList<Produto> prod){
    
        System.out.println("\nNOME DO PRODUTO:");
        this.buscar = sc.nextLine();
        
        for(Produto produto : prod){
            if(this.buscar.equalsIgnoreCase(produto.nome)){
                System.out.println("\n~~PRODUTO BUSCADO~~");
                System.out.println("ID: " + prod.indexOf(produto));
                System.out.println("NOME: " + produto.nome);
                System.out.println("DESCRICAO: " + produto.descricao);
                System.out.println("MARCA: " + produto.marca);
                System.out.println("QUANTIDADE: " + produto.quantidade);
                System.out.println("\nBUSCA REALIZADA COM SUCESSO!");
            }
        }
    }
}
