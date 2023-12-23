package innerTest;

public class testInner {
    float reliceq = 99;

    private float calulate(float a){
        float b ;
        b= a * 5/2 +5;
        return b;
    }

    public class innerBody{
        float headeq;
        public innerBody(){}

        public void testone(){
            System.out.println(calulate(reliceq));
        }

        public float getHeadeq() {
            return headeq;
        }

        public void setHeadeq(float headeq) {
            this.headeq = headeq;
        }
    }
}
