<template>
  <div id="app">
    <section>
      <Navbar />
    </section>
    <section class="section">
      <div class="box section-box">
        <div class="columns is-multiline">
          <div class="column">
            <b-field label="CEP">
              <b-input
                v-model="cep"
                placeholder="Digite apenas os números"
                maxlength="8"
                :has-counter="false"
              ></b-input>
            </b-field>
          </div>
          <div class="column">
            <b-field label="Cidade">
              <b-input :value="cidade" disabled></b-input>
            </b-field>
          </div>
          <div class="column is-full">
            <b-field label="Rua">
              <b-input :value="rua" disabled></b-input>
            </b-field>
          </div>
          <div class="column is-full">
            <b-field label="Bairro">
              <b-input :value="bairro" disabled></b-input>
            </b-field>
          </div>
          <div class="column is-align-self-flex-end is-offset-9">
            <b-button @click="calcular" type="is-primary" expanded
              >Calcular</b-button
            >
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import Navbar from "./components/navbar.vue";
import axios from "axios";
import Modal from "./components/modal.vue";

export default {
  name: "App",
  components: {
    Navbar,
  },
  watch: {
    cep(newValue) {
      if (newValue.length === 8) this.getCep();
    },
  },
  data() {
    return {
      uf: "",
      cep: "",
      cidade: "",
      rua: "",
      bairro: "",
      transportadora: "",
    };
  },
  methods: {
    getCep() {
      axios
        .get(`https://viacep.com.br/ws/${this.cep}/json/`)
        .then((response) => {
          this.cidade = response.data.localidade;
          this.rua = response.data.logradouro;
          this.bairro = response.data.bairro;
          this.uf = response.data.uf;
        });
    },
    calcular() {
      axios
        .get(`http://localhost:8080/calcula-frete?estado=${this.uf}`)
        .then((response) => {
          this.$buefy.modal.open({
            parent: this,
            component: Modal,
            props: {
              empresa: response.data.empresa,
              valor: response.data.frete
            },
            hasModalCard: true,
            trapFocus: true,
          });
        });
    },
  },
};
</script>

<style>
html {
  background-color: #f8f8f8 !important;
}
.section-box {
  width: 50%;
  margin: auto;
}
</style>
