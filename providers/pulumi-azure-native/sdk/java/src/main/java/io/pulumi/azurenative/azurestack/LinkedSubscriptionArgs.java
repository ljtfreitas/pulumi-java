// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.azurestack.enums.Location;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedSubscriptionArgs Empty = new LinkedSubscriptionArgs();

    /**
     * The identifier associated with the device subscription.
     * 
     */
    @Import(name="linkedSubscriptionId", required=true)
      private final Output<String> linkedSubscriptionId;

    public Output<String> getLinkedSubscriptionId() {
        return this.linkedSubscriptionId;
    }

    /**
     * Name of the Linked Subscription resource.
     * 
     */
    @Import(name="linkedSubscriptionName")
      private final @Nullable Output<String> linkedSubscriptionName;

    public Output<String> getLinkedSubscriptionName() {
        return this.linkedSubscriptionName == null ? Output.empty() : this.linkedSubscriptionName;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<Either<String,Location>> location;

    public Output<Either<String,Location>> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The identifier associated with the device registration.
     * 
     */
    @Import(name="registrationResourceId", required=true)
      private final Output<String> registrationResourceId;

    public Output<String> getRegistrationResourceId() {
        return this.registrationResourceId;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }

    public LinkedSubscriptionArgs(
        Output<String> linkedSubscriptionId,
        @Nullable Output<String> linkedSubscriptionName,
        @Nullable Output<Either<String,Location>> location,
        Output<String> registrationResourceId,
        Output<String> resourceGroup) {
        this.linkedSubscriptionId = Objects.requireNonNull(linkedSubscriptionId, "expected parameter 'linkedSubscriptionId' to be non-null");
        this.linkedSubscriptionName = linkedSubscriptionName;
        this.location = location;
        this.registrationResourceId = Objects.requireNonNull(registrationResourceId, "expected parameter 'registrationResourceId' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private LinkedSubscriptionArgs() {
        this.linkedSubscriptionId = Output.empty();
        this.linkedSubscriptionName = Output.empty();
        this.location = Output.empty();
        this.registrationResourceId = Output.empty();
        this.resourceGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> linkedSubscriptionId;
        private @Nullable Output<String> linkedSubscriptionName;
        private @Nullable Output<Either<String,Location>> location;
        private Output<String> registrationResourceId;
        private Output<String> resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedSubscriptionId = defaults.linkedSubscriptionId;
    	      this.linkedSubscriptionName = defaults.linkedSubscriptionName;
    	      this.location = defaults.location;
    	      this.registrationResourceId = defaults.registrationResourceId;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder linkedSubscriptionId(Output<String> linkedSubscriptionId) {
            this.linkedSubscriptionId = Objects.requireNonNull(linkedSubscriptionId);
            return this;
        }

        public Builder linkedSubscriptionId(String linkedSubscriptionId) {
            this.linkedSubscriptionId = Output.of(Objects.requireNonNull(linkedSubscriptionId));
            return this;
        }

        public Builder linkedSubscriptionName(@Nullable Output<String> linkedSubscriptionName) {
            this.linkedSubscriptionName = linkedSubscriptionName;
            return this;
        }

        public Builder linkedSubscriptionName(@Nullable String linkedSubscriptionName) {
            this.linkedSubscriptionName = Output.ofNullable(linkedSubscriptionName);
            return this;
        }

        public Builder location(@Nullable Output<Either<String,Location>> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable Either<String,Location> location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder registrationResourceId(Output<String> registrationResourceId) {
            this.registrationResourceId = Objects.requireNonNull(registrationResourceId);
            return this;
        }

        public Builder registrationResourceId(String registrationResourceId) {
            this.registrationResourceId = Output.of(Objects.requireNonNull(registrationResourceId));
            return this;
        }

        public Builder resourceGroup(Output<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Output.of(Objects.requireNonNull(resourceGroup));
            return this;
        }
        public LinkedSubscriptionArgs build() {
            return new LinkedSubscriptionArgs(linkedSubscriptionId, linkedSubscriptionName, location, registrationResourceId, resourceGroup);
        }
    }
}
