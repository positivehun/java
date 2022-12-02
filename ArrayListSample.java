import java.util.ArrayList;

class chick{
    String bone;
    String leg;
    String tender;
    String wing;
    public chick(String leg,String bone, String tender,String wing){
        this.bone = bone;
        this.leg = leg;
        this.tender = tender;
        this.wing = wing;
    }
}
public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        test.add("100");
        test.add("101");
        test.add("102");
        test.add("103");
        test.add("104");
        test.add("105");
        System.out.println(test.get(1)); //특정 순서에 접근
        System.out.println(test.size()); //길이
        System.out.println(test.contains(101)); //isin같이 존재 유뮤 확인

        //제네릭스
        //ArrayList에 담을수 있는 객체의타입을 한정
        ArrayList<chick> chicks = new ArrayList<>();
        chick goobne = new chick("100","100","100","100");

        chicks.add(goobne);

        System.out.println(chicks.get(0).leg);

    }
}
