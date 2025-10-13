package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Membership;
import java.util.List;

public interface MembershipService {
    Membership addMembership(Membership membership);

    Membership updateMembership(Membership membership);

    Membership getMembership(Long id);

    void deleteMembership(Long id);

    List<Membership> getMemberships();
}
