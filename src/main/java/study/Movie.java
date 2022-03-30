package study;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie")
public class Movie {
    // 엔티티는 반드시 식별자를 가져야함.
    @Id // 식별자
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOVIE_ID") // 테이블에서 사용하는 컬럼의 특징을 설정
    private Long movieId;
    @Column(name = "NAME")
    private String movieName;

    @Transient // 데이터베이스에 없는 필드지만 비즈니스 로직을 작성하기 위해서 필요한 필드를 만들기 위해서 사용
    private int raking;

    

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                '}';
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
