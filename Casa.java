public class Casa {
    
    //Ubicaci�n de la casa.
    private String ubicacion;
    //Tama�o de la casa.
    private int tamano;
    //Casa de planta Baja.
    private boolean plantaBaja;

    public Casa (int metrosCuadrados, boolean bajo) {
        ubicacion = "Villabalter";
        tamano = metrosCuadrados;
        plantaBaja = bajo;
    }

    /**
     * M�todo que devuelve la ubicai�n.
     */
    public String getUbicacion(){
        return ubicacion;
    }
    
    /**
     * M�todo que devuelve el tama�o.
     */
    public int getTamano(){
    return tamano;
    }

    /**
     * M�todo que indica si la casa es de planta baja.
     */
    public boolean getPlantaBaja(){
        return plantaBaja;
    }
    
    /**
     * Nos permite cambiar la ubicaci�n de la casa.
     */
    public void setUbicacion(String ubicacionCorrecta) {
        ubicacion = ubicacionCorrecta;
    }
    
    /**
     * Devuelve el nuevo tama�o de la casa.
     */
    public int ampliarTamano(int tamanoAmpliacion) {
        int ampliarTamano = tamano + tamanoAmpliacion;
        return ampliarTamano;
    }
        
    /**
     * Alterna el valor del m�todo boolean.
     */
    public void getAlternarPlantaBaja() {
        if (plantaBaja == true) {
            plantaBaja = false;
        }
        else {
            plantaBaja = true;
        }
    }
    
    /**
     * Imprime los detalles de la clase.
     */
    public void imprimirDetalles() {
        System.out.println("Ubicaci�n: " + ubicacion + ", Tama�o: " + tamano + " metros cuadrados, Planta baja: " + plantaBaja);
    }
    
    /**
     * Devuelve los detalles de la clase.
     */
    public String getDetallesCasa() {
        String devolver = "";
        devolver = devolver + "Ubicaci�n: " + ubicacion + ", Tama�o: " + tamano + " metros cuadrados, Planta baja: " + plantaBaja;   
        return devolver;
    }
}