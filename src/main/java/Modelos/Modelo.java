
package Modelos;

public class Modelo {
    private String tipo;
    private String fecha;
    private String tipoVehiculo;
    private double costo;
    private String registros[][];

    public String[][] getRegistros() {
        return registros;
    }

    public void setRegistros(String[][] registros) {
        this.registros = registros;
    }
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
     public void costoTotal(){
         if(this.tipo.equals("Lavado-Basico")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=64900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=76900;
             }   
         }else if(this.tipo.equals("Lavado-Especial")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=82900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=98900;
             }   
         }else if(this.tipo.equals("Desinfeccion-Basica")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=62900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=78900;
             }   
         }else if(this.tipo.equals("Desinfeccion-Avanzada")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=69900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=79900;
             }   
         }else if(this.tipo.equals("Combo-1")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=60900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=70900;
             }   
         }else if(this.tipo.equals("Combo-2")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=70900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=80900;
             }   
         }else if(this.tipo.equals("Combo-3")){
             if(this.tipoVehiculo.equals("Automovil")){
                 costo=90900;
             }else if(this.tipoVehiculo.equals("Camioneta")){
                 costo=100900;
             }   
         }
     }
     
     public String ImpCosto(){    
        return "$ "+this.costo;
         
     }
     public String ImpConsultaFun(String nomF){
         String info="";
         for(int i=0;i<registros.length;i++){
             if(registros[i][0].equals(nomF)){
                 String ser=registros[i][3];
                 String fec=registros[i][2];
                 String cos=registros[i][4];
                 info+="Servicio: "+ser+" Fecha: "+fec+" Costo: "+cos+"\n";
             }
         }
         return info;
     }
     public String ImpConsultaSer(String ser){
         String info="";
         for(int i=0;i<registros.length;i++){
             if(registros[i][3].equals(ser)){
                 String nom=registros[i][0];
                 String fec=registros[i][2];
                 String cos=registros[i][4];
                 info+="Funcionario: "+nom+" Fecha: "+fec+" Costo: "+cos+"\n";
             }
         }
         return info;
     }
     
     public String ImpConsultafech(String fech){
         String info="";
         for(int i=0;i<registros.length;i++){
             if(registros[i][2].equals(fech)){
                 String ser=registros[i][3];
                 String nom=registros[i][0];
                 String cos=registros[i][4];
                 info+="Funcionario: "+nom+" Servicio: "+ser+" Costo: "+cos+"\n";
             }
         }
         return info;
     }
}
