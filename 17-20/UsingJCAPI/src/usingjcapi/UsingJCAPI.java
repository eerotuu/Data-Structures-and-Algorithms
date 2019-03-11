/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingjcapi;

import java.util.*;
/**
 *
 * @author kamaj
 */
public class UsingJCAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<TrafficCard> cardUsers = new ArrayList<TrafficCard>();
        RandomString rString = new RandomString(10);
        float genBalance;
        TrafficCard myCard;
        Random r = new Random();
        int i;
        for (i = 0; i < 10; i++) {
            genBalance = ((float) r.nextInt(1000) / 10);
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
            cardUsers.add(myCard);
        }
        
        
        System.out.println("===== Sorting by Traveller Number =====");
        Collections.sort(cardUsers);
        print(cardUsers.iterator());
        
        System.out.println("===== Sorting by Balance =====");
        Collections.sort(cardUsers, new TravellerBalanceComparator());
        print(cardUsers.iterator());
        
        System.out.println("===== Sorting by Name =====");
        Collections.sort(cardUsers, new TravellerNameComparator());
        print(cardUsers.iterator());
        
        System.out.println("===== Sorted & filtered by number 10-40 =====");
        cardUsers.stream()
                .sorted(Comparator.comparingInt(o -> o.mTravellerNumber))
                .filter(o -> o.mTravellerNumber > 10 && o.mTravellerNumber < 40)
                .forEach(o -> System.out.println(o.toString()));
    }
    
    static void print(Iterator itr) {
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");
    }
    
}
