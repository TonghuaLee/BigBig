<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Clairvoyance 全景播放器·用户反馈</title>

	<!-- Global stylesheets -->
	<link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
	<link href="assets/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
	<link href="assets/css/minified/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="assets/css/minified/core.min.css" rel="stylesheet" type="text/css">
	<link href="assets/css/minified/components.min.css" rel="stylesheet" type="text/css">
	<link href="assets/css/minified/colors.min.css" rel="stylesheet" type="text/css">
	<!-- /global stylesheets -->

	<!-- Core JS files -->
	<script type="text/javascript" src="assets/js/plugins/loaders/pace.min.js"></script>
	<script type="text/javascript" src="assets/js/core/libraries/jquery.min.js"></script>
	<script type="text/javascript" src="assets/js/core/libraries/bootstrap.min.js"></script>
	<script type="text/javascript" src="assets/js/plugins/loaders/blockui.min.js"></script>
	<!-- /core JS files -->

	<!-- Theme JS files -->
	<script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
	<script type="text/javascript" src="assets/js/plugins/forms/styling/switch.min.js"></script>
	<script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>

	<script type="text/javascript" src="assets/js/core/app.js"></script>
	<script type="text/javascript" src="assets/js/pages/form_checkboxes_radios.js"></script>
	<!-- /theme JS files -->

</head>

<body>

<!-- Page container -->
<div class="page-container login-container">

	<!-- Page content -->
	<div class="page-content">

		<!-- Main content -->
		<div class="content-wrapper">

			<!-- Content area -->
			<div class="content">

				<!-- Form horizontal -->
				<div class="panel panel-flat">
					<div class="panel-heading">
						<h5 class="panel-title">提点问题吧，我会努力攻克的！</h5>
						<div class="heading-elements">
							<ul class="icons-list">
								<li><a data-action="collapse"></a></li>
								<li><a data-action="reload"></a></li>
							</ul>
						</div>
					</div>

					<div class="panel-body">

						<form class="form-horizontal" action="#">
							<fieldset class="content-group">
								<legend class="text-bold">我来反馈</legend>

								<div class="form-group">
									<div class="col-lg-12">
										<textarea rows="5" cols="5" class="form-control" placeholder="哪里用的不爽的，告诉我..."></textarea>
									</div>
								</div>
							</fieldset>

							<fieldset class="content-group">
								<legend class="text-bold">问题类型</legend>

								<div class="form-group">

									<div class="col-md-4">
										<div class="radio">
											<label>
												<div class="choice border-warning-600 text-warning-800"><span class="checked"><input type="radio" name="radio-styled-color" class="control-warning"></span></div>
												我要吐槽
											</label>
										</div>
									</div>
									<div class="col-md-4">
										<div class="radio">
											<label>
												<div class="choice border-info-600 text-info-800"><span><input type="radio" name="radio-styled-color" class="control-info"></span></div>
												发现问题
											</label>
										</div>
									</div>
									<div class="col-md-4">

										<div class="radio">
											<label>
												<div class="choice border-indigo-600 text-indigo-800"><span><input type="radio" name="radio-styled-color" class="control-custom"></span></div>
												提点意见
											</label>
										</div>
									</div>
									</div>



							</fieldset>

							<fieldset class="content-group">
								<legend class="text-bold">联系方式</legend>

								<div class="form-group">
									<div class="col-lg-12">
										<div class="input-group">
											<span class="input-group-addon"><i class="icon-comment"></i></span>
											<input type="text" class="form-control" placeholder="请留下您的手机/QQ/邮箱/微信">
										</div>
									</div>
								</div>


							</fieldset>


							<div class="text-center">
								<button type="submit" class="btn btn-primary">提交 <i class="icon-arrow-right14 position-right"></i></button>
							</div>
						</form>
					</div>
				</div>
				<!-- Footer -->
				<div class="footer text-muted">
					&copy; 2017. <a href="#">Clairvoyance Panoramic Player  by 李宽</a>
				</div>
				<!-- /footer -->

			</div>
			<!-- /content area -->

		</div>
		<!-- /main content -->

	</div>
	<!-- /page content -->

</div>
<!-- /page container -->

</body>
</html>
