package se.sigma.security.persistence.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.sigma.security.persistence.model.DeviceMetaData;

import java.util.List;

@Repository
public interface DeviceMetadataRepository extends JpaRepository<DeviceMetaData, Long> {

    List<DeviceMetaData> findByUserId(Long userId);
}
