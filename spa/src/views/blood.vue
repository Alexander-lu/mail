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
        <div class="panel-heading">血型遗传规律表</div>

        <!-- Table -->
        <div class="table-responsive">
          <table class="table">
            <thead>
              <tr>
                <th>父母血型</th>
                <th>子女会出现的血型</th>
                <th>子女不会出现的血型</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>O+O</td>
                <td>O</td>
                <td>A、B、AB</td>
              </tr>
              <tr>
                <td>O+A</td>
                <td>A、O</td>
                <td>B、AB</td>
              </tr>
              <tr>
                <td>O+B</td>
                <td>B、O</td>
                <td>A、AB</td>
              </tr>
              <tr>
                <td>O+AB</td>
                <td>A、B</td>
                <td>O、AB</td>
  
              </tr>
              <tr>
                <td>A+A</td>
                <td>A、O</td>
                <td>AB、B</td>
    
              </tr>
              <tr>
                <td>A+B</td>
                <td>AB、A、B、O</td>
                <td></td>
      
              </tr>
              <tr>
                <td>A+AB</td>
                <td>A、B、AB</td>
                <td>O</td>
        
              </tr>
              <tr>
                <td>B+B</td>
                <td>B、O</td>
                <td>A、AB</td>
       
              </tr>
              <tr>
                <td>B+AB</td>
                <td>A、B、AB</td>
                <td>O</td>
        
              </tr>
              <tr>
                <td>AB+AB</td>
                <td>A、B、AB</td>
                <td>O</td>
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
  name: "Blood",
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

