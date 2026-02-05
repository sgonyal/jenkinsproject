<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
  box-sizing: border-box;
}

.responsive-form {
  max-width: 600px;
  width: 100%;
  border-radius: 4px;
  border: 2px solid #04AA6D;;
  background-color:  #f2f2f2;
  padding: 20px;
}

form {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

label {
  min-width: 48%;
  margin-bottom: 10px;
}

input[type=text], select {
  min-width: 45%;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  padding: 10px;
}



input[type=submit] {
  width: 100%;
  background-color: #04AA6D;
  color: white;
  padding: 14px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

@media screen and (max-width: 600px) {
  label,
  input[type=text],
  input[type=submit],
  select, textarea {
    flex: 100%;
    min-width: 100%;
  }
}
</style>
</head>

<body>
<h2>Calculator</h2>
<p>Division of Two Number's</p>

<div class="responsive-form">

 <form action="divnumber">
   <label for="firstnumber">First Number:</label>
   <input type="number" id="firstnumber" name="firstnumber" placeholder="Your first Number">
 
   <label for="secondnumber">Second Number:</label>
   <input type="number" id="secondnumber" name="secondnumber" placeholder="Your Second Number">

  

    <input type="submit" value="Division">
 </form>

</div>

</body>
</html>