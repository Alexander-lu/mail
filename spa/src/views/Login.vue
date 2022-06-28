<template>
<el-container>
  <el-header>Header</el-header>
  <el-main>
  <el-input  placeholder="请输入账号" v-model="username" clearable></el-input>
 <el-input placeholder="请输入密码" v-model="password" show-password></el-input>
  <el-input  placeholder="请输入邮箱地址" v-model="mail"  clearable></el-input>
  <el-button type="primary" icon="el-icon-thumb">点我注册</el-button>
  </el-main>
  <el-footer>Footer</el-footer>
</el-container>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
          username: ''
    ,password:''
    ,mail: ''
    };
  },
};
</script>

<style scoped>

</style>
