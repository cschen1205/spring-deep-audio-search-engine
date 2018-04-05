import Vue from 'vue'
import Router from 'vue-router'
import MachineLearningCatalogue from '@/components/MachineLearningCatalogue'
import AudioUploader from '@/components/AudioUploader'
import AudioSearch from '@/components/AudioSearch'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'MachineLearningCatalogue',
      component: MachineLearningCatalogue
    },
    {
      path: '/audio_upload',
      name: 'AudioUploader',
      component: AudioUploader
    },
    {
      path: '/audio_search',
      name: 'AudioSearch',
      component: AudioSearch
    }
  ]
})
