var followData = angular.module('follow-data', []);

/* FACTORIES */

followData.factory('following',function($http,$q) {
	return { getFollowersForName: function(twitterName) {
	var deferred = $q.defer();
		$http.get("/followers/"+twitterName).success(function(data) {
			deferred.resolve(data);
		});
	return deferred.promise;
	}};
});

followData.factory('followersFollowing',function($http,$q) {
    return { getFollowersOfFollowersForName: function(twitterName) {
        var deferred = $q.defer();
        $http.get("/followersOffollowers/"+twitterName).success(function(data) {
            deferred.resolve(data);
        });
        return deferred.promise;
    }};
});

followData.factory('timeline',function($http,$q) {
    return { getTimelineForName: function(twitterName) {
        var deferred = $q.defer();
        $http.get("/timeline/"+twitterName).success(function(data) {
            deferred.resolve(data);
        });
        return deferred.promise;
    }};
});
