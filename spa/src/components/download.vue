<template>
  <div class="center">
    <div class="property-card">
      <div class="property-image">
        <img :src="image" />
      </div>
      <!-- <div class="property-msg">
        <p>{{msg}}</p>
      </div> -->
      <div class="property-description">
        <slot></slot>
      </div>
    </div>
  </div>
</template>

<script>
export default {
    name: 'download',
    props: {
      image: String,
        msg: String,
    }
}
</script>

<style scoped>

.center {
  height: 25vh;
  width: 100%;
  display: flex;
 
  justify-content: center;
  align-items: center;
}

.property-card {
  height: 10em;
  width: 30em;
  display: flex;
  flex-direction: column;
  position: relative;
  transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);
  border-radius: 16px;
  overflow: hidden;
  box-shadow: 15px 15px 27px #e1e1e3, -15px -15px 27px #ffffff;
}
/* .property-msg{
  width: 170px;
  height: 30px;
  background-color: aqua;
  position: relative;
  top: 70%;
  left: 10%;
}
.property-msg p{
  color: red;
} */

.property-image {
  height: 5em;
  width: 10em;
  position: Absolute;
  top: 7%;
  left: 10%;
  transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.property-image img {
  max-height: 100%;
  max-width: 100%;

}

.property-description {
  /* background-color: #d6d6d6; */
  height: 8em;
  width: 14em;
  position: absolute;
  top: 2rem;
  right: 1rem;
  transition: all 0.4s cubic-bezier(0.645, 0.045, 0.355, 1);
  padding: 0.5em 1em;
  text-align: center;
}
</style>