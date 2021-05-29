import axios from 'axios';

const API_URL = "http://localhost:8080"

class InvestimentoService{

    retrieveAllInvestimentos(){
        return axios.get(`${API_URL}/investimentos`)
    }

    saveInvestimento(investimento){
        return axios.post(`${API_URL}/investimentos`, investimento)
    }

    deleteInvestimento(id){
        return axios.delete(`${API_URL}/investimentos/${id}`)
    }

}

export default new InvestimentoService();