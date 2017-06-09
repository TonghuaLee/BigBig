<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>测试</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link href="plugins/webuploader/css/webuploader.css" rel="stylesheet" type="text/css">
    <link href="assets/css/minified/bootstrap.min.css" rel="stylesheet" type="text/css">

    <script type="text/javascript" src="plugins/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="plugins/jquery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="plugins/webuploader/webuploader.min.js"></script>
    <script type="text/javascript" src="js/uploader.js"></script>
</head>
<body>
<div class="page-container">
    <div class="page-content">
        <div class="content-wrapper">
            <div class="content">
                <div class="row">

                    <div class="col-lg-4">

                        <!-- Progress counters -->
                        <div class="row">
                            <div class="col-md-6">

                                <!-- Available hours -->
                                <div class="panel text-center">
                                    <div class="panel-body">
                                        <div id="uploader" class="wu-example">
                                            <!--用来存放文件信息-->
                                            <div id="thelist" class="uploader-list"></div>
                                            <div class="btns">
                                                <div id="picker">选择文件</div>
                                                <button id="upload" class="btn btn-default">开始上传</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- /available hours -->
                            </div>

                        </div>
                        <!-- /progress counters -->

                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</div>


</body>
</html>