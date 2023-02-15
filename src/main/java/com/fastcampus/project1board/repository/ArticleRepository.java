package com.fastcampus.project1board.repository;

import com.fastcampus.project1board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}