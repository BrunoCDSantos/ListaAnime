package Erro;

/**
 *
 * @author bruno
 */
public class Erros {

    public Erros(String descricaoErro) {
     this.descricaoErro = descricaoErro;
    }
     private String descricaoErro;
    private String link;

    public String getDescricaoErro() {
	return descricaoErro;
    }

    public void setDescricaoErro(String descricaoErro) {
	this.descricaoErro = descricaoErro;
    }

    public String getLink() {
	return link;
    }

    public void setLink(String link) {
	this.link = link;
    }
    public String getErro(){
      return this.descricaoErro;
    }
    public void setErro(String erro){
      this.descricaoErro = erro;
    }
 
}
