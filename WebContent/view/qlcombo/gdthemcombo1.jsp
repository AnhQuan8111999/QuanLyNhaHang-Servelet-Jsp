<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thêm Combo</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">
				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title">Thêm Combo</div>
						<div class="right__formWrapper">

							<form action="/QLNhaHang/admin/addcombo1" method="post">
								<div class="right__inputWrapper">
									<input type="text" placeholder="Nhập tên combo" id="tencombo" value="${combo.ten }"
										name="ten" autofocus>
								</div>
								<div class="right__inputWrapper">
									<input type="number" placeholder="Nhập giá tiền" id="giatien" value="${combo.gia }"
										name="gia" autofocus>
								</div>

								<div class="right__inputWrapper">
									<select name="moTa">
										<option value="${combo.moTa }">Chọn loại combo</option>
										<option disabled selected value="Combo cho 2 nguoi">Loại 1:Combo cho 2
											người</option>
										<option disabled selected value="Combo cho 4 nguoi">Loại 2:Combo cho 4
											người</option>
										<option disabled selected value="Combo cho 6 nguoi">Loại 3:Combo cho 6
											người</option>
										<option disabled selected value="Combo cho 10 nguoi">Loại 4:Combo cho
											10 người</option>
									</select>
								</div>
								
								<button class="btn" type="submit" onclick="abc()">Thêm món ăn</button>
							</form>
						</div>

						<div class="right__table">
							<div class="right__tableWrapper">
								<table>
									<thead>
										<tr>
											<th>Tên món ăn</th>	
											<th>Giá</th>
											<th>Mô tả</th>								  
											<th>Xóa</th>                                                                                   										
										</tr>
									</thead>
									<c:forEach var="comBoMonAn" items="${comBoMonAns}">
									<tbody>
										<tr>											
											
											<td >${comBoMonAn.monAn.ten}</td>											
											<td >${comBoMonAn.monAn.gia}</td>
											<td >${comBoMonAn.monAn.moTa}</td>																																				
											<td data-label="Xoá" class="right__iconTable"><a href="/QLNhaHang/admin/xoamonancomboadd?id=${comBoMonAn.id}&idcombo=${combo.id}"><img src="/QLNhaHang/view/static2/assets/icon-trash-black.svg" alt=""></a></td>                                  
										</tr>
									</tbody>
									</c:forEach>									
								</table>
							</div>
						</div>
						<div class="right__formWrapper" style="text-align: center;">
							<a href="/QLNhaHang/admin/viewcombo?id=${combo.id}" class="left__name"
								style="text-align: center; color: blue;">Hoàn thành</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>

</body>
</html>