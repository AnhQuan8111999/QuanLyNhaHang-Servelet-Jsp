<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Trang chủ</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">
				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>
				<div class="right">
					<div class="right__content">
						<div class="right__title"> Menu</div>												
						<div class="right__table">
							<div class="right__tableWrapper">
								<table>
									<thead>
										<tr>
											<th>Id</th>	
											<th>Tên</th>										
											<th>Loại</th>
											<th>Giá</th>
											<th>Mô tả</th>																						                                                                                      										
										</tr>
									</thead>
									<c:forEach var="monAn" items="${monAns}">
									<tbody>
										<tr>											
											<td >${monAn.id}</td>
											<td >${monAn.ten}</td>
											<td >${monAn.loai}</td>
											<td >${monAn.gia}</td>
											<td >${monAn.moTa}</td>																																                                            
										</tr>
									</tbody>
									</c:forEach>									
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/QLNhaHang/view/static2/js/main.js"></script>
</body>
</html>