
package clasepunto2;

public class Punto {
    // Datos miembro
    private
    int x, y;
    
    // Funciones miembro o métodos
    public
            Punto (){ // Constructor sin argumentos
                x = y = 0;
            }
            
            Punto (int x1, int y1){
                x = x1;
                y = y1;
            }
            
            // Setters permiten establecer valores a los datos miembro
            void SetX(int x1){
                x = x1;
            }
            void SetY(int y1){
                y = y1;
            }
            
            // Getters permiten el valor de los datos miembro
            int GetX (){
                return x;
            }
            
             int GetY (){
                return y;
            }
    
}
