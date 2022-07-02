import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import axios from 'axios'
import VueAxios from 'vue-axios'
import $ from 'jquery'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
Vue.config.productionTip = false
Vue.use(ElementUI)
Vue.use(VueAxios, axios)

import VueCookies from 'vue-cookies'
Vue.use(VueCookies)
new Vue({
  render: h => h(App),
  router
}).$mount('#app')
Vue.prototype.$ = $
