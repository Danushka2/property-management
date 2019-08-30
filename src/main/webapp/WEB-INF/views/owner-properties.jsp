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

    <!-- Font Roboto 400, 500, 700 and 900-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,500,700,900&display=swap" rel="stylesheet">

    <!-- Styles -->
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="/resources/css/dashboard.css">
    <link rel="stylesheet" href="/resources/css/owner-property.css">

    <title>Owner</title>
</head>
    <body>
        <div class="section">
            <div class="container-fluid">
                <div class="row">
                    <div class="left-panel">
                        <div class="wrapper-profile">
                            <div class="profile-picture">
                                <img src="/resources/icons/profile-pic.png" alt="Profile picture">
                            </div>
                            <div class="profile-text">
                                <h5>John Snow</h5>
                                <p>Property Owner</p>
                            </div>
                            <div class="profile-notification">
                                <img src="/resources/icons/notification-icon.png" alt="Notification Icon">
                            </div>
                        </div>

                        <div class="wrapper-menu">
                            <ul>
                                <a href=""><li><img src="/resources/icons/dashboard-icon.png" alt="Dashboard Icon">Dashboard</li></a>
                                <a href=""><li class="active"><img src="/resources/icons/property-icon.png" alt="Properties Icon">Properties</li></a>
                                <a href=""><li><img src="/resources/icons/booking-icon.png" alt="Bookings Icon">Bookings</li></a>
                                <a href="all-promotions.html"><li><img src="/resources/icons/promotions-icon.png" alt="Promotions Icon">Promotions</li></a>
                                <a href=""><li><img src="/resources/icons/payment-icon.png" alt="Payment Icon">Payments</li></a>
                                <a href=""><li><img src="/resources/icons/support-icon.png" alt="Support Icon">Support</li></a>
                            </ul>
                        </div>

                        <div class="wrapper-help">
                            <a href=""><img src="/resources/icons/help-icon.png" alt="Help icon">Help</a>
                        </div>
                    </div>
                    <div class="right-panel">
                        <div class="wrapper-body">
                            <h3 class="title">All Properties</h3>
                            <button class="btn-blue btn-add-prop" data-toggle="modal" data-target=".add-property-modal">+Add Property</button>
                            <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
                        </div>

                        <div class="dashboard-body">
                          
                            
                            <img class="property-img" src="/resources/images/houseImg.png" alt="House images">
                            <br>
                            <h4 class="mdl-text">No properties available yet.</h4>
                            <p class="mdl-text">Click the button below to add your first property</p>
                            <button class="btn-blue btn-middle" data-toggle="modal" data-target=".add-property-modal">+Add Property</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

  
  <!-- Modal -->
  <div class="modal fade add-property-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Add Property</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
               
                <form class="modal-form" method="POST" action="/owner/property">
                        <div class="row">
                            <div class="col-md-4">
                               <div class="form-group row">
                                 <input type="text" class="col-sm-11 " id="ownerid" name="" value="${newProperty.ownerId}" placeholder="Property Owner ID" required>
                               </div>
                            </div>
                            <div class="col-md-8">
                                <div class="form-group row">
                                    <h6 class="col-form-label col-sm-4">Property Type:</h6>
                                        <select class="form-control property-area col-sm-8" id="propertyModal2">
                                            <option>Room</option>
                                            <option>House</option>
                                            <option>Apartment</option>
                                            <option>annexes</option>
                                        </select>
                                    </div>
                            </div>
                        </div>
                       <div class="row">
                            <div class="col-md-6">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="address" name="addressOne" value="${newProperty.addressOne}" placeholder="Address 1" required>
                                </div>   
                            </div>
                            <div class="col-md-6">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="propertyModal4" name="addressTwo" value="${newProperty.addressTwo}" placeholder="Address 2" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="cityId" name="city" value="${newProperty.city}" placeholder="City" required>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="keymoney" name="keyMoney" value="${newProperty.keyMoney}" placeholder="Key Money" required>
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="payment" name="monthlyPayment" value="${newProperty.monthlyPayment}" placeholder="Monthly Rental" required>
                                </div>   
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="form-group row">
                                      <input type="text" class="col-sm-11" id="NoRooms" name="noOfRooms" value="${newProperty.noOfRooms}" placeholder="No of Rooms" required>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group row">
                                    <input type="text" class="col-sm-11" id="time" name="timePeriod" value="${newProperty.timePeriod}" placeholder="Time Period" required>
                                </div>
                            </div>
                            <div class="col-md-3">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                    <fieldset class="form-group">
                                            <div class="row">
                                                <h6 class="col-form-label col-sm-4">Air Condition:</h6>
                                               <div class="col-sm-8">
                                                <div class="form-check-inline">
                                                     <input class="form-check-input" type="radio" name="airC" id="airC1" value="option1">
                                                      <label class="form-check-label" for="gridRadios1">Yes</label>
                                                </div>
                                                   <div class="form-check-inline">
                                                      <input class="form-check-input" type="radio" name="airC" id="airC2" value="option2">
                                                      <label class="form-check-label" for="gridRadios2">No</label>
                                                </div>       
                                              </div>
                                        </div>
                                      </fieldset>
                            </div>
                            <div class="col-md-6">
                                    <fieldset class="form-group">
                                            <div class="row">
                                                    <h6 class="col-form-label col-sm-4">Parking:</h6>
                                               <div class="col-sm-8">
                                                <div class="form-check-inline">
                                                     <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1">
                                                      <label class="form-check-label" for="gridRadios1">Yes</label>
                                                </div>
                                                   <div class="form-check-inline">
                                                      <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
                                                      <label class="form-check-label" for="gridRadios2">No</label>
                                                </div>       
                                              </div>
                                        </div>
                                      </fieldset>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group row">
                                    <textarea class="col-sm-11 property-area" placeholder="Description" name="description" value="${newProperty.description}" id="description" rows="2" required></textarea>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group row">
                                    <textarea class="col-sm-11 property-area" placeholder="Other Facilities" name="otherFacilities" value="${newProperty.otherFacilities}" id="otherFacilities" rows="2" required></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group row">
                                    <h6 class="col-form-label col-sm-3">Picture of Property</h6>
                                    <input type="file" class="form-control-file col-sm-8" id="propertyPicture">
                                </div>
                            </div>
                        </div>

                    <button type="submit" onclick="formValidation()" class="btn-blue modal-btn">Create a Property</button>
                 </form>
        </div>
      </div>
    </div>
  </div>



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="/resources/js/propertyValidate.js"></script> 
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>