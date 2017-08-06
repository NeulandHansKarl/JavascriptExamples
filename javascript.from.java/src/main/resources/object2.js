var obj2 = new Object(); 

//ein array und einem map in obj2 packen
obj2.array =['aa', 'bb'];
obj2.map = {'aa': 'bb', 'cc': 1 };

// auch eine funktion ist in obj2
obj2.fun2 
     = function (name) {
         print('Hi there from obj1 Javascript, ' + name);
         print ('zugriff array '+this.array[1]);
         print ('zugriff map '+this.map['cc']);
         print ('zugriff funktion in object aus anderem script '+this.map['cc']);
         return obj1.fun1(name) +" hi from obj2 "+name;
       };