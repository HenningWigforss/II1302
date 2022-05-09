import axios from 'axios'

const BackEnd_API_BASE_URL = 'http://localhost:8888'

class BackEndService{
    translateMorse(msg){
        return axios.get(BackEnd_API_BASE_URL + '/translateMorse?msg=' + msg)
    }
}

export default new BackEndService()