package com.example.simpleboard.crud;

import com.example.simpleboard.common.Api;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

//DTO를 받아서 다시 DTO를 리턴 시켜주는 인터페이스
public interface CRUDInterface<DTO> {
    DTO create(DTO dto);

    Optional<DTO> read(Long id);

    DTO update(DTO dto);

    void delete(Long id);

    Api<List<DTO>> list(Pageable pageable);
}
