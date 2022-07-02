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
      <p style="font-size:xxx-large"><b>转16进制工具</b></p>
      <div style="margin-top: 20px">
      <input class="input" placeholder="请输入字符串" v-model="strss" clearable>
        <br>
        <br>
      <button @click="str2hex" type="button" class="btn btn-default btn-lg"> 字符串转十六进制HEX
      </button>
      <button @click="hex2str" type="button" class="btn btn-default btn-lg">
        十六进制HEX转字符串
      </button>
      </div>
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
  name: "Hexstr",
  data() {
    return {
      strss: ''
    };
  },
  methods: {
    str2hex() {
      var str = this.strss;
      var val = "";
      for (var i = 0; i < str.length; i++) {
        if (val == "")
          val = str.charCodeAt(i).toString(16);
        else
          val += "," + str.charCodeAt(i).toString(16);
      }
      this.strss = val
    },
    hex2str() {
      var str = this.strss;
      var val = "";
      var arr = str.split(",");
      for (var i = 0; i < arr.length; i++) {
        val += String.fromCharCode(parseInt(arr[i], 16));
      }
      this.strss = val
    },
  }
};
</script>

<style scoped>
#footer {
  height: 100px;
  margin-top: 600px;
  /* background-color: #ffc0cb; */
}
.imageOne {
  position: relative;
  left: -50px;
}

.blockOne {
  position: absolute;
  left: 100px;
  top: 0px;
  font-size: 20px;
}

.classtwo {
  display: block;
  margin: 0 auto;
  width: 80%;
}

.classOne {
  width: 200px;
  height: 120px;
  padding: 0px;
  margin-right: 20px;
}


.titleBrand {
  font-size: 30px;
}

.time {
  font-size: 13px;
  color: #999;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}

.button {
  padding: 0;
  float: right;
}

.image {
  width: 100%;
  display: block;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both
}


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
  /*display: float;*/
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

