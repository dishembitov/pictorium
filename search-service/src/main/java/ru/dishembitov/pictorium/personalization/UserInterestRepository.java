package ru.dishembitov.pictorium.personalization;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterestRepository extends ElasticsearchRepository<UserInterestDocument, String> {
}