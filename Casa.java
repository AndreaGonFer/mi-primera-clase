public class Casa {
    
    //Ubicación de la casa.
    private String ubicacion;
    //Tamaño de la casa.
    private int tamano;
    //Casa de planta Baja.
    private boolean plantaBaja;

    public Casa (int metrosCuadrados, boolean bajo) {
        ubicacion = "Villabalter";
        tamano = metrosCuadrados;
        plantaBaja = bajo;
    }

    /**
     * Método que devuelve la ubicaión.
     */
    public String getUbicacion(){
        return ubicacion;
    }
    
    /**
     * Método que devuelve el tamaño.
     */
    public int getTamano(){
    return tamano;
    }

    /**
     * Método que indica si la casa es de planta baja.
     */
    public boolean getPlantaBaja(){
        return plantaBaja;
    }
    
    /**
     * Nos permite cambiar la ubicación de la casa.
     */
    public void setUbicacion(String ubicacionCorrecta) {
        ubicacion = ubicacionCorrecta;
    }
    
    /**
     * Devuelve el nuevo tamaño de la casa.
     */
    public int ampliarTamano(int tamanoAmpliacion) {
        int ampliarTamano = tamano + tamanoAmpliacion;
        return ampliarTamano;
    }
        
    /**
     * Alterna el valor del método boolean.
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
        System.out.println("Ubicación: " + ubicacion + ", Tamaño: " + tamano + " metros cuadrados, Planta baja: " + plantaBaja);
    }
    
    /**
     * Devuelve los detalles de la clase.
     */
    public String getDetallesCasa() {
        String devolver = "";
        devolver = devolver + "Ubicación: " + ubicacion + ", Tamaño: " + tamano + " metros cuadrados, Planta baja: " + plantaBaja;   
        return devolver;
    }
}