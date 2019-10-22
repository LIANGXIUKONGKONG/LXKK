<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${WEB_PATH}/resources/layui/css/layui.css">
    <script src="${WEB_PATH}/resources/layui/layui.js"></script>
    <link rel="stylesheet" href="${WEB_PATH}/resources/css/iconfont.css">
    <link rel="stylesheet" href="${WEB_PATH}/resources/css/admin.css">
    <link rel="stylesheet" href="${WEB_PATH}/resources/layui/css/modules/layer/default/layer.css">
    <script src="${WEB_PATH}/resources/js/jquery-3.0.0.min.js"></script>
</head>
<style>
    .my-layout-right{
        margin-right: 5%;
    }
    .layui-header a{
        color: #ffffff !important;
    }
    .layui-nav-child a{
        color: black !important;
    }
    #my-side dl a{
        color: #ffffff !important;
    }
</style>
<script>
    $(function () {
        layui.use('element', function () {
            var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

            //监听导航点击
            element.on('nav(demo)', function (elem) {
                //console.log(elem)
                layer.msg(elem.text());
            });
        });
        $('#BTN_CHANG_SIDE').on('click',function () {
            alert(2)
            console.log($('#my-side'));
            $('#my-side').css('display','none');
        });
        $('#layout').on('click',function () {
            localStorage.clear();
            window.location.href = '${WEB_PATH}/admin/loginPage';
        });


    })
    $(document).ready(function () {
        var newPage = '<iframe src="/school_cloud/role/query" id="demoAdmin" style="width: 100%; height: 90%;" frameborder="0"></iframe>';
        $('.layui-body').append($(newPage));
    });
    function openPage(url) {
        $("#demoAdmin").attr('src',url);
    }
</script>
<body class="layui-layout-body ">
<div class="layadmin-tabspage-none">
    <div class="layui-layout layui-layout-admin my-layout">
        <div class="layui-header layui-bg-green">
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item layadmin-flexible" lay-unselect>
                    <a href="" layadmin-event="flexible" title="侧边伸缩" id="BTN_CHANG_SIDE">
                        <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
                    </a>
                </li>
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="" title="前台">
                        <i class="layui-icon layui-icon-website"></i>
                    </a>
                </li>
                <li class="layui-nav-item " lay-unselect>
                    <a href="" title="刷新">
                        <i class="layui-icon layui-icon-refresh-3"></i>
                    </a>
                </li>

            </ul>
            <ul class="layui-nav layui-layout-right my-layout-right"  lay-filter="layadmin-layout-right">
                <li class="layui-nav-item" lay-unselect>
                    <a href="" layadmin-event="flexible">
                        <i class="layui-icon layui-icon-notice"></i>
                        <span class="layui-badge-dot"></span>
                    </a>
                </li>
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href=""><img src="${WEB_PATH}/resources/imgs/3.jpg" class="layui-nav-img">${param.account}</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${WEB_PATH}/admin/info">基本信息</a></dd>
                        <dd><a href="${WEB_PATH}/admin/updatePwd">修改密码</a></dd>
                        <dd><a href="javascript:;" id="layout">退出</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
        <div class="layui-side layui-side-menu" id="my-side">
            <div class="layui-side-scroll">
                <div class="layui-logo layui-bg-green" lay-href>
                    <span>CSRCBMS</span>
                </div>8j
                <ul class="layui-nav layui-nav-tree" lay-filter="layadmin-system-side-menu" lay-shrink="all" style="margin-right: 10px;">
                    <c:forEach items="${moduleList}" var="model">
                        <li class="layui-nav-item">
                            <a href="javascript:;" onclick="openPage('${WEB_PATH}${model.modePath}')">
                                <i class="${model.modeIcon}"></i>
                                <cite>${model.modeName}</cite>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="layui-body">

        </div>
        <div class="layui-footer">
            &copy;2019 在线投票系统
        </div>
    </div>

</div>
</body>
</html>