<template>
  <div class="modal-card" style="width: auto">
    <header class="modal-card-head">
      <p class="modal-card-title">Resultado</p>
      <button type="button" class="delete" @click="$emit('close')" />
    </header>
    <section class="modal-card-body">
      <p>
        A empresa responsável pelo frete será: <b>{{ empresa }}</b>
      </p>
      <br />
      <p>
        O valor do frete será: <b>R$ {{ valor }}</b>
      </p>
    </section>
    <footer class="modal-card-foot is-justify-content-end">
      <b-button label="Entendi" type="is-primary" @click="$emit('close')" />
    </footer>
  </div>
</template>
<script>
export default {
  props: {
    empresa: String,
    valor: Number,
  },
};
</script>
