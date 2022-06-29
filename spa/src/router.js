import Vue from 'vue'
import Router from 'vue-router'
import Register from './views/Register'
import Login from './views/Login'
import Main from './views/main'
import Error403 from './views/403.vue'
import Error404 from './views/404.vue'
import permission from './views/Permission.vue'
Vue.use(Router)
export default new Router({
    routes: [
        {
            path: '/register',
            name: 'Register',
            component: Register
        },
        {
            path: '/403',
            name: '403',
            component: Error403
        },
        {
            path: '/permission',
            name: 'Permission',
            component: permission
        },
        {
            path: '/404',
            name: '404',
            component: Error404
        },
        {
            path: '/login',
            name: 'Login',
            component: Login
        },
        {
            path: '/main',
            name: 'Main',
            component: Main
        },
        {
            path: '*',
            redirect: '/main'
        }
    ]
});
