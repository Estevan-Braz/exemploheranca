public class Paciente extends Pessoa{
    private String doenca;

    public Paciente(){
        this("","","","","");
    }

    public String validaLogin(String email, String senha){
        if(this.getEmail().equals(email) && this.getSenha().equals(senha)){
            return "Paciente "+this.getNome()+" encontrado ";
        }else{
            return "";
        }
    }
    public Paciente(String nome, String telefone, String email, String senha, String doenca){
        super(nome, telefone, email, senha);
        this.setDoenca(doenca);
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                super.toString() +
                "doenca='" + doenca + '\'' +
                '}';
    }
}
