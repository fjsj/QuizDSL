
package v1.quiz;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QuizStandaloneSetup extends QuizStandaloneSetupGenerated{

	public static void doSetup() {
		new QuizStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

