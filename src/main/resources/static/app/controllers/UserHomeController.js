(function() {
var UserHomeController = function($scope,$log,$location,appService){
	
	
	/*$scope.login = function() {
    //$rootScope.loggedInUser = $scope.username;
		var status;
		status= appService.authenticateUser($scope.username, $scope.password);
		$log.log('Logged in: '+ status);
		if(status === 'true'){
			 $location.path("/userHome/"+$scope.username);
			}else{
				$location.path("/login");
			}
			
   
  };*/
};

UserHomeController.$inject=['$scope','$log','$location','appService'];	angular.module('myApp').controller('UserHomeController',UserHomeController);

}());