package com.garden.repositories;

import com.garden.models.*;
import org.springframework.data.jpa.repository.*;

public interface ClientRepository extends JpaRepository<Client, Long> {}