import java.util.Scanner;

/**
 * A classe LoginScreen representa a interface de login de um aplicativo, permitindo
 * que os usuários insiram suas credenciais e realizem a autenticação.
 */
public class LoginScreen {
    private LoginService loginService;

    /**
     * Construtor da classe LoginScreen.
     *
     * loginService O serviço de login que será utilizado para autenticar os usuários.
     *                     Deve ser previamente inicializado com as credenciais desejadas.
     */
    public LoginScreen(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * Exibe um prompt de login na tela, solicita ao usuário que insira seu nome de usuário e senha,
     * realiza a autenticação com base nas credenciais fornecidas e fornece feedback.
     */
    public void displayLoginPrompt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à tela de login");
        System.out.print("Nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = loginService.authenticate(username, password);

        if (isAuthenticated) {
            System.out.println("Login bem-sucedido! Acesso concedido.");
        } else {
            System.out.println("Falha na autenticação. Verifique suas credenciais e tente novamente.");
        }
    }
}
