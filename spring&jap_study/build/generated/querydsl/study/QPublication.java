package study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPublication is a Querydsl query type for Publication
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPublication extends EntityPathBase<Publication> {

    private static final long serialVersionUID = -11490969L;

    public static final QPublication publication = new QPublication("publication");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QPublication(String variable) {
        super(Publication.class, forVariable(variable));
    }

    public QPublication(Path<? extends Publication> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPublication(PathMetadata metadata) {
        super(Publication.class, metadata);
    }

}

