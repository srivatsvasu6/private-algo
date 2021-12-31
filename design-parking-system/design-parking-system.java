class ParkingSystem {

  Map<Integer,Integer> park;
    
    public ParkingSystem(int big, int medium, int small) {
        
        park = new HashMap<>();
        park.put(1, big);
        park.put(2, medium);
        park.put(3, small);
    }
    
    public boolean addCar(int carType) {
        
       int numSlots =  park.get(carType);
        
        if(numSlots > 0){
            
            park.put(carType, numSlots -1);
            return true;
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */