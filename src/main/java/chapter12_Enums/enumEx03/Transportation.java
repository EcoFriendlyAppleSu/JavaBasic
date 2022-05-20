package chapter12_Enums.enumEx03;

public enum Transportation {

    /**
     * 사실 열거형 상수 하나하나가 객체이다.
     */
    BUS(100){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    SHIP(300){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(600){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE;

    abstract int fare(int distance);

    Transportation(int BASIC_FARE) {
        this.BASIC_FARE = BASIC_FARE;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }
}
