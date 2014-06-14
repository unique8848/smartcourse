'use strict';

/**
 * @ngdoc function
 * @name pagesApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the pagesApp
 */
angular.module('pagesApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
