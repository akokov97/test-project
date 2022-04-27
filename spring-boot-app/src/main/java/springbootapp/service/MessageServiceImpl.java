package springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import springbootapp.model.Message;
import springbootapp.repository.MessageRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepositoryImpl messageRepositoryImpl;

    @Override
    public void createMessage(String firstName, String lastName, Byte age, String email, String password, String role) {

    }

    @Override
    public void deleteMessage(String firstName, String lastName, Byte age, String email, String password, String role) {

    }

    @Override
    public void editMessage(Long id, String firstName, String lastName, Byte age, String email, String password, String role) {

    }

    @Override
    public void deleteMessage(Long id) {
    }

    @Override
    public Optional<Message> getMessage(Long id) {
        return messageRepositoryImpl.findById(id);
    }

    @Override
    public List<Message> getAllMessages() {
        return null;
    }

    @Override
    public Message getMessageByEmail(String email) {
        return null;
    }

}
