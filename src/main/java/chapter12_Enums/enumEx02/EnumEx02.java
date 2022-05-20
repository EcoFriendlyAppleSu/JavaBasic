package chapter12_Enums.enumEx02;

public class EnumEx02 {
    public static void main(String[] args) {

        for (Direction d :
                Direction.values()) {
            System.out.printf("%s = %d\n", d.name(), d.getValue());
        }

        Direction east = Direction.EAST;
        Direction of = Direction.of(1);

        System.out.printf("east = %s, %d\n", east.name(), east.getValue());
        System.out.printf("of = %s, %d\n", of.name(), of.getValue());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));

    }
}
