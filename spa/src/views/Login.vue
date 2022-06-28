<template>
  <Card>
    <el-carousel :interval="2000" type="card" height="562.5px" autoplay="true">
      <el-carousel-item v-for="item in images" :key="item">
        <img :src="item.url" alt="无图片" class="imageURL" />
      </el-carousel-item>
    </el-carousel>
    <el-input class='what' placeholder="用户名" v-model="username" clearable></el-input>
    <el-input class='what' placeholder="密码" v-model="password" show-password></el-input>
    <input type="submit" value="登陆" @click="login" />
    <span v-if="errMsg">{{ errMsg }}</span>
  </Card>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      username: "",
      password: "",
      errMsg: "",
      images: [
        { url: require("../assets/1.png") },
        { url: require("../assets/2.jpg") },
        { url: require("../assets/3.png") },
        { url: require("../assets/4.png") },
        { url: require("../assets/5.jpg") },
        { url: require("../assets/6.jpg") }
      ],
    };
  },
  components: {
},
  methods: {
    login() {
      if(isNotGood(this.username)){
      this.axios({
        method:"POST",
        url:"/api/login",
        data:{
            "username":this.username,
            "password":encrypt(this.password)
        }
       }).then(response=>{
           if (response.data.status == "good") {
            this.$router.push('/balance');
          } else {
            this.errMsg = response.data.errMsg
          }
       })
      }else {
     this.errMsg = "您输入的用户名有误！"
      }
    },
  },
};
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
</script>

<style scoped>
.what {
  width: 70%;
  height: 15%;
  margin: 15px auto;
  background: #fff;
  padding: 5px;
  font-size: 16px;
  border: 2px solid #fff;
  transition: all 0.3s ease;
  border-radius: 5px;
}

what:focus {
  border: 2px solid #1abc9d;
}

input[type="submit"] {
  height: 50px;
  display: block;
  background: #1abc9d;
  width: 70%;
  padding: 4px;
  cursor: pointer;
  color: #fff;
  border: 0px;
  margin: auto;
  margin-bottom: 20px;
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

.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

.imageURL {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  min-width: 1000px;
  z-index: -10;
  zoom: 1;
  background-color: #fff;
  background-repeat: no-repeat;
  background-size: cover;
  -webkit-background-size: cover;
  -o-background-size: cover;
  background-position: center 0;
}
</style>
