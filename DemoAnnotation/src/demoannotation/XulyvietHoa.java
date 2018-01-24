/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoannotation;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adminis
 */
public class XulyvietHoa {

    public static void Chuhoa(Object o) {
        Class<?> oclass = o.getClass();
        Field[] fields = oclass.getDeclaredFields();
        for (Field f : fields) {
            ChuHoa chuhoa = f.getAnnotation(ChuHoa.class);
            if (chuhoa != null) {
                f.setAccessible(true);
                try {
                    String ten = (String) f.get(o);
                    if (chuhoa.vietHoa()) {
                        ten = ten.toUpperCase();
                    } else {
                      ten = ten.toLowerCase();  
                    }
                    f.set(o, ten);
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(XulyvietHoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                

            }
        }

    }
}
