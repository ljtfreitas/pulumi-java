// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine;

import io.pulumi.azurenative.sqlvirtualmachine.enums.SqlVmGroupImageSku;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.WsfcDomainProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlVirtualMachineGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlVirtualMachineGroupArgs Empty = new SqlVirtualMachineGroupArgs();

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SQL image offer. Examples may include SQL2016-WS2016, SQL2017-WS2016.
     * 
     */
    @Import(name="sqlImageOffer")
      private final @Nullable Output<String> sqlImageOffer;

    public Output<String> getSqlImageOffer() {
        return this.sqlImageOffer == null ? Output.empty() : this.sqlImageOffer;
    }

    /**
     * SQL image sku.
     * 
     */
    @Import(name="sqlImageSku")
      private final @Nullable Output<Either<String,SqlVmGroupImageSku>> sqlImageSku;

    public Output<Either<String,SqlVmGroupImageSku>> getSqlImageSku() {
        return this.sqlImageSku == null ? Output.empty() : this.sqlImageSku;
    }

    /**
     * Name of the SQL virtual machine group.
     * 
     */
    @Import(name="sqlVirtualMachineGroupName")
      private final @Nullable Output<String> sqlVirtualMachineGroupName;

    public Output<String> getSqlVirtualMachineGroupName() {
        return this.sqlVirtualMachineGroupName == null ? Output.empty() : this.sqlVirtualMachineGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Cluster Active Directory domain profile.
     * 
     */
    @Import(name="wsfcDomainProfile")
      private final @Nullable Output<WsfcDomainProfileArgs> wsfcDomainProfile;

    public Output<WsfcDomainProfileArgs> getWsfcDomainProfile() {
        return this.wsfcDomainProfile == null ? Output.empty() : this.wsfcDomainProfile;
    }

    public SqlVirtualMachineGroupArgs(
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> sqlImageOffer,
        @Nullable Output<Either<String,SqlVmGroupImageSku>> sqlImageSku,
        @Nullable Output<String> sqlVirtualMachineGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<WsfcDomainProfileArgs> wsfcDomainProfile) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlImageOffer = sqlImageOffer;
        this.sqlImageSku = sqlImageSku;
        this.sqlVirtualMachineGroupName = sqlVirtualMachineGroupName;
        this.tags = tags;
        this.wsfcDomainProfile = wsfcDomainProfile;
    }

    private SqlVirtualMachineGroupArgs() {
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sqlImageOffer = Output.empty();
        this.sqlImageSku = Output.empty();
        this.sqlVirtualMachineGroupName = Output.empty();
        this.tags = Output.empty();
        this.wsfcDomainProfile = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlVirtualMachineGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sqlImageOffer;
        private @Nullable Output<Either<String,SqlVmGroupImageSku>> sqlImageSku;
        private @Nullable Output<String> sqlVirtualMachineGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<WsfcDomainProfileArgs> wsfcDomainProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlVirtualMachineGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlImageOffer = defaults.sqlImageOffer;
    	      this.sqlImageSku = defaults.sqlImageSku;
    	      this.sqlVirtualMachineGroupName = defaults.sqlVirtualMachineGroupName;
    	      this.tags = defaults.tags;
    	      this.wsfcDomainProfile = defaults.wsfcDomainProfile;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder sqlImageOffer(@Nullable Output<String> sqlImageOffer) {
            this.sqlImageOffer = sqlImageOffer;
            return this;
        }

        public Builder sqlImageOffer(@Nullable String sqlImageOffer) {
            this.sqlImageOffer = Output.ofNullable(sqlImageOffer);
            return this;
        }

        public Builder sqlImageSku(@Nullable Output<Either<String,SqlVmGroupImageSku>> sqlImageSku) {
            this.sqlImageSku = sqlImageSku;
            return this;
        }

        public Builder sqlImageSku(@Nullable Either<String,SqlVmGroupImageSku> sqlImageSku) {
            this.sqlImageSku = Output.ofNullable(sqlImageSku);
            return this;
        }

        public Builder sqlVirtualMachineGroupName(@Nullable Output<String> sqlVirtualMachineGroupName) {
            this.sqlVirtualMachineGroupName = sqlVirtualMachineGroupName;
            return this;
        }

        public Builder sqlVirtualMachineGroupName(@Nullable String sqlVirtualMachineGroupName) {
            this.sqlVirtualMachineGroupName = Output.ofNullable(sqlVirtualMachineGroupName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder wsfcDomainProfile(@Nullable Output<WsfcDomainProfileArgs> wsfcDomainProfile) {
            this.wsfcDomainProfile = wsfcDomainProfile;
            return this;
        }

        public Builder wsfcDomainProfile(@Nullable WsfcDomainProfileArgs wsfcDomainProfile) {
            this.wsfcDomainProfile = Output.ofNullable(wsfcDomainProfile);
            return this;
        }
        public SqlVirtualMachineGroupArgs build() {
            return new SqlVirtualMachineGroupArgs(location, resourceGroupName, sqlImageOffer, sqlImageSku, sqlVirtualMachineGroupName, tags, wsfcDomainProfile);
        }
    }
}
