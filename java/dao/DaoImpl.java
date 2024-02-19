package dao;

import org.springframework.stereotype.Component;

@Component("dao") //pour la version annotation du Spring
public class DaoImpl implements IDao{
    @Override
    public double getdate() {
        System.out.println("la version 1 : ");
        return 34;
    }
}
