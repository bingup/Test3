public abstract class AbStract01 {
    public abstract void run();
    //public abstract class 类名字
    private  String id;
    private  String name;
    private  Double salery;

    public AbStract01() {
    }

    public AbStract01(String id, String name, Double salery) {
        this.id = id;
        this.name = name;
        this.salery = salery;
    }

    public abstract  void work();
}
