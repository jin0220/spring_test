package study;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

            Movie movie = new Movie();
            movie.setMovieId(1L);
            movie.setMovieName("타이타닉");
            em.persist(movie); // 영속성 컨텍스트라는 곳에 저장하는 것이지 엔티티의 내용을 DB에 저장하는 것은 아님

            tx.commit(); // 여기서 DB에 전달할 모든 SQL을 모아서 한 번에 처리
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
    }
}
