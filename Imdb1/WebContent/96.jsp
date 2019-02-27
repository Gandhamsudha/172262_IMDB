<!DOCTYPE html>
<head>
  <title>96</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color:#474e5d;
      padding: #ffffff;
    }
  </style>
</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>IMDB</h1>      
    
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">Home</a></li>
  
 
   
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
     
      </ul>
    </div>
  </div>
</nav>
<div class="container">
  <div class="rows">  
<div class= col-sm-6>
    <iframe height="300" width="300" src="https://www.youtube.com/embed/Qx7I1j1KVDE" ></iframe>
</div>
 <div class="container">
  <h1>96</h1>
 
  <Agnyaathavaasi class="blockquote-reverse">
    <p align="left">96 is a 2018 Indian Tamil-language romance film written and directed by C. Prem Kumar, starring Vijay Sethupathi and Trisha Krishnan.[1] The film, the directorial debut of Prem Kumar, was produced by S. Nanthagopal for Madras Enterprises and features a score and soundtrack composed by Govind Vasantha. Mahendiran Jayaraju and N. Shanmuga Sundaram handled the cinematography and R. Govindaraj edited the film, while the costumes were designed by Subhashree Kaarthik Vijay.

The film was released on 4 October 2018 to critical acclaim, with praise for its screenplay, direction, music and the performances of the two leading actors. It will be remade in Kannada as 99</p>
  
  </blockquote>
</div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>IMDb Copyright</p>  
  <form  action="LoginServlet" method="post">
   <h1>Username</h1>
    <input type="text" class="form-control" size="50" placeholder="username">  
    <input type="password" class="form-control" size="50" placeholder="password">
    <input type="submit" Name="submit">
    </form>


 
 <br>   <button type="button" class="btn btn-danger">Enter</button>
  </form>
   <div class="txt-center">
    <form action="Login.jsp" method="post">
        <div class="rating">
        <h3>Rating </h3>
            <input id="star5" name="star" type="radio" value="5" class="radio-btn hide" />
            <label for="star5">?</label>
            <input id="star4" name="star" type="radio" value="4" class="radio-btn hide" />
            <label for="star4">?</label>
            <input id="star3" name="star" type="radio" value="3" class="radio-btn hide" />
            <label for="star3">?</label>
            <input id="star2" name="star" type="radio" value="2" class="radio-btn hide" />
            <label for="star2">?</label>
            <input id="star1" name="star" type="radio" value="1" class="radio-btn hide" />
            <label for="star1">?</label>
            <div class="clear"></div>
        </div>
    </form>
   
</div>

  
<h2> comment </h2>

<textarea cols="50" rows="4" name="Comment"></textarea>
<!-- <input type=submit value="submit"> -->

<button id="myBtn">Submit</button>
<div id="myModal" class="modal">

  <div class="modal-content">
    <span class="close">&times;</span>
    <p>You need to login first</p>
  </div>
</div>
</form>


<script>

var modal = document.getElementById('myModal');


var btn = document.getElementById("myBtn");


var span = document.getElementsByClassName("close")[0];


btn.onclick = function() {
  modal.style.display = "block";
}


span.onclick = function() {
  modal.style.display = "none";
}


window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
</script>
</footer>

</body>
</html>