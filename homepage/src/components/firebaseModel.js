import Firebase from 'firebase'
import toastr from 'toastr'

const REF= "MorseMate" ; //  NN is your TW2_TW3 group number
function persistModel(model){
    model.addObserver(function(){
         	Firebase.database().ref(REF).set({
			guests: model
		});
    });
}