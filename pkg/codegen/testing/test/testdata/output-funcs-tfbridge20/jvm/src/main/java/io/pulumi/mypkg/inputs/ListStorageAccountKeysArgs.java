// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListStorageAccountKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountKeysArgs Empty = new ListStorageAccountKeysArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Specifies type of the key to be listed. Possible value is kerb.
     * 
     */
    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListStorageAccountKeysArgs(
        String accountName,
        @Nullable String expand,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListStorageAccountKeysArgs() {
        this.accountName = null;
        this.expand = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String expand;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListStorageAccountKeysArgs build() {
            return new ListStorageAccountKeysArgs(accountName, expand, resourceGroupName);
        }
    }
}
