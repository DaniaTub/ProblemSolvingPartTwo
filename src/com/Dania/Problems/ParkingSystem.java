package com.Dania.Problems;
//ParkingSystem(int big, int medium, int small)
// Initializes object of the ParkingSystem class.
// The number of slots for each parking
// space are given as part of the constructor.
// bool addCar(int carType) Checks whether there is a parking space of carType for the car
// that wants to get into the parking lot. carType can be of
// three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
// A car can only park in a parking space of its carType. If there is no space available,
// return false, else park the car in that size space and return true.


public class ParkingSystem
{


        int big;
        int small;
        int medium;
        public ParkingSystem(){}
        public ParkingSystem(int big, int medium, int small) {
                this.big=big;
                this.small=small;
                this.medium=medium;
        }
        public boolean addCar(int carType)
        {
                if(carType == 1 && big == 0 || carType == 2 && medium == 0 || carType == 3 && small==0 ){
                        return false;
                }
                if(carType==1) big--;
                if(carType==2) medium--;
                if(carType==3) small--;
                return true;

        }

        public static void main()
        {
                ParkingSystem obj =new ParkingSystem(1,2,3);
                obj.addCar(4);
        }
}


