// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.healthcareapis.enums.IotIdentityResolutionType;
import io.pulumi.azurenative.healthcareapis.inputs.IotMappingPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotConnectorFhirDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotConnectorFhirDestinationArgs Empty = new IotConnectorFhirDestinationArgs();

    /**
     * The name of IoT Connector FHIR destination resource.
     * 
     */
    @InputImport(name="fhirDestinationName")
    private final @Nullable Input<String> fhirDestinationName;

    public Input<String> getFhirDestinationName() {
        return this.fhirDestinationName == null ? Input.empty() : this.fhirDestinationName;
    }

    /**
     * FHIR Mappings
     * 
     */
    @InputImport(name="fhirMapping", required=true)
    private final Input<IotMappingPropertiesArgs> fhirMapping;

    public Input<IotMappingPropertiesArgs> getFhirMapping() {
        return this.fhirMapping;
    }

    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    @InputImport(name="fhirServiceResourceId", required=true)
    private final Input<String> fhirServiceResourceId;

    public Input<String> getFhirServiceResourceId() {
        return this.fhirServiceResourceId;
    }

    /**
     * The name of IoT Connector resource.
     * 
     */
    @InputImport(name="iotConnectorName", required=true)
    private final Input<String> iotConnectorName;

    public Input<String> getIotConnectorName() {
        return this.iotConnectorName;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines how resource identity is resolved on the destination.
     * 
     */
    @InputImport(name="resourceIdentityResolutionType", required=true)
    private final Input<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType;

    public Input<Either<String,IotIdentityResolutionType>> getResourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IotConnectorFhirDestinationArgs(
        @Nullable Input<String> fhirDestinationName,
        Input<IotMappingPropertiesArgs> fhirMapping,
        Input<String> fhirServiceResourceId,
        Input<String> iotConnectorName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType,
        Input<String> workspaceName) {
        this.fhirDestinationName = fhirDestinationName;
        this.fhirMapping = Objects.requireNonNull(fhirMapping, "expected parameter 'fhirMapping' to be non-null");
        this.fhirServiceResourceId = Objects.requireNonNull(fhirServiceResourceId, "expected parameter 'fhirServiceResourceId' to be non-null");
        this.iotConnectorName = Objects.requireNonNull(iotConnectorName, "expected parameter 'iotConnectorName' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceIdentityResolutionType = Objects.requireNonNull(resourceIdentityResolutionType, "expected parameter 'resourceIdentityResolutionType' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IotConnectorFhirDestinationArgs() {
        this.fhirDestinationName = Input.empty();
        this.fhirMapping = Input.empty();
        this.fhirServiceResourceId = Input.empty();
        this.iotConnectorName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceIdentityResolutionType = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotConnectorFhirDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fhirDestinationName;
        private Input<IotMappingPropertiesArgs> fhirMapping;
        private Input<String> fhirServiceResourceId;
        private Input<String> iotConnectorName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IotConnectorFhirDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fhirDestinationName = defaults.fhirDestinationName;
    	      this.fhirMapping = defaults.fhirMapping;
    	      this.fhirServiceResourceId = defaults.fhirServiceResourceId;
    	      this.iotConnectorName = defaults.iotConnectorName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceIdentityResolutionType = defaults.resourceIdentityResolutionType;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setFhirDestinationName(@Nullable Input<String> fhirDestinationName) {
            this.fhirDestinationName = fhirDestinationName;
            return this;
        }

        public Builder setFhirDestinationName(@Nullable String fhirDestinationName) {
            this.fhirDestinationName = Input.ofNullable(fhirDestinationName);
            return this;
        }

        public Builder setFhirMapping(Input<IotMappingPropertiesArgs> fhirMapping) {
            this.fhirMapping = Objects.requireNonNull(fhirMapping);
            return this;
        }

        public Builder setFhirMapping(IotMappingPropertiesArgs fhirMapping) {
            this.fhirMapping = Input.of(Objects.requireNonNull(fhirMapping));
            return this;
        }

        public Builder setFhirServiceResourceId(Input<String> fhirServiceResourceId) {
            this.fhirServiceResourceId = Objects.requireNonNull(fhirServiceResourceId);
            return this;
        }

        public Builder setFhirServiceResourceId(String fhirServiceResourceId) {
            this.fhirServiceResourceId = Input.of(Objects.requireNonNull(fhirServiceResourceId));
            return this;
        }

        public Builder setIotConnectorName(Input<String> iotConnectorName) {
            this.iotConnectorName = Objects.requireNonNull(iotConnectorName);
            return this;
        }

        public Builder setIotConnectorName(String iotConnectorName) {
            this.iotConnectorName = Input.of(Objects.requireNonNull(iotConnectorName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setResourceIdentityResolutionType(Input<Either<String,IotIdentityResolutionType>> resourceIdentityResolutionType) {
            this.resourceIdentityResolutionType = Objects.requireNonNull(resourceIdentityResolutionType);
            return this;
        }

        public Builder setResourceIdentityResolutionType(Either<String,IotIdentityResolutionType> resourceIdentityResolutionType) {
            this.resourceIdentityResolutionType = Input.of(Objects.requireNonNull(resourceIdentityResolutionType));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public IotConnectorFhirDestinationArgs build() {
            return new IotConnectorFhirDestinationArgs(fhirDestinationName, fhirMapping, fhirServiceResourceId, iotConnectorName, location, resourceGroupName, resourceIdentityResolutionType, workspaceName);
        }
    }
}
