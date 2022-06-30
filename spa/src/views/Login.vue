<template >
<div class="background" >
     <div class="login">
        <div class="header">登录</div>
        <div class="container">
            <div  placeholder="请输入用户名"> {{username}} </div>
            <span class="left"></span>
            <span class="right"></span>
            <span class="top"></span>
            <span class="bottom"></span>
        </div>
        <div class="container1">
          <!-- <input type="password" placeholder="请输入密码" value={{code}}> -->
            <span class="left"></span>
            <span class="right"></span>
            <span class="top"></span>
            <span class="bottom" ></span>
        </div> 
       <button class="btn" v-on:click="greet">登录</button> 
       <p>{{message}}</p>
    </div> 

</div>
</template>

<script>

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

  /**
 * 对密码进行加密
 * @param {string} passwd 用户输入的密码
 * @returns {string} 加密后的密码
 */
function encrypt(passwd) {
  var PASSWORD_ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz";
  var newStr = "";
  for (let i = 0; i < passwd.length; i++) {
    var posInCipherText = PASSWORD_ALPHABET.indexOf(passwd.charAt(i));
    var posInPlainText = (36 + (posInCipherText - 9)) % 36;
    newStr += PASSWORD_ALPHABET.charAt(posInPlainText)
  }
  // console.log(newStr);
  return newStr;
}


export default {
    name: "LoginBox",
    data() {
        return {
          
            username: ''
            , password: ''
            , mail: ''
        };
    },
   


  methods: {
      login() {
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
            this.$router.push('/balance');
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
</script>

<style scoped>

    * {
            margin: 0;
            padding: 0;
        }

 .background{
background:url("../assets/1.jpg");
width:100%;			
height:100%;			
position:fixed;
background-size:100% 100%;}
     

        .login {
            width: 358px;
            height: 588px;
            border-radius: 15px;
            padding: 0 50px;
            position: relative;
            left: 50%;
            margin-top: 30%;
            transform: translate(-50%, -50%);
            background-color: rgba(200,200,200,0.75);
        }
        .header {
            font-size: 38px;
            font-weight: bold;
            text-align: center;
            line-height: 200px;
            color: #61dafb;
        }
        .container {
              padding-right: 0px;
          padding-left: 0px;
            height: 30px;
            width: 250px;
            position: absolute;
            left: 50%;
            top: 40%;
            transform: translate(-50%, -50%);
        }
           .container1 {
            height: 30px;
            width: 250px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        input {
            width: 100%;
            height: 100%;
            position: relative;
            outline: none;
            border: none;
            box-sizing: border-box;
            padding-left: 5px;
            background-color: #282c34;
            color: #61dafb;
            caret-color: #61dafb;
        }
        input::placeholder {
            color: #61dafb;
        }

        span {
            position: absolute;
            content: "";
            display: block;
            background-color: #61dafb;
            transition: transform .1s ease-in-out;
        }
        .top,
        .bottom {
            left: 0px;
            right: 0px;
            height: 2px;
        }
        .left,
        .right {
            top: 0px;
            bottom: 0px;
            width: 2px;
            transform: scaleY(0);
        }
        .top {
            top: 0px;
            transform: scaleX(0);
            transform-origin: left center;
            transition-delay: .2s;
        }
        .left {
            left: 0px;
            transform-origin: bottom center;
            transition-delay: .3s;
        }
        .bottom {
            bottom: 0px;
        }
        .right {
            right: 0px;
            transform-origin: top center;
            transition-delay: .1s;
        }
        input:focus ~ .right {
            transform: scaleY(1);
            transform-origin: bottom center;
        }
        input:focus ~ .left {
            transform: scaleY(1);
            transform-origin: top center;
        }
        input:focus ~ .top {
            transform: scaleY(1);
            transform-origin: right center;
        }
     
        .btn {
            position: absolute;
            left: 50%;
            top: 54%;
            transform: translate(-50%, -50%);
            text-align: center;
            padding: 5px;
            width: 52%;
            margin-top: 40px;
            background-color: #61dafb;
            color: #fff;
        }

</style>
