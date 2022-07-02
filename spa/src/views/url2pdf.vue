<template>
    <div id="url2pdf">
        <div class="outter-space">
            <nav class="navbar">
                <a href="https://www.adalab.cn/" class="left">
                    <img src="../img/adalab.png" alt="主页">
                </a>

                <button class="right" @click="register" round>注册</button>
                <button class="right" @click="login" round>登录</button>

            </nav>

            <main class="main-conversation">
                <div class="main-title">
                    <img src="../img/banner.png" alt="">
                </div>
                <div class="input">
                    <input class="main=input" v-model="input" type="text" placeholder="请输入需要转换的网页地址">
                    <button type="submit" @click="convert" v-loading.fullscreen.lock="fullscreenLoading">点击转换</button>

                </div>
                <div class="intro">
                    <div class="intro1">
                        <img src="../img/links.png" alt="links">
                        <p>输入网页链接，将网页转换成PDF</p>
                    </div>
                    <div class="intro2">
                        <img src="../img/enter.png" alt="">
                        <P>敲一下回车，魔法就会出现</P>
                    </div>
                    <div class="intro3">
                        <img src="../img/download.png" alt="">
                        <p>点点手指，下载转换好的文件</p>
                    </div>
                </div>

                <Download v-bind:image="require('../img/file.png')" id="down-component">

                    <button type="submit" @click="download">下载</button>
                    <!-- <Sendmail></Sendmail> -->
                    <button type="submit" @click="send2mail">转发到邮箱</button>
                    <!-- <input type="submit" value="下载" @click="download" /> -->
                    <p>{{ msg }}</p>
                </Download>



            </main>

            <footer class="footer">

                <div class="footer-intro">
                    <a href="#">
                        <button>转换成PDF</button>
                    </a>
                    <a href="#"> <button>转换成图片</button></a><a href="#"> <button>价格</button></a><a href="#">
                        <button>条款</button></a>
                </div>
                <div class="footer-powerby">本工具由
                    <img src="../img/team-title.png" alt=""> &
                    <a href="#"><img src="../img/apilogo.svg" alt=""></a> 强力驱动
                </div>
            </footer>


        </div>

    </div>

</template>

<script>
import Download from '@/components/download.vue';

export default {
    name: 'Url2pdf',
    data() {
        return {
            input: '',
            msg: '',
            fullscreenLoading: false
        }
    },
    components: {
        Download,

    }, methods: {
        convert() {
           
            this.fullscreenLoading = true;
         
            this.axios({
                method: 'POST',
                url: '/api/url2pdf',
                data: {
                    'url': this.input,
                }
            }).then((response) => {
                if (response.data.status == 'good') {
                   
                    this.msg = response.data.path
                    this.fullscreenLoading = false;

                } else {

                    this.msg = response.data.msg;
                    this.fullscreenLoading = false;
                }
            })
        },
        download() {
            window.location.href = '/api/download?path=' + this.msg
        },
        login() {
            this.$router.push('/login')
        },
        register() {
            this.$router.push('/register')
        },
        send2mail() {
            // console.log(1);
            this.$prompt('请输入邮箱', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                inputPattern: /[\w!#$%&'*+/=?^_`{|}~-]+(?:\.[\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\w](?:[\w-]*[\w])?\.)+[\w](?:[\w-]*[\w])?/,
                inputErrorMessage: '邮箱格式不正确'
            }).then(({ value }) => {
                // sendemail333()
                // console.log(222222);
                // this.$message({

                //     type: 'success',
                //     message: '你的邮箱是: ' + value


                // }).catch(() => {
                //     this.$message({
                //         type: 'info',
                //         message: '取消输入'
                //     });
                // });
                // console.log(value);
                // console.log(2);
                // console.log(this.msg);
                this.axios({
                    method: 'POST',
                    url: 'api/sendMail',
                    data: {
                        'email': value,
                        'filename': this.msg
                    }

                }).then((response) => {
                    // console.log(4);
                    if (response.data.status == 'good') {
                        this.msg = response.data.msg
                    }
                })

            });



        }

    }
}
// function sendemail333() {
//     console.log(222);
// }
// function storepdf() {
//     this.axios({
//         method: 'POST',
//         url: '/api/insertpdf',
//         data: {
//             'filename': this.msg,
//             'cookiename': VueCookies.get('mail')

//         }
//     }).then((response2) => {
//         console.log(response2)
//     })
// }


</script>

<style scoped>
#url2pdf {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    font-family: "PingFang SC";
    font-size: medium;



}

.outter-space {
    height: 700px;
    /* background-color: aqua; */
    text-align: center;
    margin: 46px 66px 22px;
}

.navbar {
    display: float;
    height: 50px;
    line-height: 50px;
    margin-bottom: 80px;
}

.navbar .left {
    float: left;
}

.navbar .right {
    float: right
}

.navbar img {
    width: 10rem;
    height: 50px;

    /* width: 100px; */

}

.navbar button,
.input button {
    /* color: aqua; */


    border: none;
    width: 100px;
    height: 40px;
    line-height: 40px;
    border-radius: 50px;
    background-color: white;
    transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);

}

.navbar button:hover {
    /* box-shadow: 15px 15px 27px #4c92d3, -15px -15px 27px #ffffff; */
    box-shadow: 10px 10px 50px #4c92d3;
    color: rgb(16, 206, 219);
    font-weight: bold;
}

main {
    padding: 20px 20vw;
    height: 630px;
}

.main-title img {
    width: 30vw;
}

.input {
    position: relative;
    left: 20px;
    margin-top: 50px;
    display: flex;
    width: 55vw;

}

.input input {
    background-color: #FFF;
    border-radius: 25px;
    border: 1px solid #DCDFE6;
    box-shadow: 0 0 30px #4c92d3;
    box-sizing: border-box;
    color: #606266;
    display: inline-block;
    font-size: inherit;
    height: 50px;
    line-height: 40px;
    outline: 0;
    padding: 0 15px;
    transition: border-color .2s cubic-bezier(.645, .045, .355, 1);
    width: 100%;

}

.input button {
    border: none;
    position: relative;
    right: 93px;
    top: 2px;
    height: 45px;

    line-height: 35px;
    transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.input button:hover {
    box-shadow: 0 0 50px #ccc;
    /* box-shadow: 15px 15px 27px #e1e1e3, -15px -15px 27px #ffffff; */
    color: rgb(16, 206, 219);
    font-weight: bold;
}


.intro {
    margin-top: 5vh;
    margin-bottom: 2vh;
    display: flex;
    /* flex-direction: row-reverse; */
    justify-content: space-around;
}

.intro div {
    width: 150px;
    height: 100px;
    margin-right: 10px;
}

.intro img {
    margin-bottom: 10px;
}

#down-component p {
    position: relative;
    top: -35px;
    right: 230px;
    color: #4c92d3;
}

#down-component button {


    display: block;
    border: none;
    font-size: inherit;
    margin: 0 auto 20px auto;
    width: 100px;
    height: 40px;
    line-height: 40px;
    color: #4c92d3;
    border-radius: 50px;
    background-color: white;
    transition: all 0.5s cubic-bezier(0.645, 0.045, 0.355, 1);

}

#down-component button:hover {
    background: hsl(168, 34%, 72%);
    box-shadow: 0 0 50px #ccc;
}



.footer-intro>a {
    text-decoration: none;
    margin-right: 5%;
}

.footer button {
    border: none;
    width: 100px;
    height: 40px;
    line-height: 40px;
    border-radius: 50px;
    background-color: white;
    transition: all 0.5s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.footer button:hover {
    box-shadow: 15px 15px 27px #e1e1e3, -15px -15px 27px #ffffff;
    color: rgb(16, 206, 219);
    font-weight: bold;
}

.footer-powerby {
    height: 40px;
    line-height: 40px;
    margin-top: 2rem;
    font-weight: bold;
    float: right;
}

.footer-powerby>img {

    width: 8rem;
    height: 30px;
}
</style>