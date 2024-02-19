package dao;

public class DaoImpl2 implements IDao{

    @Override
    public double getdate() {
        System.out.println("Version 2 : ");
        return 25;
    }
}
