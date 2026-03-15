package ru.dishembitov.pictorium.analytic;

import ru.dishembitov.pictorium.history.SearchHistoryResponse;
import ru.dishembitov.pictorium.search.SearchCriteria;

import java.util.List;

public interface SearchAnalyticsService {

    void logSearch(SearchCriteria request, long resultsCount, long took, String userId);

    List<TrendingQueryResponse> getTrendingQueries(int limit);

    List<SearchHistoryResponse> getUserSearchHistory(String userId, int limit);

    void deleteUserSearchHistory(String userId);
}