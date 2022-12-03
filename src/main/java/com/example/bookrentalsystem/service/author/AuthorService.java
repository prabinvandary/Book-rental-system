package com.example.bookrentalsystem.service.author;

import com.example.bookrentalsystem.globalException.AppException;
import com.example.bookrentalsystem.model.Author;
import com.example.bookrentalsystem.pojo.author.AuthorDetailRequestPojo;
import com.example.bookrentalsystem.pojo.author.AuthorDetailResponsePojo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface AuthorService {
    AuthorDetailResponsePojo getAuthorById(Integer authorId) throws AppException;
    void saveAuthorDetails(AuthorDetailRequestPojo authorDetailRequestPojo);
     List<AuthorDetailResponsePojo> getAuthor();

     void  deleteAuthorById(Integer authorId) throws AppException;

    Page<Map<String,Object>> getAllAuthorPage(Integer pageNumber, Integer pageSize);

//     Page<Author> findAllAuthor(Pageable pageable);
}
