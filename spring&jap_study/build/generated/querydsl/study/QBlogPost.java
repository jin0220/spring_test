package study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBlogPost is a Querydsl query type for BlogPost
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBlogPost extends EntityPathBase<BlogPost> {

    private static final long serialVersionUID = 787699207L;

    public static final QBlogPost blogPost = new QBlogPost("blogPost");

    public final QPublication _super = new QPublication(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath title = _super.title;

    public final StringPath url = createString("url");

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public QBlogPost(String variable) {
        super(BlogPost.class, forVariable(variable));
    }

    public QBlogPost(Path<? extends BlogPost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlogPost(PathMetadata metadata) {
        super(BlogPost.class, metadata);
    }

}

