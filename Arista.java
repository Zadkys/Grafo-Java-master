
public class Arista implements Comparable<Arista>
{
    private Vertice vertice1, vertice2;
    private int peso;

    /**
     * Constructor de un objeto Arista uniforme
     * @param vertice1. Extremo o vértice de la arista
     * @param vertice2. Segundo extremo o vértice para formar la arista
     **/
    public Arista(Vertice vertice1, Vertice vertice2)
    {
	this(vertice1, vertice2, 1);
    }

    /**
     * @param vertice1. Extremo o vértice de la arista
     * @param vertice2. Segundo vértice para formar la arista
     * @param peso. Define el coste de ir desde el vertice1 al vertice2 y viceversa(arista no dirigida)
     **/
    public Arista(Vertice vertice1, Vertice vertice2, int peso)
    {
	if(vertice1.getEtiqueta().compareTo(vertice2.getEtiqueta()) <= 0)
	    {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	    }
	else
	    {
		this.vertice1 = vertice2;
		this.vertice2 = vertice1;
	    }

     	this.peso = peso;
		
    }


    /** 
     * @param actual
     * @return el vecino adyecente mediante este objeto Arista
     **/
    public Vertice getVecinoDe(Vertice actual)
    {
	if (actual.equals(this.vertice1))
	    return this.vertice2;
	else if( actual.equals(this.vertice2))
	    return this.vertice1;
	else
	    return null;
    }

    /**
     * @return el contenido del atributo vertice1 de tipo Vertice
     **/
    public Vertice getVertice1()
    {
	return this.vertice1;
    }
    
    /**
     * @return el contenido del atributo vertice2 de tipo Vertice
     **/
    public Vertice getVertice2()
    {
	return this.vertice2;
    }

    /**
     * @return el valor de tipo entero del atributo peso
     **/
    public int getPeso()
    {
	return this.peso;
    }

    /**
     * Modificador del atributo peso
     * 
     * @param peso. Nuevo coste de la arista
     **/
    public void setPeso(int peso)
    {
	this.peso = peso;
    }

    /**
     * @param arista2. Arista con la que comparamos nuestra arista actual
     * @return int. Se devuelve 0 en caso de que ambas tengan el mismo peso
     **/
    public int compareTo(Arista arista2)
    {
	return this.peso - arista2.peso;
    }

    /**
     * @return String. Representación mediante una cadena de este objeto Arista
     **/
    public String toString()
    {
	return "({" + this.vertice1 + ", " + this.vertice2  + "}, "+ this.peso  +")";
    }


    /**
     * @return int. Código hash para esta arista
     **/
    public int hashCode()
    {
	return (vertice1.getEtiqueta() + vertice2.getEtiqueta()).hashCode();
    }
    
    /**
     * @param objeto. Se comprueba si es de tipo Arista. Y si lo es, se compara e identifica.
     * @return true. Si y solo si ambos objetos son idénticos(extremos iguales).
     **/
    public boolean equals(Arista objeto)
    {
	if(!(objeto instanceof Arista))
	    return false;

	Arista arista2 = (Arista) objeto;

	if(arista2.vertice1.equals(this.vertice1) && arista2.vertice2.equals(this.vertice2))
	    return true;

	return false;
    }
}
