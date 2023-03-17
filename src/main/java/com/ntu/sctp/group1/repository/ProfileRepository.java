package com.ntu.sctp.group1.repository;

import com.ntu.sctp.group1.entity.Profile;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    Optional<Profile> findByVolunteerId(Integer volunteerid);
}
