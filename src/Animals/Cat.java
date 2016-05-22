package Animals;



public class Cat extends Animal implements Jumpable {



    public Cat(String name) {
        super(name);
        type = "Cat";
        maxRunDistance = 500.0f;

    }



    @Override
    public void jump(float height) {
        float maxHeigth = 1.0f;
        if (height < maxHeigth) {
            System.out.println(type + " " + name + "maxHeigth = " + maxHeigth + " jump ok");
        } else {
            maxHeigth += Math.random();
            if (height < maxHeigth) {
                System.out.println(type + " " + name + "maxHeigth = " + maxHeigth + " double jump ok");
            } else {
                System.out.println(type + " " + name + "maxHeigth = " + maxHeigth + " TROUBLE jump!!!");
                getOutFromDistance();
            }
        }
    }
}
