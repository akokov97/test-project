package springbootapp.service;

import springbootapp.model.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    void createMessage(String firstName, String lastName, Byte age, String email, String password, String role);

    void editMessage(Long id, String firstName, String lastName, Byte age, String email, String password, String role);

    void deleteMessage(String firstName, String lastName, Byte age, String email, String password, String role);

    void deleteMessage(Long id);

    List<Message> getAllMessages();

    Message getMessageByEmail(String email);

    Optional<Message> getMessage(Long id);
}
