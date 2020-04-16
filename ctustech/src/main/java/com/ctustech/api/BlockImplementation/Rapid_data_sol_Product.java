package com.ctustech.api.BlockImplementation;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class Rapid_data_sol_Product extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506109b5806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806323bc839b14610067578063528c87d2146100bf578063793a8e71146100f8578063a5a1c3ad146102c8578063c35c60591461050d578063faba8d6714610527575b600080fd5b61006f61052f565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156100ab578181015183820152602001610093565b505050509050019250505060405180910390f35b6100dc600480360360208110156100d557600080fd5b5035610592565b604080516001600160a01b039092168252519081900360200190f35b61011e6004803603602081101561010e57600080fd5b50356001600160a01b03166105b9565b6040518080602001806020018060200180602001858103855289818151815260200191508051906020019080838360005b8381101561016757818101518382015260200161014f565b50505050905090810190601f1680156101945780820380516001836020036101000a031916815260200191505b5085810384528851815288516020918201918a019080838360005b838110156101c75781810151838201526020016101af565b50505050905090810190601f1680156101f45780820380516001836020036101000a031916815260200191505b50858103835287518152875160209182019189019080838360005b8381101561022757818101518382015260200161020f565b50505050905090810190601f1680156102545780820380516001836020036101000a031916815260200191505b50858103825286518152865160209182019188019080838360005b8381101561028757818101518382015260200161026f565b50505050905090810190601f1680156102b45780820380516001836020036101000a031916815260200191505b509850505050505050505060405180910390f35b61050b600480360360a08110156102de57600080fd5b6001600160a01b038235169190810190604081016020820135600160201b81111561030857600080fd5b82018360208201111561031a57600080fd5b803590602001918460018302840111600160201b8311171561033b57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561038d57600080fd5b82018360208201111561039f57600080fd5b803590602001918460018302840111600160201b831117156103c057600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561041257600080fd5b82018360208201111561042457600080fd5b803590602001918460018302840111600160201b8311171561044557600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561049757600080fd5b8201836020820111156104a957600080fd5b803590602001918460018302840111600160201b831117156104ca57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610817945050505050565b005b6105156108dc565b60408051918252519081900360200190f35b6100dc6108e2565b6060600180548060200260200160405190810160405280929190818152602001828054801561058757602002820191906000526020600020905b81546001600160a01b03168152600190910190602001808311610569575b505050505090505b90565b6001818154811061059f57fe5b6000918252602090912001546001600160a01b0316905081565b6000602081815291815260409081902080548251601f60026000196101006001861615020190931692909204918201859004850281018501909352808352909283919083018282801561064d5780601f106106225761010080835404028352916020019161064d565b820191906000526020600020905b81548152906001019060200180831161063057829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156106eb5780601f106106c0576101008083540402835291602001916106eb565b820191906000526020600020905b8154815290600101906020018083116106ce57829003601f168201915b50505060028085018054604080516020601f600019610100600187161502019094169590950492830185900485028101850190915281815295969594509092509083018282801561077d5780601f106107525761010080835404028352916020019161077d565b820191906000526020600020905b81548152906001019060200180831161076057829003601f168201915b5050505060038301805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815294959493509083018282801561080d5780601f106107e25761010080835404028352916020019161080d565b820191906000526020600020905b8154815290600101906020018083116107f057829003601f168201915b5050505050905084565b6001600160a01b038516600090815260208181526040909120855190916108429183918801906108e7565b50835161085890600183019060208701906108e7565b50825161086e90600283019060208601906108e7565b50815161088490600383019060208501906108e7565b50506001805480820182556000919091527fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf60180546001600160a01b0319166001600160a01b03969096169590951790945550505050565b60015490565b600090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061092857805160ff1916838001178555610955565b82800160010185558215610955579182015b8281111561095557825182559160200191906001019061093a565b50610961929150610965565b5090565b61058f91905b80821115610961576000815560010161096b56fea26469706673582212203d875b99a182f11e51fdadf297f0f9f253277c7384aef9ac96ed660bb3447e2664736f6c63430006060033";

    public static final String FUNC_COUNTPRODUCTS = "countProducts";

    public static final String FUNC_GETPRODUCTDETAILS = "getProductDetails";

    public static final String FUNC_PRODUCTLIST = "productList";

    public static final String FUNC_PRODUCTS = "products";

    public static final String FUNC_SETPRODUCTDETAILS = "setProductDetails";

    public static final String FUNC_STORETRANSACTIONHASHFORDISTRIBUTOR = "storeTransactionHashForDistributor";

    @Deprecated
    protected Rapid_data_sol_Product(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Rapid_data_sol_Product(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Rapid_data_sol_Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Rapid_data_sol_Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> countProducts() {
        final Function function = new Function(FUNC_COUNTPRODUCTS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getProductDetails() {
        final Function function = new Function(FUNC_GETPRODUCTDETAILS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<String> productList(BigInteger param0) {
        final Function function = new Function(FUNC_PRODUCTLIST, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple4<String, String, String, String>> products(String param0) {
        final Function function = new Function(FUNC_PRODUCTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteFunctionCall<Tuple4<String, String, String, String>>(function,
                new Callable<Tuple4<String, String, String, String>>() {
                    @Override
                    public Tuple4<String, String, String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<String, String, String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (String) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> setProductDetails(String _address, String _year, String _alert_number, String _name, String _risk_type) {
        final Function function = new Function(
                FUNC_SETPRODUCTDETAILS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address),
                new org.web3j.abi.datatypes.Utf8String(_year), 
                new org.web3j.abi.datatypes.Utf8String(_alert_number), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_risk_type)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> storeTransactionHashForDistributor() {
        final Function function = new Function(FUNC_STORETRANSACTIONHASHFORDISTRIBUTOR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Rapid_data_sol_Product load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Rapid_data_sol_Product(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Rapid_data_sol_Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Rapid_data_sol_Product(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Rapid_data_sol_Product load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Rapid_data_sol_Product(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Rapid_data_sol_Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Rapid_data_sol_Product(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Rapid_data_sol_Product> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Rapid_data_sol_Product.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Rapid_data_sol_Product> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Rapid_data_sol_Product.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Rapid_data_sol_Product> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Rapid_data_sol_Product.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Rapid_data_sol_Product> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Rapid_data_sol_Product.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
