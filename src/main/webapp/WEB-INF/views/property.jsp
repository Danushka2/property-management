<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <!-- Custom styles -->
    <link rel="stylesheet" href="/resources/css/property.css">

    <title>Boardimak</title>
</head>
<body>

<header style="background-image: linear-gradient( rgba(0, 0, 0, 0.7),  rgba(0, 0, 0, 0.7)),url(/resources/images/homePage.jpg);">
  <div class="container">
      <div class="row">

            <nav class="navbar navbar-expand-lg">
                    <a class="navbar-brand" href="/">Boardimak</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavDropdown">
                      <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="#">HOW IT WOKRS</a>
                        </li>  
                        <li class="nav-item active">
                          <a class="nav-link" href="#">ABOUT US <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#">BLOGS</a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#">CONTACT US</a>
                        </li>
                      </ul>
                    </div>
                    <div class="home-buttons">
                            <a href="/owner/property" class="btn-white log-in"  uk-toggle="target: #modal-close-outside">LOG IN</a>
                            <a href="#" class="btn-white sign-up" uk-toggle="target: #modal-sign-up">SIGN UP</a>
                        </div>
                  </nav>


      </div>
      <div class="row" >
            <div class="col-md-8">
                <div id="carouselExampleIndicators" style="width: 100%; height: 80vh; margin:auto;" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner" style="border-radius: 20px;">
                      <div class="carousel-item active">
                        <img class="d-block w-100" style="width: 600px; height: 80vh;border-radius: 20px;" src="/resources/images/pr1.jpg" alt="First slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block w-100" style="width: 600px;height: 80vh;border-radius: 20px;" src="/resources/images/pr2.jpg" alt="Second slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block w-100" style="width: 600px;height: 80vh;border-radius: 20px;" src="/resources/images/pr3.jpg" alt="Third slide">
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <div class="col-md-4">
                <div style="width: 100%; height: 80vh; margin:auto;background-color: blanchedalmond; border-radius: 10px;">
                    <div style="background-color: rgb(79, 122, 187);height: 50px; text-align: center;font-size: 25px;font-weight: 600">
                        property ID : <span style="color: blue">1535987</span>
                    </div>
                    <div class="row" style="margin-left: 20px;">
                        <div class="col-sd-12">
                            address :Lorem Ipsum is simply dummy text of the printing and types
                        </div>
                    </div>
                    <div class="row" style="margin-left: 20px;">
                        <div class="col-sd-6">type: house</div>
                        <div class="col-sd-6">no of rooms:</div>
                    </div>
                    <div class="row" style="margin-left: 20px;">
                        <div class="col-sd-6">monthly Payment: Rs:5000.00</div>
                        <div class="col-sd-6">key money: Rs 10000.00</div>
                    </div>
                    <div class="row" style="margin-left: 20px;">
                        <div class="col-sd-4">Air Condition: Yes</div>
                        <div class="col-sd-4">Parking : Yes</div>
                    </div>
                    Lorem Ipsum is simply dummy text of the printing and types
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley 
                    of type and scrambled it to make a type specimen book. It has survived not only five centuries, but a

                    <button class="btn-blue">Book</button>
                    <button class="btn-blue" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                        Propose
                    </button>

                    <div class="collapse" id="collapseExample">
                      <div class="card card-body">
                        form for make a proposal
                      </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</header>



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>