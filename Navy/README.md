# NAVIYA 프로젝트
## 05-13
 * UI & UX 메인페이지 구현
 	> - 메인페이지 view UI를 생성
 	> - 메인페이지 vsCode -> jsp로 구현
 	> - 시큐리티를 활용한 회원가입, 로그인, 로그아웃, 마이페이지 구현(UI 안됨)

 	<!--
			$("input").prop("readonly",true)
			
			
			$(document).on("click",".btn_update",function(){
				let pass = $("#password").val()
				if(pass == "") {
					alert("수정하려면 비밀번호를 입력한 후 \n"
							+"다시 수정하기 버튼을 클릭하세요")
					// $("div.password").css("display","block")
					$("#password").prop("readonly",false)
					$("#password").focus()
					return false
				}
				 -->