<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/img/image.ico" type="image/vnd.microsoft.icon">
    <title>安卓后端图片上传</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/image.css">
</head>
<body>
    <form id="file_of_pic1" method="post" action="" enctype="multipart/form-data" name = "file">
        <input id="file" type="file" name="file" accept="image/gif,image/jpeg,image/jpg,image/png,image/svg">
    </form>
    <hr/>
    <div id="tip"><!-- 演示提示 --></div>
    <ul id="report"><!-- 演示报告 --></ul>
    <footer>
        <p style=""><a href="https://github.com/think2011/localResizeIMG3">localResizeIMG3 by think2011</a></p>
    </footer>
</body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.form/4.2.2/jquery.form.js"></script>
<script src="js/lrz.pc.min.js"></script>
<script src="/js/image.js"></script>
</html>