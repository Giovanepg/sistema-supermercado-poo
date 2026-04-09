class Produto {
    private String nome;
    private float preco;
    private int estoque;
    
    public Produto(String nome, float preco, int estoque){
        this.nome = nome;
        setPreco(preco);
        setEstoque(estoque);
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getPreco(){
        return preco;
    }
     
    public int getEstoque(){
        return estoque;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(float preco){
        if (preco >= 0){
           this.preco = preco; 
        } else{
            System.out.println("Erro. Preco nao pode ser negativo...");
            this.preco = preco;
        }
    }
    
    public void setEstoque(int estoque){
        if (estoque >= 0){
            this.estoque = estoque;
        } else{
            System.out.println("Erro. Estoque nao pode ser negativo");
        this.estoque = estoque;
        }
    }
    
     public void adicionarEstoque(int qtd) {
        if(qtd > 0){
            this.estoque += qtd;
        } else {
            System.out.println("Erro: quantidade inválida.");
        }
    }
    
    public void vender(int qtd){
        if(qtd > 0 && qtd <= estoque){
            this.estoque -= qtd;
            System.out.println("Vendido: " + qtd + " unidades.");
        } else {
            System.out.println("Erro: estoque insuficiente ou quantidade inválida.");
        }
    }
    
}