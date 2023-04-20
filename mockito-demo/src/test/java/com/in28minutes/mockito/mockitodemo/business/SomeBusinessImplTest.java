package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {
    @Test
    void test(){
        DataserviceStub dataserviceStub= new DataserviceStub();
        SomeBusinessImpl businessImpl= new SomeBusinessImpl(dataserviceStub);
        businessImpl.findTheGreatestFromAllData();
    }
}
class DataserviceStub implements Dataservice{

    @Override
    public int[] retrieveAllData() {
        return new int[] {25,15,5};
    }
}
