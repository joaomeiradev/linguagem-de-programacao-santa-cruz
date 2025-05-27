document.addEventListener('DOMContentLoaded', () => {
    carregarAulas();

    const form = document.getElementById('form-aula');
    form.addEventListener('submit', async (event) => {
        event.preventDefault();

        if (form.dataset.editingId) {
            await atualizarAula(form.dataset.editingId);
        } else {
            await adicionarAula();
        }
    });
});

async function carregarAulas() {
    try {
        const response = await fetch('http://localhost:3000/aulas');
        const aulas = await response.json();

        const container = document.getElementById('aulas-container');

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

        container.querySelectorAll('.btn-edit').forEach((btn) => {
            btn.addEventListener('click', () => {
                const card = btn.closest('.card');
                const id = card.dataset.id;
                document.getElementById('text').value = card.querySelector('h3').textContent;
                document.getElementById('content').value = card.querySelector('p').textContent;
                document.getElementById('form-aula').dataset.editingId = id; 
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
