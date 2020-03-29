package erro;

public class FahrenheitException extends Exception{
    private final double tempF;
    
    public FahrenheitException(double valorF){
        super();
        this.tempF = valorF;
    }

    @Override
    public String toString() {
        return "O valor para a temperatura em °F não pode ser menor que -459,78\nO valor informado foi " +this.tempF+";";
    }
    
    @Override
    public String getMessage(){
        return "O valor para a temperatura em °F não pode ser menor que -459,78\nO valor informado foi " +this.tempF+";";
    }
}
