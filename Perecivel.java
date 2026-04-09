class Perecivel extends Produto{
    private String dataValidade;
    
    public Perecivel(String nome, float produto, int estoque, String dataValidade){
        super(nome, produto, estoque);
        this.dataValidade = dataValidade;
    }
    
    public void vender(int qtd){
        System.out.println("Verificando Validade...");
        
        System.out.println("Verificando validade...");
        
        if(qtd > 0 && qtd <= getEstoque()){
            setEstoque(getEstoque() - qtd);
            System.out.println("Item perecível vendido.");
        } else {
            System.out.println("Erro: estoque insuficiente ou quantidade inválida.");
        }
    }
    
}
