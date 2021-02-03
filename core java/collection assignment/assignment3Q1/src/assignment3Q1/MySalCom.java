package assignment3Q1;

import java.util.Comparator;

class MySalaryCom implements Comparator<person>{
    
    @Override
    public int compare(person e1, person e2) {
        if(e1.getPersonHeight() > e2.getPersonHeight()){
            return 1;
        } else {
            return -1;
        }
    }

}