(function(angular) {
  angular.module("chatApp.controllers", []).controller("ChatCtrl", ['$scope', 'ChatService', function($scope, ChatService) {

    $scope.user = ChatService.user_data;
    
    $scope.user.addMessage = function() {
      for (i = 0; i < 10; i++) {
        ChatService.send($scope.user.sender);
      }
    };
    
    var nr = 1;

    ChatService.receive().then(null, null, function(message) {
        //update_message_view(message.sender);
        message.nr = nr;
        nr++;
        $scope.user.messages.push(message);
        //console.log("message received -- from controllers.js");
    });
    

  }]);
})(angular);