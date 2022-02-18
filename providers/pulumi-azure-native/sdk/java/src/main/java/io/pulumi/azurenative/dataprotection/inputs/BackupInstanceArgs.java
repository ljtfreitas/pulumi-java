// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.DatasourceArgs;
import io.pulumi.azurenative.dataprotection.inputs.DatasourceSetArgs;
import io.pulumi.azurenative.dataprotection.inputs.PolicyInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupInstanceArgs Empty = new BackupInstanceArgs();

    /**
     * Gets or sets the data source information.
     * 
     */
    @InputImport(name="dataSourceInfo", required=true)
    private final Input<DatasourceArgs> dataSourceInfo;

    public Input<DatasourceArgs> getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @InputImport(name="dataSourceSetInfo")
    private final @Nullable Input<DatasourceSetArgs> dataSourceSetInfo;

    public Input<DatasourceSetArgs> getDataSourceSetInfo() {
        return this.dataSourceSetInfo == null ? Input.empty() : this.dataSourceSetInfo;
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    @InputImport(name="objectType", required=true)
    private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @InputImport(name="policyInfo", required=true)
    private final Input<PolicyInfoArgs> policyInfo;

    public Input<PolicyInfoArgs> getPolicyInfo() {
        return this.policyInfo;
    }

    public BackupInstanceArgs(
        Input<DatasourceArgs> dataSourceInfo,
        @Nullable Input<DatasourceSetArgs> dataSourceSetInfo,
        @Nullable Input<String> friendlyName,
        Input<String> objectType,
        Input<PolicyInfoArgs> policyInfo) {
        this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
        this.dataSourceSetInfo = dataSourceSetInfo;
        this.friendlyName = friendlyName;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.policyInfo = Objects.requireNonNull(policyInfo, "expected parameter 'policyInfo' to be non-null");
    }

    private BackupInstanceArgs() {
        this.dataSourceInfo = Input.empty();
        this.dataSourceSetInfo = Input.empty();
        this.friendlyName = Input.empty();
        this.objectType = Input.empty();
        this.policyInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasourceArgs> dataSourceInfo;
        private @Nullable Input<DatasourceSetArgs> dataSourceSetInfo;
        private @Nullable Input<String> friendlyName;
        private Input<String> objectType;
        private Input<PolicyInfoArgs> policyInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceInfo = defaults.dataSourceInfo;
    	      this.dataSourceSetInfo = defaults.dataSourceSetInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.objectType = defaults.objectType;
    	      this.policyInfo = defaults.policyInfo;
        }

        public Builder setDataSourceInfo(Input<DatasourceArgs> dataSourceInfo) {
            this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo);
            return this;
        }

        public Builder setDataSourceInfo(DatasourceArgs dataSourceInfo) {
            this.dataSourceInfo = Input.of(Objects.requireNonNull(dataSourceInfo));
            return this;
        }

        public Builder setDataSourceSetInfo(@Nullable Input<DatasourceSetArgs> dataSourceSetInfo) {
            this.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }

        public Builder setDataSourceSetInfo(@Nullable DatasourceSetArgs dataSourceSetInfo) {
            this.dataSourceSetInfo = Input.ofNullable(dataSourceSetInfo);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder setPolicyInfo(Input<PolicyInfoArgs> policyInfo) {
            this.policyInfo = Objects.requireNonNull(policyInfo);
            return this;
        }

        public Builder setPolicyInfo(PolicyInfoArgs policyInfo) {
            this.policyInfo = Input.of(Objects.requireNonNull(policyInfo));
            return this;
        }

        public BackupInstanceArgs build() {
            return new BackupInstanceArgs(dataSourceInfo, dataSourceSetInfo, friendlyName, objectType, policyInfo);
        }
    }
}
