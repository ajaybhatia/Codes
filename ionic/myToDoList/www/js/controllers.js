angular.module('starter.controllers', [])

.controller('ToDoListCtrl', function($scope) {
	$scope.toDoListItems = [
		{task: 'To buy groceries on Monday', status: 'not done'},
		{task: 'Meet someone on Wednesday', status: 'not done'},
		{task: 'Party on Friday!', status: 'not done'}
	];
});
