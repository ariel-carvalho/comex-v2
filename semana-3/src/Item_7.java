public class Item_7
{
    public static void main(String[] args)
    {
        String nomeCliente1 = "Fulano";
        String nomeCliente2 = "Cicrano";

        int anoNascimentoCliente1 = 1980;
        int anoNascimentoCliente2 = 2000;

        int idadeCliente1 = 0;
        int idadeCliente2 = 0;

        String faixaEtariaCliente1;
        String faixaEtariaCliente2;

        System.out.println(">>> Listagem dos Clientes");
        System.out.println("________________________________________");

        System.out.println("Nome: " + nomeCliente1);
        System.out.println("Ano de Nascimento: " + anoNascimentoCliente1);
        idadeCliente1 = 2024 - anoNascimentoCliente1;
        System.out.println("Idade: " + idadeCliente1);

        if (idadeCliente1 >= 60)
        {
            System.out.println("Característica Etária: IDOSO");
        }
        else if (idadeCliente1 >= 30 && idadeCliente1 <= 59)
        {
            System.out.println("Característica Etária: ADULTO");
        }
        else if (idadeCliente1 >= 18 && idadeCliente1 <= 29)
        {
            System.out.println("Característica Etária: JOVEM");
        }
        else
        {
            System.out.println("Característica Etária: ADOLESCENTE");
        }
        System.out.println("________________________________________");

        System.out.println("Nome: " + nomeCliente2);
        System.out.println("Ano de Nascimento: " + anoNascimentoCliente2);
        idadeCliente2 = 2024 - anoNascimentoCliente2;
        System.out.println("Idade: " + idadeCliente2);

        if (idadeCliente2 >= 60)
        {
            System.out.println("Característica Etária: IDOSO");
        }
        else if (idadeCliente2 >= 30 && idadeCliente2 <= 59)
        {
            System.out.println("Característica Etária: ADULTO");
        }
        else if (idadeCliente2 >= 18 && idadeCliente2 <= 29)
        {
            System.out.println("Característica Etária: JOVEM");
        }
        else
        {
            System.out.println("Característica Etária: ADOLESCENTE");
        }
    }
}
