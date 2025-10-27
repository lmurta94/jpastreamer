package lucasti.services.impl;

import com.speedment.jpastreamer.application.JPAStreamer;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lucasti.controllers.dtos.MerchantDTO;
import lucasti.models.MerchantModel;
import lucasti.repositories.MerchantRepository;
import lucasti.services.MerchantService;

import java.util.Comparator;
import java.util.List;

@ApplicationScoped
public class MerchantServiceImpl implements MerchantService {

    @Inject
    JPAStreamer jpaStreamer;

    @Inject
    MerchantRepository merchantRepository;

    @Transactional
    @Override
    public MerchantModel saveMerchant(MerchantDTO merchantDTO) {
        MerchantModel merchantModel = new MerchantModel(merchantDTO);
        merchantRepository.persist(merchantModel);
        return merchantModel;
    }

    @Override
    public List<MerchantModel> getAllMerchants() {
        List<MerchantModel> merchantModelList = merchantRepository.listAll();
        return merchantModelList;
    }

    @Override
    public List<MerchantModel> getByName(String merchantName) {
        List<MerchantModel> merchantModelList = merchantRepository
                .list("bornYear > 1900 ", Sort.by("name"));
        return merchantModelList;
    }


    @Override
    public List<MerchantModel> getByOwner(String owner) {
        List<MerchantModel> merchantModelList =
         jpaStreamer.stream(MerchantModel.class)
                 .filter(merchantModel -> merchantModel.getBornYear() > 1900)
                 .sorted(Comparator.comparing(MerchantModel::getOwner))
                .toList();

        return merchantModelList;
    }


}
