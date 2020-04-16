package com.ctustech.api.BlockImplementation;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.Parity;
import org.web3j.tx.FastRawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.response.NoOpProcessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Properties;

import java.math.BigInteger;

public class BlockChain {
    private static Web3jService service = new HttpService("http://127.0.0.1:7545");
    private static Web3j web3j = Web3j.build(service);
    private static Parity parity = Parity.build(service);
    private static String address = ""; //0xb3220577546783cc1Db43B31b8362FdD8e5aD9E4
    private static String privatekey = ""; //ece1556578c7ad3903003068596a969495d081de2034eca9a0002283f9c1e76e
    public static String getHash(
            String year,
            String alertNumber,
            String name,String riskType) throws Exception {

                try (InputStream is = new FileInputStream("config.properties")) {
                    Properties prop = new Properties();
                    prop.load(is);

                    BlockChain.address = prop.getProperty("address");
                    BlockChain.privatekey = prop.getProperty("privatekey");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

        BigInteger privkey = new BigInteger(privatekey, 16);
        ECKeyPair ecKeyPair = ECKeyPair.create(privkey);
        Credentials credentials = Credentials.create(ecKeyPair);

        TransactionManager txManager = new FastRawTransactionManager(web3j, credentials);

        RemoteCall<com.ctustech.api.BlockImplementation.Rapid_data_sol_Product> request = com.ctustech.api.BlockImplementation.Rapid_data_sol_Product.deploy(web3j, txManager, DefaultGasProvider.GAS_PRICE, DefaultGasProvider.GAS_LIMIT);
        com.ctustech.api.BlockImplementation.Rapid_data_sol_Product token = request.send();

        TransactionReceipt receipt = token.setProductDetails(address, year,alertNumber,name,riskType).send();

        return receipt.getTransactionHash();
    }
}
