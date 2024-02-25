This app is a simple implementation of how to use firebase inside 
android apps. Firstly, we used a FirebaseDatabase Instance to the refernce for 
our database. Then we use this instance for getting reference to our realtime database
using a reference name to it to Collection Reference object. We use setValue method to add simple datatypes.
We then add addValueEventListener to our Collection reference object which has inner class of same name consisting of 
methods onDataChange() and onCancelled() where onDataChange() is called when changes happen to the data inside of node of the 
given ref; and onCancelled is called when handle errors if they occur. Similary, the custom objects also follow the same procedure.
onDataChange() provides DataSnapshot object from which we can access data stored in that node inside the firebase and display it on the views
or anything we can manipulate in the app or at database too.  

    Image-1 : the realtime database is empty.
<img src="https://github.com/sanjuray/FirebaseApp/assets/94555333/2e1d0835-7abe-4801-85a3-89d5fb52ec15" width=500 height=450/>

    Image-2: the app runs and setValue() is run to a node called msgs and the custom object to customOobjectsdb reference
<img src="https://github.com/sanjuray/FirebaseApp/assets/94555333/bde8227a-483a-48d9-86e0-68bbacc7bf19" width=450 height=550/>
    
    Image-3: the database gets updated.
<img src="https://github.com/sanjuray/FirebaseApp/assets/94555333/32aeaa2c-eb22-43b7-821b-4881b5968747" width=500 height=550/>

    Image-4: we make changes to the data in the database
<img src="https://github.com/sanjuray/FirebaseApp/assets/94555333/c57c8ed4-6727-4ac5-af4e-e6c13132da22" width=500 height=450/>

    Image-5: the changes gets reflected in the app
<img src="https://github.com/sanjuray/FirebaseApp/assets/94555333/dd6966a7-dd3a-4c87-ac88-ed0a82b29030" width=450 height=550/>

