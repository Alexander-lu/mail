import Vue from 'vue'
import Router from 'vue-router'
import Register from './views/Register'
import Login from './views/Login'
import Main from './views/main'
import Error403 from './views/403.vue'
import Error404 from './views/404.vue'
import Permission from './views/Permission.vue'
import Dynasty from './views/dynasty.vue'
import Qrcode from './views/qrcode.vue'
import Encdec from './views/encdec.vue'
import Daxie from './views/daxie.vue'
import Hexstr from './views/hexstr.vue'
import Url2pdf from './views/url2pdf.vue'
import Blood from './views/blood.vue'
import Store from './views/store.vue'
import Soudu from './views/soudu'
Vue.use(Router)
export default new Router({
    routes: [
        {
            path: '/403',
            name: '403',
            component: Error403
        },
        {
            path: '/404',
            name: '404',
            component: Error404
        },
        {
            path: '/blood',
            name: 'Blood',
            component: Blood
        },
        {
            path: '/soudu',
            name: 'Soudu',
            component: Soudu
        },
        {
            path: '/store',
            name: 'Store',
            component: Store
        },
        {
            path: '/register',
            name: 'Register',
            component: Register
        },
        {
            path: '/hexstr',
            name: 'Hexstr',
            component: Hexstr
        },
        {
            path: '/daxie',
            name: 'Daxie',
            component: Daxie
        },
        {
            path: '/encdec',
            name: 'Encdec',
            component: Encdec
        },
        {
            path: '/permission',
            name: 'Permission',
            component: Permission
        },
        {
            path: '/qrcode',
            name: 'Qrcode',
            component: Qrcode
        },
        {
            path: '/dynasty',
            name: 'Dynasty',
            component: Dynasty
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
            path: '/',
            redirect: '/main'
        },
        {
            path: '*',
            redirect: '/404'
        },
        {
            path: '/url2pdf',
            name: 'Url2pdf',
            component: Url2pdf
        }
    ]
});
