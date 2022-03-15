// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileSlackConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSlackConnectorProfilePropertiesArgs Empty = new ConnectorProfileSlackConnectorProfilePropertiesArgs();

    /**
     * The location of the Slack resource
     * 
     */
    @Import(name="instanceUrl", required=true)
      private final Output<String> instanceUrl;

    public Output<String> getInstanceUrl() {
        return this.instanceUrl;
    }

    public ConnectorProfileSlackConnectorProfilePropertiesArgs(Output<String> instanceUrl) {
        this.instanceUrl = Objects.requireNonNull(instanceUrl, "expected parameter 'instanceUrl' to be non-null");
    }

    private ConnectorProfileSlackConnectorProfilePropertiesArgs() {
        this.instanceUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSlackConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSlackConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder instanceUrl(Output<String> instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }

        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Output.of(Objects.requireNonNull(instanceUrl));
            return this;
        }
        public ConnectorProfileSlackConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileSlackConnectorProfilePropertiesArgs(instanceUrl);
        }
    }
}
