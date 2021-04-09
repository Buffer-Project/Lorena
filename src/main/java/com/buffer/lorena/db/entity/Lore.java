package com.buffer.lorena.db.entity;

import javax.persistence.*;

/**
 * The type Lore.
 */
@Entity
@Table(name = "Lore")
public class Lore {

  @EmbeddedId
  private LoreId loreId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;

  /**
   * Instantiates a new Lore.
   */
  public Lore() {
  }

  /**
   * Instantiates a new Lore.
   *
   * @param idServer  the id server
   * @param idUser    the id user
   * @param idMessage the id message
   */
  public Lore(long idServer, long idUser, long idMessage) {
    this.loreId = new LoreId(idServer, idUser, idMessage);
  }

  /**
   * Gets id server.
   *
   * @return the id server
   */
  public long getIdServer() {
    return this.loreId.getIdServer();
  }

  /**
   * Gets id user.
   *
   * @return the id user
   */
  public long getIdUser() {
    return this.loreId.getIdUser();
  }

  /**
   * Gets id message.
   *
   * @return the id message
   */
  public long getIdMessage() {
    return this.loreId.getIdMessage();
  }

  /**
   * Gets created at.
   *
   * @return the created at
   */
  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets updated at.
   *
   * @return the updated at
   */
  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

}
