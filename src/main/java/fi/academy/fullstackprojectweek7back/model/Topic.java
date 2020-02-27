package fi.academy.fullstackprojectweek7back.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max=50)
    private String name;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "topic_posts",
            joinColumns= @JoinColumn(name = "topic_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private Set<Post> posts = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    public void addPost(Post post) {
        this.posts.add(post);
    }
}
