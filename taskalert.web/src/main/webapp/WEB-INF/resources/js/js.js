/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function savePerson(){
    var json = $("#personJson").val();
    $.ajax({
         url: "/Spring4AnnotationConfig/person",
         type: "POST",
         dataType: "json",
         contentType: "application/json; charset=utf-8",
         data: json,
         success: function (updatedPerson) {
            $("#personJson").val(JSON.stringify(updatedPerson));
            //alert(updatedPerson);
         },
         // unhandled error response
         error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert(XMLHttpRequest.responseText);
         }
      });
}

