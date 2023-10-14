// Pecthgamon Sangnual 6410406819
package ku.cs.kafe.repository;


import ku.cs.kafe.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, UUID> {
}
