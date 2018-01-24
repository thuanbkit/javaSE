/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import model.Sinhvien;

/**
 *
 * @author Adminis
 */
public class DemoMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("key","value1");
        map.put(5.5,"value1");
        Map<String,Sinhvien> mapSv = new HashMap<String,Sinhvien>();
        mapSv.put("001", new Sinhvien("abc", "2333", "33333"));
        mapSv.put("002", new Sinhvien("abc1", "233a3", "333323"));
        System.out.println(mapSv.get("002"));
        
        // get danh sách key hàng dọc->hàng ngang
        Set<String> dsKey = mapSv.keySet();
        for (String string : dsKey) {
            System.out.println(mapSv.get(string));
        }
        Set<Map.Entry<String, Sinhvien>> entrySet = mapSv.entrySet();
        for (Map.Entry<String, Sinhvien> entry : entrySet) {
            System.out.println(entry.getKey()+ "----" + entry.getValue());
        }
    }
    
}
