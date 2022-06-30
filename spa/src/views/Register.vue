<template>
<el-main class="backbig">
<div class="innerback">
<p class="denglu">注册</p>
<el-input v-model="username"   clearable placeholder="请输入账号"></el-input>
<el-input v-model="password1" show-password placeholder="请输入密码"></el-input>
<el-input v-model="password2" show-password placeholder="请再次输入密码"></el-input>
<el-input v-model="mail" show-password placeholder="请输入邮箱"></el-input>
<el-button style="width: 150px;" type="primary" plain @click="register">注册</el-button>
<p class="msg">{{message}}</p>
</div>
</el-main>
      
</template>

<script>

export default {
    name: "Registe",
    data() {
return {      
username: '',
password1: '',
password2: '',
mail:'',
message:''
        };
    },

   

  methods: {
    register() {
      if(isNotGood(this.username)){
      this.axios({
        method:"POST",
        //发生请求地址
        url:"/api/login",
        //发送数据
        data:{
            "username":this.username,
            "password":encrypt(this.password)
        }
        //响应结果
       }).then(response=>{
           if (response.data.status == "good") {
            this.$router.push('/main');
          } else {
            this.message = response.data.errMsg
          }
       })
      }else {
     this.message = "您输入的用户名有误！"
      }
    },
  },
};
/**
   * 判断输入是不是非法的
   */
   function isNotGood(data) {
    var patt1=new RegExp(/^1\d{10}$/);
    var patt2=new RegExp(/^[a-zA-Z._-]*[a-zA-Z]+[0-9]*@bank.c(om|n)$/);
    var patt3=new RegExp(/[._-][._-]/);
    if(patt1.test(data)){
        return true;
    }else if(patt2.test(data)){
        if(data.length>30){
          return false;
        }
        if(patt3.test(data)){
          return false;
        }
        return true;
      }else{
        return false;
      }
  }
    // 加密
    function encrypt(str, num) {
      var newStr = "";
      for (let i = 0; i < str.length; i++) {
        if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 65 + num + 26) % 26 + 65)
        }
        else if (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) {
          newStr += String.fromCharCode((str.charCodeAt(i) - 97 + num + 26) % 26 + 97)
        }
        //特殊符号不做处理
        else newStr += String.fromCharCode(str.charCodeAt(i));
      }
      // console.log(newStr);
      return newStr;
    }

</script>

<style scoped>
.backbig{    
height: 100vh;
width: 100vw;
background-image: url(../assets/register.png);
background-size: 100% 100%;
}
.innerback{
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
.msg{
     margin-top: 20px;
    text-align: center;
	color: orange;
	font-size: 25px;
}
.el-input{
    margin-top: 20px;
}
.el-button{
    margin-top: 20px;
}
</style>
