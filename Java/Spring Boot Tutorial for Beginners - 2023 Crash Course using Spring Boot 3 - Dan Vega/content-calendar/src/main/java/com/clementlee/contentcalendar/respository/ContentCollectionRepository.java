package com.clementlee.contentcalendar.respository;

import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.model.Status;
import com.clementlee.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll(){
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count()==1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct // "@PostConstruct" allow the method to be executed once initialized (initialized in ContentController)
    public void init(){ // method name does not matter, "init" is just naming convention
        Content c = new Content(1,
                "My First Blog Post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(c);
    }



}
