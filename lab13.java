<!DOCTYPE html>
<html>
<head>
<title>Registration form</title>
<script>
function validate()
{
if(document.f1.name.value==" "||(document.f1.name.value).length<5)
window.alert("please enter proper name");
if(document.f1.address.value==" ");
window.alert("please enter adress");
if(document.f1.phone.value==" "||document.f1.phone.value).length!=10)
window.alert("please enter 10 digit phone number");
}
</script>
</head>
<body>
<form name="f1"on submit="validate()">
Name:<input type="text"name="name"placeholder="name">
<br>
Address:<text area rows="5"cols="20"name="address"placeholder="address"></text area><br>
Phone number:<input type="text"name="phone"><br>
<input type="submit"value="submit">
</form>
</body>
</html>
