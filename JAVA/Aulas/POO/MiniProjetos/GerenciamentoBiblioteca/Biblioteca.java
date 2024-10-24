package GerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import Biblioteca.livros;

public class Biblioteca {
    private Scanner in = new Scanner(System.in);
    private List<Livro> acervo;
    private List<Emprestimo> emprestimos;
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Adicionar um livro
    public void adicionarLivro() {
        System.out.print("\nInforme o título do Livro: ");
        String titulo = in.nextLine();
        
        System.out.print("Informe o autor do Livro: ");
        String autor = in.nextLine();
        
        System.out.print("Informe a editora: ");
        String editora = in.nextLine();
        
        System.out.print("Informe o ano de publicação: ");
        int anoPublicacao = in.nextInt();
        in.nextLine();

        System.out.print("Informe a quantidade disponível: ");
        int qtdDisponivel = in.nextInt();
        in.nextLine();

        System.out.print("Informe o ISBN: ");
        String isbn = in.nextLine();

        Livro livro = new Livro(titulo, autor, editora, anoPublicacao, isbn, qtdDisponivel);
        acervo.add(livro);
        System.out.println();
        System.out.println("Livro adicionado com sucesso!");
    }

    // Buscar livros
    public void buscarLivro() {
        int opcao;
        System.out.println("\nSelecione a opção da tarefa que deseja realizar:\n" + 
            "\n1. Buscar um livro\n" + 
            "2. Listar todos os livros\n");
        
        opcao = in.nextInt();
        in.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\nInforme o livro que você está procurando: ");
                String livroProcurado = in.nextLine();
                boolean encontrado = false;

                for (Livro livro : acervo) {
                    if (livro.gettitulo().equalsIgnoreCase(livroProcurado)) {
                        System.out.println("\nLivro Encontrado!\n");
                        System.out.println("====INFORMAÇÕES DO LIVRO====\n" + 
                            "\nTítulo: " + livro.gettitulo() + "\n" + 
                            "Autor: " + livro.getautor() + "\n" + 
                            "Editora: " + livro.geteditora() + "\n" + 
                            "Ano de Publicação: " + livro.getAnoPublicacao() + "\n" + 
                            "ISBN: " + livro.getISBN() + "\n" + 
                            "Quantidade Disponível: " + livro.getQuantidadeDisponivel());
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Livro não Encontrado!");
                }
                break;

            case 2:
                System.out.println("\n=====Todos os livros:=====\n");
                for (Livro livro : acervo) {
                    System.out.println("Título: " + livro.gettitulo() + "\n" +
                        "Autor: " + livro.getautor() + "\n" +
                        "Editora: " + livro.geteditora() + "\n" +
                        "Ano de Publicação: " + livro.getAnoPublicacao() + "\n" +
                        "ISBN: " + livro.getISBN() + "\n" +
                        "Quantidade Disponível: " + livro.getQuantidadeDisponivel() + "\n");
                }
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    }
    
    // Atualizar um livro
    public void atualizarLivro() {
        System.out.println("\nInforme o título do livro que deseja atualizar: ");
        String tituloProcurado = in.nextLine();

        Livro livroParaAtualizar = null;
        for (Livro livro : acervo) {
            if (livro.gettitulo().equalsIgnoreCase(tituloProcurado)) {
                System.out.println("Livro Encontrado!" + "\n");
                livroParaAtualizar = livro;
                break;
            }
        }

        if (livroParaAtualizar == null) {
            System.out.println("Livro não Encontrado!");
            return;
        }

        System.out.print("Informe o novo título do Livro: (Para permanecer com o mesmo título, clique 'Enter') ");
        String titulo = in.nextLine();
        if (!titulo.isEmpty()) {
            livroParaAtualizar.settitulo(titulo);
        }

        System.out.print("Informe o novo autor do Livro: (Para permanecer com o mesmo autor, clique 'Enter') ");
        String autor = in.nextLine();
        if (!autor.isEmpty()) {
            livroParaAtualizar.setautor(autor);
        }

        System.out.print("Informe a nova editora: (Para permanecer com a mesma editora, clique 'Enter') ");
        String editora = in.nextLine();
        if (!editora.isEmpty()) {
            livroParaAtualizar.seteditora(editora);
        }

        System.out.print("Informe o ano de publicação: (Para permanecer com o mesmo ano de publicação, clique '0') ");
        int anoPublicacao = in.nextInt();
        in.nextLine();
        if (anoPublicacao != 0) {
            livroParaAtualizar.setAnoPublicacao(anoPublicacao);
        }

        System.out.print("Informe a quantidade disponível: (Para permanecer com a mesma quantidade de exemplares, clique '0') ");
        int qtdDisponivel = in.nextInt();
        in.nextLine();
        if (qtdDisponivel != 0) {
            livroParaAtualizar.setQuantidadeDisponivel(qtdDisponivel);   
        }

        System.out.print("Informe o ISBN: (Para permanecer com o mesmo ISBN, clique 'Enter') ");
        String isbn = in.nextLine();
        if (!isbn.isEmpty()) {
            livroParaAtualizar.setISBN(isbn);   
        }

        System.out.println("\nLivro atualizado com sucesso!");
    }

    // Excluir um livro;
    public void excluirLivro () {
        System.out.print("\nInforme o título do livro que deseja excluir: ");
        String tituloProcurado = in.nextLine();

        Livro LivroParaExcluir = null;
        for (Livro livro : acervo) {
            if (livro.gettitulo().equalsIgnoreCase(tituloProcurado)) {
                System.out.println("\nLivro encontrado!");
                LivroParaExcluir = livro;
                break;
            }
        }

        if (LivroParaExcluir == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        acervo.remove(LivroParaExcluir);
        System.out.println("\nLivro removido com sucesso!");
        return;
    }

    // Empréstimo de livro
    public void emprestarLivro() {
        System.out.print("\nInforme seu nome: ");
        String nome = in.nextLine();

        System.out.print("\nInforme o título do livro que você deseja pegar emprestado: ");
        String tituloLivro = in.nextLine();

        Livro livroEmprestado = null;
        boolean livroEncontrado = false;

        for (Livro livro : acervo) {
            if (livro.gettitulo().equalsIgnoreCase(tituloLivro)) {
                livroEmprestado = livro;
                livroEncontrado = true;

                if (livroEmprestado.getQuantidadeDisponivel() > 0) {
                    System.out.println("\nLivro disponível na biblioteca!");
                } else {
                    System.out.println("\nLivro indisponível para empréstimo!");
                    return;
                }

                int novaQuantidade = livroEmprestado.getQuantidadeDisponivel() - 1;
                livroEmprestado.setQuantidadeDisponivel(novaQuantidade);

                System.out.print("\nInforme a data de empréstimo do livro: ");
                String dataEmprestimoStr = in.nextLine();
                Date dataEmprestimo;

                // Tentar converter a data de empréstimo
                try {
                    dataEmprestimo = formatoData.parse(dataEmprestimoStr);
                } catch (ParseException e) {
                    System.out.println("\nData inválida! Tente novamente.");
                    return;
                }

                // Calcular a data de devolução (5 dias após a data de empréstimo)
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(dataEmprestimo);
                calendario.add(Calendar.DAY_OF_MONTH, 5); // Adiciona 5 dias
                Date dataDevolucaoPrevista = calendario.getTime();

                // Criar o registro de empréstimo
                Emprestimo emprestimo = new Emprestimo(nome, livro, dataEmprestimo, dataDevolucaoPrevista);
                emprestimos.add(emprestimo);

                System.out.println("\n===== INFORMAÇÕES DO EMPRÉSTIMO =====\n" +
                        "\nNome do usuário: " + nome + "\n" +
                        "Data de empréstimo: " + formatoData.format(dataEmprestimo) + "\n" +
                        "Data prevista para devolução: " + formatoData.format(dataDevolucaoPrevista) + "\n" +
                        "Quantidade atual disponível: " + livroEmprestado.getQuantidadeDisponivel());
                return;
            }
        }

        if (!livroEncontrado) {
            System.out.println("\nLivro não encontrado!");
        }
    }

    // Devolução de livro;
    public void devolverLivro() {
        System.out.print("\nInforme seu nome: ");
        String nome = in.nextLine();

        System.out.print("\nInforme o título do livro que você está devolvendo: ");
        String tituloLivro = in.nextLine();

        System.out.print("\nInforme a data que está devolvendo este livro: ");
        String dataDevolucaoStr = in.nextLine();
        Date dataDevolucao;

        // Tentar converter a data de empréstimo
        try {
            dataDevolucao = formatoData.parse(dataDevolucaoStr);
        } catch (ParseException e) {
            System.out.println("\nData inválida! Tente novamente.");
            return;
        }

        Livro livroParaDevolver = null;
        Emprestimo emprestimoEncontrado = null;

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getNomeUsuario().equalsIgnoreCase(nome) && 
                emprestimo.getLivro().gettitulo().equalsIgnoreCase(tituloLivro)) {
                emprestimoEncontrado = emprestimo;
                livroParaDevolver = emprestimo.getLivro();
                break;
            }
        }

        if (emprestimoEncontrado == null) {
            System.out.println("\nEmpréstimo não encontrado! Verifique as informações e tente novamente.");
            return;
        }

        // Verificar a data de devolução
        if (dataDevolucao.after(emprestimoEncontrado.getDataDevolucaoPrevista())) {
            System.out.println("\nA devolução está atrasada! Por favor, regularize a situação.");
        } else {
            System.out.println("\nLivro devolvido no prazo correto!");
        }

        int novaQuantidade = livroParaDevolver.getQuantidadeDisponivel() + 1;
        livroParaDevolver.setQuantidadeDisponivel(novaQuantidade);
        
        // Remover o empréstimo da lista
        emprestimos.remove(emprestimoEncontrado);

        System.out.println("\nDevolução concluída! Quantidade atual disponível: " + livroParaDevolver.getQuantidadeDisponivel());
    }
}