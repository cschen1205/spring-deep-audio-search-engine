<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Audio Search Engine</h2>
    <ul>
      <li>
        <a
          href="#/audio_upload"
          target="_blank"
        >
          Music Upload
        </a>
      </li>
      <br>
      <li>
        <a
          href="#/audio_search"
          target="_blank"
        >
          Music Search
        </a>
      </li>
    </ul>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Deep Audio API'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
