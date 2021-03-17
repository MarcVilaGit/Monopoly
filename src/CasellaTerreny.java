public interface CasellaTerreny extends Casella {

    /**
     * @author: Marc Vila, Adria Sambi i Marc Estevez.
     *
     * #Descripció: Gestiona de ceselles generiques.
     */

    public int comprar( Jugador j );

    public int lloger();

    public int hipotecar();

    public int comprarCasa();

    public int comprarHotel();

    public boolean hasHipoteca();

    public int costDeshipotecacio();

    public void deshipotecar();

    public void agrupacio( boolean estat );

    public String agrupacio();

}
