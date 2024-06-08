package com.example.simpleboard.crud;

import com.example.simpleboard.comment.db.CommentEntity;
import com.example.simpleboard.comment.model.CommentDto;

public interface ConverterInterface<DTO, ENTITY> {
    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
}
