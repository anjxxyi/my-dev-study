package com.tj.edu.practice5.jpa.model;

import com.tj.edu.practice5.jpa.repository.MemberLogHistoryRepository;
import com.tj.edu.practice5.jpa.repository.MemberRepository;
import com.tj.edu.practice5.jpa.util.SpringBeanUtils;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberEntityListener {
    @Autowired
    private MemberLogHistory memberLogHistory;

    @PostUpdate
    @PostPersist
    public void postPersistAndPostUpdate(Object o) {
//        MemberLogHistoryRepository memberLogHistoryRepository = SpringBeanUtils.getBean(MemberLogHistoryRepository.class);

        Member member = (Member) o;

        MemberLogHistory memberLogHistory = MemberLogHistory.builder()
                .memberId(member.getId())
                .name(member.getName())
                .email(member.getEmail())
                .male(member.getMale())
                .build();
        memberLogHistory.save(memberLogHistory);

    }
}
