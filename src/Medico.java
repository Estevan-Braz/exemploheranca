public class Medico extends Pessoa{
    private String crm;

    public Medico(){
        this("","","","","");
    }

    public Medico(String nome,
                  String telefone,
                  String email,
                  String senha,
                  String crm ){
        super(nome, telefone, email, senha);
        this.setCrm(crm);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String validaLogin(String crm, String senha){
        if(this.getCrm().equals(crm) && this.getSenha().equals(senha)){
            return "Medico "+this.getNome()+" encontrado ";
        }else{
            return "";
        }
    }

    @Override
    public String toString() {
        return "Medico{" +
                super.toString() +
                "crm='" + crm + '\'' +
                '}';
    }
}
