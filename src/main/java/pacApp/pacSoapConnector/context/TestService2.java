package pacApp.pacSoapConnector.context;

import org.springframework.stereotype.Service;

import pacApp.pacSoapConnector.SoapConvertCurrencyConnector;

@Service
public class TestService2 implements ISoapTestService{

	@Override
	public String runTest() {
		new SoapConvertCurrencyConnector().convertCurrency();		
		return null;
	}
}
