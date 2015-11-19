/**
 * 
 */
package com.mock.infyview.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mock.infyview.model.AppUser;
import com.mock.infyview.model.AppUserRole;

/**
 * @author Saby
 *
 */
@Service("authenticationService")
public class UserAuthenticationProvider implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		AppUser appUser = findByUserName(userName);
		List<GrantedAuthority> authorities = buildUserAuthority(appUser.getUserRole());
		return buildUserForAuthentication(appUser, authorities);
	}
	
	private AppUser findByUserName(String userName){
		List<AppUser> appUsers = new ArrayList<AppUser>();
		
		AppUser u1 = new AppUser("CEO", "Infosys1", true);
		Set<AppUserRole> appUserRoles1 = new HashSet<AppUserRole>();
		AppUserRole role1 = new AppUserRole(u1, "ROLE_CEO"); 
		appUserRoles1.add(role1);
		u1.setUserRole(appUserRoles1);
		appUsers.add(u1);
		
		AppUser u2 = new AppUser("DM", "Infosys2", true);
		Set<AppUserRole> appUserRoles2 = new HashSet<AppUserRole>();
		AppUserRole role2 = new AppUserRole(u2, "ROLE_DM"); 
		appUserRoles2.add(role2);
		u2.setUserRole(appUserRoles2);
		appUsers.add(u2);
		
		AppUser u3 = new AppUser("UnitHead", "Infosys3", true);
		Set<AppUserRole> appUserRoles3 = new HashSet<AppUserRole>();
		AppUserRole role3 = new AppUserRole(u3, "ROLE_UnitHead"); 
		appUserRoles3.add(role3);
		u1.setUserRole(appUserRoles3);
		appUsers.add(u3);
		
		//appUsers.add(new AppUser("CEO", "Infosys1", true));
		//appUsers.add(new AppUser("DM","Infosys2",true));
		//appUsers.add(new AppUser("UnitHead","Infosys3",true));
		
		for (AppUser appUser : appUsers){
			if(appUser.getUserName().equalsIgnoreCase(userName)){
				return appUser;
			}
		}
		return null;
	}
	
	private List<GrantedAuthority> buildUserAuthority(Set<AppUserRole> appUserRoles){
		
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		// Build user's authorities
		for (AppUserRole appUserRole : appUserRoles) {
			setAuths.add(new SimpleGrantedAuthority(appUserRole.getRole()));
		}
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
		return Result;
	}
	
	private User buildUserForAuthentication(AppUser appUser, List<GrantedAuthority> authorities) {
			return new User(appUser.getUserName(), appUser.getPassword(), appUser.isEnabled(), true, true, true, authorities);
		}
}
