package chapter06;

class TV {
    public String color; // 속성, 맴버변수, 필드, 상태
    public boolean power;
    public int channel;

    public TV() {
    }

    public TV(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelMinus() {
        channel--;
    }

    @Override
    public String toString() {
        return "TV{" +
                "color='" + color + '\'' +
                ", power=" + power +
                ", channel=" + channel +
                '}';
    }
}
