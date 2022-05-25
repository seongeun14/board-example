const path = require('path');

module.exports = {
  //추가
  outputDir: path.resolve(__dirname, "../src/main/resources/static"),

  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8180',
        ws: true,
        changeOrigin: true
      }
    }
  },
  chainWebpack: config => {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
  }
}