// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrustedIdProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrustedIdProviderArgs Empty = new TrustedIdProviderArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The URL of this trusted identity provider.
     * 
     */
    @InputImport(name="idProvider", required=true)
    private final Input<String> idProvider;

    public Input<String> getIdProvider() {
        return this.idProvider;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * 
     */
    @InputImport(name="trustedIdProviderName")
    private final @Nullable Input<String> trustedIdProviderName;

    public Input<String> getTrustedIdProviderName() {
        return this.trustedIdProviderName == null ? Input.empty() : this.trustedIdProviderName;
    }

    public TrustedIdProviderArgs(
        Input<String> accountName,
        Input<String> idProvider,
        Input<String> resourceGroupName,
        @Nullable Input<String> trustedIdProviderName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.idProvider = Objects.requireNonNull(idProvider, "expected parameter 'idProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.trustedIdProviderName = trustedIdProviderName;
    }

    private TrustedIdProviderArgs() {
        this.accountName = Input.empty();
        this.idProvider = Input.empty();
        this.resourceGroupName = Input.empty();
        this.trustedIdProviderName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustedIdProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> idProvider;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> trustedIdProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustedIdProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.idProvider = defaults.idProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.trustedIdProviderName = defaults.trustedIdProviderName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setIdProvider(Input<String> idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }

        public Builder setIdProvider(String idProvider) {
            this.idProvider = Input.of(Objects.requireNonNull(idProvider));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTrustedIdProviderName(@Nullable Input<String> trustedIdProviderName) {
            this.trustedIdProviderName = trustedIdProviderName;
            return this;
        }

        public Builder setTrustedIdProviderName(@Nullable String trustedIdProviderName) {
            this.trustedIdProviderName = Input.ofNullable(trustedIdProviderName);
            return this;
        }

        public TrustedIdProviderArgs build() {
            return new TrustedIdProviderArgs(accountName, idProvider, resourceGroupName, trustedIdProviderName);
        }
    }
}
