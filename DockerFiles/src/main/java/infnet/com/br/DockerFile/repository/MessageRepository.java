package infnet.com.br.DockerFile.repository;
import infnet.com.br.DockerFile.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
}
