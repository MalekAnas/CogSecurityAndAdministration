package se.sigma.security.service;

public interface SecurityUserService {
    String validatePasswordResetToken(long id, String token);

}
