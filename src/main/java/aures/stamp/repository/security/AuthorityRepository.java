/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: AuthorityRepository
 *	@CreatedOn	: 05-27-2023
 *
 *	@Type		: Interface
 *	@Layaer		: Repository
 *	@Goal		: Security
 *
 **/

package aures.stamp.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import aures.stamp.model.security.Authority;

@RepositoryRestResource(collectionResourceRel = "authority", path = "authority")
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    
}