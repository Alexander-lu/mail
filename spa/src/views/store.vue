<template>
  <!-- <el-container>
      <el-header>
          <a href="#" class="logo">AdalabTeamD</a>
          <ul class="navigation">
              <li><a href="http://192.168.1.111:3000/#/main">首页</a></li>
              <li><a href="#">博客</a></li>
              <li><a href="#">联系我</a></li>
              <li><a href="#">留言板</a></li>
              <li><a href="#">关于我</a></li>
              <li><a href="#">照片墙</a></li>
          </ul>
          <div class="search">
              <input type="text" placeholder="Search">
              <i class="fa fa-search" aria-hidden="true"></i>
          </div>
      </el-header>

      <el-main>
          <div class="banner">
              <div class="content">
                  <h2>STORE</h2>
                  <p>
                      STORESTORESTORESTORESTORESTORESTORESTORE
                  </p>
                  <a href="#">阅读全文</a>
              </div>
          </div>
      </el-main>

      <el-footer>
          FOOTER
      </el-footer>
  </el-container> -->

  <el-container>
    <el-header>
      <a href="#" class="logo">PDF文档管理中心</a>
      <div>
        <ul class="navigation">
          <li><a href="/main">首页</a></li>
          <li><a href="/url2pdfon">转换工具</a></li>
          <!-- <li><a href="#">联系我</a></li>
          <li><a href="#">留言板</a></li>
          <li><a href="#">关于我们</a></li>
          <li><a href="#">照片墙</a></li>  -->
        </ul>
      </div>
      <div class="search">
        <input type="text" placeholder="Search">
        <i class="fa fa-search" aria-hidden="true"></i>
      </div>
    </el-header>
    <el-container
      style="height: 70vh; width: 70vw; border: 1px solid #eee; position:absolute; margin-top: 15vh; margin-left: 15vw;">

      <el-aside width="250px" style="margin-top: 60px; background-color: rgb(238, 241, 246); ">
        <el-menu :default-openeds="['1', '3']">
          <el-submenu index="1">
            <template slot="title"><i class="el-icon-message"></i>站点</template>
            <el-menu-item-group>
              <!-- <template slot="title">组1</template> -->
              <el-menu-item index="1-1">腾讯</el-menu-item>
              <el-menu-item index="1-2">百度</el-menu-item>
            </el-menu-item-group>
            <!-- <el-menu-item-group title="分组2">
                <el-menu-item index="1-3">选项3</el-menu-item>
            </el-menu-item-group> -->
            <!-- <el-submenu index="1-4">
                <template slot="title">选项4</template>
                <el-menu-item index="1-4-1">选项4-1</el-menu-item>
            </el-submenu> -->
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"><i class="el-icon-menu"></i>日期</template>
            <el-menu-item-group>
              <!-- <template slot="title">年</template> -->
              <el-menu-item index="2-1">2022</el-menu-item>
              <el-menu-item index="2-2">2021</el-menu-item>
            </el-menu-item-group>
            <!-- <el-menu-item-group title="分组2">
                <el-menu-item index="2-3">选项3</el-menu-item>
            </el-menu-item-group> -->
            <!-- <el-submenu index="2-4">
                <template slot="title">选项4</template>
                <el-menu-item index="2-4-1">选项4-1</el-menu-item>
            </el-submenu> -->
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"><i class="el-icon-setting"></i>类型</template>
            <el-menu-item-group>
              <!-- <template slot="title">OO</template> -->
              <el-menu-item index="3-1">OO</el-menu-item>
              <el-menu-item index="3-2">XX</el-menu-item>
            </el-menu-item-group>
            <!-- <el-menu-item-group title="XX">
                <el-menu-item index="3-3">选项3</el-menu-item>
            </el-menu-item-group>
            <el-submenu index="3-4">
                <template slot="title">选项4</template>
                <el-menu-item index="3-4-1">选项4-1</el-menu-item>
            </el-submenu> -->
          </el-submenu>
        </el-menu>
      </el-aside>

      <el-container>
        <el-header style="text-align: right; font-size: 12px">
          <el-dropdown style="margin-left: 900px;">
            <i class="el-icon-setting" style="margin-right: 15px"></i>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>查看</el-dropdown-item>
              <el-dropdown-item>新增</el-dropdown-item>
              <el-dropdown-item>删除</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <span>{{username}}</span>
        </el-header>

        <el-main>
          <el-table :data="tableData">
            <el-table-column prop="date" label="日期" width="140">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址">
            </el-table-column>
            <el-table-column>

              <button type="submit" @click="download">下载</button>

            </el-table-column>
          </el-table>
        </el-main>
      </el-container>
    </el-container>
  </el-container>
</template>

<script>
export default {
  name: 'Store',
  components: {
  },
  data() {
    const item = {
      
      date: '2022-6-30',
      name: 'user_id',
      address: 'url'
    };
    return {
      tableData: Array(20).fill(item)
    }
  }

};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.el-header {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 15px 100px;
  z-index: 10;
  background: #5b639c;
}

.el-header .logo {
  position: relative;
  font-size: 1.5em;
  color: #fff;
  text-decoration: none;
  font-weight: 600;
}

.el-header .navigation {
  display: flex;
  justify-content: center;
  flex-wrap: wrap;
  margin: 10px 0;
}

.el-header .navigation li {
  list-style: none;
  margin: 0 20px;
}

.el-header .navigation li a {
  text-decoration: none;
  color: #fff;
  font-weight: 600;
  letter-spacing: 1px;
}

.el-header .navigation li a:hover {
  color: #ffed3b;
}

.el-header .search {
  position: relative;
  width: 300px;
  height: 40px;
}



.el-header .search input {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  color: #fff;
  background: transparent;
  outline: none;
  border: 1px solid #fff;
  border-radius: 5px;
  padding: 0 10px 0 45px;
}

.el-header .search input::placeholder {
  color: #fff;
}

.el-header .search .fa-search {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  left: 10px;
  color: #fff;
  border-right: 1px solid #fff;
  padding-right: 10px;
}

.banner {
  background: #eee;
  padding: 200px 100px 100px;
  min-height: 100vh;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.banner .content {
  max-width: 1000px;
}

.banner .content h2 {
  font-size: 2.5em;
  color: #333;
  margin-bottom: 20px;
}

.banner .content p {
  font-size: 1em;
  color: #333;
}

.banner .content a {
  display: inline-block;
  background: #434978;
  color: #fff;
  padding: 10px 20px;
  text-decoration: none;
  font-weight: 600;
  margin-top: 20px;
}

.banner .image {
  max-width: 500px;
  margin-left: 50px;
}

.el-aside {
  color: #333;
}

button {
  border: none;
  width: 80px;
  height: 35px;
  line-height: 35px;
  border-radius: 50px;
  background-color: white;
  transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);
}

button:hover {
  /* box-shadow: 10px 10px 50px #4c92d3; */
  color: rgb(16, 206, 219);
  font-weight: bold;
}
</style>