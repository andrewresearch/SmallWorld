var followUi = angular.module('follow-ui', ['follow-data']);

/* CONTROLLERS */

var followers = function($scope,following,followersFollowing,timeline) {

    $scope.followersLoaded = false;
    $scope.followersOfFollowersLoaded = false;
    $scope.TimelineLoaded = false;
    
    /* Get followers for a user */
    var getFollowersForName = function(twitterName) {
        console.log("Getting followers for id: "+twitterName);
        following.getFollowersForName(twitterName).then(function(data) {
            $scope.followers = data;
            $scope.followersLoaded = true;
        });
    };
    // Call from button in browser
    $scope.getFollowersForName = getFollowersForName;

    /* Get followers of followers for a user */
    var getFollowersOfFollowersForName = function(twitterName) {
        console.log("Getting followers of followers for id: "+twitterName);
        followersFollowing.getFollowersOfFollowersForName(twitterName).then(function(data) {
            $scope.followersOfFollowers = data;
            $scope.followersOfFollowersLoaded = true;
        });
    };
    // Call from button in browser
    $scope.getFollowersOfFollowersForName = getFollowersOfFollowersForName;

    /* Get followers for a user */
    var getTimelineForName = function(twitterName) {
        console.log("Getting timeline for id: "+twitterName);
        timeline.getTimelineForName(twitterName).then(function(data) {
            $scope.timeline = data;
            $scope.timelineLoaded = true;
        });
    };
    // Call from button in browser
    $scope.getTimelineForName = getTimelineForName;

    
    // Call when id is selected in dropdown
   $scope.selectchange = function(twitterName) {
      console.log("Change value: "+JSON.stringify(twitterName, null, 4));
      //getRecordsForName(twitterName);
    };
    
    
    
};


/* Add Controllers to Module */
followUi.controller('followers', followers);