package se.sigma.security.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
