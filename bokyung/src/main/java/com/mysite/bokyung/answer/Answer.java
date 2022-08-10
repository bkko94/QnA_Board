package com.mysite.bokyung.answer;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import com.mysite.bokyung.question.Question;
import com.mysite.bokyung.user.SiteUser;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice.Local;

@Getter
@Setter
@Entity
public class Answer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	
	private LocalDateTime createDate;
	
	private LocalDateTime modifyDate;
	
	@ManyToOne
	private Question question;

	@ManyToOne
	private SiteUser author;
	
	@ManyToMany
	Set<SiteUser> voter;
}
