/*
__        ____  __ ____    ____  _     ___   ____ 
\ \      / /  \/  |  _ \  | __ )| |   / _ \ / ___|
 \ \ /\ / /| |\/| | | | | |  _ \| |  | | | | |  _ 
  \ V  V / | |  | | |_| | | |_) | |__| |_| | |_| |
   \_/\_/  |_|  |_|____/  |____/|_____\___/ \____|
 */
package net.zhaoxuyang.blog.mapper;

import java.util.List;
import java.util.Set;
import net.zhaoxuyang.blog.model.Article;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zhaoxuyang
 */
@Repository
public interface ArticleMapper {

    public Article getById(Article article);

    public List<Article> listAnd(Article article);

    public List<Article> listOr(Article article);

    public int insert(Article article);

    public int update(Article article);

    public int delete(Article article);
    
    
}
