import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/myentities")
public class MyEntityController {
    @Autowired
    private MyEntityRepository repository;

    @GetMapping
    public List<MyEntity> getAllEntities() {
        return repository.findAll();
    }

    @PostMapping
    public MyEntity createEntity(@RequestBody MyEntity entity) {
        return repository.save(entity);
    }

    @GetMapping("/{id}")
    public MyEntity getEntityById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public MyEntity updateEntity(@PathVariable String id, @RequestBody MyEntity updatedEntity) {
        updatedEntity.setId(id);
        return repository.save(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable String id) {
        repository.deleteById(id);
    }
}
