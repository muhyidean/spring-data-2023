package edu.miu.springdata1.service;

import edu.miu.springdata1.dto.output.UserDto;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.dto.input.PagingRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    Page<User> paging(PagingRequest pagingRequest);

    List<User> findAll();

    User findById(int id);

    UserDto findByIdDto(int id);

    void deleteById(int id);
}
