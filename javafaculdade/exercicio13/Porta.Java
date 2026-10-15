Class Porta implements Macaneta{
    private float peso;
    private String cor;
    private Boolean estado=null;
    
    public Porta(float peso, String cor){
        this.estado=false;
        this.cor=cor;
        this.peso=peso;


    }
    
    public void abirPorta(){
        System.out.println(" a porta esta aberta");
        this.estado=true;
    }
    public void fecharPorta(){
        System.out.println(" a porta esta fechada");
        this.estado=false;

    }
    public void trancarPorta(){
        if(estado){
        System.out.println(" a porta esta trancada");}
        else{
            System.out.println("Por favor feche a porta antes");
        }
    }
}
public Class Main{
    public static void main(String[] args){
        Porta porta1=new Porta(10,"marrom");

    }
}