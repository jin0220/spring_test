package study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QManuscript is a Querydsl query type for Manuscript
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QManuscript extends EntityPathBase<Manuscript> {

    private static final long serialVersionUID = 393415755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QManuscript manuscript = new QManuscript("manuscript");

    public final QBook book;

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QManuscript(String variable) {
        this(Manuscript.class, forVariable(variable), INITS);
    }

    public QManuscript(Path<? extends Manuscript> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QManuscript(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QManuscript(PathMetadata metadata, PathInits inits) {
        this(Manuscript.class, metadata, inits);
    }

    public QManuscript(Class<? extends Manuscript> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new QBook(forProperty("book"), inits.get("book")) : null;
    }

}

