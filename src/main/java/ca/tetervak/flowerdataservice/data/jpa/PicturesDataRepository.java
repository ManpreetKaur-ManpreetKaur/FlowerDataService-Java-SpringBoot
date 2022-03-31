package ca.tetervak.flowerdataservice.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PicturesDataRepository extends JpaRepository<Picture, Integer> {
}
