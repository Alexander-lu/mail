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


        <!-- Table -->
        <div class="table-responsive">
          <table class="table">
            <thead>
              <tr>
                <th>国家名称</th>
                <th>首都</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>中华人民共和国 People's Republic of China</td>
                <td>北京 Beijing</td>
      
              </tr>
                 <tr>
                <td>蒙古 Mongolia</td>
                <td>乌兰巴托 Elggydggmgj</td>
      
              </tr>    <tr>
                <td>朝鲜 Democratic People's Republic of Korea</td>
                <td>平壤 Pyongyang</td>
      
              </tr>    <tr>
                <td>韩国 Republic of Korea</td>
                <td>首尔 Seoul</td>
      
              </tr>    <tr>
                <td>日本 Japan</td>
                <td>东京 Tokyo</td>
      
              </tr>    <tr>
                <td>菲律宾 Republic of the Philippines</td>
                <td>马尼拉 Manila</td>
      
              </tr>    <tr>
                <td>印度尼西亚 Republic of Indonesia</td>
                <td>雅加达 Jakarta</td>
      
              </tr>    <tr>
                <td>文莱 Brunei Darussalam</td>
                <td>斯里巴加湾市 Bandar Seri Begawan</td>
      
              </tr>    <tr>
                <td>新加坡 Republic of Singapore</td>
                <td>新加坡 Singapore</td>
      
              </tr>    <tr>
                <td>泰国 Kingdom of Thailand</td>
                <td>曼谷 Bangkok</td>
      
              </tr>    <tr>
                <td>马来西亚 Malaysia</td>
                <td>吉隆坡 Kuala Lumpur</td>
      
              </tr>    <tr>
                <td>越南 Socialist Republic of Vietnam</td>
                <td>河内 Hanoi</td>
      
              </tr>    <tr>
                <td>老挝 Lao People's Democratic Republic</td>
                <td>万象 Vientiane</td>
      
              </tr>    <tr>
                <td>柬埔寨 Kingdom of Cambodia</td>
                <td>金边 Phnom Penh</td>
      
              </tr>    <tr>
                <td>缅甸 Union of Myanmar</td>
                <td>仰光 Yangon</td>
      
              </tr>    <tr>
                <td>不丹 Kingdom of Bhutan</td>
                <td>廷布 Thimphu</td>
      
              </tr>    <tr>
                <td>东帝汶 Democratic Republic of East Timor</td>
                <td>帝力 Dili</td>
      
              </tr>    <tr>
                <td>尼泊尔 Kingdom of Nepal</td>
                <td>加德满都 Kathmandu</td>
      
              </tr>    <tr>
                <td>印度 Republic of India</td>
                <td>新德里 New Delhi</td>
      
              </tr>    <tr>
                <td>孟加拉国 People's Republic of Bangladesh</td>
                <td>达卡 Dhaka</td>
      
              </tr>    
              <tr>
                <td>斯里兰卡 Democratic Socialist Republic of Sri Lanka</td>
                <td>科伦坡 Colombo</td>
              </tr>
                <tr>
                <td>马尔代夫 Republic of Maldives</td>
                <td>马累 Male</td>
              </tr>
                <tr>
                <td>巴基斯坦 Islamic Republic of Pakistan</td>
                <td>伊斯兰堡 Islamabad</td>
              </tr>
                <tr>
                <td>阿富汗 Islamic State of Afghanistan</td>
                <td>喀布尔 Kabul</td>
              </tr>
                <tr>
                <td>塔吉克斯坦 Republic of Tajikistan</td>
                <td>杜尚别 Dushanbe</td>
              </tr>
                <tr>
                <td>吉尔吉斯斯坦 Kyrgyz Republic</td>
                <td>比什凯克 Bishkek</td>
              </tr>
                <tr>
                <td>哈萨克斯坦 Republic of Kazakhstan</td>
                <td>阿斯塔纳 Astana</td>
              </tr>
                <tr>
                <td>乌兹别克期坦 Republic of Uzbekistan</td>
                <td>塔什干 Tashkent</td>
              </tr>
                <tr>
                <td>土库曼斯坦 Republic of Turkmenistan</td>
                <td>阿什哈巴德 Ashgabat</td>
              </tr>
                <tr>
                <td>阿什哈巴德 Ashgabat</td>
                <td>德黑兰 Tehran</td>
              </tr>
                <tr>
                <td>伊拉克 Republic of Iraq</td>
                <td>巴格达 Baghdad</td>
              </tr>
                <tr>
                <td>科威特 State of Kuwait</td>
                <td>科威特城 Kuwait</td>
              </tr>
                <tr>
                <td>卡塔尔 State of Qatarc</td>
                <td>多哈 Doha</td>
              </tr>
                <tr>
                <td>阿拉伯联合酋长国 United Arab Emirates</td>
                <td>阿布扎比 Abu Dhabi</td>
              </tr>
                <tr>
                <td>巴林 Kingdom of Bahrain</td>
                <td>麦纳麦 Manama</td>
              </tr>
                <tr>
                <td>阿曼 Sultanate of Oman</td>
                <td>马斯喀特 Muscat</td>
              </tr>
                <tr>
                <td>也门 Republic of Yemen</td>
                <td>萨那 Sanaa</td>
              </tr>
                <tr>
                <td>沙特阿拉伯 Kingdom of Saudi Arabia</td>
                <td>利雅得 Riyadh</td>
              </tr>
                <tr>
                <td>约旦 Hashemite Kingdom of Jordan</td>
                <td>安曼 Amman</td>
              </tr>
                <tr>
                <td>巴勒斯坦 State of Palestine</td>
                <td>耶路撒冷 Jerusalem</td>
              </tr>
                <tr>
                <td>以色列 State of Israel</td>
                <td>耶路撒冷 Jerusalem</td>
              </tr>
                <tr>
                <td>叙利亚 Syrian Arab Republic</td>
                <td>大马士革 Damascus</td>
              </tr>
                <tr>
                <td>黎巴嫩 Lebanese Republic</td>
                <td>贝鲁特 Beirut</td>
              </tr>
                <tr>
                <td>塞浦路斯 Republic of Cyprus</td>
                <td>尼科西亚 Nicosia</td>
              </tr>
                <tr>
                <td>土耳其 Republic of Turkey</td>
                <td>安卡拉 Ankara</td>
              </tr>
                <tr>
                <td>阿塞拜疆 Republic of Azerbaijan</td>
                <td>巴库 Baku</td>
              </tr>
                <tr>
                <td>格鲁吉亚 Georgia</td>
                <td>第比利斯 T'bilisi</td>
              </tr>
                <tr>
                <td>亚美尼亚 Republic of Armenia</td>
                <td>埃里温 Yerevan</td>
              </tr>
              
        
            </tbody>
          </table>
   </div>
      </div>
    </el-main>
    <el-footer><div class="block" id="footer">
        <span><a href="http://192.168.1.111:3000/#/main">主页</a></span>
        <br>
        <span>TeamD - CMX CYM FXD LKJ winson ZJM</span>
      </div></el-footer>
  </el-container>


</template>

<script>
export default {
  name: "Soudu",
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

#footer {
  height: 100px;
  margin-top: 600px;
  /* background-color: #ffc0cb; */
}
</style>

