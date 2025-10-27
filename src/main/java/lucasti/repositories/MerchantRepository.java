package lucasti.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import lucasti.models.MerchantModel;

@ApplicationScoped
public class MerchantRepository implements PanacheRepository<MerchantModel> {
}
