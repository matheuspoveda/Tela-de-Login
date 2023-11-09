import java.util.HashMap;
import java.util.Map;

/**
 * A classe LoginService fornece funcionalidade de autenticação de usuário.
 */
public class LoginService {
    private Map<String, String> userCredentials;

    /**
     * Construtor da classe LoginService.
     * Inicializa o mapa de credenciais com alguns valores de exemplo.
     */
    public LoginService() {
        userCredentials = new HashMap<>();
        userCredentials.put("usuario", "senha123");
        userCredentials.put("outroUsuario", "outraSenha456");
    }

    /**
     * Autentica um usuário com base no nome de usuário e senha fornecidos.
     *
     * username O nome de usuário a ser autenticado.
     * password A senha a ser verificada para autenticação.
     * return true se a autenticação for bem-sucedida, caso contrário, false.
     */
    public boolean authenticate(String username, String password) {
        // Verifique se o usuário existe no mapa de credenciais
        if (userCredentials.containsKey(username)) {
            // Obtém a senha armazenada para o usuário
            String storedPassword = userCredentials.get(username);

            // Verifique se a senha fornecida corresponde à senha armazenada
            return password.equals(storedPassword);
        }

        // Se o usuário não existe no mapa de credenciais, a autenticação falha
        return false;
    }
}

