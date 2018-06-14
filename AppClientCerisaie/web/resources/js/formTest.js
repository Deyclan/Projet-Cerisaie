function test()
{
    var  ok=true;

    var today = new Date();
    var dd = today.getDate();
    var mm = today.getMonth()+1; //January is 0!
    var yyyy = today.getFullYear();
    if(dd<10){
        dd='0'+dd
    }
    if(mm<10){
        mm='0'+mm
    }

    today = yyyy+'-'+mm+'-'+dd;
    if(document.identification.jourActivite.value < today)
    {
        alert("Vous ne pouvez pas choisir un jour déjà passé")
        ok=false;
    }
    else
    if(document.identification.nom.value == "")
    {
        alert("Veuillez entrer votre nom");
        ok=false;
    }
    else
    if(document.identification.prenom.value == "")
    {
        alert("Veuillez entrer votre prenom");
        ok=false;
    }

    return ok;
}