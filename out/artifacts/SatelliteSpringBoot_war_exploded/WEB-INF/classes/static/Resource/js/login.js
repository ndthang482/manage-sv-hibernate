

function submit(){
    let username = document.getElementById('uName').value;
    let password = document.getElementById('pWord').value;
    let checkBox = document.getElementById("chk");
    if(username === ""){
       username ='';
       document.getElementById('userError').innerHTML = 'Please fill in UserName';
    } else {
        document.getElementById('userError').innerHTML = '';
    }  
     if(password === '' && username!=''){
        alert("Password can't be blank");
    } 
    }
