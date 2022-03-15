// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.datashare.enums.SynchronizationSettingKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SynchronizationSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SynchronizationSettingArgs Empty = new SynchronizationSettingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Kind of synchronization setting.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,SynchronizationSettingKind>> kind;

    public Output<Either<String,SynchronizationSettingKind>> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to add the synchronization setting to.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName;
    }

    /**
     * The name of the synchronizationSetting.
     * 
     */
    @Import(name="synchronizationSettingName")
      private final @Nullable Output<String> synchronizationSettingName;

    public Output<String> getSynchronizationSettingName() {
        return this.synchronizationSettingName == null ? Output.empty() : this.synchronizationSettingName;
    }

    public SynchronizationSettingArgs(
        Output<String> accountName,
        Output<Either<String,SynchronizationSettingKind>> kind,
        Output<String> resourceGroupName,
        Output<String> shareName,
        @Nullable Output<String> synchronizationSettingName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.synchronizationSettingName = synchronizationSettingName;
    }

    private SynchronizationSettingArgs() {
        this.accountName = Output.empty();
        this.kind = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareName = Output.empty();
        this.synchronizationSettingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SynchronizationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<Either<String,SynchronizationSettingKind>> kind;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private @Nullable Output<String> synchronizationSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(SynchronizationSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.synchronizationSettingName = defaults.synchronizationSettingName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder kind(Output<Either<String,SynchronizationSettingKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(Either<String,SynchronizationSettingKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
            return this;
        }

        public Builder synchronizationSettingName(@Nullable Output<String> synchronizationSettingName) {
            this.synchronizationSettingName = synchronizationSettingName;
            return this;
        }

        public Builder synchronizationSettingName(@Nullable String synchronizationSettingName) {
            this.synchronizationSettingName = Output.ofNullable(synchronizationSettingName);
            return this;
        }
        public SynchronizationSettingArgs build() {
            return new SynchronizationSettingArgs(accountName, kind, resourceGroupName, shareName, synchronizationSettingName);
        }
    }
}
