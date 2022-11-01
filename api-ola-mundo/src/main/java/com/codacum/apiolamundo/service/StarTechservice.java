package com.codacum.apiolamundo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codacum.apiolamundo.entity.StartechEntity;
import com.codacum.apiolamundo.repository.StartechRepository;

@Service
public class StarTechservice {
    @Autowired
    private StartechRepository startechRepository;

    public StartechEntity createUser(StartechEntity startechUser){
        return startechRepository.save(startechUser);
    }

    public List<StartechEntity> createUsers(List<StartechEntity> startechUsers){
        return startechRepository.saveAll(startechUsers);
    }
    
    public List<StartechEntity> getUsers() {
        return startechRepository.findAll();
    }

    public StartechEntity getUserById(int id){
        return startechRepository.findById(id).orElse(null);
    }

   public String deleteUserById (int id){
    startechRepository.deleteById(id);
    return "Usuario deletado";
   }
}
