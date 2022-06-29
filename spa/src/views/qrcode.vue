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
      <el-input type="textarea" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入数字" v-model="numnnn">
      </el-input>
      <button @click="num2daxie" type="button" class="btn btn-default btn-lg"> 数字转中文大写
      </button>
    </el-main>
    <el-footer>Footer</el-footer>
  </el-container>


</template>

<script>
export default {
  name: "Qrcode",
  data() {
    return {
      numnnn: ""
    };
  },
  methods: {
    num2daxie() {
      this.numnnn = toChinesNum(this.numnnn)
    },
  }
};
const toChinesNum = (num) => {
  let changeNum = ['零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖']; //changeNum[0] = "零"
  let unit = ["", "拾", "佰", "仟", "万"];
  num = parseInt(num);
  let getWan = (temp) => {
    let strArr = temp.toString().split("").reverse();
    let newNum = "";
    for (var i = 0; i < strArr.length; i++) {
      newNum = (i == 0 && strArr[i] == 0 ? "" : (i > 0 && strArr[i] == 0 && strArr[i - 1] == 0 ? "" : changeNum[strArr[i]] + (strArr[i] == 0 ? unit[0] : unit[i]))) + newNum;
    }
    return newNum;
  }
  let overWan = Math.floor(num / 10000);
  let noWan = num % 10000;
  if (noWan.toString().length < 4) noWan = "0" + noWan;
  return overWan ? getWan(overWan) + "万" + getWan(noWan) : getWan(num);

}
</script>

<style scoped>
.titleBrand {
  font-size: 30px;
}
</style>

