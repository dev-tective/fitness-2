package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Membership;
import com.gatodev.fitness.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    private MembershipRepository membershipRepository;

    @Override
    public Membership addMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    @Override
    public Membership updateMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    @Override
    public Membership getMembership(Long id) {
        return membershipRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membership not found"));
    }

    @Override
    public void deleteMembership(Long id) {
        membershipRepository.deleteById(id);
    }

    @Override
    public List<Membership> getMemberships() {
        return membershipRepository.findAll();
    }
}
