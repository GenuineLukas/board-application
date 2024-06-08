package com.example.simpleboard.comment.service;

import com.example.simpleboard.comment.db.CommentEntity;
import com.example.simpleboard.comment.db.CommentRepository;
import com.example.simpleboard.comment.model.CommentDto;
import com.example.simpleboard.comment.model.CommentRequest;
import com.example.simpleboard.crud.CRUDAbstractService;
import com.example.simpleboard.post.db.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.time.LocalDateTime;
@Service
@RequiredArgsConstructor
public class CommentService extends CRUDAbstractService<CommentDto, CommentEntity> {
}
