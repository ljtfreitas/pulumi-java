// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.communication.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListCommunicationServiceKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListCommunicationServiceKeysArgs Empty = new ListCommunicationServiceKeysArgs();

    @InputImport(name="communicationServiceName", required=true)
    private final String communicationServiceName;

    public String getCommunicationServiceName() {
        return this.communicationServiceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListCommunicationServiceKeysArgs(
        String communicationServiceName,
        String resourceGroupName) {
        this.communicationServiceName = Objects.requireNonNull(communicationServiceName, "expected parameter 'communicationServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListCommunicationServiceKeysArgs() {
        this.communicationServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListCommunicationServiceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String communicationServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListCommunicationServiceKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.communicationServiceName = defaults.communicationServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCommunicationServiceName(String communicationServiceName) {
            this.communicationServiceName = Objects.requireNonNull(communicationServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListCommunicationServiceKeysArgs build() {
            return new ListCommunicationServiceKeysArgs(communicationServiceName, resourceGroupName);
        }
    }
}