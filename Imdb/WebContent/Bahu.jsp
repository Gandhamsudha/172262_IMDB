
<!DOCTYPE html>
<head>
  <title>Bahubali</title>
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
      background-color: #474e5d;
      padding: #ffffff;
    }
  </style>
</head>
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>IMDb</h1>      
    
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
    <iframe height="300" width="300" src="https://www.youtube.com/embed/G62HrubdD6o" ></iframe>
</div>
 <div class="container">
  <h1>Bahubali</h1>
 
  <Bahubali class="blockquote-reverse">
    <p>
    When Bhallaladeva conspires against his brother to become the king of Mahishmati, he has him killed by Katappa and imprisons his wife. Years later, his brother's son returns to avenge his father's death
  </blockquote>
</div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>IMDb Copyright</p>  
  <form class="form-inline"> <h1>Email:</h1>
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form><br>
  <form class="form-inline"><h1> Comments:</h1>
    <input type="text" class="form-control" size="50" placeholder="comments">
 <br>   <button type="button" class="btn btn-danger">Enter</button>
  </form>
</footer>

</body>
</html>