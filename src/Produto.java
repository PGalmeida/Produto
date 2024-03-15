public class Produto {
    public  int id, qtde;
    public String descricao;
    public float preco;
    public Produto(){

    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x;
    }
    public void vender(int x){
        if(this.qtde - x >= 0){
            this.qtde -= x;
        }else {
            System.out.println("Estoque insuficiente.");
        }
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        if(this.preco - x >= 0){
            this.preco -= x;
        }else{
            System.out.println("O preço não pode ser negativo.");
        }
    }
    public void mostrar(){
        System.out.println("\nId: "+this.id);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Quantidade: "+this.qtde);
        System.out.println("Preço: R$"+this.preco);
    }
}
