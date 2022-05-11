// js/firebaseModel.js
const REF= "MorseMate" ; //  NN is your TW2_TW3 group number
function persistModel(model){
    model.addObserver(function(){
         	firebase.database().ref(REF).set({  // object literal
			morseTranslation: this.nextMorseMessage;
		});
    });
}
