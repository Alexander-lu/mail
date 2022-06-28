<template>
<el-container>
  <el-header>
  <el-page-header @back="goBack" content="注册页面">
</el-page-header>
</el-header>
  <el-main>
  <div class="demo-image__placeholder">
  <div class="block">
    <el-image :src="src">
      <div slot="placeholder" class="image-slot">
        加载中<span class="dot">...</span>
      </div>
    </el-image>
  </div>
</div>
<el-input placeholder="请输入账号" v-model="username" clearable></el-input>
<el-input placeholder="请输入密码" v-model="password" show-password></el-input>
<el-input placeholder="请输入邮箱地址" v-model="mail"  clearable></el-input>
<el-button type="primary" icon="el-icon-thumb" @click="register" >点我注册</el-button>
</el-main>
<el-footer>
<div>
<el-row :gutter="24">
  <el-col :span="3"><div class="grid-content bg-purple">
  <i class="el-icon-link"></i>
  </div></el-col>
  <el-col :span="3"><div class="grid-content bg-purple">
  <el-link target="_blank" href="https://pdfmyurl.com/"  underline=false>pdfmyurl</el-link>
  </div></el-col>
  <el-col :span="3"><div class="grid-content bg-purple">
  <el-link target="_blank" href="https://www.web2pdfconvert.com/" >web2pdfconvert</el-link>
  </div></el-col>
  <el-col :span="3"><div class="grid-content bg-purple">
  <el-link target="_blank" href="https://www.html2pdf.co.uk/" >html2pdf</el-link>
  </div></el-col>
  <el-col :span="3"><div class="grid-content bg-purple">
  <el-link target="_blank" href="https://pdfcrowd.com/" >pdfcrowd</el-link>
  </div></el-col>
    <el-col :span="3"><div class="grid-content bg-purple">
  <el-link target="_blank" href="https://www.sodapdf.com/html-to-pdf/" >sodapdf</el-link>
  </div></el-col>
      <el-col :span="3"><div class="grid-content bg-purple">
<el-link target="_blank" href="http://www.sciweavers.org/" >sciweavers</el-link>
  
  </div></el-col>
      <el-col :span="3"><div class="grid-content bg-purple">
  
  <el-link target="_blank" href="https://pdf-ace.com/" >pdf-ace</el-link>
  </div></el-col>
</el-row>






</div>
</el-footer>
</el-container>
</template>

<script>
export default {
  name: "Register",
  data() {
    return {
          username: ''
    ,password:''
    ,mail: ''
    ,src: 'https://images.unsplash.com/photo-1623276527153-fa38c1616b05?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1169&q=80'
    };
  },
  methods: {
     register() {
       this.axios({
        method:"POST",
        url:"/api/insert",
        data:{
            "username":this.username,
            "password":this.password,
               "mail":this.mail,
        }
       }).then(()=>{
              this.$router.push('/login');
       })

     },
      goBack() {
            this.$router.push('/login');
      }
    }
};
</script>

<style scoped>
.el-image{
  height: 500px;
  widows: 300px;
}
.el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }
  
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 50px;
  }
  
  body > .el-container {
    margin-bottom: 40px;
  }
  
  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }
  
  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }
</style>
