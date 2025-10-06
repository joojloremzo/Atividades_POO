/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_05;

/**
 *
 * @author zobol
 */
public class Ponto {
    
    int x;
    int y;
    
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public Quadrante identificarQuadrante() {
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        }
        if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        }
        if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        }
        if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }
        return Quadrante.NENHUM;
    }
    
    public boolean estaIncidindoSobreX() {
        if (x == 0) {
            return true;
        }
        return false;
    }
    
    public boolean estaIncidindoSobreY() {
        if (y == 0) {
            return true;
        }
        return false;
    }
    
    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public static double calcularDistancia(Ponto p1, Ponto p2) {        
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}
