package com.in28minutes.mockito.mockitodemo.business;

public class SomeBusinessImpl {
    private Dataservice dataservice;

    public SomeBusinessImpl(Dataservice dataservice) {
        super();
        this.dataservice = dataservice;
    }

    public int findTheGreatestFromAllData(){
     int[] data =  dataservice.retrieveAllData();
     int greatestValue=Integer.MIN_VALUE;
     for(int value : data){
         if(value>greatestValue){
             greatestValue=value;
         }
     }
     return greatestValue;
    }
}
interface Dataservice{
    int[] retrieveAllData();
}