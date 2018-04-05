import * as axios from 'axios'

function searchAudio (formData) {
  const url = `./api/search/audio`
  return axios.post(url, formData)
  // get data
    .then(x => x.data)
}

function uploadAudio (formData) {
  const url = `./api/index/audio`
  return axios.post(url, formData)
  // get data
    .then(x => x.data)
}

export { searchAudio, uploadAudio }
