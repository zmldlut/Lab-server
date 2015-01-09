<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>智能实验室后台管理系统</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/fullcalendar.css" />   
        <link rel="stylesheet" href="css/unicorn.main.css" />
        <link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />
    </head>
    <body>
        <div id="header">
            <h1><a href="./dashboard.html">管理员</a></h1>
        </div>
        <div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li  class="btn btn-inverse dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">欢迎Admin</span><b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#"><i class="icon-user"></i> 我的资料</a></li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="icon-check"></i> 我的任务</a></li>
                    <li class="divider"></li>
                    <li><a href="login.html"><i class="icon-key"></i> 退出</a></li>
                  </ul>
                </li>
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span></a></li>
                <li class="btn btn-inverse"><a title="" href="admin_login.jsp"><i class="icon icon-share-alt"></i> <span class="text">登出</span></a></li>
            </ul>
        </div>

        <div id="search">
            <input type="text" placeholder="Search here..." /><button type="submit" class="tip-right" title="Search"><i class="icon-search icon-white"></i></button>
        </div>

        <div id="sidebar">
            <a href="#" class="visible-phone"><i class="icon icon-home"></i> 首页</a>
            <ul>
                <li class="active"><a href="index.html"><i class="icon icon-home"></i> <span>首页</span></a></li>
                <li class="submenu">
                    <a href="#"><i class="icon icon-th-list"></i> <span>用户信息管理</span> <span class="label">3</span></a>
                    <ul>
                        <li><a href="form-common.html">用户信息查询</a></li>
                        <li><a href="form-validation.html">用户信息录入</a></li>
                        <li><a href="form-wizard.html">用户信息修改</a></li>
                        <li><a href="form-wizard.html">用户信息统计</a></li>
                    </ul>
                </li>
                <li class="submenu">
                    <a href="#"><i class="icon icon-file"></i> <span>设备管理</span> <span class="label">4</span></a>
                    <ul>
                        <li><a href="invoice.html">设备信息查询</a></li>
                        <li><a href="chat.html">设备信息录入</a></li>
                        <li><a href="calendar.html">设备信息修改</a></li>
                        <li><a href="gallery.html">设备信息统计</a></li>
                    </ul>
                </li>
                <li>
                    <a href="charts.html"><i class="icon icon-signal"></i> <span>门锁管理</span></a>
                </li>
                <li>
                    <a href="widgets.html"><i class="icon icon-inbox"></i> <span>签到管理</span></a>
                </li>
            </ul>
        
        </div>
        
        <div id="style-switcher">
            <i class="icon-arrow-left icon-white"></i>
            <span>Style:</span>
            <a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
            <a href="#blue" style="background-color: #2D2F57;"></a>
            <a href="#red" style="background-color: #673232;"></a>
        </div>
        
        <div id="content">
            <div id="content-header">
                <h1>首页</h1>
                <div class="btn-group">
                    <a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
                    <a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
                    <a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
                    <a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
                </div>
            </div>
            <div id="breadcrumb">
                <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
                <a href="#" class="current">首页</a>
            </div>
                <div class="row-fluid">
                    <div class="span12">
                        <div class="alert alert-info">
                            Welcome in the <strong>Unicorn Admin Theme</strong>. Don't forget to check all the pages!
                            <a href="#" data-dismiss="alert" class="close">×</a>
                        </div>
                        <div class="widget-box">
                            <div class="widget-title"><span class="icon"><i class="icon-signal"></i></span><h5>Site Statistics</h5><div class="buttons"><a href="#" class="btn btn-mini"><i class="icon-refresh"></i> Update stats</a></div></div>
                            <div class="widget-content">
                                <div class="row-fluid">
                                <div class="span4">
                                    <ul class="site-stats">
                                        <li><i class="icon-user"></i> <strong>1433</strong> <small>Total Users</small></li>
                                        <li><i class="icon-arrow-right"></i> <strong>16</strong> <small>New Users (last week)</small></li>
                                        <li class="divider"></li>
                                        <li><i class="icon-shopping-cart"></i> <strong>259</strong> <small>Total Shop Items</small></li>
                                        <li><i class="icon-tag"></i> <strong>8650</strong> <small>Total Orders</small></li>
                                        <li><i class="icon-repeat"></i> <strong>29</strong> <small>Pending Orders</small></li>
                                    </ul>
                                </div>
                                <div class="span8">
                                    <div class="chart"></div>
                                </div>  
                                </div>                          
                            </div>
                        </div>                  
                    </div>
                </div>

                <div class="row-fluid">
                    <div id="footer" class="span12">
                        2012 &copy; Unicorn Admin. Brought to you by <a href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/excanvas.min.js"></script>
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.ui.custom.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.flot.min.js"></script>
        <script src="js/jquery.flot.resize.min.js"></script>
        <script src="js/jquery.peity.min.js"></script>
        <script src="js/fullcalendar.min.js"></script>
        <script src="js/unicorn.js"></script>
        <script src="js/unicorn.dashboard.js"></script>
</body></html>