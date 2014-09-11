angular.module 'JUG', []
 .controller 'Recruteur', class
     constructor: ->
        @devs = [
            nom:'NOM1'
            prenom:'PRENOM1'
        ,
            nom:'NOM2'
            prenom:'PRENOM2'
        ]
