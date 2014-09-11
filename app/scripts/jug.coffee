angular.module 'JUG', []
 .controller 'Recruteur', class
     constructor: ($http) ->
       @title = 'JUG du 11 septembre'
       $http.get('/programmers').success (data) =>
         @devs = data

