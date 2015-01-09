<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<!-- saved from url=(0021)https://worktile.com/ -->
<html lang="zh-CN" class="">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
    @charset "UTF-8";
    [ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,
    .ng-hide{display:none !important;}ng\:form{display:block;}
    .ng-animate-block-transitions{transition:0s all!important;-webkit-transition:0s all!important;}
    .ng-hide-add-active,.ng-hide-remove{display:block!important;}
    </style>
    <meta charset="utf-8">
    <title>Worktile 让工作更简单 - Worktile</title>
    <link rel="stylesheet" type="text/css" href="css/base_common.css">
    <link rel="stylesheet" type="text/css" href="css/base_outer.css">

    
    <meta name="author" content="YCTech">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="maximum-scale=1.0,width=device-width,initial-scale=1.0,user-scalable=no">
    <meta name="keywords" content="团队协同,项目管理,任务管理,项目协作,在线办公,协作办公,SAAS,云协作,企业办公">
    <meta name="description" content="worktile，让工作更简单。Worktile是一个团队协同工具，通过简单的协作、沟通和分享，实现团队交互与任务管理的轻松协作。工作随身带，多平台、云数据，随时随地与团队一起工作，项目、任务、文件、话题、文档、事件、活动流、通知和日历，一个都不能少。">
    <!--[if lt IE 9]>
    <script src="/iejs/html5shiv/3.6.2/html5shiv.js"></script>
    <script src="/iejs/respond/1.1.0/respond.js"></script>
    <![endif]-->
    <!--[if lte IE 8]>
    <script src="/iejs/json/json2.js"></script>
    <![endif]-->

    
    <script type="text/javascript" async="" src="js/atrk.js"></script>
    <script charset="utf-8" src="js/lxb.js"></script>
    <script charset="utf-8" src="js/v.js"></script>
    <script>
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F6091ae364b1e135eee2ab1cd60659210' type='text/javascript'%3E%3C/script%3E"));
    </script>
    <script src="js/h.js" type="text/javascript"></script>
    <style type="text/css">.fancybox-margin{margin-right:0px;}</style>
</head>
<body class="">
<header id="header">

    <nav id="header_outer" class="navbar navbar-inverse navbar-default navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-header-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a id="header_logo" class="navbar-brand" href="main.js" title="Worktile">Worktile</a>
        </div>
        <div class="collapse navbar-collapse navbar-header-collapse">

            <ul id="header_menu" class="nav navbar-nav">
                <li class="active">
                <a href="main.jsp">首页</a>
                </li>
                <li>
                <a href="main.jsp">功能</a>
                </li>
                <li>
                <a href="main.jsp">产品</a>
                </li>
                <li>
                <a href="main.jsp">关于</a>
                </li>
                <li>
                <a href="main.jsp">联系</a>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right ng-scope" ng-controller="user_ctrl" id="header_me">
                <li class="divider-vertical hidden-xs"></li>
                
                <li>
                    <a class="mr_15" href="login.jsp">登录</a>
                </li>
                <li>
                    <a href="login.jsp">注册</a>
                </li>
                
            </ul>
        </div>
</nav>

</header>
<div id="wrap-all"><div id="main" class="inner">
    <div id="index-wrap">
<div class="index-banner">
    <div class="index-banner-wrap">
        <div class="index-banner-inner">
            <h1>让你的大学生活更充实</h1>
            <p>
                一个免费的平台、积极向上的团队，<br>
                让你的大学生活更加丰富多彩
            </p>
            <div class="index-banner-action">
                <a class="btn btn-success btn-lg" href="https://worktile.com/signup">
                    加入我们
                </a>　
            </div>
            <div ng-controller="index_carousel_ctrl" class="index-banner-carousel ng-scope">
                <video controls="" height="281" poster="/img/index/index_video.png" preload="none" width="458">
                    <source src="https://dn-wt-video.qbox.me/worktile-for-teamwork.mp4" type="video/mp4">
                    <source src="https://dn-wt-video.qbox.me/worktile-for-teamwork.webm" type="video/webm">
                </video>
            </div>
        </div>
    </div>
</div>

<div class="index-body">
    <h3 class="index-feature-title">
        <span>团队项目</span>
    </h3>
    <ul class="index-feature">
        <li>
            <img src="img/i1.png" alt="提高效率">
            <br>
            <h4>提高效率</h4>
            灵活的任务和日程，让团队成员的<br>
            效率迅速提升，工作就是这么简单
        </li>
        <li>
            <img src="img/i2.png" alt="无缝沟通">
            <br>
            <h4>无缝沟通</h4>
            简单好用的在线讨论，无处不在的<br>
            关注和评论，与团队成员之间无缝沟通
        </li>
        <li>
            <img src="img/i3.png" alt="资源共享">
            <br>
            <h4>资源共享</h4>
            无共享，不协同，完善的文件共享<br>
            让你的团队达到真正意义上的协同
        </li>
        <li>
            <img src="img/i4.png" alt="帮助记录">
            <br>
            <h4>帮助记录</h4>
            强大的在线文档编辑，帮助团队<br>
            记录，积累沉淀形成团队知识库
        </li>
    </ul>

    <h3 class="index-other-title">成品展览</h3>
    <ul class="index-other-list">
        <li>
            <a href="https://worktile.com/plan">
            <img src="img/index-other-plan.png" alt="付费方案">
            <h4>解决方案</h4>
            免费版、商业版任您选择
            </a>
        </li>
        <li>
            <a href="https://worktile.com/mobile">
            <img src="img/index-other-mobile.png" alt="移动版">
            <h4>移动互联网</h4>
            iPhone、Android全平台支持
            </a>
        </li>
        <li>
            <a href="https://worktile.com/security">
            <img src="img/index-other-security.png" alt="数据安全">
            <h4>嵌入式产品</h4>
            Arm处理器，智能设备等
            </a>
        </li>
        <li>
            <a href="https://worktile.com/club">
            <img src="img/index-other-feedback.png" alt="用户社区">
            <h4>产品设计</h4>
            用心倾听您的声音，做好产品
            </a>
        </li>
    </ul>
</div>
<footer id="footer-outer" class="hidden-xs">
    <div class="columns">
        <ul class="column mr_210">
            <li><h2>产品</h2></li>
            <li><a href="https://worktile.com/tour">功能特性</a></li>
            <li><a href="https://worktile.com/mobile">移动版本</a></li>
        </ul>
        <ul class="column mr_210">
            <li><h2>媒体</h2></li>
            <li><a href="https://worktile.com/uservoice">用户怎么说</a></li>
            <li><a href="https://worktile.com/customers">他们也在用</a></li>
        </ul>
        <ul class="column mr_210">
            <li><h2>支持</h2></li>
            <li><a href="https://worktile.com/help">帮助中心</a></li>
            <li><a href="https://worktile.com/guide">用户指南</a></li>
        </ul>
        <ul class="column">
            <li><h2>更多</h2></li>
            <li><a href="https://worktile.com/about">关于我们</a></li>
            <li><a href="https://worktile.com/contact">联系我们</a></li>
        </ul>
    </div>
    <div class="text-center">
        © 2014 zml.com &nbsp; 大连理工大学创新实验学院 &nbsp; 移动互联网实验室
    </div>
</footer>
</div>
</div></div>

<script type="text/javascript">
    window.wt = {};
</script>

<script src="./Worktile 让工作更简单 - Worktile_files/js.js"></script>

<!-- Start Alexa Certify Javascript -->
<script type="text/javascript">
    _atrk_opts = { atrk_acct:"I+xBi1a4ZP00O9", domain:"worktile.com",dynamic: true};
    (function() { var as = document.createElement('script'); as.type = 'text/javascript'; as.async = true; as.src = "https://d31qbv1cthcecs.cloudfront.net/atrk.js"; var s = document.getElementsByTagName('script')[0];s.parentNode.insertBefore(as, s); })();
</script>
<noscript>&lt;img src="https://d5nxst8fruw4z.cloudfront.net/atrk.gif?account=I+xBi1a4ZP00O9" style="display:none" height="1" width="1" alt="" /&gt;</noscript>
<!-- End Alexa Certify Javascript -->

<script type="text/javascript">
    angular.element(document).ready(function() {
        initOuterApp();
        angular.bootstrap(document, ['wt']);
    });
</script>

</body>
</html>
