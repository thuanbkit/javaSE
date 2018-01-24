/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoannotation;

/**
 *
 * @author Adminis
 */
public class DemoAnnotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien();
        sv.setName("doan duc Thuan");
        XulyvietHoa.Chuhoa(sv);
        System.out.println("ten moi :" + sv.getName());
    }
    
}
