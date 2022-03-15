// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateRecordSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateRecordSetArgs Empty = new GetPrivateRecordSetArgs();

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateZoneName", required=true)
      private final String privateZoneName;

    public String getPrivateZoneName() {
        return this.privateZoneName;
    }

    /**
     * The type of DNS record in this record set.
     * 
     */
    @Import(name="recordType", required=true)
      private final String recordType;

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * The name of the record set, relative to the name of the zone.
     * 
     */
    @Import(name="relativeRecordSetName", required=true)
      private final String relativeRecordSetName;

    public String getRelativeRecordSetName() {
        return this.relativeRecordSetName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateRecordSetArgs(
        String privateZoneName,
        String recordType,
        String relativeRecordSetName,
        String resourceGroupName) {
        this.privateZoneName = Objects.requireNonNull(privateZoneName, "expected parameter 'privateZoneName' to be non-null");
        this.recordType = Objects.requireNonNull(recordType, "expected parameter 'recordType' to be non-null");
        this.relativeRecordSetName = Objects.requireNonNull(relativeRecordSetName, "expected parameter 'relativeRecordSetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateRecordSetArgs() {
        this.privateZoneName = null;
        this.recordType = null;
        this.relativeRecordSetName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateZoneName;
        private String recordType;
        private String relativeRecordSetName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateRecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateZoneName = defaults.privateZoneName;
    	      this.recordType = defaults.recordType;
    	      this.relativeRecordSetName = defaults.relativeRecordSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder privateZoneName(String privateZoneName) {
            this.privateZoneName = Objects.requireNonNull(privateZoneName);
            return this;
        }

        public Builder recordType(String recordType) {
            this.recordType = Objects.requireNonNull(recordType);
            return this;
        }

        public Builder relativeRecordSetName(String relativeRecordSetName) {
            this.relativeRecordSetName = Objects.requireNonNull(relativeRecordSetName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPrivateRecordSetArgs build() {
            return new GetPrivateRecordSetArgs(privateZoneName, recordType, relativeRecordSetName, resourceGroupName);
        }
    }
}
