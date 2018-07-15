package com.ubs.business;

import java.util.ArrayList;

public class Employees {

    private ArrayList cognizant  = new ArrayList();


    public void initialLoad(){

        for(int i = 0; i < 50; i++){
            cognizant.add(new Employee( ("sachin" + i), ("surve" + i), ("IT " + i), (i) ));
        }

    }

    public ArrayList getCognizant(){
        return cognizant;
    }

}
