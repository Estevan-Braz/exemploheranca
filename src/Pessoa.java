public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(){
       this("","","","");
    }
    public Pessoa(String nome, String telefone, String email, String senha){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public String validaLogin(String email, String senha){
        if(this.getEmail().equals(email) && this.getSenha().equals(senha)){
            return "Pessoa "+this.getNome()+" encontrado ";
        }else{
            return "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
