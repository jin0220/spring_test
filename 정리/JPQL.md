JPQL(Java Persistence Query Language)
- 객체지향 쿼리
- 테이블을 대상으로 쿼리를 생성하는 것이 아닌 엔티티 객체를 대상으로 쿼리를 생성
- JPQL로 실행한 쿼리도 결국 SQL로 변환되어 실행
- 따라서 실행되는 SQL 로깅하여 확인하는 작업이 필요
- JPA에서 관리되는 엔티티에 대한 SQL은 트랜잭션 커밋 시점이지만 JPQL은 즉시 실행됨

Query의 종류
- TypedQuery
  - 쿼리 실행의 결과로 반환될 타입을 알고 있을 때
  - 추가적인 형변환이 없고 유연하고 쉬운 테스트를 제공
- NamedQuery
  - 엔티티에 실행될 JPQL과 그 이름을 명시하여 직관적으로 이해
- NativeQuery
  - SQL쿼리
  - JPQL의 구문에 제약없이 대상 DB에 곧 바로 SQL실행
  - JPQL이나 JPA의 관리를 벗어나므로 이식성이 떨어질 수 있음
  - NativeQuery는 최후의 수단으로 생각
