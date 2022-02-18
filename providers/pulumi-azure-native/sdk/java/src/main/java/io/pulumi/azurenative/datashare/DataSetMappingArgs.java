// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.datashare.enums.DataSetMappingKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetMappingArgs Empty = new DataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @InputImport(name="dataSetMappingName")
    private final @Nullable Input<String> dataSetMappingName;

    public Input<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Input.empty() : this.dataSetMappingName;
    }

    /**
     * Kind of data set mapping.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<Either<String,DataSetMappingKind>> kind;

    public Input<Either<String,DataSetMappingKind>> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
    private final Input<String> shareSubscriptionName;

    public Input<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    public DataSetMappingArgs(
        Input<String> accountName,
        @Nullable Input<String> dataSetMappingName,
        Input<Either<String,DataSetMappingKind>> kind,
        Input<String> resourceGroupName,
        Input<String> shareSubscriptionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
    }

    private DataSetMappingArgs() {
        this.accountName = Input.empty();
        this.dataSetMappingName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareSubscriptionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> dataSetMappingName;
        private Input<Either<String,DataSetMappingKind>> kind;
        private Input<String> resourceGroupName;
        private Input<String> shareSubscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDataSetMappingName(@Nullable Input<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder setDataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Input.ofNullable(dataSetMappingName);
            return this;
        }

        public Builder setKind(Input<Either<String,DataSetMappingKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,DataSetMappingKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setShareSubscriptionName(Input<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Input.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }

        public DataSetMappingArgs build() {
            return new DataSetMappingArgs(accountName, dataSetMappingName, kind, resourceGroupName, shareSubscriptionName);
        }
    }
}
