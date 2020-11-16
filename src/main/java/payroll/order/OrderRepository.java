package payroll.order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Boot will fill this interface with functionality from JpaRepository.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}