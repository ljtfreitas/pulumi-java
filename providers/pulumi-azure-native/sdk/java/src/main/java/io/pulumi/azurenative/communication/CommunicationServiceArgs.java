// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.communication;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommunicationServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommunicationServiceArgs Empty = new CommunicationServiceArgs();

    /**
     * The name of the CommunicationService resource.
     * 
     */
    @Import(name="communicationServiceName")
      private final @Nullable Output<String> communicationServiceName;

    public Output<String> getCommunicationServiceName() {
        return this.communicationServiceName == null ? Output.empty() : this.communicationServiceName;
    }

    /**
     * The location where the communication service stores its data at rest.
     * 
     */
    @Import(name="dataLocation", required=true)
      private final Output<String> dataLocation;

    public Output<String> getDataLocation() {
        return this.dataLocation;
    }

    /**
     * The Azure location where the CommunicationService is running.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CommunicationServiceArgs(
        @Nullable Output<String> communicationServiceName,
        Output<String> dataLocation,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.communicationServiceName = communicationServiceName;
        this.dataLocation = Objects.requireNonNull(dataLocation, "expected parameter 'dataLocation' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private CommunicationServiceArgs() {
        this.communicationServiceName = Output.empty();
        this.dataLocation = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommunicationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> communicationServiceName;
        private Output<String> dataLocation;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CommunicationServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.communicationServiceName = defaults.communicationServiceName;
    	      this.dataLocation = defaults.dataLocation;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder communicationServiceName(@Nullable Output<String> communicationServiceName) {
            this.communicationServiceName = communicationServiceName;
            return this;
        }

        public Builder communicationServiceName(@Nullable String communicationServiceName) {
            this.communicationServiceName = Output.ofNullable(communicationServiceName);
            return this;
        }

        public Builder dataLocation(Output<String> dataLocation) {
            this.dataLocation = Objects.requireNonNull(dataLocation);
            return this;
        }

        public Builder dataLocation(String dataLocation) {
            this.dataLocation = Output.of(Objects.requireNonNull(dataLocation));
            return this;
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public CommunicationServiceArgs build() {
            return new CommunicationServiceArgs(communicationServiceName, dataLocation, location, resourceGroupName, tags);
        }
    }
}
