package study;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    // 엔티티는 반드시 식별자를 가져야함.
    @Id // 식별자
    @Column(name = "MOVIE_ID") // 테이블에서 사용하는 컬럼의 특징을 설정
    private Long movieId;

    @Column(name = "NAME")
    private String movieName;

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
