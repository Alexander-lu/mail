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
                <td>夏</td>
                <td>约前2146-1675年</td>
                <td>安邑</td>
                <td>山西夏县</td>
              </tr>
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
                <td>秦</td>
                <td>前221-207年</td>
                <td>咸阳</td>
                <td>陕西咸阳</td>
              </tr>
              <tr>
                <td>汉-③西汉</td>
                <td>前206—公元25</td>
                <td>长安</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>汉-东汉</td>
                <td>25—220</td>
                <td>洛阳</td>
                <td>河南洛阳</td>
              </tr>
              <tr>
                <td>三国-魏</td>
                <td>220-265</td>
                <td>洛阳</td>
                <td>河南洛阳</td>
              </tr>
              <tr>
                <td>三国-蜀</td>
                <td>221-263</td>
                <td>成都</td>
                <td>四川成都</td>
              </tr>
              <tr>
                <td>三国-吴</td>
                <td>222-280</td>
                <td>建业</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>西晋</td>
                <td>265-317</td>
                <td>洛阳</td>
                <td>河南洛阳</td>
              </tr>
              <tr>
                <td>东晋十六国-东晋</td>
                <td>317-420</td>
                <td>建康</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>东晋十六国-④十六国</td>
                <td>304-439</td>
                <td>—</td>
                <td>—</td>
              </tr>
              <tr>
                <td>南朝-宋</td>
                <td>420-479</td>
                <td>建康</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>南朝-齐</td>
                <td>479-502</td>
                <td>建康</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>南朝-梁</td>
                <td>502-557</td>
                <td>建康</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>南朝-陈</td>
                <td>557-589</td>
                <td>建康</td>
                <td>江苏南京</td>
              </tr>
              <tr>
                <td>北朝-北魏</td>
                <td>386-534</td>
                <td>平城/洛阳</td>
                <td>山西大同/河南洛阳</td>
              </tr>
              <tr>
                <td>北朝-东魏</td>
                <td>534-550</td>
                <td>邺</td>
                <td>河北临漳</td>
              </tr>
              <tr>
                <td>北朝-北齐</td>
                <td>550-577</td>
                <td>邺</td>
                <td>河北临漳</td>
              </tr>
              <tr>
                <td>北朝-西魏</td>
                <td>535-557</td>
                <td>长安</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>北朝-北周</td>
                <td>557-581</td>
                <td>长安</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>隋</td>
                <td>581-618</td>
                <td>大兴</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>唐</td>
                <td>618-907</td>
                <td>长安</td>
                <td>陕西西安</td>
              </tr>
              <tr>
                <td>五代十国-后梁</td>
                <td>907-923</td>
                <td>汴</td>
                <td>河南开封</td>
              </tr>
              <tr>
                <td>五代十国-后唐</td>
                <td>923-936</td>
                <td>洛阳</td>
                <td>河南洛阳</td>
              </tr>
              <tr>
                <td>五代十国-后晋</td>
                <td>936-946</td>
                <td>汴</td>
                <td>河南开封</td>
              </tr>
              <tr>
                <td>五代十国-后汉</td>
                <td>947-950</td>
                <td>汴</td>
                <td>河南开封</td>
              </tr>
              <tr>
                <td>五代十国-后周</td>
                <td>951-960</td>
                <td>汴</td>
                <td>河南开封</td>
              </tr>
              <tr>
                <td>五代十国-⑤十国</td>
                <td>902-979</td>
                <td>—</td>
                <td>—</td>
              </tr>
              <tr>
                <td>北宋</td>
                <td>960-1127</td>
                <td>开封</td>
                <td>河南开封</td>
              </tr>
              <tr>
                <td>南宋</td>
                <td>1127-1279</td>
                <td>临安</td>
                <td>浙江杭州</td>
              </tr>
              <tr>
                <td>辽</td>
                <td>907-1125</td>
                <td>皇都(上京)</td>
                <td>内蒙古 巴林左旗</td>
              </tr>
              <tr>
                <td>西夏</td>
                <td>1038-1227</td>
                <td>兴庆府</td>
                <td>宁夏银川</td>
              </tr>
              <tr>
                <td>金</td>
                <td>1115-1234</td>
                <td>会宁/中都/开封</td>
                <td>阿城(黑龙江)/北京/河南开封</td>
              </tr>
              <tr>
                <td>元</td>
                <td>1206-1368</td>
                <td>大都</td>
                <td>北京</td>
              </tr>
              <tr>
                <td>明</td>
                <td>1368-1644</td>
                <td>北京</td>
                <td>北京</td>
              </tr>
              <tr>
                <td>清</td>
                <td>1616-1911</td>
                <td>北京</td>
                <td>北京</td>
              </tr>
              <tr>
                <td>中华民国</td>
                <td>1912-1949</td>
                <td>南京</td>
                <td>江苏南京</td>
              </tr>

            </tbody>
          </table>
        </div>
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
  name: "Dynasty",
  data() {
    return {
 
    };
  },
  methods: {
 
  }
};

</script>

<style scoped>
th{
  text-align: center;
}
.titleBrand {
  
  font-size: 30px;
}

p {
  float: left;
}
#footer {
  height: 100px;
  margin-top: 600px;
  /* background-color: #ffc0cb; */
}
</style>

