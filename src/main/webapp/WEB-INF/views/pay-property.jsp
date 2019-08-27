<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
<!--   Required meta tags -->
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

<!--   Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
     <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

 <!--  Font Roboto 400, 500, 700 and 900 -->
  <link href="https://fonts.googleapis.com/css?family=Roboto:400,500,700,900&display=swap" rel="stylesheet"/>
<!--   Styles -->
  <link rel="stylesheet" href="/resources/css/pay-property.css"/>
  <link rel="stylesheet" href="/resources/css/main.css"/>
  <link rel="stylesheet" href="/resources/css/dashboard.css"/>


  <title>pay</title>
</head>

<body>
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#paymentModal">
    Open modal
  </button>
  <div class="modal modal-box" id="paymentModal">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="row form-container">
          <div class="col-md-7 payment-form">

            <form action="#" id="payment-form" method="post">
                    <input id="api-key" type="hidden" th:value="pk_test_fiNmKZ5r1VOsJqi4PLEnRqsu006QD8Fb6K">
                    <div class="form-group">
                        <input class="form-control" id="email" name="email"
                               placeholder="Email Address" type="email" required>
                    </div>
                    <div class="form-group">
                        <label class="font-weight-medium" for="card-element">
                            Enter credit or debit card below
                        </label>
                        <div class="w-100" id="card-element">
                            <!-- A Stripe Element will be inserted here. -->
                        </div>
                    </div>
                    <!-- Used to display Element errors. -->
                    <div class="text-danger w-100" id="card-errors" role="alert"></div>
                    <div class="form-group pt-2">
                        <button class="btn btn-primary btn-block" id="submitButton" type="submit">
                            Add this card
                        </button>
                        <div class="small text-muted mt-2">
                            Pay securely with Stripe. By clicking the button above, you agree
                            to our <a target="_blank" href="#">Terms of Service</a>,
                            <a target="_blank" href="#">Privacy</a> and
                            <a target="_blank" href="#">Refund</a> policies.

                        </div>
                    </div>


                </form>
          </div>
        </div>
      </div>
    </div>
   </div>

        <script src="https://js.stripe.com/v3/"></script>

        <script type="text/javascript">
	        	var stripe = Stripe('pk_test_fiNmKZ5r1VOsJqi4PLEnRqsu006QD8Fb6K');

	            // Create an instance of Elements.
	            var elements = stripe.elements();
	
	            // Create an instance of the card Element.
	            var card = elements.create('card');
	
	            // Add an instance of the card Element into the `card-element` <div>.
	            card.mount('#card-element');
	            
	         	// Handle real-time validation errors from the card Element.
	            card.addEventListener('change', function (event) {
	                var displayError = document.getElementById('card-errors');
	                if (event.error) {
	                    displayError.textContent = event.error.message;
	                } else {
	                    displayError.textContent = '';
	                }
	            });
	         	
	            // Handle form submission.
	            var form = document.getElementById('payment-form');
	            form.addEventListener('submit', function (event) {
	                event.preventDefault();
					handlePayments();
	            });
	            
 	          	//handle card submission
	            function handlePayments() {
	                stripe.createToken(card).then(function (result) {
	                    if (result.error) {
	                        // Inform the user if there was an error.
	                        var errorElement = document.getElementById('card-errors');
	                        errorElement.textContent = result.error.message;
	                    } else {
	                        // Send the token to your server.
	                        var token = result.token.id;
	                        var email = $('#email').val();
	                        $.post(
	                            "/createCust",
	                            {token: token, email: email},
	                            function (data) {
	                                alert(data.details);
	                            }, 'json');
	                    }
	                });
	          	}
        </script>
</body> 