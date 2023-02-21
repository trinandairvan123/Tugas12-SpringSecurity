import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        // Replace this with actual implementation that loads user details from database
        if ("081234567890".equals(phone)) {
            return new User("081234567890", "$2a$10$rnLpAlTthJqqT8EjHSdfMuKYwMsoMYOzyZdnm8Xz1JZmxTBtOumnm",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with phone: " + phone);
        }
    }
}
