Vue.component('strokastrany', {
	props: ['stroka'],
	template: '<div> <i>{{ stroka.kluj }}</i> {{ stroka.nazva }}</div>'
})

Vue.component('listikstran', {
	props: ['stroki'],
  template:
    '<div>'+
      '<strokastrany v-for="strana in stroki" :stroka="strana" :key="strana.kluj"/>' +
    '</div>'
})

var lkl = new Vue({
  el: '#app',
  template:
	  '<listikstran :stroki="strany"/>',
  data: {
    strany: [
        {kluj: '1', nazva:'Belarus'},
        {kluj: '2', nazva:'Russia'},
        {kluj: '3', nazva:'Ukraine'},
    ]
  }
})