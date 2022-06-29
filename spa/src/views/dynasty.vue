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
      <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading">中国朝代表</div>
        <div class="panel-body">
          <p>① 约公元前14世纪盘庚迁都于殷，此后商也称为殷。
          </p>
          <p>
            ② 公元前841年(西周共和元年)为中国历史确切纪年的开始。
          </p>
          <p>
            ③ 包括王莽建立的"新"王朝(公元8年—23年)。王莽时期，爆发大规模的农民起义，建立了农民政权。公元23年，新王莽政权灭亡。公元25年，东汉王朝建立。
          </p>
          <p>
            ④ 这时期，在我国北方，先后存在过一些封建政权，其中有：汉(前赵)、成(成汉)、前凉、后赵(魏)、前燕、前秦、后燕、后秦、西秦、后凉、南凉、北凉、南燕、西凉、北燕、夏等国，历史上叫做"十六国"。
          </p>
          <p>
            ⑤ 这时期，除后梁、后唐、后晋、后汉、后周外，还先后存在过一些封建政权，其中有：吴、前蜀、吴越、楚、闽、南汉、荆南(南平)、后蜀、南唐、北汉等国，历史上叫做"十国"。。
          </p>
        </div>

        <!-- Table -->
        <div class="table-responsive">
          <table class="table">
            <thead>
              <tr>
                <th>朝 代</th>
                <th>起 讫</th>
                <th>都 城</th>
                <th>今 地</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>①商</td>
                <td>约前1675-1029年</td>
                <td>亳</td>
                <td>河南商丘</td>
              </tr>
              <tr>
                <td>西周</td>
                <td>②约前1029-771年</td>
                <td>镐京</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>东周</td>
                <td>前770-256年</td>
                <td>洛邑</td>
                <td>河南洛阳</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
              <tr>
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </el-main>
    <el-footer>Footer</el-footer>
  </el-container>


</template>

<script>
export default {
  name: "Dynasty",
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

p {
  float: left;
}
</style>

