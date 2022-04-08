package study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPurchaseOrder is a Querydsl query type for PurchaseOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPurchaseOrder extends EntityPathBase<PurchaseOrder> {

    private static final long serialVersionUID = 1587916616L;

    public static final QPurchaseOrder purchaseOrder = new QPurchaseOrder("purchaseOrder");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Item, QItem> items = this.<Item, QItem>createList("items", Item.class, QItem.class, PathInits.DIRECT2);

    public final StringPath userName = createString("userName");

    public QPurchaseOrder(String variable) {
        super(PurchaseOrder.class, forVariable(variable));
    }

    public QPurchaseOrder(Path<? extends PurchaseOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPurchaseOrder(PathMetadata metadata) {
        super(PurchaseOrder.class, metadata);
    }

}

