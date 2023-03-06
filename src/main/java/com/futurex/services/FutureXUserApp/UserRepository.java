package com.futurex.services.FutureXUserApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public class UserRepository extends JpaRepository<User, BigInteger> {
}
