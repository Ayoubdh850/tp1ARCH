package dao;

public class DaoIMP implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return Math.random() * 100;
    }
}
