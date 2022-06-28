<template>
<Card>
    <el-menu :default-active="activeIndex2" class="el-menu-demo" mode="horizontal" @select="handleSelect"
      background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
      <el-menu-item index="1"><a href="https://www.bankofchina.com/pbservice/pb3/">金融理财</a></el-menu-item>
      <el-submenu index="2">
        <template slot="title">个人中心</template>
        <el-menu-item index="2-1"><a class="bai" href="https://www.bankofchina.com/bcservice/">银行卡</a></el-menu-item>
        <el-menu-item index="2-2"><a class="bai" href="https://www.bankofchina.com/pbservice/pb6/">私人银行</a></el-menu-item>
      </el-submenu>
      <el-menu-item index="3" disabled>消息中心</el-menu-item>
    </el-menu>
    <p>欢迎回来，{{ message }}！</p>
    <a>您当前余额为1234.56元</a>
    <input type="submit" value="退出登陆" @click="loginout" />
</Card>
</template>

<script>
import cookies from 'vue-cookies'
export default {
  name: "balance",
  data() {
    return {
      message: "",
      activeIndex: '1',
      activeIndex2: '1'
    };
  },
  created() {
    //发送get
    this.axios({
      method: "GET",
      url: "/api/name"
    }).then(response => {
      console.log(response);
      this.message = response.data.name
    })
  },
  components: {
},
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    loginout() {
      cookies.remove("session_id");
      this.$router.push('/Login');
    }
  },
};
</script>

<style scoped>
input[type="submit"] {
  display: block;
  background: #1abc9d;
  width: 70%;
  padding: 4px;
  cursor: pointer;
  color: #fff;
  border: 0px;
  margin: auto;
  border-radius: 5px;
  font-size: 12px;
  transition: all 0.3s ease;
  line-height: 12px;
}

input[type="submit"]:hover {
  background: #09cca6;
}

span {
  margin: 0.5em;
  color: red;
}
a{
   text-decoration:none 
}
.bai{
  color:#fff
}
</style>
