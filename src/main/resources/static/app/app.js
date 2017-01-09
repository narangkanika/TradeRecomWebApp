//option 1
//var app = angular.module('customerApp',[]);

//option 2
(function(){
	var app= angular.module('myApp',['ngRoute']);
	
	app.config(function($routeProvider) {
        $routeProvider
            .when('/login', {
                controller: 'LoginController',
                templateUrl: 'app/views/login.html'
            })
            .when('/userHome/:username', {
                controller: 'UserHomeController',
                templateUrl: 'app/views/userHome.html'
            })
            .otherwise( { redirectTo: '/login' } );
    });
}());
 