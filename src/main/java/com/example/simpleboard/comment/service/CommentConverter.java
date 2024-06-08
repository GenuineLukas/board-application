package com.example.simpleboard.comment.service;

import com.example.simpleboard.comment.db.CommentEntity;
import com.example.simpleboard.comment.model.CommentDto;
import com.example.simpleboard.crud.ConverterInterface;
import com.example.simpleboard.post.db.PostEntity;
import com.example.simpleboard.post.db.PostRepository;
import com.example.simpleboard.post.service.PostConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class CommentConverter implements ConverterInterface<CommentDto, CommentEntity> {
    private final PostRepository postRepository;

    @Override
    public CommentDto toDto(CommentEntity commentEntity) {
        var commentDto = CommentDto.builder()
                .id(commentEntity.getId())
                .postId(commentEntity.getPost().getId())
                .status(commentEntity.getStatus())
                .title(commentEntity.getTitle())
                .email(commentEntity.getEmail())
                .content(commentEntity.getContent())
                .userName(commentEntity.getUserName())
                .password(commentEntity.getPassword())
                .commentedAt(commentEntity.getCommentedAt())
                .build()
                ;
        return commentDto;
    }

    @Override
    public CommentEntity toEntity(CommentDto commentDto) {
        var postEntity = postRepository.findById(commentDto.getPostId());

        var commentEntity = CommentEntity.builder()
                .id(commentDto.getId())
                .post(postEntity.orElseGet(()->null))
                .status(commentDto.getStatus())
                .title(commentDto.getTitle())
                .email(commentDto.getEmail())
                .content(commentDto.getContent())
                .userName(commentDto.getUserName())
                .password(commentDto.getPassword())
                .commentedAt((commentDto.getCommentedAt() != null) ? commentDto.getCommentedAt() : LocalDateTime.now())
                .build()
                ;

        return commentEntity;
    }
}
