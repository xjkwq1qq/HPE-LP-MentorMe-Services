package com.livingprogress.mentorme.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

/**
 * The mentee feedback.
 */
@Getter
@Setter
@Entity
public class MenteeFeedback extends IdentifiableEntity {
    /**
     * The mentor score.
     */
    private Integer mentorScore;

    /**
     * The comment.
     */
    private String comment;

    private Date createdOn;
}

