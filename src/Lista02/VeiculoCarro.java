package Lista02;
public class VeiculoCarro implements VeiculoIF {

    private boolean portasAbertas;

    @Override
    public void ligar() {
        if(portasAbertas==true){
            System.out.println("-----Favor ligar o carro após fechar as portas!-----");
        }else {
            System.out.println("**Ligando o carro...**");
        }
    }

    @Override
    public void desligar() {
        System.out.println("**Desligando o carro...**");
        // ...
    }

    @Override
    public void acelerar() {
        System.out.println("**Acelerando o carro...**");
        // ...
    }

    @Override
    public void frear() {
        System.out.println("**Freando o carro...**");
        // ...
    }

    public void abrirPortas() {
        portasAbertas = true;
        System.out.println("**Portas abertas!**");
    }

    public void fecharPortas() {
        portasAbertas = false;
        System.out.println("**Portas fechadas!**");
    }

    public boolean isPortasAbertas() {
        return portasAbertas;
    }

}
