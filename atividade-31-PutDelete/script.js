/* script.js atualizado: inclui botões Editar/Excluir e integra métodos PUT e DELETE */

document.addEventListener('DOMContentLoaded', () => {
    carregarAulas();

    const form = document.getElementById('form-aula');
    form.addEventListener('submit', async (event) => {
        event.preventDefault();

        // Se o formulário está em modo de edição (possui data-editing-id), faz PUT; caso contrário, faz POST
        if (form.dataset.editingId) {
            await atualizarAula(form.dataset.editingId);
        } else {
            await adicionarAula();
        }
    });
});

/* --------------------------------------------------------------------
   GET – Carrega e renderiza todas as aulas
   ------------------------------------------------------------------*/
async function carregarAulas() {
    try {
        const response = await fetch('http://localhost:3000/aulas');
        const aulas = await response.json();

        const container = document.getElementById('aulas-container');

        // Renderiza cada aula com botões de ação
        container.innerHTML = aulas
            .map(
                (aula) => `
            <div class="card" data-id="${aula.id}">
                <span>${aula.id}</span>
                <h3>${aula.title}</h3>
                <p>${aula.content}</p>
                <button class="btn-edit">Editar</button>
                <button class="btn-delete">Excluir</button>
            </div>`
            )
            .join('');

        // Liga os eventos dos botões após a renderização
        container.querySelectorAll('.btn-edit').forEach((btn) => {
            btn.addEventListener('click', () => {
                const card = btn.closest('.card');
                const id = card.dataset.id;
                document.getElementById('text').value = card.querySelector('h3').textContent;
                document.getElementById('content').value = card.querySelector('p').textContent;
                document.getElementById('form-aula').dataset.editingId = id; // marca formulário em modo edição
            });
        });

        container.querySelectorAll('.btn-delete').forEach((btn) => {
            btn.addEventListener('click', async () => {
                const id = btn.closest('.card').dataset.id;
                await excluirAula(id);
            });
        });
    } catch (error) {
        console.error('Erro ao carregar aulas', error);
    }
}

/* --------------------------------------------------------------------
   POST – Adiciona uma nova aula
   ------------------------------------------------------------------*/
async function adicionarAula() {
    const title = document.getElementById('text').value.trim();
    const content = document.getElementById('content').value.trim();

    if (!title || !content) {
        alert('Preencha título e conteúdo antes de salvar.');
        return;
    }

    const dados = { title, content };

    try {
        const response = await fetch('http://localhost:3000/aulas', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(dados),
        });

        if (response.ok) {
            document.getElementById('form-aula').reset();
            delete document.getElementById('form-aula').dataset.editingId;
            await carregarAulas();
        } else {
            alert('Falha ao adicionar aula.');
        }
    } catch (error) {
        console.error('Erro ao adicionar aula', error);
    }
}

/* --------------------------------------------------------------------
   PUT – Atualiza uma aula existente
   ------------------------------------------------------------------*/
async function atualizarAula(id) {
    const title = document.getElementById('text').value.trim();
    const content = document.getElementById('content').value.trim();

    if (!title || !content) {
        alert('Preencha título e conteúdo antes de salvar.');
        return;
    }

    const dados = { title, content };

    try {
        const response = await fetch(`http://localhost:3000/aulas/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(dados),
        });

        if (response.ok) {
            document.getElementById('form-aula').reset();
            delete document.getElementById('form-aula').dataset.editingId;
            await carregarAulas();
        } else {
            alert('Falha ao atualizar aula.');
        }
    } catch (error) {
        console.error('Erro ao atualizar aula', error);
    }
}

/* --------------------------------------------------------------------
   DELETE – Remove uma aula
   ------------------------------------------------------------------*/
async function excluirAula(id) {
    if (!confirm('Tem certeza de que deseja excluir esta aula?')) return;

    try {
        const response = await fetch(`http://localhost:3000/aulas/${id}`, {
            method: 'DELETE',
        });

        if (response.ok) {
            await carregarAulas();
        } else {
            alert('Falha ao excluir aula.');
        }
    } catch (error) {
        console.error('Erro ao excluir aula', error);
    }
}
