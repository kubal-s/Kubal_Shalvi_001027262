/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akhil
 */
public class VitalSignsHistory {
    private List<VitalSigns> vitalSignsHistroy = new ArrayList<VitalSigns>();
        

    public void addToVitalSignsHistory(VitalSigns vs){
        this.vitalSignsHistroy.add(0,vs);
    }

    public List<VitalSigns> getVitalSignsHistroy() {
        return vitalSignsHistroy;
    }

    public void setVitalSignsHistroy(List<VitalSigns> vitalSignsHistroy) {
        this.vitalSignsHistroy = vitalSignsHistroy;
    }

    public VitalSigns createVitalSigns() {
        VitalSigns vs = new VitalSigns();
        System.out.println("enetred to create new vs");
        return vs;
    }
    public VitalSigns getVitalAtIndex(int index){
        return vitalSignsHistroy.get(index);
    }

    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int i = 1;
        for (VitalSigns vs : vitalSignsHistroy) {
            sb.append("Vital Sign "+ i +":");
            sb.append(vs);
            sb.append("\n");
            i++;
        }
        String str = sb.toString();
        return str;
    }

}
