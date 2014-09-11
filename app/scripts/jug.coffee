angular.module 'JUG', []
 .controller 'Recruteur', class
     constructor: ($http) ->
       $http.get('/programmers').success (data) =>
         @devs = data

