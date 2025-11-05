package com.gatodev.fitness.services.impl;

import com.gatodev.fitness.entities.Membership;
import com.gatodev.fitness.repositories.MembershipRepository;
import com.gatodev.fitness.services.MembershipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipServiceImpl implements MembershipService {

    private final MembershipRepository membershipRepository;

    public MembershipServiceImpl(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

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
                .orElseThrow(() -> new RuntimeException("Membresía no encontrada"));
    }

    @Override
    public void deleteMembership(Long id) {
        membershipRepository.findById(id).ifPresentOrElse(
                membership -> {
                    membership.setActive(false);
                    membershipRepository.save(membership);
                },
                () -> {
                    throw new RuntimeException("Membresía no encontrada");
                }
        );
    }

    @Override
    public List<Membership> getMemberships() {
        return membershipRepository.findAll();
    }
}
