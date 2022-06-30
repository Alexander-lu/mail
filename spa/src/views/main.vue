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
      <div class="row classtwo">
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <!-- <img class='imageOne' src="../assets/123.png" alt="..."> -->
            <img class='imageOne' height="70" width="70" src="../assets/pdf.png" alt="...">
            <h3 class='blockOne'>url转pdf</h3>
            <a href="#/url2pdf" class="btn btn-primary" role="button">进入</a>
            <a href="#/store" class="btn btn-primary" role="button">查看</a>
          </div>

        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/朝代表.png" alt="...">
            <h3 class='blockOne'>国朝代表</h3>
            <a href="#/dynasty" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/加密.png" alt="...">
            <h3 class='blockOne'>加密解密</h3>
            <a href="#/encdec" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/转16.png" alt="...">
            <h3 class='blockOne'>str转hex</h3>
            <a href="#/hexstr" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/转大写.png" alt="...">
            <h3 class='blockOne'>数字转大写</h3>
            <a href="#/daxie" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/世界.png" alt="...">
            <h3 class='blockOne'>各国首都列表</h3>
            <a href="#/soudu" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 classOne">
          <div class="thumbnail">
            <img class='imageOne' height="70" width="70" src="../assets/二维码.png" alt="...">
            <h3 class='blockOne'>二维码生成</h3>
            <a href="#/qrcode" class="btn btn-primary" role="button">进入</a>
          </div>
        </div>
      </div>
    </el-main>
    <el-footer>
      <div class="block" id="footer">
        <span>首页-<a href="https://www.adalab.cn/">Abalab</a></span>
        <br>
        <span>TeamD - CMX CYM FXD LKJ winson ZJM</span>
        <el-pagination layout="prev, pager, next" :total="5">
        </el-pagination>
      </div>
    </el-footer>
    <div id="fixed-btn" style="position:fixed;">
      <a class="go-top" href="#" title="返回顶部"><div style="{
        height: 50px;
        width: 50px;
        background-color: #f2f5f6;
        box-shadow: 0 0 10px rgba(0,0,0, .2);
        text-align: center;
        line-height: 40px;
        color: #1989fa;
      }">
        <font size="5" >UP</font>
      </div></a>
    </div>
  </el-container>
</template>

<script>
export default {
  name: "Main",
  data() {
    return {
    };
  },
};
</script>

<style scoped>
.imageOne {
  position: relative;
  left: -50px;
}

.blockOne {
  position: absolute;
  left: 90px;
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

#footer {
  height: 100px;
  margin-top: 500px;
  /* background-color: #ffc0cb; */
}

#fixed-btn {
  margin-top: 800px;
  margin-left: 1600px;
}

.fixed-btn .go-top {
  border-bottom: 1px solid #eee
}

</style>

