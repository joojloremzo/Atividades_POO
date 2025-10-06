/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_10;

/**
 *
 * @author zobol
 */
public abstract class Figura {
    private TipoFigura tipoFigura;
    public abstract double calcularArea();

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(TipoFigura tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
}
