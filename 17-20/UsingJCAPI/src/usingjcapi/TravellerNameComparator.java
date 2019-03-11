/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingjcapi;

import java.util.Comparator;

/**
 *
 * @author Eero
 */
public class TravellerNameComparator implements Comparator<TrafficCard> {

    @Override
    public int compare(TrafficCard o1, TrafficCard o2) {
        return o1.mOwnerName.compareTo(o2.mOwnerName);
    }
    
}
