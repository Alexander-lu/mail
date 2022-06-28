import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/Login.vue'
import balance from './views/balance.vue'
import cookies from 'vue-cookies'
Vue.use(Router)
export default new Router({
    routes: [
        {
            path: '/login',
            name: 'Login',
            component: Login,   // `/login`路径访问Login组件
        },
        {
            path: '/balance',
            name: 'balance',
            component: balance,
            beforeEnter: (to,from,next) => {
                if(cookies.get("session_id")){
                    next()
                }else {
                    next('/login')
                }
            }
        },
        {
            path: '*',
            redirect: '/login'  // 所有路径都重定向到`/login`
        }
    ]
});
