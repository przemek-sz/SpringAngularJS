var app = angular.module('app', []);

app.controller('UserController', function ($http) {

    var vm = this;
    refreshData();
    /////////////////////////////////////////////////////
    function refreshData() {
        $http({
            method: 'GET',
            url: '/user'
        }).then(function succes(response) {
            vm.users = response.data;
            console.log('API good ' + response.data);

        }, function error(response) {
            console.log('API error ' + response.status);
        });
    }
    //////////////////////////////////////////////////////////
    vm.addUser = function (user) {
        $http({
            method: 'POST',
            url: '/user',
            data: user
        }).then(function succes(response) {

            refreshData();
            vm.user = {};
        }, function error(response) {
        });
    }
    //////////////////////////////////////////////////////
    vm.updateUser = function (user,us) {
        $http({
            method: 'PUT',
            url: '/user/'+us.id,
            data: user
        }).then(function succes(response) {

            refreshData();
            vm.user = {};
        }, function error(response) {
        });
    }
    ////////////////////////////////////////////////////////
    vm.removeUser = function (user) {
        $http({
            method: 'DELETE',
            url: '/user/' + user.id
        }).then(function succes(response) {
            vm.user = {};
            refreshData();

        }, function error(response) {
        });
    }
});



