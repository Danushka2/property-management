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