package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        List<Post> posts = new ArrayList<>();

        Post post1 = new Post("Post 1", "Post Body 1", new Date());
        Post post2 = new Post("Post 2", "Post Body 2", new Date());
        Post post3 = new Post("Post 3", "Post Body 3", new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        /*
        * This line will add the posts list to the model object and for future use
        * will make sure that the posts list is referred by the
        * model attribute/context variable (in Thymeleaf jargon) -- "posts"
        * */
        model.addAttribute("posts", posts);

        return "index";
    }
}
