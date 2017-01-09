(function() {
    var appService = function($http,$log) {
       /*var users= [
		   {
			   'username': 'keerthi',
			   'password' : '123'
		   },
		   
		   {
			   'username': 'veeru',
			   'password' : 'abc'
		   }
		   
	   ]; */
		
        this.authenticateUser = function(username, psswrd) {
        	$httpp.post("/login",{username,passwrd}).success(function(response)
        			{
        		alert(response.status);
        			})
        			/*$http.post('/login', {uname : username, psswrd : psswrd})
        	.success(function(data,status){
        		$log.log(data+' '+ status);
        		if(data == 'true'){
        		$location.path('/home');
        		//return 'true';
        		}else{
        			$location.path('/home');
        		}
        	})
        	.error(function(data,status){
        		//return 'false';
        	})
        	};*/
        	
        	//return $http.get('/login?uname='+username+'&passwrd='+ psswrd);
        	

    };
    };
    
    angular.module('myApp').service('appService', appService);
                                           
}());