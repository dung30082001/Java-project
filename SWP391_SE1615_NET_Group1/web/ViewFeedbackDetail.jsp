<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--Favicon-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

        <!--Table Styling-->
        <link rel="stylesheet" href="css/OrderTableStyle.css" type="text/css"/>

        <!--Custom Styling-->
        <link rel="stylesheet" href="css/ViewAllFeedbackStyle.css" type="text/css"/>

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title></title>
    </head>
    <body>


        <div class="container-fuild">
            <div class="row">
                <div class="col-md-2" style="background-color: #ebebf2">
                    <nav class="navbar navbar-expand-lg navbar-light flex-column">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link" href="HomeController"><i class="fas fa-home"></i>Home</a>
                                <hr class="line">
                            </li>
                            <c:if test="${sessionScope.user == null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="LoginController">Login</a>
                                </li>
                            </c:if>
                            <c:if test = "${sessionScope.user != null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="profile"><i class="fas fa-user-circle"></i>Hello</a>
                                    <hr class="line">
                                </li>
                            </c:if>

                            <li class="nav-item">&nbsp;
                            </li> 
                        </ul>
                        <a class="nav-link" href="logout" style="position: fixed; right: 10px;">LogOut</a>
                    </nav>
                </div>

                <div class="col-md-10">
                    <hr>
                    <div class="row">


                        <img src="image/${requestScope.feedback.product.getImageLink()}" style="width: 400px; border-radius: 50%; margin: auto; box-shadow: 10px 10px 5px #ddd; border-color: #000">
                        <div class="card-body p-5">
                            <h3 class="title mb-3">${requestScope.feedback.product.getProductName()}</h3>

                            <p class="price-detail-wrap"> 
                                <span class="price h3 text-warning"> 
                                    <span class="currency">VND </span><span class="num">${requestScope.feedback.product.getSellPrice()}</span>
                                </span> 
                            </p> 

                        </div>


                        <div class="col-md-2"></div>
                        <div class="col-md-8">
                            <div class="card-body">
                                <h5 class="card-title">Feedback Detail:</h5>
                                <table class="table table-borderless">
                                    <tr style="padding:2px; ">
                                        <td class="col-md-3"><b>User:</b></td>
                                        <td class="col-md-9">${requestScope.feedback.user.getUsername()}</td>
                                    </tr>
                                    <tr style="padding:2px; ">
                                        <td class="col-md-3"><b>Product Name:</b></td>
                                        <td class="col-md-9">${requestScope.feedback.product.getProductName()}</td>
                                    </tr>
                                    <tr style="padding:2px; ">
                                        <td class="col-md-3"><b>Star:</b></td>
                                        <td class="col-md-9">
                                            <c:forEach begin="1" end="${requestScope.feedback.getStar()}">
                                                <span>
                                                    <i class="fa fa-star checked" style="font-size: 10px"></i>
                                                </span>  
                                            </c:forEach>
                                        </td>
                                    </tr>
                                    <tr style="padding:2px; ">
                                        <td class="col-md-3"><b>Feedback Detail:</b></td>
                                        <td class="col-md-9">${requestScope.feedback.getFeedbackDetails()}</td>
                                    </tr> 
                                    <tr style="padding:2px; ">
                                        <td class="col-md-3"><b>Date Feedback:</b></td>
                                        <td class="col-md-9">${requestScope.feedback.getDateFeedback()}</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="col-md-2"></div>
                    </div>


                </div>
            </div>
    </body>
</html>
