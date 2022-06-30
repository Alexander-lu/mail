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
      <el-input type="textarea" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入密码" v-model="passward">
      </el-input>
      <button @click="encode" type="button" class="btn btn-default btn-lg"> 加密
      </button>
      <button @click="decode" type="button" class="btn btn-default btn-lg"> 解密
      </button>
    </el-main>
    <el-footer>Footer</el-footer>
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
</style>

