// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileVeevaConnectorProfileProperties {
    /**
     * The location of the Veeva resource
     * 
     */
    private final String instanceUrl;

    @OutputCustomType.Constructor
    private ConnectorProfileVeevaConnectorProfileProperties(@OutputCustomType.Parameter("instanceUrl") String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * The location of the Veeva resource
     * 
    */
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileVeevaConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileVeevaConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder setInstanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }
        public ConnectorProfileVeevaConnectorProfileProperties build() {
            return new ConnectorProfileVeevaConnectorProfileProperties(instanceUrl);
        }
    }
}
