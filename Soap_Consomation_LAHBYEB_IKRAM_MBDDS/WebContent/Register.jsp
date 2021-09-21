<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register/Login</title>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script>
    $(function () {

        $('#login-form-link').click(function (e) {
            $("#login-form").delay(100).fadeIn(100);
            $("#register-form").fadeOut(100);
            $('#register-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register-form-link').click(function (e) {
            $("#register-form").delay(100).fadeIn(100);
            $("#login-form").fadeOut(100);
            $('#login-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });

    });
</script>
<style>
    #regContainer {
        margin-top: 3%;
    }

    .panel-login {
        border-color: #ccc;
        background-color: #f9f8f8;
        -webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
        -moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
        box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
    }

        .panel-login > .panel-heading {
            text-align: center;
        }

            .panel-login > .panel-heading a {
                text-decoration: none;
                font-weight: bold;
                font-size: 28px;
                -webkit-transition: all 0.1s linear;
                -moz-transition: all 0.1s linear;
                transition: all 0.1s linear;
            }

                .panel-login > .panel-heading a.active {
                    font-size: 34px;
                }

            .panel-login > .panel-heading hr {
                margin-top: 10px;
                margin-bottom: 0px;
                clear: both;
                border: 0;
                height: 1px;
                background-image: -webkit-linear-gradient(left,rgba(0, 0, 0, 0),rgba(0, 0, 0, 0.15),rgba(0, 0, 0, 0));
                background-image: -moz-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
                background-image: -ms-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
                background-image: -o-linear-gradient(left,rgba(0,0,0,0),rgba(0,0,0,0.15),rgba(0,0,0,0));
            }

        .panel-login input[type="text"], .panel-login input[type="email"], .panel-login input[type="password"] {
            height: 45px;
            border: 1px solid #ddd;
            font-size: 16px;
            -webkit-transition: all 0.1s linear;
            -moz-transition: all 0.1s linear;
            transition: all 0.1s linear;
        }

        .panel-login input:hover,
        .panel-login input:focus {
            outline: none;
            -webkit-box-shadow: none;
            -moz-box-shadow: none;
            box-shadow: none;
            border-color: #ccc;
        }

    .btn-login {
        background-color: #05233c;
        outline: none;
        color: #fff;
        font-size: 14px;
        height: auto;
        font-weight: normal;
        padding: 14px 0;
        text-transform: uppercase;
        border-color: #05233c;
    }

        .btn-login:hover,
        .btn-login:focus {
            color: #fff;
            background-color: #198da8;
            border-color: #53A3CD;
        }

    .btn-register {
        background-color: #93c83f;
        outline: none;
        color: #fff;
        font-size: 14px;
        height: auto;
        font-weight: normal;
        padding: 14px 0;
        text-transform: uppercase;
        border-color: #93c83f;
    }

        .btn-register:hover,
        .btn-register:focus {
            color: #fff;
            background-color: #1CA347;
            border-color: #1CA347;
        }

    .fullscreen_bg {
        position: fixed;
        top: 0;
        right: 0;
        bottom: 0;
        left: 0;
        background-size: cover;
        background-position: 50% 50%;
        background-image: url('');
        background-repeat: repeat;
    }

    .panel-heading a {
        font-size: 48px;
        color: rgb(6, 106, 117);
        padding: 2px 0 10px 0;
        font-family: 'FranchiseRegular','Arial Narrow',Arial,sans-serif;
        font-weight: bold;
        text-align: center;
        padding-bottom: 30px;
    }

    .panel-heading a {
        background: -webkit-repeating-linear-gradient(-45deg, rgb(18, 83, 93), rgb(18, 83, 93) 20px, rgb(64, 111, 118) 20px, rgb(64, 111, 118) 40px, rgb(18, 83, 93) 40px);
        -webkit-text-fill-color: transparent;
        -webkit-background-clip: text;
    }
</style>
</head>
<body>
<%@ include file="Header.jsp"  %>
<div class="row" style="margin-top:140px;">
    <div class="col-md-6 col-md-offset-3">
        <div class="panel panel-login">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-6">
                        <a href="#" class="active" id="login-form-link">Login</a>
                    </div>
                    <div class="col-xs-6">
                        <a href="#" id="register-form-link">Register</a>
                    </div>
                </div>
                <hr>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <form asp-action="Login" id="login-form" action="AddUser" method="post" role="form" style="display: block;">
                            <div class="form-group">
                                <label for="username">Email</label>
                                <input asp-for="name" type="text" name="email" id="username" tabindex="1" class="form-control" placeholder="Email" value="">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input asp-for="password" type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                            </div>
                            <div class="form-group text-center">
                                <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                                <label for="remember"> Remember Me</label>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-sm-offset-3">
                                        <input type="submit" name="op" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                    </div>
                                </div>
                            </div>
                        </form>
                        <form id="register-form" action="AddUser" method="post"style="display: none;">
                            <div class="form-group">
                                <label for="username">Username</label>
                                <input asp-for="name" type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                            </div>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input asp-for="email" type="email" name="email" id="email" tabindex="2" class="form-control" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input id="password" tabindex="3" class="form-control" placeholder="Password" type="password" name="password">
                            </div>
                            <div class="form-group">
                                <label for="date">Date</label>
                                <input id="date" tabindex="4" class="form-control" placeholder="Password" name="date" type="date">
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-sm-offset-3">
                                        <input type="submit" value="register-submit" name="op" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="Footer.jsp"  %>
</body>
</html>