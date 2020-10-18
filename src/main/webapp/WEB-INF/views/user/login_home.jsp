<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html> 
<html>
<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js" ></script>
<head>
<link rel="stylesheet" type="text/css" href="/resources/css/styles.css">
	<title>로그인</title>
	<style type="text/css">
		#userId{margin-left : 280px;}
		#userPass{margin-left : 280px;}		
	</style>
	<script type="text/javascript">

	</script>
</head>

<body>

<a class="navbar-brand js-scroll-trigger" style="color:black; font-size:17px;" href="http://localhost:8082">쇼핑몰 만들기</a>
<form id ="writeForm" name ="writeForm" method="post">
	        <section class="page-section" id="contact">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">로그인</h2>
                    <h3 class="section-subheading text-muted">저희 쇼핑몰에 오신걸 환영합니다.</h3>
                </div>
                
                    <div class="row align-items-stretch mb-5">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input class="form-control" id="userId" name="userId" type="text" placeholder="아이디" required="required" data-validation-required-message="Please enter your id." />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="form-group">
                                <input class="form-control" id="userPass" name="userPass" type="text" placeholder="비밀번호" required="required" data-validation-required-message="Please enter your password." />
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                    </div>
                    <div class="text-center">
                        <div id="success"></div>
                        <button class="btn btn-primary btn-xl text-uppercase" onclick="javascript:register()" id="submit" type="submit">로그인</button>
                    </div>
                
            </div>
        </section>
	<script src="/resources/assets/mail/jqBootstrapValidation.js"></script>
    <script src="/resources/assets/mail/contact_me.js"></script>	
</form>


</body>

</html>
