package cf.dylan.login.security;

import cf.dylan.login.security.util.JWTUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JWTTests {

    private JWTUtil jwtUtil;

    @BeforeEach
    public void testBefore() {
        System.out.println("testBefore.............");
        jwtUtil = new JWTUtil();
    }

    @Test
    public void testEncode() throws Exception {
        String email = "user95@jonghyun.cf";

        String str = jwtUtil.generateToken(email);
        System.out.println(str);
    }

    @Test
    public void testValidate() throws Exception {

        String email = "user95@jonghyun.cf";

        String str = jwtUtil.generateToken(email);
        System.out.println(str);

        Thread.sleep(5000);

        String resultEmail = jwtUtil.validateAndExtract(str);

        System.out.println(resultEmail);
    }
}
