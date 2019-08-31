var stripe = Stripe('pk_test_fiNmKZ5r1VOsJqi4PLEnRqsu006QD8Fb6K');

	            // Create an instance of Elements.
	            var elements = stripe.elements();
	         	
	            // Handle form submission.
	            var form = document.getElementById('payment-form');
	            form.addEventListener('submit', function (event) {
                    event.preventDefault();
                    handleDetails();
                    console.log("after function");
	            });
	            
 	          	//handle card submission
	            function handleDetails() {
                    var routingNumber = "" + document.getElementById('routingNumber');
                    var acNo = "" + document.getElementById('accountNo');
                    stripe.createToken('bank_account', {
                        country: 'US',
                        currency: 'usd',
                        routing_number: $('#routingNumber').val(),
                        account_number: $('#accountNo').val(),
                        account_holder_name: $('#Name').val(),
                        account_holder_type: 'individual'
                      }).then(function(result) {
                        if (result.error) {
                            // Inform the user if there was an error.
                            alert(result.error.message);
	                        // var errorElement = document.getElementById('card-errors');
	                        // errorElement.textContent = result.error.message;
	                    } else {
	                        // Send the token to your server.
	                        var token = result.token.id;
                            var email = $('#email').val();
	                        $.post(
	                             "/create-account",
	                             {token: token, email: email},
	                             function (data) {
	                            	 var r = data;
	                            	 
	                            	 if(r.isWorking === 'wrongEmail'){
	                            		 console.log("check the email address");
	                            		 $( "#error-types" ).html( "The email should be the one you netered when creating the account" );
	                            	 }else if(r.isWorking === "hasAccount"){
	                            		 $( "#error-types" ).html( "You have already registerd an account" );
	                            	 }else{
	                            		 window.location.href="http://localhost:8080/";
	                            	 }
	                             }, 'json');
	                    }
                      });
	          	}
	            function testFunc(){
	            	console.log("this is working");
	            	console.log("final");
	            	window.location.href="http://localhost:8080/";
	            }