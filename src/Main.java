import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[10];

        pessoas[0] = new Medico(
                "Nome Medico",
                "(43)99998989",
                "medico@teste.com",
                "123",
                "9897879"
        );

        pessoas[1]= new Paciente(
                "Paciente 1",
                "(43)38291830",
                "paciente@hotmail.com",
                "321",
                "Programa em PHP"
        );

        pessoas[2] = new Medico(
                "Medico Fera",
                "(43)99998989",
                "medico2@teste.com",
                "222",
                "9897879"
        );

        pessoas[3]= new Paciente(
                "Paciente 2",
                "(43)38291830",
                "paciente2@hotmail.com",
                "333",
                "Programa em PHP"
        );

        for(int i=0; i<4; i++){
            if(pessoas[i] instanceof Paciente){
                System.out.print("Eh um paciente ");
            }else if (pessoas[i] instanceof Medico){
                System.out.print("Eh um medico "+((Medico) pessoas[i]).getCrm());
            }
            System.out.println(
                    pessoas[i].validaLogin(
                            "paciente2@hotmail.com",
                            "333")
            );
        }

    }
}