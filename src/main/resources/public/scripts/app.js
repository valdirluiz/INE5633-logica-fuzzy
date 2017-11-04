/**
 * Created by shekhargulati on 10/06/14.
 */

var app = angular.module('todoapp', [
    'ngCookies',
    'ngResource',
    'ngSanitize',
    'ngRoute'
]);

app.config(function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'views/home.html',
        controller: 'RobotCtrl'
    }).otherwise({
        redirectTo: '/'
    })
});

app.controller('RobotCtrl', function ($scope, $http) {
     

    $scope.statusChanged = function () {
        console.log($scope.robot);
        $http.post('/api/v1/robot', $scope.robot).success(function (data) {
            $scope.robot = data;
        }).error(function (data, status) {
            console.log('Error ' + data)
        });
    }
});

