package ru.dishembitov.pictorium.user;

import ru.dishembitov.pictorium.search.SearchCriteria;
import ru.dishembitov.pictorium.search.SearchResult;

public interface UserSearchService {

    SearchResult<UserSearchResult> searchUsers(SearchCriteria criteria);

    InternalSearchResult<UserSearchResult> searchUsersInternal(SearchCriteria criteria, int from, int size);

    record InternalSearchResult<T>(java.util.List<T> results, long totalHits) {}
}