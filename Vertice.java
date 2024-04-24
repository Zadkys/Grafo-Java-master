import java.util.ArrayList;

public class Vertice
{
 
    private ArrayList<Arista> vecindad;
    private String etiqueta;

    public Vertice (String etiqueta)
    {
	this.etiqueta = etiqueta;
	this.vecindad = new ArrayList<Arista>();
    }

    /**
     * @param arista. Objeto a añadir
     */
    public void insertarVecino(Arista arista)
    {
	if( !this.vecindad.contains(arista))
	    this.vecindad.add(arista);
    }

    /**
     * @param arista. Objeto a evaluar
     * @return true. Si y solo si el objeto esta contenido en el array de lista vecindad
     */
    public boolean contieneUnVecino(Arista arista)
    {
	return this.vecindad.contains(arista);
    }

    /**
     * @param indice. Indica la posicion a extraer
     * @return Arista. La arista apuntada por el índice en el array de lista vecindad
     */
    public Arista getVecino(int indice)
    {
	return this.vecindad.get(indice);
    }

    /**
     * @param indice. Indica la posicion a eliminar
     * @return Arista. La Arista que ha sido eliminada del array de lista vecindad
     */
    public Arista eliminarVecino(int indice)
    {
	return this.vecindad.remove(indice);
    }


    /**
     * @param arista. indice el objeto Arista a eliminar
     */
    public void eliminarVecino(Arista arista)
    {
	this.vecindad.remove(arista);
    }

    /**
     * @return int. Se devuelve el número de aristas incidentes (o vecinos) 
     */
    public int getContarVecinos()
    {
	return this.vecindad.size();
    }

    /**
     * @return String. Devuelve el valor de la cadena etiqueta
     */
    public String getEtiqueta()
    {
	return this.etiqueta;
    }

    /**
     * @param vertice2. Objeto que comparamos con el vertice para 
     * @return true. Efectivamente son el mismo objeto
     */
    public boolean equals(Object vertice2)
    {
	if( !(vertice2 instanceof Vertice))
	    return false;

	Vertice v = (Vertice) vertice2;
	return this.etiqueta.equals(v.etiqueta);
    }

    /**
     * @return String. Representación del vértice en una cadena
     */
    public String toString()
    {
	return "Vertice: " + this.etiqueta;
    }


    /**
     * @return int. Código hash para este vértice
     **/
    public int hashCode()
    {
	return this.getEtiqueta().hashCode();
    }
    
    /**
     * @return ArrayList<Arista>. Copia del array de lista vecindad
     */ 
    public ArrayList<Arista> getVecinos()
    {
	return new ArrayList<Arista>(this.vecindad);
    }
}
