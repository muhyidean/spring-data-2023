package edu.miu.springdata1.service.impl;

import edu.miu.springdata1.dto.output.UserDto;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.dto.input.PagingRequest;
import edu.miu.springdata1.repo.UserRepo;
import edu.miu.springdata1.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.persistence.*;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;

    @PersistenceContext
    EntityManager entityManager;

    private final UserRepo userRepo;

    /**
     * FOR DEMO PURPOSES
     *  
     * @param pagingRequest .sortBy CANNOT be null !!!
     * @return
     */
    public Page<User> paging(PagingRequest pagingRequest) {
        var direction = (pagingRequest.isAscending()) ? Sort.Direction.ASC : Sort.Direction.DESC;

        var request = PageRequest
                .of(pagingRequest.getPage(), pagingRequest.getPageSize(), direction,pagingRequest.getSortBy());
        return userRepo.findAll(request);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public UserDto findByIdDto(int id){

        return modelMapper.map(userRepo.findById(id),UserDto.class);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id);
    }


}
