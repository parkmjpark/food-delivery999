
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PayManager from "./components/listers/PayCards"
import PayDetail from "./components/listers/PayDetail"

import FoodcookingManager from "./components/listers/FoodcookingCards"
import FoodcookingDetail from "./components/listers/FoodcookingDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },
            {
                path: '/pays/:id',
                name: 'PayDetail',
                component: PayDetail
            },

            {
                path: '/foodcookings',
                name: 'FoodcookingManager',
                component: FoodcookingManager
            },
            {
                path: '/foodcookings/:id',
                name: 'FoodcookingDetail',
                component: FoodcookingDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },




    ]
})
