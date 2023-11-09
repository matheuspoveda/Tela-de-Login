import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Classe de teste para verificar o funcionamento da autenticação no serviço de login.
 */
public class LoginTest {
    private LoginService loginService; // Instância da classe que será testada

    /**
     * Método executado antes de cada teste para configurar os objetos necessários, incluindo a inicialização do serviço de login.
     */
    @Before
    public void setUp() {
        loginService = new LoginService(); // Inicializa o serviço de login antes de cada teste
    }

    /**
     * Testa a autenticação com credenciais válidas.
     */
    @Test
    public void testLoginWithValidCredentials() {
        // Simule a entrada do usuário e senha
        String username = "usuario";
        String password = "senha123";

        // Realize a autenticação
        boolean isAuthenticated = loginService.authenticate(username, password);

        // Verifique se a autenticação foi bem-sucedida
        assertTrue("A autenticação com credenciais válidas deve ser bem-sucedida.", isAuthenticated);
    }

    /**
     * Testa a autenticação com credenciais inválidas.
     */
    @Test
    public void testLoginWithInvalidCredentials() {
        // Simule a entrada do usuário e senha inválidos
        String username = "usuario";
        String password = "senha_incorreta";

        // Realize a autenticação
        boolean isAuthenticated = loginService.authenticate(username, password);

        // Verifique se a autenticação falhou
        assertFalse("A autenticação com credenciais inválidas deve falhar.", isAuthenticated);
    }
}
