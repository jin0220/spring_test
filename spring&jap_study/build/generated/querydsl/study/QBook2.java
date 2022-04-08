package study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBook2 is a Querydsl query type for Book2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBook2 extends EntityPathBase<Book2> {

    private static final long serialVersionUID = 1046933988L;

    public static final QBook2 book2 = new QBook2("book2");

    public final QPublication _super = new QPublication(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> pages = createNumber("pages", Integer.class);

    //inherited
    public final StringPath title = _super.title;

    //inherited
    public final NumberPath<Integer> version = _super.version;

    public QBook2(String variable) {
        super(Book2.class, forVariable(variable));
    }

    public QBook2(Path<? extends Book2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBook2(PathMetadata metadata) {
        super(Book2.class, metadata);
    }

}

