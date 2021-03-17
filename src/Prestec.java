public interface Prestec {

    /**
     * @author: Marc Vila, Adria Sam. i Marc Estevez.
     *
     * #Descripció: Gestiona els presetenc
     */

    public void crearPrestec( Jugador prestamista, int quantitat, int torns, int interssos );

    public boolean actualitzatTorns();

    public int pagarPresetec();
}
