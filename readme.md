# 프로젝트 개발 보고서(Project Development Report)
-----------------------------------------------
## 1. 프로젝트 개요(Project Outline)
    
    한글

    영어
	
    
<br><br><br>

## 2. 프로젝트 목적(Project Purpose)
    
    한글
	
    영어

<br><br><br>

## 3. 프로젝트 개발 환경 정보(Project Dvelopement Environment)

<br>


* **Database :** <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
  
* **Backend :**  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/> <img src="https://img.shields.io/badge/mybatis-red?style=for-the-badge&logo=spring&logoColor=white">
  
* **Frontend :** <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"/> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"/><br/>
  
* **CI/CD :** <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"/>
<br><br><br>

## 4. 팀 소개 (Introduce the team)
<center>

|<img src="https://avatars.githubusercontent.com/u/160584115?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/152273002?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/53883433?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/110553201?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|
|이원석<br/>[@jst1024](https://github.com/jst1024)|강범준<br/>[@hololollo](https://github.com/hololollo)|장인범<br/>[@dlsqja432](https://github.com/dlsqja432)|박범수<br/>[@nawe1](https://github.com/nawe1)|

</center>

<br><br><br>

## 5. 서비스 시나리오(Service User Scenario)

회원/비회원 사용자 시나리오(Member User Scenario)

## 비회원
1. 홈페이지 접속 후 현재 판매중인 책을 확인 한다.
2. 사용자가 원하는 장르가 있는지 확인한다.
3. 필요한 책이 있을 경우 검색이 가능한지 확인한다.
4. 리스트를 클릭하면 상세정보를 볼 수 있게 한다.
5. 모든 게시판을 열람'만' 할 수 있게한다.

<br>

## 회원
1. 홈페이지 접속 후 현재 판매중인 책을 확인 한다.
2. 사용자가 원하는 장르가 있는지 확인한다.
3. 필요한 책이 있을 경우 검색이 가능한지 확인한다.
4. 리스트를 클릭하면 상세정보를 볼 수 있게 한다.
5. 구매나 관심상품등록을 원하는 경우 버튼을 클릭했을 때 로그인창이 뜨게 한다.
6. 회원가입이 되어있다면 로그인, 안되어있다면 회원가입
회원가입을 시작하게 되면, 회원 약관 및 개인정보처리 방침에 동의하도록 한다.
회원가입 페이지에서 필수 정보를 입력하고, 아이디의 중복확인 거쳐 회원 가입을 완료하도록 한다.
회원 가입 후 로그인을 하도록 한다.
7. 해당 책 판매 세부페이지로 이동되게 하여 구매 버튼을 다시 클릭한다.
8. 장바구니 페이지로 이동되어 구매버튼을 클릭한다.
9. 결제창이 열리게되고 결제한다.
10. 공지사항 글을 확인하고, 해당 정보가 없는 경우 궁금한 사항을 질문하기 위해 묻고 답하기로 이동한다.
11. 구매한 책에 대하여 후기를 작성할 수 있고 다른사람의 후기를 볼 수 있다.
12. 후기 작성간 별점을 줄 수 있고, 평균(소수점 첫째 자리)이 해당 책 상세보기 화면에 누적되어 표시된다.
13. 회원 정보를 수정하기 위해 마이페이지화면으로 이동한다.
14. 회원정보 수정은 아이디를 제외한 나머지를 할 수 있다.
15. 마이페이지 주문내역 조회로 이동하여 구매한 내용을 확인한다.
16. 배송 주소록 관리 페이지로 이동하여 배송주소지를 추가/수정/삭제한다.
17. 관심상품(jjim) 확인을 위해 관심상품 페이지로 이동한다.
18. 더 궁금한사항이 있다면 채팅기능을 이용할 수 있도록 채팅버튼(어디던지 존재)을 클릭한다.

사용자는 어디 어디에 방문할지 주요 빌딩과 주요 협회, 맛집 등을 확인한다.
해당 지역의 이벤트나 특이사항을 확인하기 위하여 공지사항의 글을 확인한다.

<br>

## 관리자 시나리오(Administrator Scenario)

1. 관리자로 로그인을 하도록 한다.
2. 관리자 페이지로 이동하여 각종 게시판을 세부관리(추가,수정,삭제)할 수 있도록 한다.
3. 공지사항 목록을 확인하고, 누락된 상세 정보가 있는지 확인한다.
4. 해당 지역의 이벤트나 특이사항을 공지사항으로 등록하도록 한다.
5. 변동된 내용이 있을 경우 공지사항을 수정하도록 한다.
6. 이벤트나 특이사항 중에서 취소된 내용이 있어 공지사항 글을 삭제하도록 한다.
7. 묻고 답하기 목록으로 이동하여 등록된 질문을 확인하여 답변 글을 등록한다.
8. 만약, 스팸 글인 경우나 불필요한 질문이 있는 경우 해당 글을 삭제하도록 한다.
9. 새로 추가된 책이 있어 카테고리별로 내용을 추가한다.
10. 책 소개에 대한 내용변동이 있어 해당 페이지의 내용을 수정한다.
11.  대한 변동사항이 있어 새로운 내용으로 변경한다.
12. 관리자페이지로 이동하여 회원목록으로 이동하여 신규 회원이나 탈퇴 회원을 확인하도록 하고, 현재 제적 사유에 해당하는 회원은 강퇴시키도록 한다.
13. 댓글 또는 게시글의 신고 기능을 통해  괸리자 게시판에  신고 3번 이상 걸린 회원을 띄운다.
14. 신고 누적이 많이 된 회원은 로그인을 제한하는 기능을 괸리자에게 부여하여 회원을 관리한다.

<br><br><br>

## 6. 프로젝트 기획 및 설계(Project Planning & Design)

<br>

### 6-1. 네비게이션 설계(Navigation Design)

![nav](https://github.com/nawe1/team01/assets/161221357/0b0e1226-8276-49c6-ae69-ac8485a9015d)
     
<br>

#### 6-1.1. 자료 수집(Data Collection And Sort) - WordCloud


<br>

#### 6-1.2. 콘텐츠 분류(Content Cort) - Card Sorting



<br>

#### 6-1.3. ERD다이어그램

<br>

#### 6-1-4. 서비스 흐름 설계(Service Flow Design)

![service Flow Design](https://github.com/nawe1/pro1/assets/161221357/77dad7bb-3cd5-4254-a97d-cbe6326639d8)


<br>

## 7.기능 구현

<br>


