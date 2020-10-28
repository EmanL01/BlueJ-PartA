
/**
 * Write a description of class coin here.
 *
 * @author Eman Limbu
 * @version 2020.10.28
 */
    public enum coin 
 { // fixed values so this method is used to define it
        P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);
        
        private final int value;
        
        private coin(int value)
        {
            this.value = value;
        }
        
        
        public int getValue()
        {
            return value;
        }
 }
