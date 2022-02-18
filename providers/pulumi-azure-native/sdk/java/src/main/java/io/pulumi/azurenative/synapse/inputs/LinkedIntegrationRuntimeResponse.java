// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The linked integration runtime information.
 * 
 */
public final class LinkedIntegrationRuntimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeResponse Empty = new LinkedIntegrationRuntimeResponse();

    /**
     * The creating time of the linked integration runtime.
     * 
     */
    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The location of the workspace for which the linked integration runtime belong to.
     * 
     */
    @InputImport(name="dataFactoryLocation", required=true)
    private final String dataFactoryLocation;

    public String getDataFactoryLocation() {
        return this.dataFactoryLocation;
    }

    /**
     * The name of the workspace for which the linked integration runtime belong to.
     * 
     */
    @InputImport(name="dataFactoryName", required=true)
    private final String dataFactoryName;

    public String getDataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * The name of the linked integration runtime.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The subscription ID for which the linked integration runtime belong to.
     * 
     */
    @InputImport(name="subscriptionId", required=true)
    private final String subscriptionId;

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public LinkedIntegrationRuntimeResponse(
        String createTime,
        String dataFactoryLocation,
        String dataFactoryName,
        String name,
        String subscriptionId) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.dataFactoryLocation = Objects.requireNonNull(dataFactoryLocation, "expected parameter 'dataFactoryLocation' to be non-null");
        this.dataFactoryName = Objects.requireNonNull(dataFactoryName, "expected parameter 'dataFactoryName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private LinkedIntegrationRuntimeResponse() {
        this.createTime = null;
        this.dataFactoryLocation = null;
        this.dataFactoryName = null;
        this.name = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String dataFactoryLocation;
        private String dataFactoryName;
        private String name;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dataFactoryLocation = defaults.dataFactoryLocation;
    	      this.dataFactoryName = defaults.dataFactoryName;
    	      this.name = defaults.name;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDataFactoryLocation(String dataFactoryLocation) {
            this.dataFactoryLocation = Objects.requireNonNull(dataFactoryLocation);
            return this;
        }

        public Builder setDataFactoryName(String dataFactoryName) {
            this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public LinkedIntegrationRuntimeResponse build() {
            return new LinkedIntegrationRuntimeResponse(createTime, dataFactoryLocation, dataFactoryName, name, subscriptionId);
        }
    }
}
