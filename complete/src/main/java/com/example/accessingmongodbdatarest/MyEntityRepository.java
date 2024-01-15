import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityRepository extends MongoRepository<MyEntity, String> {
    // custom queries if needed
    List<MyEntity> findByName(@Param("name") String name);
}
