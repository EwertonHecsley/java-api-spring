package person.apirest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import person.apirest.model.User;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId() == null){
            System.out.println("SAVE - Recebendo um usuário na camada repository");
        }else{
            System.out.println("UPDATE - Recebendo um usuário na camada repository");
        }
        System.out.println(user);
    }

    public void delete(Integer id){
        System.out.println("DELETE");
        System.out.println(id);
    }

    public List<User> findAllUsers(){
        System.out.println("Listando os usuários do sistema");
        List<User> users = new ArrayList<User>();

        users.add(new User("hecsley","senha123"));
        users.add(new User("Zé da Manga","senha123"));

        return users;
    }
}
