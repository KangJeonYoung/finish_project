<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
    
<!DOCTYPE html>
<html lang="UTF-8">


<%@include file="includes/header.jsp" %>

             <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">관리자 권한 페이지</h1>
                </div>
            </div>
            
           <div class="row">
 			    <div class="container">
            <div class="col-md-4 ">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">계정별 권한 설정</h3>
                    </div>
                    <div class="panel-body">
                        <form method='post' action="/authInsert" >
                            <fieldset>
                                <div class="col-md-6">
                                    <input class="form-control" placeholder="userid" name="userid" type="text">
                                </div>
                                <div class="pr-1">
									<select class="col-md-6 pr-1" name="auth">
									    <option value="">권한 선택</option>
									    <option value="0">일반 계정</option>
									    <option value="1">관리자 계정</option>
									</select>
                                </div>
                                <br><br><br>
                                <button type="submit" class="btn btn-lg btn-success btn-block">설정 확인</button>
                            </fieldset>
                        </form>
	                </div>
	                </div>
	            </div>
	         </div>
	     </div>

           <div class="row">
 			    <div class="container">
            <div class="col-md-4 ">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">계정 삭제 설정</h3>
                    </div>
                    <div class="panel-body">
                        <form method='post' action="/remove" >
                            <fieldset>
                                <div class="col-md-12">
                                    <input class="form-control" placeholder="userid" name="userid" type="text">
                                </div>
                                <br><br><br>
                                <button type="submit" class="btn btn-lg btn-success btn-block">설정 확인</button>
                            </fieldset>
                        </form>
	                </div>
	                </div>
	            </div>
	         </div>
	     </div>


	<!-- 아래코드는 footer -->
<%@ include file="includes/footer.jsp" %>

<c:if test="${model != '1' }">  
	<script>
		location.href="/board/list"
	</script>
</c:if>
            
</body>

</html>
