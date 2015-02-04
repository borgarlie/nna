(function(angular, SockJS, Stomp, _, undefined) {
  angular.module("chatApp.services", []).service("ChatService", ['$rootScope', '$q', '$timeout', '$http', function($rootScope, $q, $timeout, $http) {

    var service = {}, listener = $q.defer(), socket = {
      client: null,
      stomp: null
    }, messageIds = [];
    
    service.RECONNECT_TIMEOUT = 30000;
    service.SOCKET_URL = "/nna/ws";
    service.CHAT_TOPIC = "/topic/message.hei";
    service.CHAT_BROKER = "/app/chat.hei";

    service.user_data = {};
    service.user_data.messages = [];
    service.user_data.sender = "TEST";

    service.receive = function() {
      return listener.promise;
    };
    
    service.send = function(message) {
        console.log("message SENT");
      socket.stomp.send(service.CHAT_BROKER, {
        priority: 9
      }, JSON.stringify({
        message: message
      }));
    };
    
    var reconnect = function() {
      $timeout(function() {
        service.initialize();
      }, this.RECONNECT_TIMEOUT);
    };
    
    var getMessage = function(data) {
      //var message = JSON.parse(data), out = {};
      //return message;
      //out.message = message;
      //return out;
      return JSON.parse(data);
    };
    
    service.initialize = function() {
      socket.client = new SockJS(service.SOCKET_URL);
      socket.stomp = Stomp.over(socket.client);
      socket.stomp.connect({}, function() {
        socket.stomp.subscribe(service.CHAT_TOPIC, function(data) {
          listener.notify(getMessage(data.body));
        });
      });
      socket.stomp.onclose = reconnect;
    };
    
    service.initialize();
    return service;
  }]);
})(angular, SockJS, Stomp, _);