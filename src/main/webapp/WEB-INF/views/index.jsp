<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Add-Property</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="/resources/css/test.css">

</head>
<body>
<div class="container">
    <h1 id="para">Spring boot web application</h1>

    <form>
   		<div class="row">
    		<div class="col-md-6">
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">Property Owner ID</label>
	    			<input type="text" class="form-control col-sm-8 " id="Int1" placeholder="Pro Owner ID">
	  			</div>
	  			<div class="form-group row">
  				  <label class="col-sm-4 col-form-label" for="exampleFormControlSelect1">Property Type</label>
  					<select class="form-control col-sm-8" id="exampleFormControlSelect1">
    				  <option>Room</option>
    				  <option>House</option>
    				  <option>Apartment</option>
    				  <option>annexes</option>
    				</select>
 	 			</div>
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">Address</label>
	    			<input type="text" class="form-control col-sm-8" id="Input1" placeholder="street">
	  			</div>
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">City</label>
	    			<input type="text" class="form-control col-sm-8" id="Input2" placeholder="Colombo">
	  			</div>
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">Time period</label>
	    			<input type="text" class="form-control col-sm-8" id="Input3" placeholder="no of months">
	  			</div>
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">Key Money</label>
	    			<input type="text" class="form-control col-sm-8" id="Input3" placeholder="Key Money">
	  			</div>
	  			<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInpu">Price per Month</label>
	    			<input type="text" class="form-control col-sm-8" id="Input3" placeholder="Rs 100000.00">
	  			</div>
	  			<div class="form-group row">
    				<label class="col-sm-4" for="exampleFormControlTextarea1">Description</label>
    				<textarea class="form-control col-sm-8" id="exampleFormControlTextarea1" rows="3"></textarea>
  				</div>
	  			
	  				
 	 		</div>
 	 		<div class="col-md-6">
 	 			<div class="form-group row">
    				<label class="col-sm-4" for="exampleFormControlFile1">Picture of property</label>
    				<input type="file" class="form-control-file col-sm-8" id="exampleFormControlFile1">
  				</div>
  				<div class="form-group row">
	    			<label class="col-sm-4 col-form-label" for="exampleFormControlInput1">Rooms</label>
	    			<input type="email" class="form-control col-sm-8" id="Input4" placeholder="no of Rooms">
	  			</div>
	  			 <fieldset class="form-group">
   					 <div class="row">
    					 <legend class="col-form-label col-sm-4 pt-0">AirCondition</legend>
      					 <div class="col-sm-8">
					        <div class="form-check">
        				 	    <input class="form-check-input" type="radio" name="airC" id="airC" value="option1">
      						    <label class="form-check-label" for="gridRadios1">Yes</label>
        					</div>
      						 <div class="form-check">
    					    	  <input class="form-check-input" type="radio" name="airC" id="airC" value="option2">
         						 <label class="form-check-label" for="gridRadios2">No</label>
    				    	</div>       
      					</div>
					</div>
  				</fieldset>
				<fieldset class="form-group">
   					 <div class="row">
    					 <legend class="col-form-label col-sm-4 pt-0">Parking</legend>
      					 <div class="col-sm-8">
					        <div class="form-check">
        				 	    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1">
      						    <label class="form-check-label" for="gridRadios1">Yes</label>
        					</div>
      						 <div class="form-check">
    					    	  <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
         						 <label class="form-check-label" for="gridRadios2">No</label>
    				    	</div>       
      					</div>
					</div>
  				</fieldset>
	  			<div class="form-group row">
	    			<label class="col-sm-4" for="exampleFormControlInput1">Time period</label>
	    			<input type="email" class="form-control col-sm-8" id="Input2" placeholder="no of months">
	  			</div>
  				<div class="form-group row">
    				<label class="col-sm-4" for="exampleFormControlTextarea1">Other Facilities</label>
    				<textarea class="form-control col-sm-8" id="exampleFormControlTextarea1" rows="3"></textarea>
  				</div>
  				<button type="submit" class="btn btn-primary">Create a Property</button>
 			</div>
  		</div>
	</form>
    
</div>
</body>
</html>