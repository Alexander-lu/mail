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

          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>
    </el-header>
    <el-main>
      <div class="row classtwo">
        <el-tabs v-model="activeName" @tab-click="handleClick">
          <el-tab-pane label="全部" name="first">
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <!-- <img class='imageOne' src="../assets/123.png" alt="..."> -->
                <img class='imageOne' src="../assets/pdf.png" alt="...">
                <h3 class='blockOne'><b>url转pdf</b></h3>
                <p class="illustration">将网页转换成PDF文档</p>
                <a href="#/url2pdf" class="btn btn-primary pos" role="button">进入</a>
                <a href="#/store" class="btn btn-primary pos" role="button">查看</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/朝代表.png" alt="...">
                <h3 class='blockOne'><b>国朝代表</b></h3>
                <p class="illustration">中国历代详细信息</p>
                <a href="#/dynasty" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/加密.png" alt="...">
                <h3 class='blockOne'><b>加密解密</b></h3>
                <p class="illustration">生成加密文本</p>
                <a href="#/encdec" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/转16.png" alt="...">
                <h3 class='blockOne'><b>str转hex</b></h3>
                <p class="illustration">字符串转换成16进制</p>
                <a href="#/hexstr" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/转大写.png" alt="...">
                <h3 class='blockOne'><b>数字转大写</b></h3>
                <p class="illustration">数字转成中文大写</p>
                <a href="#/daxie" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/世界.png" alt="...">
                <h3 class='blockOne'><b>各国首都列表</b></h3>
                <p class="illustration">各国首都信息</p>
                <a href="#/soudu" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/二维码.png" alt="...">
                <h3 class='blockOne'><b>二维码生成</b></h3>
                <p class="illustration">信息保存到二维码中</p>
                <a href="#/qrcode" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="转换类" name="second">
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <!-- <img class='imageOne' src="../assets/123.png" alt="..."> -->
                <img class='imageOne' src="../assets/pdf.png" alt="...">
                <h3 class='blockOne'><b>url转pdf</b></h3>
                <p class="illustration">将网页转换成PDF文档</p>
                <a href="#/url2pdf" class="btn btn-primary pos" role="button">进入</a>
                <a href="#/store" class="btn btn-primary pos" role="button">查看</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/加密.png" alt="...">
                <h3 class='blockOne'><b>加密解密</b></h3>
                <p class="illustration">生成加密文本</p>
                <a href="#/encdec" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/转16.png" alt="...">
                <h3 class='blockOne'><b>str转hex</b></h3>
                <p class="illustration">字符串转换成16进制</p>
                <a href="#/hexstr" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/转大写.png" alt="...">
                <h3 class='blockOne'><b>数字转大写</b></h3>
                <p class="illustration">数字转成中文大写</p>
                <a href="#/daxie" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="查询类" name="third">
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/朝代表.png" alt="...">
                <h3 class='blockOne'><b>国朝代表</b></h3>
                <p class="illustration">中国历代详细信息</p>
                <a href="#/dynasty" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/世界.png" alt="...">
                <h3 class='blockOne'><b>各国首都列表</b></h3>
                <p class="illustration">各国首都信息</p>
                <a href="#/soudu" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="二维码类" name="fourth">
            <div class="col-sm-6 col-md-4 classOne">
              <div class="thumbnail">
                <img class='imageOne' src="../assets/二维码.png" alt="...">
                <h3 class='blockOne'><b>二维码生成</b></h3>
                <p class="illustration">信息保存到二维码中</p>
                <a href="#/qrcode" class="btn btn-primary pos" role="button">进入</a>
              </div>
            </div>
          </el-tab-pane>
        </el-tabs>

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
    <div id="fixed-btn" style="position:fixed;" @click="back_top">
      <!--      <a class="go-top" href="#" title="返回顶部">-->
      <div style="{
        height: 50px;
        width: 50px;
        background-color: #f2f5f6;
        box-shadow: 0 0 10px rgba(0,0,0, .2);
        text-align: center;
        line-height: 40px;
        /*color: #1989fa;*/
        color: rgb(0, 154, 97);
      }">
        UP
      </div>
      <!--      </a>-->
    </div>
  </el-container>
</template>

<script>
export default {
  name: "Main",
  data() {
    return {
      activeName: 'second'
    };
  },
  methods: {
    back_top() {
      let a = scrollY;
      let timer = setInterval(function () {
        if (a > 0) {
          a -= 20;
          scrollTo(0, a);
        } else {
          clearInterval(timer);
        }
      }, 10)
    },
    handleClick(tab, event) {
      console.log(tab, event);
    }
  }
};
</script>

<style scoped>
.imageOne {
  position: relative;
  height: 70px;
  width: 70px;
  right: 110px;
}

/*
进入按钮位置
 */
.pos {
  background: rgb(0, 154, 97, 0.6);
  margin-top: 20px;
  position: relative;
  top: 10px;
  left: 90px;
  border: hidden;
}

/*
说明文本
 */
.illustration {
  color: rgb(255, 170, 69);
  position: relative;
  top: 20px;
  padding-left: 0;
  text-align: left;
}

/*
工具框
 */
.thumbnail {
  padding-bottom: 20px
}

.thumbnail:hover {
  transform: translate3d(0, -3px, 0);
  box-shadow: 0 8px 16px 0 rgba(48, 55, 66, 0.2);
}

.blockOne {
  position: absolute;
  left: 90px;
  top: 0;
  font-size: 20px;
}

.classtwo {
  display: block;
  margin: 0 auto;
  width: 60%;
}

.classOne {
  width: 300px;
  height: 250px;
  padding: 0;
  margin-right: 20px;
}


.titleBrand {
  font-size: 30px;
}

.btn-primary {
  position: relative;
  margin-right: 0;
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
</style>

