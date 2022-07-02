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
                <a class='titleBrand' href="#"><img alt="在线工具" src="../assets/10.png"></a>
              </div>
            </div>

          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <form class="navbar-form navbar-left">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="搜索其实很简单">
              </div>
              <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <ul class="nav navbar-nav navbar-right">


            </ul>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>
    </el-header>
    <el-main>
      <nav class="navbar1">
        <a href="https://www.adalab.cn/" class="left">
          <img src="../img/adalab.png" alt="主页">
        </a>
      </nav>
      <p style="font-size:xxx-large"><b>加密解密工具</b></p>
      <div style="margin-top: 20px">
      <input class="input" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入密码" v-model="passward">
        <br>
        <br>
      <button @click="encode" type="button" class="btn btn-default btn-lg"> 加密
      </button>
      <button @click="decode" type="button" class="btn btn-default btn-lg"> 解密
      </button></div>
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
export default {
  name: "Encdec",
  data() {
    return {
      passward: ""
    };
  },
  methods: {
    encode() {
      this.passward = jiami(this.passward,3)
    },
    decode() {
      this.passward = jiemi(this.passward,3)
    },
  }
};
    // 加密
    function jiami(str, num) {
      var newStr = "";
      for (let i = 0; i < str.length; i++) {
        if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 65 + num + 26) % 26 + 65)
        }
        else if (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 97 + num + 26) % 26 + 97)
        }
        //特殊符号不做处理
        else newStr += String.fromCharCode(str.charCodeAt(i));
      }
      // console.log(newStr);
      return newStr;
    }
  // 解密
    function jiemi(str, num) {
      var newStr = "";
      for (let i = 0; i < str.length; i++) {
        // str.chatCodeAt(i);
        if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 65 - num + 26) % 26 + 65)
        }
        else if (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 97 - num + 26) % 26 + 97)
        }
        //特殊符号不做处理
        else newStr += String.fromCharCode(str.charCodeAt(i));
      }
      // console.log(newStr);
      return newStr;
    }

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

/*.input {*/
/*  position: relative;*/
/*  left: 20px;*/
/*  margin-top: 50px;*/
/*  display: flex;*/
/*  width: 55vw;*/

/*}*/

.input{
  position: relative;
  left: 20px;
  margin-top: 50px;
  /*display: flex;*/

  background-color: #FFF;
  border-radius: 25px;
  border: 1px solid #DCDFE6;
  box-shadow: 0 0 30px #4c92d3;
  box-sizing: border-box;
  color: #606266;
  /*display: inline-block;*/
  font-size: inherit;
  height: 50px;
  line-height: 40px;
  /*outline: 0;*/
  padding: 0 15px;
  transition: border-color .2s cubic-bezier(.645, .045, .355, 1);
  width: 50vw;

}

.navbar1 {
  display: float;
  height: 50px;
  line-height: 50px;
  margin-bottom: 80px;
}

.navbar1 .left {
  float: left;
}

.navbar1 .right {
  float: right
}

.navbar1 img {
  width: 10rem;
  height: 50px;

  /* width: 100px; */

}
</style>

