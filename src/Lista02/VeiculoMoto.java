package Lista02;
public class VeiculoMoto implements VeiculoIF {

    private boolean capaceteColocado;

    @Override
    public void ligar() {
        if(capaceteColocado == true) {
            System.out.println("**Ligando a moto...**");
        }else{
            System.out.println("----------------Favor colocar o capacete!!!---------");
        }
    }

    @Override
    public void desligar() {
        System.out.println("**Desligando a moto...**");
        // ...
    }

    @Override
    public void acelerar() {
        System.out.println("**Acelerando a moto...**");
        // ...
    }

    @Override
    public void frear() {
        System.out.println("**Freando a moto...**");
        // ...
    }

    public void colocarCapacete() {
        capaceteColocado = true;
        System.out.println("**Capacete colocado!**");
    }

    public void tirarCapacete() {
        capaceteColocado = false;
        System.out.println("**Capacete retirado!**");
    }

    public boolean isCapaceteColocado() {
        return capaceteColocado;
    }

}
