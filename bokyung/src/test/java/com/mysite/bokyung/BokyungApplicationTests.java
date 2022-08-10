package com.mysite.bokyung;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.bokyung.answer.Answer;
import com.mysite.bokyung.answer.AnswerRepository;
import com.mysite.bokyung.question.Question;
import com.mysite.bokyung.question.QuestionRepository;
import com.mysite.bokyung.question.QuestionService;

@SpringBootTest
class BokyungApplicationTests {

	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuestionService questionService;
	
	@Transactional
	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다. : [%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content,null);
		}
		
		/*
		
		//답변에 연결된 질문 찾기 vs 질문에 달린 답변 찾
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		
		assertEquals(1, answerList.size());
		assertEquals("Welcome!", answerList.get(0).getContent());
		*/
		
		/*
		 답변 조회하
		Optional<Answer> oa = this.answerRepository.findById(1);
		//id값이 1인 답변을 조회하
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
		//질문의 id값이 2인지도 테스
		*/
		
		
		/*
		  답변 데이터 생성 후 저장하
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("Welcome!");
		a.setQuestion(q); //어떤 질문의 답변인지 알기 위해서 Question의 객체가 필요
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		
		*/
		
		
		
		/*
			삭제하기
			assertEquals(2, this.questionRepository.count());
			Optional<Question> oq = this.questionRepository.findById(1);
			assertTrue(oq.isPresent());
			Question q = oq.get();
			this.questionRepository.delete(q);
			assertEquals(1, this.questionRepository.count());
		*/
			
		/*
		 제목 수정하
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject("수정된 제목");
		this.questionRepository.save(q);
		*/
		
		
		/*
		Question q = this.questionRepository.findBySubjectAndContent("First Question for you!", "I want to know ASAP!");
		assertEquals(1, q.getId());
		*/
		
		/*
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("First Question for you!", q.getSubject());
		}
		*/
		
		
		
		/*
		Question q1 = new Question();
		q1.setSubject("First Question for you!");
		q1.setContent("I want to know ASAP!");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1); //첫번째 질문 저장
		
		Question q2 = new Question();
		q2.setSubject("스프링부트 모델 질문입니다.");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2); //두번째 질문 저
	
	*/
		
		/*
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		
		Question q = all.get(0);
		assertEquals("First Question for you!", q.getSubject());
		*/
	}

}
