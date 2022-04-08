package study;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long id;
    private String name;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY) // Item을 조회할 때 Item이 포함되어있는 PurchaseOrder도 함께 조회할지, 함께 조회하지 않을지 결정
    @JoinColumn(name = "PURCHASE_ORDER_ID") // 조인할때 사용하는 컬럼럼
   private PurchaseOrder order;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PurchaseOrder getOrder() {
        return order;
    }

    public void setOrder(PurchaseOrder order) {
        this.order = order;
    }
}
