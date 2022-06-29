const webpack = require("webpack");
module.exports = {
  // 配置插件参数

  configureWebpack: {
    plugins: [
      // 配置 jQuery 插件的参数

      new webpack.ProvidePlugin({
        $: "jquery",

        jQuery: "jquery",

        "window.jQuery": "jquery",

        Popper: ["popper.js", "default"],
      }),
    ],
    devServer: {
       proxy: {
            // 前后端分离开发，调试时为解决跨域问题，利用webpack配置一个简单的反向代理。见：
            //  pathRewrite: { '^/api': '' }表示访问后端的时候把api这个后缀隐藏
            // https://cli.vuejs.org/guide/webpack.html
            // https://webpack.js.org/configuration/dev-server/#devserverproxy
            '/api': {
              target: 'http://localhost:8080',
              pathRewrite: { '^/api': '' },
            }
       }
    }
  },
};