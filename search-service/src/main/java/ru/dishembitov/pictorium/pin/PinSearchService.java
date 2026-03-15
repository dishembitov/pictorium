package ru.dishembitov.pictorium.pin;

import ru.dishembitov.pictorium.personalization.PersonalizationBoosts;
import ru.dishembitov.pictorium.search.SearchCriteria;
import ru.dishembitov.pictorium.search.SearchResult;

public interface PinSearchService {

    SearchResult<PinSearchResult> searchPins(SearchCriteria criteria);

    SearchResult<PinSearchResult> searchPins(SearchCriteria criteria, String userId);

    SearchResult<PinSearchResult> findSimilarPins(String pinId, int limit);

    InternalSearchResult<PinSearchResult> searchPinsInternal(
            SearchCriteria criteria,
            int from,
            int size,
            PersonalizationBoosts boosts
    );

    record InternalSearchResult<T>(java.util.List<T> results, long totalHits) {}
}