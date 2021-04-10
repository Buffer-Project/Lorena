package com.buffer.lorena.bot.repository;

import com.buffer.lorena.db.entity.MessageDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Message repository.
 */
public interface MessageRepository extends JpaRepository<MessageDAO, Long> {
}
