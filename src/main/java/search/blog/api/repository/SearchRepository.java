package search.blog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import search.blog.api.entity.Search;

public interface SearchRepository extends JpaRepository<Search, Long> {
}
