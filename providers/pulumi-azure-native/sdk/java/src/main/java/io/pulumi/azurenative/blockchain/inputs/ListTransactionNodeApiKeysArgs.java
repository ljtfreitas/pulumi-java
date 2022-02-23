// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListTransactionNodeApiKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListTransactionNodeApiKeysArgs Empty = new ListTransactionNodeApiKeysArgs();

    /**
     * Blockchain member name.
     * 
     */
    @InputImport(name="blockchainMemberName", required=true)
        private final String blockchainMemberName;

    public String getBlockchainMemberName() {
        return this.blockchainMemberName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Transaction node name.
     * 
     */
    @InputImport(name="transactionNodeName", required=true)
        private final String transactionNodeName;

    public String getTransactionNodeName() {
        return this.transactionNodeName;
    }

    public ListTransactionNodeApiKeysArgs(
        String blockchainMemberName,
        String resourceGroupName,
        String transactionNodeName) {
        this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName, "expected parameter 'blockchainMemberName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transactionNodeName = Objects.requireNonNull(transactionNodeName, "expected parameter 'transactionNodeName' to be non-null");
    }

    private ListTransactionNodeApiKeysArgs() {
        this.blockchainMemberName = null;
        this.resourceGroupName = null;
        this.transactionNodeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTransactionNodeApiKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blockchainMemberName;
        private String resourceGroupName;
        private String transactionNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTransactionNodeApiKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockchainMemberName = defaults.blockchainMemberName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transactionNodeName = defaults.transactionNodeName;
        }

        public Builder setBlockchainMemberName(String blockchainMemberName) {
            this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTransactionNodeName(String transactionNodeName) {
            this.transactionNodeName = Objects.requireNonNull(transactionNodeName);
            return this;
        }
        public ListTransactionNodeApiKeysArgs build() {
            return new ListTransactionNodeApiKeysArgs(blockchainMemberName, resourceGroupName, transactionNodeName);
        }
    }
}
