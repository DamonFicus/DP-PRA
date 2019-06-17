package dp.pra.validtest;

public class Product {
    private String name;
    private int    price;
    private int   weight;
    private String code;
    private String desc;

    public int getWeight() {
        return weight;
    }

    public Product setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Product setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +",desc="+'\''+desc+'\''+",code="+code+",weight="+weight+
                '}';
    }
}
