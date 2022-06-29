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
              <li><a href="http://localhost:3000/#/login">登录</a></li>
              <li class="dropdown">
                <a href="http://localhost:3000/#/register">开放注册</a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li role="separator" class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </li>
            </ul>
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>
    </el-header>
    <el-main>
      <el-input placeholder="请输入字符串" v-model="strss" clearable></el-input>
      <button @click="str2hex" type="button" class="btn btn-default btn-lg"> 字符串转十六进制HEX
      </button>
      <button @click="hex2str" type="button" class="btn btn-default btn-lg">
        十六进制HEX转字符串
      </button>
    </el-main>
    <el-footer>Footer</el-footer>
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
</style>

