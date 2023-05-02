package com.clementlee.contentcalendar.respository;

import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Do not need to mark "@" because already extended "ListCrudRepository"
// What type are we managing? - Content
// What is the type of Id? - Integer
// "ListCrudRepository" included most of the common CRUD operation that returns a List
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    // Custom queries

    // Query derivation
    // Type meaningful query name, and it will based on that and converted into SQL query in runtime
    // Derive query from method name (e.g. the method name "findAllByTitleContains" will be converted into query automatically)
    List<Content> findAllByTitleContains(String keyword);

    // Manual defined query
    @Query("""
        SELECT * FROM Content
        where status = :status
    """)
    List<Content> listByStatus(@Param("status") Status status);
}
