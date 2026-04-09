class ProdutoImportado extends Produto{
    private float taxaImportacao;
    
    public ProdutoImportado(String nome, float preco, int estoque, float taxaImportacao){
        super(nome, preco, estoque);
        this.taxaImportacao = taxaImportacao;
    }
    
    public float getTaxaImportacao(){
        return taxaImportacao;
    }
    
    public void setTaxaImportacao(float taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }
    
    public void vender(int qtd){
        if(qtd > 0 && qtd <= getEstoque()){
            
            float precoFinal = getPreco() + taxaImportacao;
            float total = precoFinal * qtd;
        } else{
            System.out.println("Erro: estoque insuficiente ou quantidade invalida...");
        }
    }
}
