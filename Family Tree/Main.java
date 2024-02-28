import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> importante = new ArrayList<Pessoa>();

        // casal principal

        Pessoa geraldo = new Pessoa("Geraldo", 81);
        Pessoa maria = new Pessoa("Maria", 79);

        // aline filha do geraldo

        Pessoa paulo = new Pessoa("Paulo", 38);
        Pessoa aline = new Pessoa("Aline", 35);

        // filhos da aline

        Pessoa pamela = new Pessoa("Pamela",16);
        Pessoa enzo = new Pessoa("Enzo", 12);
        Pessoa olivia = new Pessoa("Olivia", 6);

        // pedro filho do geraldo

        Pessoa pedro = new Pessoa("Pedro", 42);
        Pessoa karla = new Pessoa("Karla", 43);

        // filhos do pedro

        Pessoa leonardo = new Pessoa("Leonardo", 17);
        Pessoa daiane = new Pessoa("Daiana",6);

        // add informações do geraldo
        importante.add(geraldo);
        geraldo.addConjuge(maria);
        geraldo.addFilho(aline);
        geraldo.addFilho(pedro);

        // add informações da aline
        importante.add(aline);
        aline.addConjuge(paulo);
        aline.addFilho(pamela);
        aline.addFilho(enzo);
        aline.addFilho(olivia);

        // add informações do pedro
        importante.add(pedro);
        pedro.addConjuge(karla);
        pedro.addFilho(leonardo);
        pedro.addFilho(daiane);

        for(int i = 0; i < importante.size(); i++) {

            System.out.printf("%s [%d anos] - Conjuge: %s [%d anos]\n", importante.get(i).getNome(), importante.get(i).getIdade(),
                    importante.get(i).getConjuge().getNome(), importante.get(i).getConjuge().getIdade());

            System.out.print("Filhos: ");

            for(int j = 0; j < importante.get(i).filhos.size(); j++) {

                System.out.printf("%s [%d anos] ", importante.get(i).filhos.get(j).getNome(), importante.get(i).filhos.get(j).getIdade());

            }
            System.out.println("\n");
        }

    }

}
