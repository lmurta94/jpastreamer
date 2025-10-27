package lucasti.services;


import jakarta.enterprise.context.ApplicationScoped;
import lucasti.controllers.dtos.MerchantDTO;
import lucasti.models.MerchantModel;

import java.util.List;

@ApplicationScoped
public interface MerchantService {

     default MerchantModel saveMerchant(MerchantDTO merchantDTO){
         return null;
     }

    List<MerchantModel> getAllMerchants();

    List<MerchantModel> getByName(String name);

    List<MerchantModel> getByOwner(String owner);
}
