public class Main {
    public static void main(String[] args) {
        //Criar um objeto para repesentar um cachorro
        Cachorro dogBelga = new Cachorro();
        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;
        //Exibir os dados do objeto cachorro
        System.out.println(dogBelga.nome  + ", tem " + dogBelga.idade + " anos," +
                " pesa " + dogBelga.peso + "Kg e é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro
        Cachorro dogCaramelo = new Cachorro();
        //Atribuir outros valores
        dogCaramelo.nome = "Max";
        dogCaramelo.peso = 25;
        dogCaramelo.idade = 16;
        dogCaramelo.castrado = false;
        //Exibir os valores do outro objeto
        System.out.println(dogCaramelo.nome + ", tem " + dogCaramelo.idade + " anos, " +
                "pesa " + dogCaramelo.peso + "Kg e é castrado? " + dogCaramelo.castrado);
        //Chamar os métodos
        dogCaramelo.andar(); dogBelga.andar();
    }
}