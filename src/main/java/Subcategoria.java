public class Subcategoria {
    private String descricao;
    private Categoria categoriaPai;

    public Subcategoria(String descricao, Categoria categoriaPai) {
        this.descricao = descricao;
        this.categoriaPai = categoriaPai;
    }
}