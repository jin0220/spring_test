package study;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // persistence.xml에서 persistence-unit의 속성 name값을 넣어주어 그 정보를 읽게한다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring_test");
        EntityManager em = emf.createEntityManager(); // 실제 데이터베이스를 관장을 함

        // jpa 동작은 항상 트랜잭션 안에서 수행되어야 함.
        EntityTransaction tx = em.getTransaction();

        // 트랜잭션 안에서 jpa 수행
        // 트랜잭션 밖에서 수행할 경우 에러가 나기때문에 begin과 commit 사이에 jpa 관련 코드를 작성한다.
        try{
            tx.begin();

            // 등록
//            Movie movie = new Movie();
////            movie.setMovieId(1L);
//            movie.setMovieName("타이타닉");
//            em.persist(movie); // 영속성 컨텍스트라는 곳에 저장하는 것이지 엔티티의 내용을 DB에 저장하는 것은 아님

            // 조회
//            Movie findMovie = em.find(Movie.class, 1L);
//            System.out.println("findMovie = " + findMovie);

            // 업데이트
//            Movie findMovie = em.find(Movie.class, 1L);
//            System.out.println("findMovie = " + findMovie);
//            findMovie.setMovieName("로미오와 줄리엣"); //jpa 안에서 findMovie 엔티티가 관리되고 있기 때문에
                                                    // setMovieName을 하게 되면 jpa가 알아서 update 쿼리를 날림.

            // 삭제
//            Movie findMovie = em.find(Movie.class, 1L);
//            System.out.println("findMovie = " + findMovie);
//            em.remove(findMovie);

//            Item item1 = new Item();
//            item1.setName("치킨");
//
//            Item item2 = new Item();
//            item2.setName("치즈볼");
//
//            PurchaseOrder order = new PurchaseOrder();
//            order.setUserName("kim");
//            order.getItems().add(item1);
//            order.getItems().add(item2);
//
//            item1.setOrder(order);
//            item2.setOrder(order);
//
//            em.persist(order);
//            em.persist(item1);
//            em.persist(item2);
//
//            em.flush(); // find를 하기 위해 강제로 데이터베이스에 반영시키는 방법 -> commit()에서 데이터베이스에 반영되기 때문
//            em.clear(); // 위 영속성으로 관리되고 있는 엔티티를 제거하라는 의미
//
//            Item findItem = em.find(Item.class, 1L);
//            System.out.println("findItem.getOrder().getUserName() = " + findItem.getOrder().getUserName());

            // 일대일 연관관계
//            Manuscript manuscript = new Manuscript();
//            Book book = new Book();
//
//            book.setISBN("asdf");
//            book.setManuscript(manuscript);
//            manuscript.setBook(book);
//
//            em.persist(book);
//            em.persist(manuscript);

//            Book2 book2 = new Book2();
//            book2.setTitle("어린왕자");
//            book2.setVersion(1);
//            book2.setPages(200);
//
//            BlogPost blogPost = new BlogPost();
//            blogPost.setTitle("어린왕자리뷰");
//            blogPost.setVersion(1);
//            blogPost.setUrl("http://littlePrince");
//
//            em.persist(book2);
//            em.persist(blogPost);

            // cascade
            Address address1 = new Address();
            address1.setCity("city1");
            address1.setStreet("street1");
            address1.setZipCode("zipcode1");

            Address address2 = new Address();
            address2.setCity("city2");
            address2.setStreet("street2");
            address2.setZipCode("zipcode2");

            Person person = new Person();
            person.setName("kim");
            person.setAge(20);

            // 연관관계 맺어주기
            person.getAddresses().add(address1);
            person.getAddresses().add(address2);

            address1.setPerson(person);
            address2.setPerson(person);

            em.persist(person);

            // cascade persist로 설정했기 때문에 지워도 실행됨.
            em.persist(address1);
            em.persist(address2);

            em.flush();
            em.clear();

//            Person findPerson = em.find(Person.class,1);
//            em.remove(findPerson);

            // JPQL
            // 1. TypedQuery
//            TypedQuery<String> query = em.createQuery("SELECT p.name FROM Person AS p", String.class);
//            List<String> resultList = query.getResultList();
//            resultList.stream().forEach(v -> System.out.println("v = " + v));

            // 2. Query
            Query query = em.createQuery("SELECT p.name, p.age FROM Person AS p");
            List resultList = query.getResultList();
            for(Object o: resultList){
                Object[] result = (Object[]) o;
                System.out.println("result[0] = " + result[0]);
                System.out.println("result[1] = " + result[1]);
            }

            tx.commit(); // 여기서 DB에 전달할 모든 SQL을 모아서 한 번에 처리
        }catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}
