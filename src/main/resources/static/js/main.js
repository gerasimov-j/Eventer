Vue.component('country-row', {
	props: ['country'],
	template: '<div> <i>{{ country.id }}</i> {{ country.name }}</div>'
})

Vue.component('country-list', {
	props: ['countries'],
  template:
    '<div>'+
      '<country-row v-for="country in countries" :country="country" :key="country.id"/>' +
    '</div>'
})

var app = new Vue({
  el: '#app',
  template:
	  '<country-list :countries="countries"/>',
  data: {
    countries: [
        {id: '1', name:'Belarus'},
        {id: '2', name:'Russia'},
        {id: '3', name:'Ukraine'},
    ]
  }
})