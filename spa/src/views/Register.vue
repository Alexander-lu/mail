<template>
	<el-main class="backbig">
		<div class="innerback">
			<p class="denglu">注册</p>
			<el-input v-model="username" clearable placeholder="请输入账号"></el-input>
			<el-input v-model="password1" show-password placeholder="请输入密码"></el-input>
			<el-input v-model="password2" show-password placeholder="请再次输入密码"></el-input>
			<el-input v-model="mail" clearable placeholder="请输入邮箱"></el-input>
			<el-button style="width: 150px;" type="primary" plain @click="register">注册</el-button>
			<p class="msg">{{ message }}</p>
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
			mail: '',
			message: ''
		};
	},
	methods: {
		register() {

			this.axios({
				method: "POST",
				url: "/api/insert",
				data: {
					"username": this.username,
					"password": this.password1,
					"mail": this.mail,
				}
			}).then(response => {
				if (response.data.status == "good") {
					this.$router.push('/login');
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
	background-image: url(../assets/register.png);
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
