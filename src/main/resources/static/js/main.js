
var countryApi = Vue.resource('/countries{/id}');

Vue.component('country-row', {
	props: ['country'],
	template: '<div> <i>{{ country.id }}</i> {{ country.name }}</div>'
})

Vue.component('country-list', {
	props: ['countries'],
  template:
    '<div>'+
      '<country-row v-for="country in countries" :country="country" :key="country.id"/>' +
    '</div>',
    created: function() {
      countryApi.get().then(result => result.body.forEach(country => this.countries.push(country)))
    }
})

var app = new Vue({
  el: '#app',
  template:
	  '<country-list :countries="countries"/>',
  data: {
    countries: [ ]
  }
})