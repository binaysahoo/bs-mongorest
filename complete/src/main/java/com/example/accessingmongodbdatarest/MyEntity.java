import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mycollection")
public class MyEntity {
    @Id
    private String id;
    private String name;
  
	public String getName() {
		return name;
	}

	public void setName(String firstName) {
		this.name = name;
	}
}
