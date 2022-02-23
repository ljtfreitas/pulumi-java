// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LinkedIntegrationRuntimeResponse {
    /**
     * The creating time of the linked integration runtime.
     * 
     */
    private final String createTime;
    /**
     * The location of the data factory for which the linked integration runtime belong to.
     * 
     */
    private final String dataFactoryLocation;
    /**
     * The name of the data factory for which the linked integration runtime belong to.
     * 
     */
    private final String dataFactoryName;
    /**
     * The name of the linked integration runtime.
     * 
     */
    private final String name;
    /**
     * The subscription ID for which the linked integration runtime belong to.
     * 
     */
    private final String subscriptionId;

    @OutputCustomType.Constructor({"createTime","dataFactoryLocation","dataFactoryName","name","subscriptionId"})
    private LinkedIntegrationRuntimeResponse(
        String createTime,
        String dataFactoryLocation,
        String dataFactoryName,
        String name,
        String subscriptionId) {
        this.createTime = Objects.requireNonNull(createTime);
        this.dataFactoryLocation = Objects.requireNonNull(dataFactoryLocation);
        this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
        this.name = Objects.requireNonNull(name);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
    }

    /**
     * The creating time of the linked integration runtime.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The location of the data factory for which the linked integration runtime belong to.
     * 
     */
    public String getDataFactoryLocation() {
        return this.dataFactoryLocation;
    }
    /**
     * The name of the data factory for which the linked integration runtime belong to.
     * 
     */
    public String getDataFactoryName() {
        return this.dataFactoryName;
    }
    /**
     * The name of the linked integration runtime.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The subscription ID for which the linked integration runtime belong to.
     * 
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
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
