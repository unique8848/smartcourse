'use strict';

/**
 * @ngdoc function
 * @name pagesApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the pagesApp
 */
angular.module('pagesApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
