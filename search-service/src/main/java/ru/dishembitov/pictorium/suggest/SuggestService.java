package ru.dishembitov.pictorium.suggest;

public interface SuggestService {

    SuggestResponse suggest(String query, int limit);
}