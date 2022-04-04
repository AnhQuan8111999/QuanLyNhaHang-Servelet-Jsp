<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Danh sách món ăn</title>
<link rel="stylesheet" href="/QLNhaHang/view/static2/css/main.css">
</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="dashboard">

				<jsp:include page="/view/share/leftmenu.jsp"></jsp:include>

				<div class="right">
					<div class="right__content">
						<div class="right__title">Combo : ${combo.ten }</div>
						<div class="right__formWrapper">

							<form action="/QLNhaHang/admin/danhsachmonan" method="post">
								<div class="right__inputWrapper">
									<input type="text" placeholder="Nhập tên món ăn" id="tenmonan"
										name="ten" autofocus>
								</div>
								
								<button class="btn" type="submit" onclick="abc()">Tìm kiếm</button>
							</form>
						</div>					
						
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
											<th>Thêm</th>
										</tr>
									</thead>
									<c:forEach var="monAn" items="${monAns}">
										<tbody>
											<tr>
												<td>${monAn.id}</td>
												<td>${monAn.ten}</td>
												<td>${monAn.loai}</td>
												<td>${monAn.gia}</td>
												<td>${monAn.moTa}</td>
												<td data-label="Thêm" class="right__iconTable"><a
													href="/QLNhaHang/admin/addcombomonan?idcombo=${combo.id}&idmonan=${monAn.id}"><img
														src="/QLNhaHang/view/static2/assets/icon-edit.svg" alt=""></a></td>

											</tr>
										</tbody>
									</c:forEach>
								</table>
								
							</div>
						</div>
						<div class="right__formWrapper" style="text-align: center;">									
								<a  href="/QLNhaHang/admin/addcombo1?idcombo=${combo.id}" class="left__name" style="text-align: center;color: blue;">Thoát</a>
								</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="/QLNhaHang/view/static2/js/main.js"></script>
	<script>
		if( ${check}==1) {
			alert(" Thêm món ăn thành công");
		}else{
			alert(" Món ăn đã có trong combo . Mời bạn chọn món khác");
		};
	</script>
</body>
</html>