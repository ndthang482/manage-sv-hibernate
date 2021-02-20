function inputDatabase() {
    dbDriver();
    dbUrl();
    dbUser();
    dbPass();
}
function dbDriver() {
    var txt;
    var p = prompt("Enter the database driver name", "com.microsoft.sqlserver.jdbc.SQLServerDriver");

    document.getElementById("demo").innerHTML = txt;
}
function dbUrl() {
    var txt;
    var p = prompt("Enter the database url:", "jdbc:sqlserver://localhost:1433;databaseName=University");

    document.getElementById("demo").innerHTML = txt;
}
function dbUser() {
    var txt;
    var p = prompt("Enter the username", "Type Here");

    document.getElementById("demo").innerHTML = txt;
}
function dbPass() {
    var txt;
    var p = prompt("Enter the password", "");

    document.getElementById("demo").innerHTML = txt;
}
function findStudent() {
   document.getElementById('cc').value = 'findAction';
}

function deleteStudent(){
    document.getElementById('cc').value = 'deleteAction';
}
