<template>
  <el-main class="backbig">
    <div class="innerback">
      <p class="denglu">登录</p>
      <el-input v-model="username" clearable placeholder="请输入账号"></el-input>
      <el-input v-model="password" show-password placeholder="请输入密码"></el-input>
      <el-button style="width: 150px;" type="primary" plain @click="login">登录</el-button>
      <p class="msg">{{ message }}</p>
    </div>
  </el-main>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      username: '',
      password: '',
      message: ''
    };
  },



  methods: {
    login() {
      this.axios({
        method: "POST",
        url: "api/login",
        data: {
          "username": this.username,
          "password": this.password
        }

      }).then(response => {
        if (response.data.status == "good") {
          this.$router.push('/url2pdfon');
        } else {
          this.message = response.data.errMsg
        }
      })
    },
  },
};
</script>

<style scoped>
.backbig {
  height: 100vh;
  width: 100vw;
  background-image: url(../assets/login.png);
  background-size: 100% 100%;
}

.innerback {
  max-width: fit-content;
  height: 300px;
  width: 300px;
  margin: 15vh auto;
  text-align: center;
}

.denglu {
  text-align: center;
  color: white;
  font-size: 43px;
}

.msg {
  margin-top: 20px;
  text-align: center;
  color: orange;
  font-size: 25px;
}

.el-input {
  margin-top: 20px;
}

.el-button {
  margin-top: 20px;
}
</style>
