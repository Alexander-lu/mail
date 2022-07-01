<template>
  <el-container>
    <el-header>
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
              data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <div class="container-fluid">
              <div class="navbar-header">
                <a class='titleBrand' href="#/"><img alt="在线工具" src="../assets/10.png"></a>
              </div>
            </div>
          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

        
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>
    </el-header>
    <el-main>
 <button @click="creatQrCode" type="button" class="btn btn-default btn-lg"> 生成二维码</button>
      <el-input type="textarea" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入网址" v-model=qrcodedata></el-input>
  
      <span ref="qrCodeUrl"></span>
    </el-main>
    <el-footer>
      <div class="block" id="footer">
        <span><a href="#/main">主页</a></span>
        <br>
        <span>TeamD - CMX CYM FXD LKJ winson ZJM</span>
      </div>
    </el-footer>
  </el-container>


</template>


<script>

import QRCode from "qrcodejs2";
export default {
  name: "Qrcode",
  data() {
    return {
      qrcodedata: ""
    };
  },
  methods: {
    creatQrCode() {
      let a = new QRCode(this.$refs.qrCodeUrl, {
        text: this.qrcodedata, // 需要转换为二维码的内容
        width: 400,
        height: 400,
        colorDark: "black", //#000000为黑色
        colorLight: "white",
      });
      console.log("二维码:", a);
    },
  },
};
</script>

<style scoped>
.titleBrand {
  font-size: 30px;
}

#footer {
  height: 100px;
  margin-top: 600px;
  /* background-color: #ffc0cb; */
}
</style>

