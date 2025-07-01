/**
 * 
 */
package egovframework.example.auth.service;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author user
 *	VO = 테이블
 */
@Getter
@Setter
@AllArgsConstructor     // 모든필드 생성자
@NoArgsConstructor		// 모두없는 생성자
@ToString
@EqualsAndHashCode(callSuper = false)
public class MemberVO extends Criteria {

	private String email;				// 기본키,로그인 ID		
	private String password;			// 암호
	private String name;				// 유저명
	
}
