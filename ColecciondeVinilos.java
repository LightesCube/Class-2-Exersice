public class ColecciondeVinilos {
    public static void main(String[] args) {
        initialize();
    }
    public  static void  initialize(){
        String [][] vinilos= new String[100][3];
        agregarVinilo(vinilos,"Ofnir","Heilung","undefined");
        agregarVinilo(vinilos,"Back in black","ACDC","1980");
        agregarVinilo(vinilos,"Kill em' all","Metallica","undefined");
        encontrarVinilo(vinilos,"Heilung");
        encontrarVinilo(vinilos,"Chayanne");

        int cantidadVinilos=contadorVinilo(vinilos);
        System.out.println("Hay: "+cantidadVinilos+" vinilos en la coleccion");
        int espaciosDisponibles=espaciosDisponibles(vinilos);
        System.out.println("Hay: "+espaciosDisponibles+" espacios disponibles");
    }
    public static boolean agregarVinilo(String [][] vinilos, String nombreAlbum, String nombreBanda, String lanzamiento){
        for (int i=0; i< vinilos.length;i++){

            if(vinilos[i][0]==null){
                vinilos[i][0]=nombreBanda;
                vinilos[i][1]=nombreAlbum;
                vinilos[i][2]=lanzamiento;
                System.out.println( vinilos[i][0]+" "+ vinilos[i][1]+" "+vinilos[i][2]);
                return true;
            }
        }
        return false;
    }
    public static boolean encontrarVinilo(String [][] vinilos,String nombreBanda ){
        for(int i=0;i<vinilos.length;i++){
            if(vinilos[i][0]==nombreBanda){
                System.out.println("La banda/artista : "+nombreBanda+" si esta en la coleccion");
                return true;
            }
        }
        System.out.println("Su banda/artista no esta en la coleccion");
        return false;
    }
    public static int contadorVinilo(String [][] vinilos){
        int contador=0;
        for (int i=0;i<vinilos.length;i++){
            if(vinilos[i][0] !=null){
                contador++;
            }
        }
        return contador;
    }
    public static int espaciosDisponibles(String [][] vinilos){
        int contador=0;
        for (int i=0;i<vinilos.length;i++){
            if(vinilos[i][0] ==null){
                contador++;
            }
        }
        return contador;
    }
}
