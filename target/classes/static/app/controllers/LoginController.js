(function() {
var LoginController = function($scope,$log,$location,appService){
	/*$scope.sortBy='name';
	$scope.reverse= false;
	
	$scope.people=[{name:'keerthi', city:'Pune', dob:'1992-06-26', amount:'1234.56'},{name:'veeru', city:'Hyd',dob:'1993-10-07', amount:'9234'},{name:'sanju', city:'Mbnr', dob:'1994-06-26', amount:'1234.00'}] ;
	
	$scope.doSort =  function(propName){
		$scope.sortBy=propName;
		$scope.reverse= !$scope.reverse;
	};*/
	
	$scope.login = function() {
    //$rootScope.loggedInUser = $scope.username;
		
		var status;
		appService.authenticateUser($scope.username, $scope.password); /*.then(function(response) {
		status= response.data;
		$log.log('Logged in: '+ status);
		if(status == 'true'){
			$log.log('TRUE');
			 $location.path('/userHome/'+$scope.username);
			}else{
				$log.log('FALSE');	
				//$location.path('/userHome/'+$scope.username);
				$location.path("/login");
			}
		}, function(data, status, headers, config) {
            $log.log(data.error + ' ' + status);
        });*/
			/*.then(function(response) {
			var status= response.data;
			if(status){
			 $location.path("/userHome/"+$scope.username);
			}else{
				$location.path("/login");
			}
		});*/
   
  };
};

LoginController.$inject=['$scope','$log','$location','appService'];	angular.module('myApp').controller('LoginController',LoginController);

}());